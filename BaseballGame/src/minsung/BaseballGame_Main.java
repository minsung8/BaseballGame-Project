package minsung;

import java.util.List;
import java.util.Scanner;

public class BaseballGame_Main {

	public static void main(String[] args) {
/*
		Scanner sc = new Scanner(System.in);
		PlayerManage playermanage = new PlayerManage();
		
		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 프로그램 종료");
			
			String temp = sc.next();
			
			if (temp.equals("1")) {
				Player p = new Player();
				playermanage.setPlayer(p);
				System.out.println("회원가입이 완료되었습니다!");
				continue;
			} else if (temp.equals("2")) {
				System.out.println("name, id, pwd를 입력해주세요");
				String temp_name = sc.next();
				String temp_id = sc.next();
				String temp_pwd = sc.next();
				Player p = new Player(temp_name, temp_id, temp_pwd);
				
				List<Player> temp_list = playermanage.getList();
				boolean login = false;
				
				for (int i=0; i<temp_list.size(); i++) {
					if(temp_list == p) {
						System.out.println("로그인 되었습니다");
						login = true;
						PlayGame pg = new PlayGame();
					} 
				}
				if (login == false) {
					System.out.println("로그인에 실패하였습니다.");
					continue;
				}	
			}	
		}
			*/
	}

}
	