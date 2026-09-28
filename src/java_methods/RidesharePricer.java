package java_methods;

public class RidesharePricer {

    public static void main(String[] args) {

        double distanceInMiles = 10.0;
        int timeOfDay = 18;
        String weatherCondition = "Rain";
        double fare = 0.0;   // <-- initialize here

        switch (weatherCondition) {
            case "Clear":
                fare = 5.00;
                break;
            case "Rain":
                fare = 7.50;
                break;
            case "Snow":
                fare = 10.00;
                break;
            default:
                fare = 5.00;
                break;
        }

        fare += distanceInMiles * 1.50;

        if ((timeOfDay >= 17 && timeOfDay <= 19) || distanceInMiles > 15) {
            fare += 3.00;
        }

        if (timeOfDay >= 0 && timeOfDay <= 5) {
            fare -= fare * 0.20;
        }

        System.out.printf("Final fare: $%.2f%n", fare);
    }
}