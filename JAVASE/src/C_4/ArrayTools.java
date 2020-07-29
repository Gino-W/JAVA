package C_4;

public class ArrayTools {
	
	//获取数组的最大值
	public  static int getMax(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		return max;

	}
}
