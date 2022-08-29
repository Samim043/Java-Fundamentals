package com.sam.assignment;

public class ChatMessenger {
    public static void main(String[] args) {
        System.out.println("Uniliver 4th Floor Group Chat\n-----------------------------");
        Chat chat = new Chat();
        new Thread("Atik :")
        {
            public void run()
            {
                chat.atik();
            }
        }.start();
        new Thread("Pappu :")
        {
            public void run()
            {
                chat.pappu();
            }
        }.start();
        new Thread("Bappy :")
        {
            public void run()
            {
                chat.bappy();
            }
        }.start();
        new Thread("Tasdid :")
        {
            public void run()
            {
                chat.tasdid();
            }
        }.start();
    }
}
