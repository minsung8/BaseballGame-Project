package minsung;

import java.util.ArrayList;
import java.util.List;

public class PlayerManage {
	
	List<Player> list = new ArrayList<Player>();		// 플레이어 객체 리스트 

	public List<Player> getList() {
		return list;
	}

	public void setPlayer(Player p) {
		list.add(p);
	}


	
	
	
}
