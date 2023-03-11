
/*
 * 1-write a program to create a room class, the attributes of this class is roomno, roomtype, 
    roomarea and ACmachine. In this class the member functions are setdata and displaydata
    
    2-Write a program create a class ‘simpleobject‘. Using constructor display the message
 */

 public class Room {
    private int roomno;
    private String roomtype;
    private double roomarea;
    private boolean ACmachine;

    public Room() {
        System.out.print("Room object has been created");
    }

    public void setdata(int roomno, String roomtype, double roomarea, boolean ACmachine) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }

    public void displaydata() {
        System.out.println("Room number: " + roomno);
        System.out.println("Room type: " + roomtype);
        System.out.println("Room area: " + roomarea);
        if (ACmachine) {
            System.out.println("Air conditioning machine is available.");
        } else {
            System.out.println("Air conditioning machine is not available.");
        }
    }
    public static void main(String[] args) {
        Room room=new Room();
        room.displaydata();
    }

}

