//a file to define our slots list - available?
import java.util.ArrayList;
public class AllSlotsList{
    public static ArrayList<AllSlotsList> slotsList = new ArrayList<AllSlotsList>();

    public void addSlot(int slotId, boolean slotStatus, String slotType){
      Slot s = new Slot();
      p.createEntry(slotId, slotStatus, slotType);
      slotsList.add(s);
    }
    public ArrayList<Slot> getEntries(){
      return slotsList;
    }
  }

}
