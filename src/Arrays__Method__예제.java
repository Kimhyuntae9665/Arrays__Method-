import java.util.Arrays;

public class Arrays__Method__���� {

	public static void main(String[] args) {
		
		int [] arr = {0,1,2,3,4};
		int [][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
//		2���� �迭�� ���� �Լ��δ� deepToString(),deepToEquals(),deepHashCode() 3���� �ִ�.
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);//arr2�� arr�� �迭�� arr.length ��ŭ ���� 
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); //arr�迭�� index 2~3���� ���� 
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);//arr7�� 9�� ä���.
		System.out.println("arr7="+Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i->(int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7)); //�������� arr7 �� ä���.
		
		for(int i:arr7) {
			char[] graph = new char[i];//char �迭 ���� �������������� graph�� ������ char�迭�� ����Ű�� �ִ�.
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i); //char[]�迭�� String���� �ٲٱ� String(char �迭)������ �̿�
		}											//String �迭�� char[]�� �ٲٴ� ����� tocharArray()�̿�
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //2���� �迭�� deepEquals(,)���
		
		
		char[] chArr = {'A','D','C','B','E'};
		
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B')); //binarySearch �������� �ʾƼ� �߸��� ���
		System.out.println("= After sorting=");
		Arrays.sort(chArr);
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));//������ �� ��Ȯ�� ���
	}

}
