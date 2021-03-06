import java.util.Arrays;

public class Arrays__Method__森薦 {

	public static void main(String[] args) {
		
		int [] arr = {0,1,2,3,4};
		int [][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
//		2託据 壕伸拭 企廃 敗呪稽澗 deepToString(),deepToEquals(),deepHashCode() 3亜走 赤陥.
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);//arr2拭 arr税 壕伸聖 arr.length 幻鏑 差紫 
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); //arr壕伸聖 index 2~3猿走 差紫 
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);//arr7聖 9稽 辰錘陥.
		System.out.println("arr7="+Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i->(int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7)); //沓棋生稽 arr7 聖 辰錘陥.
		
		for(int i:arr7) {
			char[] graph = new char[i];//char 壕伸 持失 けけけけけけけ graph亜 持失廃 char壕伸聖 亜牽徹壱 赤陥.
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i); //char[]壕伸聖 String生稽 郊荷奄 String(char 壕伸)持失切 戚遂
		}											//String 壕伸聖 char[]稽 郊荷澗 号狛精 tocharArray()戚遂
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //2託据 壕伸精 deepEquals(,)紫遂
		
		
		char[] chArr = {'A','D','C','B','E'};
		
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B')); //binarySearch 舛慶馬走 省焼辞 設公吉 衣引
		System.out.println("= After sorting=");
		Arrays.sort(chArr);
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));//舛慶廃 板 舛溌廃 衣引
	}

}
