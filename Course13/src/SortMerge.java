/*
 * 파일명: SortMerge.java
 * 작성일: 2018.12.11
 * 작성자: 홍길동
 * 설명: 삽입정렬과 병합을 구현하고 이용하는 프로그램
 */

import java.util.Arrays;
import java.util.Random;

public class SortMerge {

	public static void main(String[] args) {
		System.out.println("course13: 이승현");
		Random generator = new Random();

		// array1, array2를 랜덤 길이(1~10)와 랜덤 원소값(0~99)으로 초기화
		int[] array1 = new int[generator.nextInt(10) + 1];
		for(int i = 0; i < array1.length; i++) {
			array1[i] = generator.nextInt(100);
		}
		int[] array2 = new int[generator.nextInt(10) + 1];
		for(int i = 0; i < array2.length; i++) {
			array2[i] = generator.nextInt(100);
		}

		// array1과 array2를 정렬
		insertionSort(array1);     // (2) insertionSort 호출    
		insertionSort(array2);      
		System.out.println(" 정렬 결과:");
		System.out.println("array1 = " + Arrays.toString(array1));
		System.out.println("array2 = " + Arrays.toString(array2));

		// array1과 array2를 병합한 결과인 array3을 구해 출력
		int[] array3 = mergeArrays(array1, array2);  // (1) mergeArrays 호출
		System.out.println(" 두 배열의 병합 결과:");
		System.out.println("array3 = " + Arrays.toString(array3));
	}

	// (1) 정렬된 두 배열을 병합하여 새로운 배열을 얻는 메소드
	private static int[] mergeArrays(int[] array1, int[] array2) {
		int[] array3=new int[array1.length+array2.length];
		int a1=0;
		int a2=0;
		int a3=0;

		while(a1<array1.length && a2<array2.length) {
			if(array1[a1]<array2[a2]) {
				array3[a3]=array1[a1];
				a1++;
				a3++;
			}
			else if(array1[a1]>array2[a2]) {
				array3[a3]=array2[a2];
				a2++;
				a3++;
			}
			else {
				array3[a3]=array1[a1];
				a1++;
				a3++;
			}


		}
		while(a2<array2.length) {
			array3[a3]=array2[a2];
			a2++;
			a3++;
		}



		while(a1<array1.length) {
			array3[a3]=array1[a1];
			a1++;
			a3++;


		}





		return array3; // 메소드 완성 후 삭제할 것
	}

	// (2) 삽입 정렬 알고리즘을 이용하여 배열의 원소들을 오름차순으로 정렬하는 메소드 
	private static void insertionSort(int[] array) {





		Arrays.sort(array); // 메소드 완성 후 삭제할 것

	}
}



