package C_2;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {67,349,12,89,78};
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=arr.length-1;i>0; i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int x=0;x<arr.length;x++) {
			System.out.println(arr[x]);
		}
	}

}
