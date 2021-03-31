package day13;



public class Task13 {
    public static void main(String[] args) {
        User bob = new User("Bob");
        User rob = new User("Rob");
        User jessica = new User("Jessica");

//        bob.sendMessage(rob, "Hello");
//        bob.sendMessage(rob, "World!");
//
//        rob.sendMessage(bob, "Were");
//        rob.sendMessage(bob, "are you");
//        rob.sendMessage(bob, "from ?");
//
//        jessica.sendMessage(bob, "How");
//        jessica.sendMessage(bob, "are");
//        jessica.sendMessage(bob, "you?");
//
//        bob.sendMessage(jessica, "Good");
//        bob.sendMessage(jessica, "morning");
//        bob.sendMessage(jessica, "Jessica");
//
//        jessica.sendMessage(bob, "I'm fine!");

        // System.out.println(MessageDatabase.getMessages());

        // MessageDatabase.showDialog(bob, jessica);

        // part two - "Bob & Jessica"
        bob.sendMessage(jessica, "Hello Jessica!");
        jessica.sendMessage(bob, "Hello Bob!");
        bob.sendMessage(jessica, "How are you?");
        jessica.sendMessage(bob, "I'm fine!");
        bob.sendMessage(jessica, "I want to fack you!");
        jessica.sendMessage(bob, "I want you too!");
        bob.sendMessage(jessica, "Suck my dick");
        jessica.sendMessage(bob, "Mmm... Mmm... Mmm...");
        bob.sendMessage(jessica, "Oooooooooooo");


        MessageDatabase.showDialog(bob,jessica);

    }
}
