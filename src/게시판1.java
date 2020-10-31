import java.util.ArrayList;
import java.util.Scanner;

public class 게시판1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		while(true) {
			int num = 0;
			num++;
			System.out.print("명령어를 입력해주세요: ");
			String user = sc.nextLine();
			if(user.equals("add")) {
				System.out.print("게시물 제목을 입력해주세요 : ");
				String title = sc.nextLine();
				System.out.print("게시물 내용을 입력해주세요 : ");
				String contents = sc.nextLine();
				list.add(title);
				System.out.println("게시물이 등록되었습니다.");
			}
			if(user.equals("list")) {
				for(int i = 0; i<list.size(); i++) {
					System.out.println("번호 : "+(i+1));
					System.out.println("제목 : "+list.get(i));
					System.out.println("=======================");
				}
			}
			if(user.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
class 게시물{
	private String title;
	private String contents;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public 게시물(String title, String contents) {
		
	}
}
