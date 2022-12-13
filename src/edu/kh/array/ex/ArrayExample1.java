package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	/* 배열(Array)
	 * -같은 자료형의 변수를 하나의 묶음으로 다루는것(자료구조)
	 * -묶여진 변수들은 하나의 배열명으로 불려지고 구분은 index를 이용함
	 *  (index는 0부터 시작하는 정수)
	 */
	public void ex1() {
		// 변수 vs 배열
	
		// 1-1 변수 선언
		int num;
		//Stack 영역에 int 자료형을 저장할수 있는 공간 4byte를 생성(할당) 하고
		// 그 공간에 num 이라는 이름을 부여한 것이다.
		
		//1-2 변수 대입
		num = 10;
		// 생성된 num이라는 변수 공간에 10을 대입한것
		
		//1-3 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		//num이 작성된 자리에 nym에 저장된 값을 읽어와서 출력하는것이다.
		
		//------------------------------
		
		//2-1 배열 선언
		int[] arr; //배열에 따라 int던 double이던 상관없다
		// Stack 영역에 int[] (int배열) 자료형 공간을 4byte 할당하고
		//그 공간에 arr이라는 이름을부여한것이다.
		//** 해당변수는 참조형으로 주소 값(4byte)만을 저장할수 있다.
		
		//2-2 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며, Heap 메모리 영역에 새로운 공간(배열, 객체)를 할당
		// int[3] : int자료형 변수 3개를 하나의 묶음으로 나타낸것
		// new int[3] : heap 영역에 int 3칸짜리 int[]을 생성한것(할당한것)
					// ******생성된 int[]에는 시작주소가 저장된다**********
		
		//2-3 배열 요소 값 대입
		//arr은 int[] 참조형 변수이지만
		// arr[0] ~ [2] int 자료형 변수이기 때문에 정수 값 대입 가능
		
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		
		//2-4 배열 요소 값 읽어보기
		System.out.println( arr[0] ); //각각의 인덱스로 접근해야 그 값을 알수 있다.
	}
	public void ex2() {
		//배열 선언 및 할당
		
		int[] arr = new int[4];
		//1. Stack 영역에 int[] 자료형 변수 arr선언
		//2. heap 영역에 int 자료형 4개 묶음으로 다루는 int[]할당
		//3. 생성된 int[]의 주소를 arr에 대입하여 형태를 만듬
		
		//배열 길이( 몇간 인가) : 배열명.length
		System.out.println("배열 길이: " + arr.length);
		
		arr[0] = 100;
		arr[1] = 300;
		arr[2] = 500;
		arr[3] = 1000;
		
		for(int i= 0; i < arr.length; i++) {
			// 0 1 2 3
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}
		
		
	}
	public void ex3() {
		
		// 5명의 키를 입력받고 편균 구하기
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 184.3
		// 4번 키 입력 : 190.2
		// 5번 키 입력 : 174.4
		
		//입력 받은 키 : 170.5 165.7 184.3 190.2 174.4
		//평균 : 177.02cm
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[5];
		
		for(int i = 0; i < height.length; i++) {
			System.out.print((i+1) + " 번 키 입력 : ");
			
			height[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double sum = 0; //합계용 변수
		
		for(int i = 0; i < height.length; i++) {
			System.out.println(height[i] + " ");
			
			sum += height[i]; //배열에 저장된 값을 sum에 누적
			//sum = sum + height[i]
			
		}
		
		System.out.printf("\n평균 : %.2f\n", sum / height.length );//sum은 합 ,length는 명수
	}
	public void ex4() {
		//입력 받은 인원수 만큼의 점수를 입력받아 배열에 저장
		//입력이 완료되면 점수합계 평균 최고점 최저점 출력
		
		//인원수 4
		//1번 점수 100
		// 2번 점수 80
		//3번 점수 50
		//4번 점수 60
		
		//합계 290
		//평균 72.5
		//최고점 100
		//최저점 50
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("입력받을 인원수 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		int[] score = new int[input];
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번 점수 입력 : ");
			
			score[i] = sc.nextInt();
			
			sum += score[i]; 
		
		}
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			// score[i] 값이 max보다 크면 max에 대입
			// score[i] 값이 min 보다 작으면 min에 대입
			if( score[i] > max) {//최고점 비교-- 0번 대입에서 50 > 50 f, 1번 대입에서 40 > 50 ㄹ, 2번 대입에서 60 > 50 t
				max = score[i];			// 3번 대입에서 100 > 60 t .... 최종적으로 max에 대입되는것은 100점이다
				
			}
			else if( score[i] < min) { 
				min = score[i]; //최저점 비교
			}	
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n " , sum / score.length );
		System.out.println("최고점 " + max);
		System.out.println("최저점 " + min);
	}
	
	}
	public void ex5() {
		//배열 선언과 동시에 초기화
		char[] arr = new char[5];
		
		//char[] arr이 참조하는 배열 요소에 a b c d e 대입하기 65 66 67 68 69
		for(int i = 0; i < arr.length; i++) {
			
			arr[i]= (char)('A' +i);//  유니코드 65부터 1씩 증가  배정된 배열 5까지 증가
			
		}
		// ** arrays 클래스
		// --java에서 ㅈ공하는 배열과 관련된 기능을 모아둔 클래스
		
		int[] arr2 = new int[4];
		// Arrays.toString(배열명) : array의 모든 요소 값 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0] int의 기본값이 0이기 때문이다
		
		//배열 선언과 동시에 초기화
		char[] arr3 = {'A', 'B' , 'C' , 'D' , 'E'};
		
		//char[] 참조 변수 arr3를 선언하고
		//heap영역에 char 5칸짜리 char[]를 생성하고
		//각각 'a' 'b' 'c' 'd' 'e'로 초기화후 주소를 arr3에 대입한것
		System.out.println(Arrays.toString(arr3));
	}
	public void ex6() {
		//배열을 이용한 검색
		
		//입력받은 정수가 배열에 있는지 없는지 확인
		//만약 있다면 몇번 인덱스에 존재하는지 출력
		
		int[] arr = {100,200,300,400,500,600,700,800,900,1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		//신호를 나타내기 위한 변수
		// flag == false: 일치 하는 값이 존재하지 않음을 flag에 선언
		// flag == true: 일치 하는 값이 존재
		
		boolean flag = false; // 검사전에는 없다고 가정
		
		//arr 배열 요소 순차 접근
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == input) {//input 과 배열을 비교
				System.out.println(i + "번째 인덱스에 존재");
			
				flag = true;// 일치하는 값이 있다면 true로 변경
			}
		
		}
			
		//flag 상태를 for문 밖에서  검사 
		if( !flag ) { //!flag는 flag가 true가 아닐경우를 의미한다 - 즉 !flag는 false
			System.out.println("존재하지 않음");
		}
	}
	public void ex7() {
		
		//입력 받은 값과 일치 값이 있으면 인덱스 번호 출력
		// 없으면 " 존재하지 않음"
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		//equals() == > 배열명[i].equals(비교할 값)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String input = sc.next();
		
		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(input)) {
				System.out.println(i + "번 인덱스에 존재");
				
			flag = true;// flag값을 true로 정의
			}
			if(!flag) {
				System.out.println("존재하지 않음");
			}
		}
		
		
	}
	public void ex8() {
		// 1. 문자열을 입력받아 한글자씩 잘라내어  char 배열에 순서대로 저장
		//2. 문자 하나를 입력받아 문자가 char 배열에 몇개 존재하는지 확인
		//3. 단 일치하는 문자가 없을 경우 존재하지 않습니다
		
		//쓸기술
		//1)배열검색
		//2)String.length() 문자열의 길이
		// 		ex) "Hello".length - 5
		
		//3) Sring.charAt(index) : 문자열에서 특정 index 에 위치한 문자하나를 얻어옴
		// ex "Hello".charAt(1) > 'e'
		
		//4) count 숫자세기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];//공간할당 1.
		
		for(int i=0; i<arr.length; i++) {//이 for문에서 받은 문자의 arr 주소값을 i설정
			arr[i] = input.charAt(i);
		}
		//System.out.println(Arrays.toString(arr)); -중간 확인 과정
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);//-한글자 이기 떄문에 무조건 0번째 인덱스에서 가져온다 그래서 0
											//chaining-자료형만 같다면 메소드를 계속 이어서 쓸수 있다.
		int count = 0;//글자 개수 세기 위한 변수
		
		for(int i = 0; i <arr.length; i++) {//여기서 arr[i]과 입력받은 문자 하나를 비교해 카운트를 센다
			if(arr[i] == ch) {
				count++;//arr안에 ch가 있는 만큼 카운트를 높인다
			}
			
		}
		if(count > 0) {
			System.out.println(count);
		}else {
			System.out.println("존재하지 않음");
		}
	
		}
		
	
}
