interface Amphibious{
    void dock();
    void launch();
}

interface AirVehicle{
    void fly();
}

class AmphibiousPlane implements Amphibious,AirVehicle{

    @Override
    public void dock() {
        System.out.println("An amphibious plane can land on both water and land");
    }

    @Override
    public void launch() {
        System.out.println("An amphibious plane can take-off from both land as well as from water");
    }

    @Override
    public void fly() {
        System.out.println("An amphibious plane cannot fly huge distances due to small engine size");

    }
}

class mainAirVehicle{
    public static void main(String[] args) {
        AmphibiousPlane amphibiousPlane=new AmphibiousPlane();

        amphibiousPlane.dock();
        System.out.println("***********************************");
        amphibiousPlane.launch();
        System.out.println("***********************************");
        amphibiousPlane.fly();
        System.out.println("***********************************");

    }
}