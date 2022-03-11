
public class MyIntegerSort {
	public static void mergeSort(int []array) {
		MyIntegerSort.mergeSort(array, 0, array.length-1);
		System.out.print("정렬 후 배열=");
		for(int s=0; s<array.length; s++) {
			System.out.print(array[s]+" ");
		}
	}
	public static void mergeSort(int []array, int lb,int ub) {
		int middle;
		if(lb<ub) {
			middle=(lb+ub)/2;
			mergeSort(array,lb,middle);
			mergeSort(array,middle+1,ub);
			merge(array,lb,middle,ub);
			
		}
	}
	public static void merge(int[] array, int lb, int middle,int ub) {
		int i=lb;
		int j=middle+1;
		int t=lb;
		int[] sort =new int[array.length];
		
		while(i<=middle || j<=ub) {
		
			if(i<=middle && j<=ub) {
				if(array[i]<=array[j])
					sort[t]=array[i++];
				else
					
					sort[t]=array[j++];
			}
			else if(i<=middle && j>ub) {
				sort[t]=array[i++];
			}
			else {
				sort[t]=array[j++];
			}
			t++;
		}
		for(int p=lb; p<ub+1; p++) {
			array[p]=sort[p];
		}
		
	}
}
