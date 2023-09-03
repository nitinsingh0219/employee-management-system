/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment2;

import java.text.NumberFormat;

/**
 *
 * @author timja
 */
public class item {
    //decleare variables
    String itemSupplier, itemID, itemName, itemIndividualCostFormatted, serialNumber;
    float itemIndividualCost;
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    
    public item(){ //zero argument constructor
        itemSupplier = "defult";
        itemID = "defult";
        itemName = "defult";
        itemIndividualCost = (float)0.00;
        itemIndividualCostFormatted = currencyFormat.format(0);
        serialNumber = "0";
    }
    
    public item(String a, String b, String c, float d, String e){ //main constructor
        itemSupplier = a;
        itemID = b;
        itemName = c;
        itemIndividualCost = d;
        itemIndividualCostFormatted = currencyFormat.format(0);
        serialNumber = e;
    }
        
    //set and get methods
    public void setItemName (String chooseItemName){
        itemName = chooseItemName;        
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public void setItemID (String chooseItemID){
        itemID = chooseItemID;
    }
    
    public String getItemID (){
        return itemID;
    }
    
    public void setItemSupplier (String chooseItemSupplier){
        itemSupplier = chooseItemSupplier;
    }
    
    public String getItemSupplier (){
        return itemSupplier;
    }
    
    public void setItemIndividualCost (float chooseItemIndividualCost){
        itemIndividualCost = chooseItemIndividualCost;
        itemIndividualCostFormatted = currencyFormat.format(chooseItemIndividualCost);
    }
    
    public float getItemIndividualCost(){
        return itemIndividualCost;
    }
    
    public String getItemIndividualCostFormatted(){
        return itemIndividualCostFormatted;
    }
    
    public void setItemSerialNumber (String chooseItemSerialNumber){
        serialNumber = chooseItemSerialNumber;
    }
    
    public String getItemSerialNumber (){
        return serialNumber;
    }
    
    public void printStates (){ //print states for testing
        System.out.println("Item Name: "+itemName+", Item ID: "+itemID+", Supplier: "+itemSupplier+", Cost: "+itemIndividualCost+", Formatted Cost: "+itemIndividualCostFormatted+", Serial Number: "+serialNumber);  
    }
}