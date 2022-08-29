package com.sam.assignment;

public class Chat {

    public static final int Count = 0;

    synchronized void atik() {
        String atikMsg[]={"Attention Sobai","Pappur nam e bichar ache ekta.","Pappu Bathroom e jore jore gan gai. Amar disturb hoi."};
        for(int i=0;i<atikMsg.length;i++)
        {
            System.out.println(Thread.currentThread().getName()+atikMsg[i]);
            if(i!=0)
            {
                notify();
            }
            try
            {
                wait();
            }
            catch (Exception e){}
        }
    }
    synchronized void pappu() {
        String pappuMsg[]={"Ki hoice?","Ki korsi ami?","Aj theke aro jore jore gaibo."};
        for(int i=0;i<pappuMsg.length;i++)
        {
            System.out.println(Thread.currentThread().getName()+pappuMsg[i]);
            if(i!=0)
            {
                notify();
            }
            try
            {
                wait();
            }
            catch (Exception e){}
        }
    }
    synchronized void bappy() {
        String bappyMsg[]={"Ki?","Pappur shasti, Agami 2 diner bazar Or.","Agami 4 diner bazar Pappur."};
        for(int i=0;i<bappyMsg.length;i++)
        {
            System.out.println(Thread.currentThread().getName()+bappyMsg[i]);
            if(i!= Count)
            {
                notify();
            }
            try
            {
                wait();
            }
            catch (Exception e){}
        }
    }
    synchronized void tasdid() {
        String tasdidMsg[]={"...","Areh! age bol ki korse Pappu?","Ghuma beda! eto rate bichar niye aschos"};
        for(int i=0;i<tasdidMsg.length;i++)
        {
            System.out.println(Thread.currentThread().getName()+tasdidMsg[i]);
            notify();
            try
            {
                wait();
            }
            catch (Exception e){}
        }
    }
}
