public class FirstLastOccurrence {

    public static int[] findFirstLastOccurrence(int[] arr, int target) {
        int firstIndex = -1;
        int lastIndex = -1;
        
        // Iterate through the array once
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstIndex == -1) {
                    firstIndex = i;  // First occurrence found
                }
                lastIndex = i;  // Always update last occurrence
            }
        }
        
        return new int[] {firstIndex, lastIndex};
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 5, 9, 5, 11};
        int target = 5;
        
        int[] result = findFirstLastOccurrence(arr, target);
        System.out.println("First occurrence: " + result[0] + ", Last occurrence: " + result[1]);
    }
}

// output
// First occurrence: 2,
//  Last occurrence: 6
