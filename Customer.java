
package compscirealestate;


public class Customer {
    private static String username;
    private static String password;
    private static int creditCard;
    
    public Customer(String u, String p, int cC){
        
        username = u;
        password = p;
        creditCard = cC;
        
    }// end constructor
    public static String getUsrnm(){
        return username;
    }// end getUsrnem
    
    public  static String getPass(){
        return password;
    }// end getPass
    
    public static int getCreditCard(){
        return creditCard;
    }// end getCreditCard
}// end class
