package minsung;

import java.util.List;
import java.util.Scanner;

public class BaseballGame_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PlayerManage playermanage = new PlayerManage();
		
		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 프로그램 종료");
			
			String temp = sc.next();
			
			if (temp.equals("1")) {
				System.out.println("name, id, pwd를 입력해주세요");
				Player p = new Player(sc.next(), sc.next(), sc.next());
				playermanage.setPlayer(p);
				System.out.println("회원가입이 완료되었습니다!");
				continue;
			} else if (temp.equals("2")) {
				System.out.println("id, pwd를 입력해주세요");
				String temp_id = sc.next();
				String temp_pwd = sc.next();
				Player[] temp_arr = playermanage.getArr();

				for (int i=0; i<1000; i++) {
					
					try {
						if (temp_arr[i].getName() == null) {
							break;
						} else if (temp_arr[i].getId().equals(temp_id) && temp_arr[i].getPwd().equals(temp_pwd)) {
								System.out.println("환영합니다.");
								PlayGame playgame = new PlayGame();
								break;
						} else {
							continue;
						}
					} catch (Exception e) {
						System.out.println("입력하신 정보가 잘못되었습니다.");
						break;
					}
				}		
			} else if (temp.equals("3")) {
				System.out.println("안녕히가세요");
				break;
			}
		}
			
	}

}