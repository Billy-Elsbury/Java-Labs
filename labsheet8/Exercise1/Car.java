package labsheet8.Exercise1;

public class Car {
    private int maxPassengers;
    private String registrationNumber;

    public Car(int maxPassengers, String registrationNumber) {
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxPassengers=" + getMaxPassengers() +
                ", registrationNumber='" + getRegistrationNumber() + '\'' +
                '}';
    }
}
