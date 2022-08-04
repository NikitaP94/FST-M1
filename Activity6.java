package activities;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        //There is a plane with max 10 passengers
        Airplane plane = new Airplane(10);
        //Add passengers on the list
        plane.onboard("Niki");
        plane.onboard("Tom");
        plane.onboard("Navv");
        //Plane takes off
        System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        //Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}
