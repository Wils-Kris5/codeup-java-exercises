package InheritanceAndPolymorphism;

public class Garage {
      Vehicle[] vehicles;
    public void alarmCascade(){
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.getName() + " WEEWOOO WEE WOOO!!  ");
        }
    }
    public Vehicle findVehicle(String name, Vehicle[] vehicles){
        for(Vehicle vehicle : vehicles){
            if(vehicle.getName().equalsIgnoreCase(name)){
                return vehicle;
            }
        }
        Vehicle isGone = new Vehicle();
        isGone.setName(null);
        return isGone;
    }
}
