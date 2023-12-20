public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        Sorter sorter = new Sorter();

        // Sử dụng thuật toán Bubble Sort
        SortingStrategy bubbleSort = new BubbleSort();
        sorter.setSortingStrategy(bubbleSort);
        sorter.performSort(arr);

        System.out.println("Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Sử dụng thuật toán Selection Sort
        int[] arr2 = {5, 2, 9, 1, 5, 6}; // Reset mảng ban đầu
        SortingStrategy selectionSort = new SelectionSort();
        sorter.setSortingStrategy(selectionSort);
        sorter.performSort(arr2);

        System.out.println("\nSelection Sort:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
