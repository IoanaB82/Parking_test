//a file to define our slots list - available?
import java.util.ArrayList;
public class BookedSlotsList{
    public static ArrayList<BookedSlotsList> bookedList = new ArrayList<BookedSlotsList>();

    public void addBookedSlot(int slotId, boolean status){
      Slot s = new Slot();
      p.createEntry(slotId, status);
      bookedList.add(s);
    }
    public ArrayList<Slot> getEntries(){
      return bookedList;
    }

    public int slotCounter(){

    }
  }

}
