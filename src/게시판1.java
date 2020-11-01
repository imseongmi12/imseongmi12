import java.util.ArrayList;
import java.util.Scanner;

public class 게시판1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<게시물> list = new ArrayList<>();
	
		String title;
		String contents;
		int id = 1;
		
		while(true) {
			System.out.print("명령어를 입력해주세요 : ");
			String user = sc.nextLine();
			if(user.equals("add")) {
				System.out.print("게시물 제목을 입력해주세요 : ");
				title = sc.nextLine();
				System.out.print("게시물 내용을 입력해주세요 : ");
				contents = sc.nextLine();
				System.out.println("게시물이 등록되었습니다.");
				list.add(new 게시물(title, contents, id));
				id++;
			}
			if(user.equals("list")) {
				for(int i = 0; i< list.size(); i++) {
					System.out.println("번호 : "+list.get(i).getId());
					System.out.println("제목 : "+list.get(i).getTitle());
					System.out.println("=======================");
				}
			}
			if(user.equals("update")) {
				System.out.print("수정할 게시물 번호 : ");
				int updateId = Integer.parseInt(sc.nextLine());
				for(int i = 1; i<=list.size(); i++) {
				if(updateId == list.get(i).getId()) {
					System.out.print("제목 : ");
					String updateTitle = sc.nextLine();
					System.out.print("내용 : ");
					String updateContents = sc.nextLine();
					list.set(updateId, new 게시물(updateTitle, updateContents, updateId));
					System.out.println("수정이 완료되었습니다.");
						
					for(int j = 0; j< list.size(); j++) {
						System.out.println("번호 : "+list.get(j).getId());
						System.out.println("제목 : "+list.get(j).getTitle());
						System.out.println("=======================");
					}
				}
				else {
					System.out.println("없는 게시물 번호입니다.");
				}
				}

			}
			if(user.equals("delete")) {
				
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
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	public 게시물(String a, String b, int c) {
		title = a;
		contents = b;
		id = c;
	}
}
