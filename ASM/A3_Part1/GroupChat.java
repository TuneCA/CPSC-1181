import java.util.ArrayList;

/**
 * The GroupChat class manages users and messages within a group chat.
 * It allows adding users, posting messages, reacting to messages,
 * and retrieving relevant messages for a specific user.
 * 
 * @author Tat Tung Nguyen
 * 
 */
public class GroupChat {
    private ArrayList<String> usernames;
    private ArrayList<Message> messages;

    /**
     * Constructs an empty GroupChat.
     * Initializes the usernames and messages lists to be empty.
     */
    public GroupChat() {
        this.usernames = new ArrayList<String>();
        this.messages = new ArrayList<Message>();
    }

    /**
     * Returns the list of usernames in the group chat.
     * 
     * @return an ArrayList of usernames.
     */
    public ArrayList<String> getUserList() {
        return this.usernames;
    }

    /**
     * Adds a new user to the group chat.
     * The username must be between 1 and 20 characters long, and duplicate
     * usernames are not allowed.
     * 
     * @param username the username to add to the group chat.
     */
    public void addUser(String username) {
        if (username.length() >= 1 && username.length() <= 20) {
            if (!usernames.contains(username)) {
                usernames.add(username);
            }
        } else {
            return;
        }

    }

    /**
     * Posts a new message to the group chat.
     * Only users who are part of the chat can post messages. If the creator is not
     * in the chat,
     * an IllegalArgumentException is thrown.
     * 
     * @param creator the username of the person posting the message.
     * @param text    the content of the message.
     * @throws IllegalArgumentException if the creator is not found in the group
     *                                  chat.
     */
    public void postMessage(String creator, String text) {
        if (!usernames.contains(creator)) {
            throw new IllegalArgumentException("Username is not found");
        }
        Message newMessage = new Message(creator, text);
        messages.add(newMessage);
    }

    /**
     * Adds a reaction to a message based on its ID.
     * If no message with the specified ID is found, an IllegalArgumentException is
     * thrown.
     * 
     * @param id       the ID of the message to react to.
     * @param reaction the reaction to add to the message.
     * @throws IllegalArgumentException if the message ID is not found.
     */
    public void reactToMessage(int id, Message.Reaction reaction) {
        for (Message msg : messages) {
            if (msg.getId() == id) {
                msg.addReaction(reaction);
                return;
            }
        }
        throw new IllegalArgumentException("Id is not found");
    }

    /**
     * Returns all messages in the group chat as an ArrayList of strings.
     * Each message is converted to its string representation.
     * 
     * @return an ArrayList of message strings.
     */
    public ArrayList<String> getMessages() {
        ArrayList<String> stringsMessage = new ArrayList<String>();
        for (Message msg : messages) {
            stringsMessage.add(msg.toString());
        }
        return stringsMessage;

    }

    /**
     * Returns messages relevant to a specific user.
     * A message is considered relevant if it was posted by the user or if the
     * message
     * contains an "@" mention of the user.
     * 
     * @param user the username to check for relevance.
     * @return an ArrayList of relevant message strings.
     */
    public ArrayList<String> getRelevantMessages(String user) {
        ArrayList<String> relevantMessages = new ArrayList<String>();
        for (Message msg : messages) {
            if (msg.relevantTo(user)) {
                relevantMessages.add(msg.toString());
            }
        }
        return relevantMessages;
    }

}
