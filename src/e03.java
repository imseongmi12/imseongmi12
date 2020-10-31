import java.util.Scanner;

public class e03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요: ");
		String name = sc.nextLine();
		System.out.print("나이를 입력해주세요: ");
		String age = sc.nextLine();
		
		System.out.println("안녕하세요 "+age+"세 "+name+"입니다.");
	}

}
