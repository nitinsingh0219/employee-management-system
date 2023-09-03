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
public class sold {
    //create variables
    String totalAmountSpentFormatted;
    float totalAmountSpent;
    int totalItemsSold, totalItems, totalCustomers;

    //create format variable
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    
    public sold (){ //zero argument constructor
        totalAmountSpentFormatted = currencyFormat.format(0);
        totalAmountSpent = (float)0.00;
        totalItemsSold = 0;
        totalCustomers = 0;
        totalItems = 0;
    }
    
    public sold (float a, int b, int c, int d){ //main constructor
        totalAmountSpent = a;
        totalAmountSpentFormatted = currencyFormat.format(a);
        totalItemsSold = b;
        totalCustomers = c;
        totalItems = d;
    }
    
    //get methods
    public int getTotalCustomers(){
        return totalCustomers;
    }
    
    public int getTotalItems(){
        return totalItems;
    }
    
    public int getTotalItemSold(){
        return totalItemsSold;
    }
}
