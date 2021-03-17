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

public class MergeSort {

    private ArrayList<Employees> inputArray;

    public ArrayList<Employees> getSortedArray() {
        return inputArray;
    }

    public MergeSort(ArrayList<Employees> inputArray) {
        this.inputArray = inputArray;
    }

    public void sortGivenArray() {
        divide(0, this.inputArray.size() - 1);
    }

    public void divide(int startIndex, int endIndex) {

        //Divide till you breakdown your list to single element
        if (startIndex < endIndex && (endIndex - startIndex) >= 1) {
            int mid = (endIndex + startIndex) / 2;

            divide(startIndex, mid);
            divide(mid + 1, endIndex);

            //merging Sorted array produce above into one sorted array
            merger(startIndex, mid, endIndex);
        }
    }

    public void merger(int startIndex, int midIndex, int endIndex) {

        //Below is the mergedarray that will be sorted array Array[i-midIndex] , Array[(midIndex+1)-endIndex]
        ArrayList<Employees> mergedSortedArray = new ArrayList<Employees>();

        int leftIndex = startIndex;
        int rightIndex = midIndex + 1;

        while (leftIndex <= midIndex && rightIndex <= endIndex) {
            if (inputArray.get(leftIndex).getId() <= inputArray.get(rightIndex).getId()) {
                mergedSortedArray.add(inputArray.get(leftIndex));
                leftIndex++;
            } else {
                mergedSortedArray.add(inputArray.get(rightIndex));
                rightIndex++;
            }
        }

        //Either of below while loop will execute
        while (leftIndex <= midIndex) {
            mergedSortedArray.add(inputArray.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex <= endIndex) {
            mergedSortedArray.add(inputArray.get(rightIndex));
            rightIndex++;
        }

        int i = 0;
        int j = startIndex;
        //Setting sorted array to original one
        while (i < mergedSortedArray.size()) {
            inputArray.set(j, mergedSortedArray.get(i++));
            j++;
        }
    }

}
