package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	public void pr1() {
				//길이가 9인 배열을 선언 및 할당 하고, 1부터 9까지의 값을 반복문을 이용하여
				//순서대로 배열의 각 인덱스 요소에 대입하고 출력한후
				//짝수번째 인덱스 값의 합을 구하시오
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			 if(arr[i] % 2 != 0) 
				
				 sum += arr[i];
			 
			}
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 번쨰 인덱스 합 : " + sum);
		
	}
		
	
	public void pr2() {
		//길이가 9인 배열을 선언 및 할당 하고, 9부터 1까지의 값을 반복문을 이용하여
		//순서대로 배열의 각 인덱스 요소에 대입하고 출력한후
		//홀수번째 인덱스 값의 합을 구하시오
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0)
				
				sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번쨰 인덱스 합 : " + sum);
		
	}
	public void pr3() {
		//사용자에게 입력받은 양의 정수만큼 배열크기를 할당하고
		//1부터 입력받은 값까지의 배열에 초기화한후 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input]; 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input;
		}
		
		System.out.println(Arrays.toString(arr));	
		
	}
	public void pr4() {
		//정수를 5개 입력받아 배열을 초기화하고
		//검색할 정수를 하나 입력받아 배열에서 같은수가 있는 인덱스를 찾아 출력
		//배열에 같은 수가 없을 경우 "일치하는 값이 존재하지않음" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 0 : ");
		int input0 = sc.nextInt();
		System.out.print("입력 1 : ");
		int input1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int input2 = sc.nextInt();
		System.out.print("입력 3 : ");
		int input3 = sc.nextInt();
		System.out.print("입력 4 : ");
		int input4 = sc.nextInt();
		
		int arr[] = {input0, input1, input2, input3, input4};//배열 선언 및 초기화
		
		System.out.print("검색할 값 : ");
		int ser = sc.nextInt();
		
		boolean flag = false;
		for(int i=0; i <arr.length; i++) {
			if(arr[i] == ser) {
				System.out.print("인덱스 : " +i);
				
			flag=true;
			
			}
			if(!flag); {
				System.out.print("값이 존재하지 않음");	
				
			}
		}		
	
	}
	public void pr5() {
		//문자열을 입력받아 문자 하나하나를 배열에 널고 검색할 문자가 문자열에 몇개가 들어있는지
		//개수와 몇번쨰 인덱스에 위치하는지 인덱스를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i=0; i <arr.length; i++) {
			arr[i]= input.charAt(i);
			
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		int count =0;
		
		for(i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				count++;
			}
					
			
		}
		System.out.print(count);
		}
	
			
	}
	public void pr6() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하라
		//그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력해라
		
		
		
		
		
		
	}
	
	
	
	
	
}
