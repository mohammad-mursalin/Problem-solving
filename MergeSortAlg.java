public class MergeSortAlg {

    public static void main(String[] args) {

        int[] nums = {3,2,6,4,7,1};

        int size = nums.length;

        mergeSort(nums, 0, size - 1);

        for(int x : nums) {
            System.out.print(x+",");
        }
    }

    private static void mergeSort(int[] nums, int l, int r) {

        if(l<r) {
            int mid = (l+r)/2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid +1, r);

            merge(nums, l, mid, r);
        }
    }

    private static void merge(int[] nums, int l, int mid, int r) {

        int n1 = mid -l +1;
        int n2 = r - mid;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for(int i = 0 ; i < n1 ; i++) {
            larr[i] = nums[l+i];
        }

        for(int i = 0 ; i < n2 ; i++) {
            rarr[i] = nums[mid+i+1];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i<n1 && j< n2) {
            if(larr[i] <= rarr[j]) {
                nums[k] = larr[i];
                i++;
            }
            else {
                nums[k] = rarr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            nums[k] = larr[i];
            k++;
            i++;
        }

        while (j < n2) {
            nums[k] = rarr[j];
            k++;
            j++;
        }
    }
}
