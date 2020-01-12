import java.util.Scanner;

public class Gugudan_89 {

	public static void main(String[] args) {

		//8,9dan
		System.out.println("출력할 구구단 자리를 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("-----" + num + "단 출력-----");
		
		if (num < 2) {
			System.out.println("값을 잘못 입력했습니다!");
		} else if (num > 9) {
			System.out.println("값을 잘못 입력했습니다!");
		} else {
			for(int i=1; i<10; i++) {
				System.out.println(num * i);
			}/*for end*/
		}/*if end*/
		

	}

}
