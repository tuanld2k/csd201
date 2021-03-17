/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortarraylist;

/**
 *
 * @author nguoitamxa
 */
import java.util.ArrayList;

 
public class MainPractise implements Cloneable {    
    
    public static void main(String[] args) {        
        
        ArrayList<Employees> unsortedArray = new ArrayList<Employees>();
        
        unsortedArray.add(new Employees(5, "Tuan", 2));
        unsortedArray.add(new Employees(6, "Hoang", 3));
        unsortedArray.add(new Employees(8, "Nam", 5));
        unsortedArray.add(new Employees(9, "Tien", 10));
        unsortedArray.add(new Employees(2, "Tien", 11));
        unsortedArray.add(new Employees(1, "Chuong", 9));
        unsortedArray.add(new Employees(20, "Chien", 2));   
        
        MergeSort ms = new MergeSort(unsortedArray);
        
        System.out.println("---------Initial Unsorted Array---------");
        
        for (Employees unsortedArray1 : unsortedArray) {
            unsortedArray1.print();
        }
        
        ms.sortGivenArray();
        
        System.out.println("\n------------Sorted Array------------");
       
        for (Employees unsortedArray1 : unsortedArray) {
            unsortedArray1.print();
        }
        
    }
}
