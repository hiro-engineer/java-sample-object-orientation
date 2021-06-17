public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car クラスの処理ここから");
        car.run();
        car.turn("右");
        car.stop();

        System.out.println("Taxi クラスの処理ここから");
        Taxi taxi = new Taxi();
        taxi.payfee();
        taxi.run();
        taxi.turn("左");
        taxi.stop();

        System.out.println("Bus クラスの処理ここから");
        Bus bus = new Bus();
        bus.payfee();
        bus.roundBusStation();
        bus.run();
        bus.turn("左");
        bus.stop();

        System.out.println("Truck クラスの処理ここから");
        Truck truck = new Truck();
        truck.stack();
        truck.run();
        truck.turn("左");
        truck.stop();

        System.out.println("ElectricCar クラスの処理ここから");
        ElectricCar electricCar = new ElectricCar();
        electricCar.run();
        electricCar.turn("左");
        electricCar.stop();

        System.out.println("AmphibiousVehicle クラスの処理ここから");
        AmphibiousVehicle amphibiousVehicle = new AmphibiousVehicle();
        amphibiousVehicle.runOnWater();
        amphibiousVehicle.run();
        amphibiousVehicle.turn("左");
        amphibiousVehicle.stop();

    }
}
