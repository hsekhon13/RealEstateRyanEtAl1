
package compscirealestate;


public class Seller {
    private String username;
    private String password;
    
    public Seller(String u, String p){
           
        username = u;
        password = p;
        
    }// end constructor
    
    
    public String getUsrnm(){
        return username;
    }// end getUsrnem
    
    public String getPass(){
        return password;
    }// end getPass
}// end class
