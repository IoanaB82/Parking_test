//a class to define the properties of a slot
public class Slot {
  int slotId; // variable that can take values from 1 to 20
  String slotStatus;//true means slot is free, false means slot is booked
  String slotType;//variable which can take values of car, mc
  boolean status = true;

//constructor
public Slot(){

}

public Slot(int iSlotID, boolean iStatus){
  slotId = iSlotId;
  status = iStatus;
}
public Slot(int iSlotID, String iSlotStatus, String iSlotType, boolean iStatus){
  slotId = iSlotId;
  slotStatus = iSlotStatus;
  slotType = iSlotType;
  status = iStatus;
}

//get methods

public int getSlotId(){
  return this.slotId;
}

public String getSlotStatus(){
  return this.SlotStatus;
}

public String getSlotType(){
  return this.SlotType;
}

public boolean getStatus(){
  return this.status;
}

//set methods
public void setSlotStatus(Slot s, String iSlotStatus){
  s.slotStatus = iSlotStatus;
}

public boolean checkStatus(){
  if(status!="available") {
      return false;}
    }
}

/*public void printStatus(){
  if (status!="available"){
    System.out.println("booked");
  }
  else {
    System.out.println("available")
  }
}*/
}

/*test
Slot s1 = new Slot(1, "available", "mc");
Slot s2 = new Slot(2, "available", "mc");
Slot s3 = new Slot(3, "available", "car");
Slot s4 = new Slot(4, "available", "car");
Slot s5 = new Slot(5, "available", "car");
Slot s6 = new Slot(6, "available", "car");
Slot s7 = new Slot(7, available, "car");
Slot s8 = new Slot(8, available, "car");
Slot s9 = new Slot(9, available, "car");
Slot s10 = new Slot(10, available, "car");
Slot s11 = new Slot(11, available, "car");
Slot s12 = new Slot(12, available, "car");
Slot s13 = new Slot(13, available, "car");
Slot s14 = new Slot(14, available, "car");
Slot s15 = new Slot(15, available, "car");
Slot s16 = new Slot(16, available, "car");
Slot s17 = new Slot(17, available, "car");
Slot s18 = new Slot(18, available, "car");
Slot s19 = new Slot(19, available, "car");
Slot s20 = new Slot(20, available, "car");
*/
