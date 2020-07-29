package C_2;

public class SelectSort {
	public static void main(String[] args) {
		int[] arr = {1,44,6,7,90};
		selectSort(arr);
	}
	
	
	public static void selectSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
			}
		}
		for(int x=0;x<arr.length;x++) {
			System.out.println(arr[x]);
		}
	}

}
