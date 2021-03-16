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
        
        ArrayList<Integer> unsortedArray = new ArrayList<Integer>();
        
        unsortedArray.add(8);
        unsortedArray.add(7);
        unsortedArray.add(6);
        unsortedArray.add(5);
        unsortedArray.add(4);
        unsortedArray.add(0);
        unsortedArray.add(2);   
        MergeSort ms = new MergeSort(unsortedArray);
        
        System.out.println("---------Initial Unsorted Array---------");
        for(int i:ms.getSortedArray()){
            System.out.print(i+" ");
        }
        
 
        ms.sortGivenArray();
        
        System.out.println("\n------------Sorted Array------------");
        for(int i:ms.getSortedArray()){
            System.out.print(i+" ");
        }
    }
}
