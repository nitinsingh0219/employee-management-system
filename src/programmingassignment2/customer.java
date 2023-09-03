/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment2;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author timja
 */
public class customer {
    //declare variables
    String name, address, email, amountSpentFormatted, phoneNumber;
    float amountSpent;
    LocalDateTime date;
    //create formatting
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    
    public customer (){ //zero argument
        name = "default";
        address = "defult";
        email = "default";
        amountSpent = (float)0.00;
        amountSpentFormatted = currencyFormat.format(0);
        phoneNumber = "0";
        date = LocalDateTime.now();
    }
    
    public customer (String a, String b, String c, float d, String e){ //main constructor
        name = a;
        address = b;
        email = c;
        amountSpent = d;
        amountSpentFormatted = currencyFormat.format(d);
        phoneNumber = e;
        date = LocalDateTime.now();
    }
    
    //set and get methods
    public void setName (String chooseName){
        name = chooseName;        
    }
    
    public String getName (){
        return name;
    }
    
    public void setAddress (String chooseAddress){
        address = chooseAddress;
    }
    
    public String getAddress (){
        return address;
    }
    
    public void setEmail (String chooseEmail){
        email = chooseEmail;
    }
    
    public String getEmail (){
         return email;
    }
    
    public void setAmountSpent (float chooseAmountSpent){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        amountSpent = chooseAmountSpent;
        amountSpentFormatted = formatter.format(chooseAmountSpent);
    }
    
    public float getAmountSpent(){
        return amountSpent;
    }
    
    public String getAmountSpentFormatted (){
        return amountSpentFormatted;
    }
    
    public void setPhoneNumber (String choosePhoneNumber){
        phoneNumber = choosePhoneNumber;
    }
    
    public String getPhoneNumber (){
        return phoneNumber;
    }
    
    public String getDate (){
        return date.format(dateFormat);
    }
    
    public void printStates (){ //printStates for testing
        System.out.println("Name: "+name+", Address: "+address+", Email: "+email+", Amount Spent: "+amountSpent+", Formatted Amount Spent: "+amountSpentFormatted+", Phone Number: "+phoneNumber+", Date: "+date.format(dateFormat));  
    }
}
