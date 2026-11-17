package down;

class Car {
    void speed() {
        System.out.println("100");
    }
}

class Bike extends Car {
    void speed() {
        System.out.println("40");
    }

    public static void main(String[] args) {
        // Downcasting
        Car c = new Bike();
        Bike b = (Bike) c;
        b.speed();
    }
}