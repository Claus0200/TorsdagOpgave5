import java.util.ArrayList;

public class Main {
    static Building building1;
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(2,10,4));
        rooms.add(new Room(2,12,6));
        rooms.add(new Room(1,6,3));
        building1 = new Building(rooms,6,8,true);
        System.out.println(countLampsInBuilding(building1));
        System.out.println(isNormal(building1));
    }
    public static int countLampsInBuilding(Building building) {
        int lampsInBuilding = 0;
        for(int i = 0; i < building.getRooms().size(); i++) {
            int lampsInRoom = building.getRooms().get(i).getNumberOfLamps();
            lampsInBuilding += lampsInRoom;
        }
        return lampsInBuilding;
    }

    public static boolean isNormal(Building building) {
        int numberOfFloors = building.getNumberOfFloors();
        int numberOfRooms = building.getRooms().size();
        if(numberOfFloors > numberOfRooms) {
            return true;
        }
        else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}