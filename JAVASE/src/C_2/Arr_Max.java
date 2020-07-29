package C_2;

public class Arr_Max {

	public static void main(String[] args) {
		//获取数组的最大值（最小值）
		int[] arr = {1,4,5,3,14,7,9,10};
		getMax(arr);

	}
	
	public static void getMax(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
