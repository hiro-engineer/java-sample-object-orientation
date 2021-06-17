public class AmphibiousVehicle extends Car implements DriveWater {

    @Override
    public void runOnWater() {
        System.out.println("水上を走る");
    }
}
