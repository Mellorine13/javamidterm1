package t1;

import java.util.ArrayList;
import java.util.List;

/**
 * A program that generates a third list ({@code list3}) by mapping indices from {@code list1}
 * to elements in {@code list2}. Each element in {@code list1} specifies a position in {@code list2},
 * and the corresponding element is placed in {@code list3}.
 *
 * @author Nikoloz Jintcharadze
 * @version 1.0
 * @since 2024
 */
public class t1 {

    /**
     * The main method that executes the list-merging logic.
     *
     * @param args Command-line arguments (unused in this program).
     */
    public static void main(String[] args) {
        // Define list1 (integers representing positions) and list2 (3-character strings)
        List<Integer> list1 = List.of(8, 4, 2, 9, 6, 10, 5, 3, 1, 7);
        List<String> list2 = List.of(
                "abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz1", "234"
        );

        // Initialize list3 with nulls (to be filled later)
        List<String> list3 = new ArrayList<>(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            list3.add(null);
        }

        // Populate list3 based on list1's values
        for (int i = 0; i < list1.size(); i++) {
            int positionInList2 = list1.get(i) - 1; // Convert to 0-based index
            String elementFromList2 = list2.get(positionInList2);
            list3.set(i, elementFromList2);
        }

        // Output the result
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("List3: " + list3);
    }

    /**
     * Maps an index from {@code list1} to an element in {@code list2}.
     * This is a helper method for demonstration purposes.
     *
     * @param indexInList1 The 1-based index from {@code list1}.
     * @param list2 The list from which to fetch the element.
     * @return The corresponding element from {@code list2}.
     * @throws IndexOutOfBoundsException If {@code indexInList1} is invalid.
     */
    public static String mapIndexToList2(int indexInList1, List<String> list2) {
        if (indexInList1 < 1 || indexInList1 > list2.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + indexInList1);
        }
        return list2.get(indexInList1 - 1);
    }
}