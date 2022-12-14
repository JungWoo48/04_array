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
			break;
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int id = sc.nextInt();
			
		int arr[] = new int[id];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i);
			arr[i] = sc.nextInt();	
		}
			
		int sum = 0;
		for ( int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + "");
			sum += arr[i];
		}
		
		System.out.println(sum);
		
	}
	public void pr7() {
		//주민등록 번호를 입력받아 성별을 나타내는 숫자 이후부터 *
		//로 가리고 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록 번호");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		
		for (int i =0; i < arr.length; i++) {
			
			if(i <= 7) {
				arr[i] = input.charAt(i);
			}else {
				arr[i] = '*';
			}
			System.out.println(arr[i]);
		}
			
		
	}
	public void pr8() {
		//3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 넣고
		//중간 이후 부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하라
		//단, 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요"를 출력
		//다시 정수를받아라
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if(input < 3 || input % 2 == 0) {
			System.out.print("다시 입력하세요");
		} else {
			int arr[] = new int[input];
			
			
			
			
			
		}
		
		
		
	}
	public void pr9() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 방생시켜 배열에 초기화한후 출력하라
		int[] arr = new int[10];
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 +1);
		}
		
		System.out.print("발생한 난수 : ");
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public void pr10() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당 하고
		//1~10사이의 난수르 발생시켜 배열에 초기화 후
		//배열 전체 값과 그 값중에서 최대값과 최소값을 출력하라
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 +1);
			
		}
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\s");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0; i < arr.length; i++) {
			if( arr[i] > max ) {
				max = arr[i];
			}
			else if(arr[i] < min ) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.print("최대값 : " + max);
		System.out.println();
		System.out.print("최소값 : " + min);
	}
	public void pr11() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언및 할당하고
		//1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하라
		int arr[] = new int [10];
		
		for(int i =0; i <arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
		
			arr[i] = random;
		
			for(int x= 0; x < i; x++) {	
		
			if(random == arr[x]) {
				
				i--;
				break;
			}
			
			}
			
		}
		System.out.print(Arrays.toString(arr));
	}
	public void pr12() { 
		//로또 번호 자동 생성기를 만들어라
		//중복 값 없이 오름차순으로 정렬하라
		int lotto[] = new int[6];
		
		for(int i =0; i < lotto.length; i++) {//50까지의 무작위 변수
			int random = (int)(Math.random() * 50 +1);
			
			lotto[i] = random;
			
			for(int x=0; x <i; x++) {//중복을 피하는 for문
				
				if(random == lotto[x]) {
					
					i--;
					break;
				}
			}
			
			
		}
		Arrays.sort(lotto);//오름차순
		System.out.print(Arrays.toString(lotto));
	}
	public void pr13() {
		//문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		//문자의 개수와 함계 출력하라
		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("문자열 : ");
 		String input = sc.nextLine();
 		
 		char[] arr = new char[input.length()];
		
 		for(int i=0; i < arr.length; i++) {
 			arr[i] = input.charAt(i);
		
 		}
 		
 		int count = 0;
 		
 		for(int i =0; i <arr.length; i++) {
 			if(arr[i] == count) {
 				count++;
 			}
 		}
 		System.out.print("문자열에 있는 문자 : " + Arrays.toString(arr));
 		System.out.println();
 		System.out.print("문자 개수 : " + count);
	}
	public void pr14() {
		//사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		//배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하라
		//단, 사용자에게 배열에 값을 더 넣을것인지 물어보고 몇개를 더 입력할건지
		//늘린 곳에 어떤 데이터를 널읗 것인지 받아라
		//사용자가 더이상 입력하지 않겠다고 하면 배열 전체 값을 출력하라
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하에요 : ");
		int input = sc.nextInt();
		
		String[] arr = new String[input];
		
		for(int i =0; i < arr.length; i++) {
			
		}
		
	}

}
