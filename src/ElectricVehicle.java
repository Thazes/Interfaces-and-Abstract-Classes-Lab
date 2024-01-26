abstract class ElectricVehicle{
    abstract void batteryType();
}

class ElectricCar extends ElectricVehicle{

    @Override
    void batteryType() {
        System.out.println("An Electric Car uses a lithium iron battery");

    }
}

class Electricbike extends ElectricVehicle{

    @Override
    void batteryType() {
        System.out.println("An Electric Bike uses a lead acid battery");

    }
}

class mainElectricVehicle{
    public static void main(String[] args) {
        Electricbike electricbike=new Electricbike();
        ElectricVehicle electricVehicle=new ElectricCar();

        electricbike.batteryType();
        System.out.println("*******************************");
        electricVehicle.batteryType();
    }
}