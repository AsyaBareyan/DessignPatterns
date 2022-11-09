package behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat=new SimpleTextChat();
        User admin=new Admin("Admin",chat);
        User user1=new SimpleUser("User1",chat);
        User user2=new SimpleUser("User2",chat);

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, i am user 1");
        admin.sendMessage("i am admin");

    }
}
