package C_7;

/**
 * @author: Gino
 * @Data: 2020年7月14日上午11:23:38
 * @File_Name: MyException_Demo.java
 * 
 */
public class MyException_Demo {
	/**
	 * 需求：写一个方法，接收考试成绩，如果考试成绩在0-100之间属于
	 * 		正常，否则属于异常
	 * 
	 * @throws MyException 
	 * 
	 */
	public static void main(String[] args){
		try {
			getScore(1234);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public static void getScore(int score) throws MyException {
		if(score > -1 && score < 101) {
			System.out.println("成绩正常");
		}else {
			throw new MyException("成绩异常");
		}
	}
}
