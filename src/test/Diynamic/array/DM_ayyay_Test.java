package test.Diynamic.array;

public class DM_ayyay_Test {

	public static void main(String[] args) {
		int[][] arr=new int[3][];
		int cnt = 0;
		//초기화
		for (int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = ++cnt;
			}
		}
		//출력
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
