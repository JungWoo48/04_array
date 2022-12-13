package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {

	
	//얕은 복사(shallow)
	// 주소를 복사하여 서로 다른 두 변수가 같은주소
	// 하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사 방법
	public void shallowCopy1() {
		
		int arr[] = {1, 2, 3, 4, 5};//원본
		
		int[] copyarr = arr; //얓은복사 진행
		
		System.out.println("주소확인");
		System.out.println("arr : " + arr);
		System.out.println("copyarr : " + copyarr);
		
		//배열값 변경
		
		System.out.println("변경전");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyarr : " + Arrays.toString(copyarr));
		
		copyarr[2] = 999; //얕은 복사한 배열의 값을 변경하는것
		
		System.out.println("변경후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyarr : " + Arrays.toString(copyarr));	
		//복사한 배열의 주소값을 변경했는데 원본 배열의 값도 변경 되었다
		//== 두 배열의 주소값은 공유한다
	}
	public void deepCopy() {
		
		//깊은 복사
		// 같은 자료형의 새로운 배열을 만들어서
		//기본 배열의 데이터를 모두 복사
		
		int[] arr = {1, 2, 3, 4, 5};//원본
		
		//1.for문을 이용한 깊은 복사
		int[] copyarr1 = new int[arr.length];//5칸 짜리 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			copyarr1[i] = arr[i];//깊은 복사 식
		}
		
		//2.System.arraycopy를 이용한 복사
		//System.arraycopy(원본배열, 원본 복사 시작인덱스, 복사배열, 복사배열의 삽입십작 인덱스, 복사길이)
		
		int[] copyarr2 = new int[arr.length];
		System.arraycopy(arr, 0 , copyarr2, 0, arr.length);
		
		//3.Arrays.copyOf 사용
		//Arrays.copyOf(원본 배열, 복사할 길이)
		
		int[] copyarr3 = Arrays.copyOf(arr, arr.length);
		
		//값 변경후 확인
		copyarr1[4] = 0;
		copyarr2[4] = 624;
		copyarr3[4] = 712;
		
		System.out.println("arr : " +Arrays.toString(arr));//원본
		System.out.println("copyarr1 : " +Arrays.toString(copyarr1));//for문을 이용한 복사
		System.out.println("copyarr2 : " +Arrays.toString(copyarr2));//System.arraycopy를 이용한 복사
		System.out.println("copyarr3 : " +Arrays.toString(copyarr3));//Arrays.copyOf를 이용한 복사
		// 복사한 배열의 값을 바꾸어도 원본의 값은 바뀌지 않는다
		
	}
	public void createlottonumber() {
		
		//로또 번호 생성기
		//{6, 12, 16, 20, 21, 42}
		
		//1.1~45 사이 중복되지 않는 난수 6개 생성 -> Math.rambom()
		//2. 생성된 난수가ㅣ 오름차순으로 정렬 -> Arrays.sort()
		
		//1)정수 6개를 저장할 배열 선언및 할당
		int[] lotto = new int[6];
		
		//2)생성ㄷ4ㅚㄴ 배열을 처음부터 끝까지 순차 접근하는 for문 생성
		for(int i = 0; i < lotto.length; i++) {
			
			//3)1 ~45사이의 난수 생성
			int ramdom = (int)(Math.random() * 45 + 1);
			//1 <= (int)( x * 45 + 1) < 46
			
			//4) 생성된 난수를 순서대로 배열 요소에 대입
			lotto[i] = ramdom;
			
			//5) 중복 검사를 위한 중복for문 작성
			for(int x = 0; x < i; x++) {
				
				//6) 현재 생성된 난수와 같은 수가
				//앞쪽 인덱스에 있는지 검사
				if(ramdom == lotto[x]) {
					
					i--;//i가 1씩 증가할때마다 난수가 하나 생성된다
						//중복 값이 있으므로 난수를 새로 하나 더 생성해야한다
						//i는 기본적으로 0~5까지 6번 반복되지만
						//i값을 인위적으로 1 감소시켜서 7회 반복하게 한다
					
					break;
					//앞쪽에서 중복데이터를 발견하면
					//남은 값을 비교할 필요가 ㅓㅄ기때문에 break를 건다
				}
			}
			
		}//for 문 끝
		
		//7)오름차순 정렬
		//선택, 삽입, 버블, 퀵 등등
		// Arrays.sort(배열명) : 배열 내 값들이 오름차순으로 정렬됨
		
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
		
	}
}





