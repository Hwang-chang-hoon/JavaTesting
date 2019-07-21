package Game;

import java.*;
import java.util.Scanner;

import Ship.*;


public class PlaingGame {
	
	public static void main(String[] args) {
		Unit destroyer = new Destroyer ("구축함", 500, 500, 50, 10, 0, 10);
		Unit cruiser = new Cruiser ("순양함", 1000, 1000, 150, 15, 0, 2, 450);
		Unit battleship = new Unit ("전함", 5000, 5000, 1000, 20, 0);
		Unit o_destroyer = new Unit ("적 구축함", 500, 500, 50, 10, 0);
		Unit o_cruiser = new Unit ("적 순양함", 1000, 1000, 150, 15, 0);
		Unit easy_ship = new Unit ("적 전함", 2000, 2000, 500, 20, 0);
		Unit normal_ship = new Unit ("적 전함", 3000, 3000, 1000,20,0);
		Unit hard_ship = new Unit ("적 전함", 4000, 4000, 1500, 20, 0);
		Unit Yamato = new Unit ("야마토", 10000, 10000, 5000, 20, 50);
						
		while(true) {
			System.out.println("함선 키우기 시작하시겠습니까?");
			System.out.println("1. 게임 시작          2. 종료");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a==1) {
				while(true) {
				
					System.out.println("당신은 대아시아 태평양함대에 함장으로서 전속 배정되었습니다.");
					System.out.println("      부디 이 끔찍한 전쟁을 승리로 이끌어주십시오.");
					System.out.println("");
					
					if (destroyer.isPowered()) {
						System.out.println("함장으로서 함선은 골라주십시오.");
						System.out.println("1. 구축함");
						int b1 = sc.nextInt();
						if(b1==1) {
							System.out.println("구축함으로 열심히 전공을 새우시기 바랍니다.");
							System.out.println("함선에 승선하신 것을 축하드립니다.");
							System.out.println("");
							System.out.println("함장 명령을 내려주십시요.");
							System.out.println("무었을 하실겁니까?");
							System.out.println("1. 출격     2. 보급     3. 강화");
							int c1 = sc.nextInt();
							if (c1==1) {
								do {
							         Unit.battle(destroyer, o_destroyer);
							         
							      }while(destroyer.checkDead() || o_destroyer.checkDead());
							   }
							else if (c1==2) {
								
							}
							else if (c1==3) {
								
							}
							
						}
						else
							System.out.println("아니 지금은 애송이이시니 빨리 구축함이나 타서 성장하세요.");
							continue;
					}
					else
						System.out.println("함장으로서 함선은 골라주십시오.");
						System.out.println("1. 구축함           2. 순양함");
						int b2 = sc.nextInt();
						if(b2==1) {
							System.out.println("구축함을 선택하셨습니다.");
							
						
						}
						else if (b2==2) {
							System.out.println("순양함을 선택하셨습니다.");
							
						
						}
				}
			}
			
			else
				System.out.println("게임을 종료합니다.");
				break;
		}

	}
}
