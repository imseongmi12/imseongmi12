import java.util.Scanner;

public class e04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
