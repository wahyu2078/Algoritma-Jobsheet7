package MergeSortTest;

public class SortMain29 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting with merge sort");
        MergeSorting29 mSort = new MergeSorting29();
        System.out.println("Data awal:");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah diurutkan:");
        mSort.printArray(data);
    }
}
