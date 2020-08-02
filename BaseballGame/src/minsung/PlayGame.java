package minsung;

import java.util.Scanner;

public class PlayGame {
	
	static int record;
	static int[] current_arr = new int[3];
	static int strike = 0;
	static int ball = 0;
	
	public PlayGame() {}
	
	public PlayGame(Player p) {
		
	}
	
	public static void playgame(Player p) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			System.out.println((i + 1) + "회 시작합니다");
			System.out.println("현재 점수는 "+ (record) + "점 입니다");
			while (true) {
				
				if (strike == 3) {
					strike = 0;
					ball = 0;
					break;
				}
				
				if (ball == 4) {
					for (int j=2; j>-1; j--) {
						if (current_arr[j] == 1 && j==2) {
							record += 1;
							current_arr[j] = 0;
						}
						if (current_arr[j] == 1 && j==1) {
							current_arr[j] = 0;
							current_arr[2] = 1;
						}
						if (current_arr[j] == 1 && j==0) {
							current_arr[j] = 0;
							current_arr[1] = 1;						
						}
					}
					current_arr[1] = 1;	
					strike = 0;
					ball = 0;
					continue;
				}
				
				int com_throw = (int)(Math.random() * 20 + 1);		// 투수가 던진 랜덤한 수

				
				System.out.println("5 ~ 15 사이 수를 입력해주세요");
				int my_heat = sc.nextInt();
				
				if (com_throw == my_heat) {							// 홈런
					record += 1;
					for (int j=0; j<current_arr.length; j++) {
						if (current_arr[j] == 1) {
							record += 1;
						}
					}
					for (int j=0; j<current_arr.length; j++) {
						if (current_arr[j] == 1) {
							current_arr[j] = 0;
						}
					}
					System.out.println("홈런 입니다");

				} else if (my_heat + 1 == com_throw || my_heat - 1 == com_throw) {		// 3루타
					for (int j=2; j>-1; j--) {
						if (current_arr[j] == 1 && j==2) {
							record += 1;
							current_arr[j] = 0;
						}
						if (current_arr[j] == 1 && j==1) {
							current_arr[j] = 0;
							record += 1;
						}
						if (current_arr[j] == 1 && j==0) {
							record += 1;
							current_arr[j] = 0;
						}
					}
					current_arr[2] = 1;
					System.out.println("3루타 입니다");
	
				} else if (my_heat + 2 == com_throw || my_heat - 2 == com_throw) {		// 2루타
					for (int j=2; j>-1; j--) {
						if (current_arr[j] == 1 && j==2) {
							record += 1;
							current_arr[j] = 0;
						}
						if (current_arr[j] == 1 && j==1) {
							record += 1;
							current_arr[j] = 0;
						}
						if (current_arr[j] == 1 && j==0) {
							current_arr[j] = 0;
							current_arr[2] = 1;						
						}
					}
					current_arr[1] = 1;
					System.out.println("2루타 입니다");

				} else if (my_heat + 3 == com_throw || my_heat - 3 == com_throw) {		// 1루타
					for (int j=2; j>-1; j--) {
						if (current_arr[j] == 1 && j==2) {
							record += 1;
							current_arr[j] = 0;
						}
						if (current_arr[j] == 1 && j==1) {
							current_arr[j] = 0;
							current_arr[2] = 1;
						}
						if (current_arr[j] == 1 && j==0) {
							current_arr[j] = 0;
							current_arr[1] = 1;						
						}
					}
					current_arr[1] = 1;	
					System.out.println("1루타 입니다");

				} else if (com_throw == 1 || com_throw == 20) {						// ball
					System.out.println("ball 입니다");
					ball += 1;
				}	else {															// strike
					System.out.println("strike 입니다");
					strike += 1;
				}
			}
		}
		p.setRecord(record);
		System.out.println("최종 점수는 " + record + "점 입니다");
		System.out.println("게임을 종료합니다.");
	}
}