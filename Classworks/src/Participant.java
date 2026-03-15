import javax.naming.Name;

public class Participant {
    public String name;
    public String surName;
    public String phoneNumber;
    public int ticket;

    public void details() {
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surName);
        System.out.println("Phone : " + phoneNumber);
        System.out.println("Ticket : " + ticket);
    }
}
