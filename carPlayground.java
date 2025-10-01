public class carPlayground {
    public static void main(String[] args) {

        car car1 = new car("Speedy", "sports", "summer", 2);

        System.out.println("=== Testing Smart Car ===");

        car1.forward();
        car1.turnLeft();
        car1.headlights(true);
        car1.honk();
        car1.setDoorNumber(4);
        
        System.out.println("\n=== Checking Car Information ===");
        System.out.println("Car type: " + car1.getCarType());
        System.out.println("Tire type: " + car1.getTireType());
        System.out.println("Number of doors: " + car1.getDoorNumber());
        System.out.println("Headlights on? " + car1.getHeadlightsStatus());
        System.out.println("Dimensions: " + car1.getDimensions());
    }
}
