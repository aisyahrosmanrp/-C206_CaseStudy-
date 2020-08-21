
import java.util.ArrayList;

public class C206_CaseStudy {
  private static void ManagePackage(ArrayList<Package> List) {
    Helper.line(90, "-");
    System.out.println("1.ADD PACKAGE");
    System.out.println("2.VIEW PACKAGE");
    System.out.println("3.DELET PACKAGE");
    System.out.println("MENU");
    Helper.line(90, "-");
    int option = Helper.readInt("Enter an option > ");

    while (option != 4) {
      //GO BACK TO MENU 
      if (option == 1) {
        //ADD PACKAGE
        Helper.line(80, "-");
        System.out.println("ADD PACKAGE");
        Helper.line(80, "-");
        String code = Helper.readString("code");
        String desc = Helper.readString("description ");
        String start = Helper.readString("start date");
        String end = Helper.readString("End date ");
        String amount = Helper.readString("price");

        List.add(new Package(code, desc, start, end, amount));
        System.out.println(" added ");
        
      } else if (option == 2) {
        //VIEW PACKAGE
        System.out.println("VIEW ALL PACKAGE ");
        Helper.line(80, "-");
        String output = String.format("%-5S %-15S %-10S %-10S %-10S \n", "CODE", "DESC", "START", "END",
            "AMOUNT");
        for (int i = 0; i < List.size(); i++) {
          output += String.format("%-5S %-15S %-10S %-10S %-10S", List.get(i).getCode(),
              List.get(i).getDescription(), List.get(i).getStartDate(),
              List.get(i).getEndDate(), List.get(i).getAmount());
        }
        System.out.println(output);
      } else if (option == 3) {
        //DELETE PACKAGE
        System.out.println("DELETE PACKAGE BY CODE");
        Helper.line(80, "-");
        String delETPack = Helper.readString("Enter  code to delete package  > ");
        boolean Delete = false;
        for (int i = 0; i < List.size(); i++) {
          if (Delete == false && delETPack.equalsIgnoreCase(List.get(i).getCode())) {//equalsIgnoreCase so that lower or upper caps still get deleted 
            List.remove(i);
            Delete = true;
          }
        }
        if (Delete == true) {
          System.out.println(
              String.format("deleted", delETPack));
        } else {
          System.out.println(String.format("pls try again with the correct details ", delETPack));
        }
      } else {
        System.out.println("Invalid");
        break;
      }
      System.out.println("1.ADD PACKAGE");
      System.out.println("2.VIEW PACKAGE");
      System.out.println("3.DELET PACKAGE");
      System.out.println("MENU");
      option = Helper.readInt("Enter an option ");
    }
  }


}