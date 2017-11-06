
package compscirealestate;

import javax.swing.JOptionPane;
import java.util.*;

public class CompSciRealEstate {

    public static ArrayList<Houses> allHouses = new ArrayList();
    public static ArrayList<Customer> allCustomers = new ArrayList();
    public static ArrayList<Seller> allSellers = new ArrayList();
    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {
        
        allHouses.add(new Houses("Bro home", "420 Bro Street", 400000000, 3000, 1997, "red"));
        allHouses.add(new Houses("Bro ome", "420 vro Street", 40, 300, 197, "rd"));
        allHouses.add(new Houses("Bro me", "420 Bro reet", 4000000, 30, 17, "d"));
        
        //new GUILogin2().setVisible(true);
        new GUISeller().setVisible(true);
        
        boolean run = true;
        while(run){
            
            System.out.println("Are you a seller or buyer (1 is seller 2 is buyer)");
            int userType = numscan.nextInt();
            if(userType == 1){
                System.out.println("1: post house listing 2: View existing listings 3: Login");
                int choice1 = numscan.nextInt();
                    if(choice1 == 1){
                        System.out.println("what would you like to list it as(name)");
                        String houseName = wordscan.nextLine();
                        System.out.println("Where is the house located(area)");
                        String address = wordscan.nextLine();
                        System.out.println("How much are you listing it for");
                        int price = numscan.nextInt();
                        System.out.println("How many square feet is it?");
                        int size = numscan.nextInt();
                        System.out.println("When was it built (year)");
                        int year = numscan.nextInt();
                        System.out.println("What color is the house?");
                        String color = wordscan.nextLine();
                        allHouses.add(new Houses(houseName, address, price, size, year, color));
                    } else if(choice1 == 2){
                        for(int i = 0; i<allHouses.size(); i++){
                            System.out.println(allHouses.get(i).houseName + " located: " + allHouses.get(i).address + " for: $" + allHouses.get(i).price);
                        }
                        
                    }
            }else if(userType == 2){
                
            }else{
                System.out.println("INVALID");
            }
            
        }// end run
        
        
    }//end main        
    
    
    
    
}//end class
