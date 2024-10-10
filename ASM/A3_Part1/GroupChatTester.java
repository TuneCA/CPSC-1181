/**
 * The GroupChatTester class is a simple test class that demonstrates the
 * functionality
 * of the Message class. It adds users, posts messages, reacts to messages,
 * and retrieves
 * both all messages and relevant messages for a specific user.
 * 
 * @author Tat Tung Nguyen
 * 
 */
public class GroupChatTester {
    public static void main(String[] args) {
        GroupChat groupChat = new GroupChat();

        // Adding users
        groupChat.addUser("Tune");
        groupChat.addUser("Kat");
        groupChat.addUser("Negav");

        // Posting messages
        groupChat.postMessage("Tune", "Hello everyone!");
        groupChat.postMessage("Kat", "Welcome @Tune@!");
        groupChat.postMessage("Negav", "How are you?");

        // Reacting to messages
        groupChat.reactToMessage(0, Message.Reaction.THUMBS_UP);
        groupChat.reactToMessage(0, Message.Reaction.THUMBS_UP);
        groupChat.reactToMessage(1, Message.Reaction.SMILE);
        groupChat.reactToMessage(2, Message.Reaction.SAD);

        // Get all messages
        System.out.println("All Messages:");
        for (String message : groupChat.getMessages()) {
            System.out.println(message);
        }

        // Get relevant messages for Tune
        System.out.println("\nRelevant Messages for Tune:");
        for (String message : groupChat.getRelevantMessages("Tune")) {
            System.out.println(message);
        }
    }

}
