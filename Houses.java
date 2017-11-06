
package compscirealestate;


public class Houses {
    String houseName;
    String address;
    int price;
    int size;
    int yearBuilt;
    String color;
    boolean sold;
   
    public Houses(String hN, String a, int p, int s, int yB, String c){
        houseName = hN;
        address = a;
        price = p;
        size = s;
        yearBuilt = yB;
        color = c;
        sold = false;
        
    }// end constructor
    
    public void getInfo(){
        System.out.println("The house is located at: " + address + " listed for: " + price + " is: " + size + " square feet and was built in " + yearBuilt);
    }// end getInfo
    
    public void buyHouse(){
        boolean sold = true;
        
    }// end buyHouse
    public static int searchByPrice(){
        
        
        return -1;
    }// end searchByPrice
    
}// end class
