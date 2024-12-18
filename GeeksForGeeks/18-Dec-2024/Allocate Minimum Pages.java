class Solution {
    public static int countStudents(int pages, int[] arr) {
        int students = 1;
        int studentPages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + studentPages > pages) {
                students++;
                studentPages = arr[i];  // Start counting pages for the next student
                if (students > pages) { // Optimization to stop early if pages are too small
                    return students;
                }
            } else {
                studentPages += arr[i];
            }
        }
        return students;
    }
    public static int findPages(int[] arr, int k) {
        int m=k,n=arr.length;
        // code here
        if (m > n) {
            return -1;
        }

        int low = Collections.max(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        int high = Arrays.stream(arr).sum();
        int result = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            int requiredStudents = countStudents(mid, arr);

            if (requiredStudents <= m) {
                result = mid; // Try for a better minimum
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
