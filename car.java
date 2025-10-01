public class car {
    private String name;
    private String carType;
    private String bodyColor;
    private int width;
    private int height;
    private int length;
    private boolean headlightsOn;
    private String tireType;
    private int doorNumber;

    public car(String carName, String type, String tires, int doors) {
        name = carName;
        carType = type;
        bodyColor = "white";
        tireType = tires;
        doorNumber = doors;
        width = 200;
        height = 150;
        length = 300;
        headlightsOn = false;
    }

    public void forward() {
        System.out.println(name + " drives forward");
    }

    public void turnLeft() {
        System.out.println(name + " turns left");
    }

    public void turnRight() {
        System.out.println(name + " turns right");
    }

    public void headlights(boolean on) {
        headlightsOn = on;
        if (headlightsOn) {
            System.out.println(name + " headlights are now on");
        } else {
            System.out.println(name + " headlights are now off");
        }
    }

    public void setDoorNumber(int doorNumber) {
        if (doorNumber == 0 || doorNumber == 1) {
            System.out.println("Not possible!");
        } else if (doorNumber == 2 || doorNumber == 3) {
            System.out.println("It is a small or sports car!");
        } else {
            System.out.println("Nothing special, a normal car!");
        }
        this.doorNumber = doorNumber; // make sure field is updated
    }

    public void honk() {
        System.out.println(name + " Beeeeep Beeeeeep!");
    }

    public String getCarType() {
        return carType;
    }

    public boolean getHeadlightsStatus() {
        return headlightsOn;
    }

    public String getDimensions() {
        return width + " x " + height + " x " + length;
    }

    public String getTireType() {
        return tireType;
    }

    public int getDoorNumber() {
        return doorNumber;
    }
}
