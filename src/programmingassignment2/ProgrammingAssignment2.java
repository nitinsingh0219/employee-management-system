/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment2;
/**
 *
 * @author timja
 */
public class ProgrammingAssignment2 {

    public static void main(String[] args) {
        
        //print states for testing
        customer test1 = new customer();
        test1.printStates();
        
        item test2 = new item();
        test2.printStates();
        
        //create gui
        guiMainDisplay displayMain = new guiMainDisplay();
        displayMain.setVisible(true);
        }
}
