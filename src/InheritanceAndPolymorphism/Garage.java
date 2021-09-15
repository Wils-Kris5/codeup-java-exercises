package InheritanceAndPolymorphism;
 //changes in method names is just for easier understanding and context of what the method is referencing
public class Garage {
      Vehicle[] vehicles;
    public void alarmCascade(){
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.getName() + " WEEWOOO WEE WOOO!!");
        }
    }
    public Vehicle findVehicle(String name, Vehicle[] vehicles){
        for(Vehicle vehicle: vehicles){
            if(vehicle.getName().equalsIgnoreCase(name)){
                return vehicle;
           //     he put the findVehicle result in the customersVehicle and then used his getName method to get the name rather than the reference ID

            }
        }
        Vehicle isGone = new Vehicle();
           isGone.setName(null);
             return isGone;
        // is set to null he put the findVehicle result in the customersVehicle and then used his getName method to get the name rather than the reference ID

        
    }
}
