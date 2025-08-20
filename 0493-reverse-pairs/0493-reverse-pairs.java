class Solution {
    static int count = 0;

    static int reversePairs(int arr[]) {
        count = 0;
        mergesort(arr, 0, arr.length - 1);
        return count;
    }

    static void mergesort(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;
        mergesort(arr, l, mid);
        mergesort(arr, mid + 1, r);
        merge(arr, mid, l, r);
    }

    static void merge(int[] arr, int mid, int l, int r) {
        int[] a1 = new int[mid - l + 1];
        int[] a2 = new int[r - mid];

        int l1 = l;
        for (int i = 0; i < a1.length; i++) a1[i] = arr[l1++];
        for (int j = 0; j < a2.length; j++) a2[j] = arr[l1++];

        // ✅ Count reverse pairs (inside merge, like inversion)
        int j = 0;
        for (int i = 0; i < a1.length; i++) {
            while (j < a2.length && (long)a1[i] > 2L * a2[j]) {
                j++;
            }
            count += j;
        }

        // ✅ Now do normal merge
        int i = 0; j = 0; l1 = l;
        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                arr[l1++] = a1[i++];
            } else {
                arr[l1++] = a2[j++];
            }
        }

        while (i < a1.length) arr[l1++] = a1[i++];
        while (j < a2.length) arr[l1++] = a2[j++];
    }
}
