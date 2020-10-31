import java.util.Scanner;

public class e01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요: ");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자를 입력해주세요: ");
		int n2 = Integer.parseInt(sc.nextLine());
		
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
	}

}
