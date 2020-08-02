package minsung;

import java.util.ArrayList;
import java.util.List;

public class PlayerManage {
	
	Player[] player_arr = new Player[1000];		// 플레이어 객체 리스트 

	public Player[] getArr() {
		return player_arr;
	}

	public void setPlayer(Player p) {
		
		for (int i=0; i<player_arr.length; i++) {
			if (player_arr[i]==null) {
				player_arr[i] = p;
				break;
			}
		}	
	}
	
	public void prn_record() {
	
		for (int i=0; i<player_arr.length; i++) {
			if (player_arr[i]==null) {
				break;
			} else {
				System.out.println(player_arr[i].getName() + "님은 " + player_arr[i].getRecord() + "점 입니다");
			}
		}
	}	
}