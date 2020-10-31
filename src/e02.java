import java.util.Scanner;

public class e02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력해주세요: ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i =1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
	}

}
