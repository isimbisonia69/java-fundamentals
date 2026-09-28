
    public static void main(String[] args) {

     
        double distance = 10.0;
        int time = 18;
        String weather= "Rain";
        double fare;

        switch (weather) {
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

        if ((time >= 17 && time <= 19) || distance > 15) {
            fare += 3.00;
        }

        if (time >= 0 &&  <= 5) {
            fare -= fare * 0.20;
        }

        System.out.printf("Final fare: $%.2f%n", fare);
    }





