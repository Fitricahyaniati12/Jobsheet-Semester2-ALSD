/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package MergeSortTest;

/**
 *
 * @author HP
 */
public class MergeSortTest {

    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("sorting dengan merge sort ");
        MergeSorting mSort= new MergeSorting();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    
    }
}
