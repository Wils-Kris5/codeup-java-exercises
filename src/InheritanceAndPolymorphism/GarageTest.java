package InheritanceAndPolymorphism;

public class GarageTest {

    public static void main(String[] args){
    Car honda = new Car();
    honda.setName("Honda");
    Car kia = new Car();
    kia.setName("Kia");
     Car myCar = new Car();
     myCar.setName("Kris's Car");
     
        Vehicle[] vehiclesInTheGarage = new Vehicle[3];
             vehiclesInTheGarage[0] = honda;
             vehiclesInTheGarage[1] = kia;
             vehiclesInTheGarage[2] =  myCar;

             Tractor  kennyChesney = new Tractor();
             kennyChesney.setName("Tractor Pun");
              vehiclesInTheGarage[2] = kennyChesney;

           Garage garage = new Garage();
          garage.vehicles = vehiclesInTheGarage;
   // the customersVehicle is refrencing the customersVehicle in the main method in order to sout out the vehicle name rather than the reference ID
        Vehicle customersVehicle = garage.findVehicle("Honda" , vehiclesInTheGarage);
        System.out.println(customersVehicle.getName());
        Vehicle customersVehicle2 = garage.findVehicle("Tractor Pun" , vehiclesInTheGarage);
        System.out.println(customersVehicle2.getName());
        Vehicle customersVehicle3 = garage.findVehicle("Kris's Car" , vehiclesInTheGarage);
        System.out.println(customersVehicle3.getName());

    }
}
