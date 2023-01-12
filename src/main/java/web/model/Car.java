package web.model;

public class Car {
    private String model;
    private double xCoord;
    private double yCoord;

    public Car(String model, double xCoord, double yCoord) {
        this.model = model;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord() {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord() {
        this.yCoord = yCoord;
    }

    @Override
    public String toString() {
        return model + " Coords by x: " + xCoord + " Coords by y:" + yCoord;
    }
}
