import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class TSG_main{

  private void printActions(Slots[] slotsList){
    System.out.println("*     Select your slot:     *");
    System.out.println("===============================");
    for (int i=0; i < slotsList.length; i++){
      System.out.println( (i+1) + ". Select " + slotsList[i].getType() + " Ticket, " +
      ticketList[i].getAge() + ". Price: " + precision.format(ticketList[i].getPrice()) + " SEK.");
    }
    System.out.println("6. Exit ticket machine.    ");

  }

  private void printWelcome(){
    System.out.println("\nWelcome to 24/7 Garage!");
  }

  private void printEnterReg(){
    System.out.println("Enter your registration number:");
  }
    public static void main(String[] args){
      TSG_main main = new TSG_main();
      Scanner scan = new Scanner(System.in);

      main.println(Slots.getSlots());

      main.printWelcome();
      main.printEnterReg();
      String regNumber = scan.nextLine();

    /*  regNumber = regNumber.replace("-","").replace(" ","");*/

      System.out.println("Your registration number is:" + regNumber);
      System.out.println("Confirm? Y/N");
      String answer;
      while(true){
        try{
          answer = scan.nextLine();
          if(answer!="Y"){
            System.out.println("Chose a parking slot:");
            break;}
          else {
          main.printEnterReg();
          break;}
          }
        catch (InputMismatchException e){
          main.printEnterReg();
        }
      }

    /*  if(answer=="Y"){
        System.out.println("Chose a parking slot:");
      }
    else {
        main.printEnterReg();
      }*/

    }

}
