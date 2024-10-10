import java.util.ArrayList;

/**
 * The Message class simulates a message posted to a group chat.
 * Each message contains the text of the message, the creator's username,
 * an ID, and a list of reactions. The ID is automatically assigned based
 * on a static counter.
 * 
 * @author Tat Tung Nguyen
 * 
 */
public class Message {
    private final String text;
    private final String username;
    private final int id;
    private ArrayList<Reaction> reactions;
    private static int nextId = 0;

    /**
     * Enum representing the possible reactions that can be added to a message.
     * Each reaction has a display text for more user-friendly printing.
     */
    public enum Reaction {
        THUMBS_UP("Thumbs Up"), SMILE("Smile"), SAD("Sad");

        private String displayText;

        /**
         * Constructor for Reaction enum, allowing custom display text.
         *
         * @param text the display text of the reaction.
         */
        private Reaction(String text) {
            this.displayText = text;
        }

        /**
         * Returns the display text of the reaction.
         *
         * @return the string representation of the reaction.
         */
        @Override
        public String toString() {
            return this.displayText;
        }
    }

    /**
     * Constructs a new Message object.
     *
     * @param username the creator's username.
     * @param text     the content of the message.
     */
    public Message(String username, String text) {
        this.username = username;
        this.text = text;
        this.reactions = new ArrayList<Reaction>();
        this.id = nextId++;
    }

    /**
     * Returns the ID of the message.
     *
     * @return the message ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the username of the creator.
     *
     * @return the username of the message creator.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns the text of the message.
     *
     * @return the message content.
     */
    public String getText() {
        return text;
    }

    /**
     * Returns the list of reactions to this message.
     *
     * @return an ArrayList of Reaction objects.
     */
    public ArrayList<Reaction> getReaction() {
        return reactions;
    }

    /**
     * Adds a reaction to the message.
     *
     * @param reaction the reaction to be added.
     */
    public void addReaction(Reaction reaction) {
        reactions.add(reaction);
    }

    /**
     * Returns a summary of the reactions in the format:
     * "Thumbs Up: 2\nSmile: 1\nSad: 1\n". Returns an empty string if there are no
     * reactions.
     *
     * @return a string representing the summary of reactions.
     */
    public String getReactionSummary() {
        if (reactions.isEmpty()) {
            return "";
        }
        int thumbsUp = 0;
        int smile = 0;
        int sad = 0;
        for (Reaction r : reactions) {
            if (r == Reaction.THUMBS_UP) {
                thumbsUp++;
            }
            if (r == Reaction.SMILE) {
                smile++;
            }
            if (r == Reaction.SAD) {
                sad++;
            }
        }
        String result = "";
        if (thumbsUp > 0) {
            result += "Thumbs Up: " + thumbsUp + "\n";
        }
        if (smile > 0) {
            result += "Smile: " + smile + "\n";
        }
        if (sad > 0) {
            result += "Sad: " + sad + "\n";
        }
        return result;
    }

    /**
     * Determines whether the message is relevant to the specified user.
     * The message is considered relevant if the username matches the creator
     * or the text contains "@username@".
     *
     * @param user the username to check relevance for.
     * @return true if the message is relevant to the user; false otherwise.
     */
    public boolean relevantTo(String user) {
        if (this.username.equals(user) || this.text.contains("@" + user + "@")) {
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of the message with detailed information,
     * including the message ID, creator, text, and reaction summary.
     *
     * @return a formatted string representing the message.
     */
    @Override
    public String toString() {
        return "Message ID: " + id + "\n" +
                "Creator: " + username + "\n" +
                "Text: " + text + "\n" +
                "Reactions:\n" + getReactionSummary();
    }

    /**
     * Returns a short version of the message that includes the username and
     * up to the first 50 characters of the text. If the text is longer than 50
     * characters,
     * it will append "..." to the end. Newline characters in the text are replaced
     * with spaces.
     *
     * @return a short version of the message.
     */
    public String shortString() {
        String shortText;
        if (text.length() > 50) {
            shortText = text.substring(0, 50);
        } else {
            shortText = text;
        }
        String result = "";
        for (int i = 0; i < shortText.length(); i++) {
            char currentChar = shortText.charAt(i);
            if (currentChar == '\n') {
                result += ' ';
            } else {
                result += currentChar;
            }
        }
        return username + ": " + result;
    }

}
