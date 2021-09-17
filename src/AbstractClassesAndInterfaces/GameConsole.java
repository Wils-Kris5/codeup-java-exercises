package AbstractClassesAndInterfaces;
 public class GameConsole implements Transferable {
    // some state & behavior for gaming console


    @Override
    public void transferToNewLocation(String location) {
        System.out.println("From current room to this room: " + location);
    }
  public String[] getListOfPossibleTransferLocations() {
      return new String[]{"Room1", "Room2"};
  }
}
