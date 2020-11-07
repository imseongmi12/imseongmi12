import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class 게시판1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<게시물> list = new ArrayList<>();
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
	
		String title;
		String contents;
		int id = 4;
		
		list.add(new 게시물("제목1", "내용1", 1));
		list.add(new 게시물("제목2", "내용2", 2));
		list.add(new 게시물("제목3", "내용3", 3));
		
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
				int i = 1;
				while(i<=list.size()) {
					if(updateId == i) {
						System.out.print("제목 : ");
						String updateTitle = sc.nextLine();
						System.out.print("내용 : ");
						String updateContents = sc.nextLine();
						list.set(updateId-1, new 게시물(updateTitle, updateContents, updateId));
					}
					i++;
				}
				System.out.println("수정이 완료되었습니다.");
				for(int j = 0; j< list.size(); j++) {
					System.out.println("번호 : "+list.get(j).getId());
					System.out.println("제목 : "+list.get(j).getTitle());
					System.out.println("=======================");	
				}
			}
			if(user.equals("delete")) {
				System.out.print("수정할 게시물 번호 : ");
				int deleteId = Integer.parseInt(sc.nextLine());
				int i = 1;
				while(i<=list.size()) {
					if(deleteId == i) {
						list.remove(i-1);
					}
					i++;
				}
				System.out.println("삭제가 완료되었습니다.");
				for(int j = 0; j< list.size(); j++) {
					System.out.println("번호 : "+list.get(j).getId());
					System.out.println("제목 : "+list.get(j).getTitle());
					System.out.println("=======================");	
				}
			}
			if(user.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(user.equals("read")) {
				System.out.print("원하는 게시물 번호 : ");
				int readId = Integer.parseInt(sc.nextLine());
				int i = 0;
				while(i<=list.size()) {
					if(readId-1 == i) {
						System.out.println("========== "+list.get(i).getId()+"번 게시물 ==========");
						System.out.println("번호 : "+list.get(i).getId());
						System.out.println("제목 : "+list.get(i).getTitle());
						System.out.println("내용 : "+list.get(i).getContents());
						System.out.println("작성자 : "+list.get(i).getWritter());
						System.out.println("등록 날짜 : "+year+"."+month+"."+date);
						System.out.println("조회수 : "+list.get(i).getClicks());
						System.out.println("================================");
					}
					i++;
				}
				
			}
			if(user.equals("search")) {
				System.out.print("검색 키워드를 입력해주세요 : ");
				String keyword = sc.nextLine();
				int i = 0;
				while(i<list.size()) {
					if(list.get(i).getContents().contains(keyword)) {
						System.out.println("번호 : "+list.get(i).getId());
						System.out.println("제목 : "+list.get(i).getTitle());
						System.out.println("=======================");
					}
					i++;
				}
				
			}
		}
	}
}

class 게시물{
	private String title;
	private String contents;
	private int id;
	private String writter = "익명";
	private String cal;
	private int clicks = 0;
	
	public int getClicks() {
		clicks++;
		return clicks;
	}
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
	public String getDate() {
		return cal;
	}
	public void setDate(String date) {
		this.cal = date;
	}
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
	
	public 게시물(String title, String contents, int id) {
		this.title = title;
		this.contents = contents;
		this.id = id;
	}
}
