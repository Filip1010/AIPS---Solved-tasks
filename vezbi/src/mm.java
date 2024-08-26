public class mm {
    int a[] = {4, -3, 5, -2, -1, 2, 6, -2};

    // Wrapper function to compute maximum subsequence sum
    int max_sub_sequence_sum() {
        // Call helper function with initial left and right indices
        return max_sub_sum(0, a.length - 1);
    }

    // Helper function to compute maximum subsequence sum recursively
    int max_sub_sum(int left, int right) {
        // Base case: if left index equals right index
        if (left == right) {
            // If the element is positive, return it; otherwise, return 0
            if (a[left] > 0) {
                return a[left];
            } else {
                return 0;
            }
        }

        // Divide the current range into two halves
        int center = (left + right) / 2;

        // Recursively compute maximum subsequence sums for the left and right halves
        int max_left_sum = max_sub_sum(left, center);
        int max_right_sum = max_sub_sum(center + 1, right);

        // Compute the maximum sum that crosses the midpoint
        int max_left_border_sum = 0, left_border_sum = 0;
        for (int i = center; i >= left; i--) {
            left_border_sum += a[i];
            if (left_border_sum > max_left_border_sum) {
                max_left_border_sum = left_border_sum;
            }
        }

        int max_right_border_sum = 0, right_border_sum = 0;
        for (int i = center + 1; i <= right; i++) {
            right_border_sum += a[i];
            if (right_border_sum > max_right_border_sum) {
                max_right_border_sum = right_border_sum;
            }
        }

        // Return the maximum of three sums: max_left_sum, max_right_sum, and the sum of borders
        return max_of_three(max_left_sum, max_right_sum, max_left_border_sum + max_right_border_sum);
    }

    // Function to compute the maximum of three integers
    int max_of_three(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    public static void main(String[] args) {
        mm obj = new mm();
        int maxSum = obj.max_sub_sequence_sum();
        System.out.println("Maximum subsequence sum: " + maxSum);
    }
}
