package Game;

import java.*;
import java.util.Scanner;

import Ship.*;


public class PlaingGame {
	
	public static void main(String[] args) {
		Unit destroyer = new Destroyer ("������", 500, 500, 50, 10, 0, 10);
		Unit cruiser = new Cruiser ("������", 1000, 1000, 150, 15, 0, 2, 450);
		Unit battleship = new Unit ("����", 5000, 5000, 1000, 20, 0);
		Unit o_destroyer = new Unit ("�� ������", 500, 500, 50, 10, 0);
		Unit o_cruiser = new Unit ("�� ������", 1000, 1000, 150, 15, 0);
		Unit easy_ship = new Unit ("�� ����", 2000, 2000, 500, 20, 0);
		Unit normal_ship = new Unit ("�� ����", 3000, 3000, 1000,20,0);
		Unit hard_ship = new Unit ("�� ����", 4000, 4000, 1500, 20, 0);
		Unit Yamato = new Unit ("�߸���", 10000, 10000, 5000, 20, 50);
						
		while(true) {
			System.out.println("�Լ� Ű��� �����Ͻðڽ��ϱ�?");
			System.out.println("1. ���� ����          2. ����");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a==1) {
				while(true) {
				
					System.out.println("����� ��ƽþ� ������Դ뿡 �������μ� ���� �����Ǿ����ϴ�.");
					System.out.println("      �ε� �� ������ ������ �¸��� �̲����ֽʽÿ�.");
					System.out.println("");
					
					if (destroyer.isPowered()) {
						System.out.println("�������μ� �Լ��� ����ֽʽÿ�.");
						System.out.println("1. ������");
						int b1 = sc.nextInt();
						if(b1==1) {
							System.out.println("���������� ������ ������ ����ñ� �ٶ��ϴ�.");
							System.out.println("�Լ��� �¼��Ͻ� ���� ���ϵ帳�ϴ�.");
							System.out.println("");
							System.out.println("���� ����� �����ֽʽÿ�.");
							System.out.println("������ �Ͻǰ̴ϱ�?");
							System.out.println("1. ���     2. ����     3. ��ȭ");
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
							System.out.println("�ƴ� ������ �ּ����̽ô� ���� �������̳� Ÿ�� �����ϼ���.");
							continue;
					}
					else
						System.out.println("�������μ� �Լ��� ����ֽʽÿ�.");
						System.out.println("1. ������           2. ������");
						int b2 = sc.nextInt();
						if(b2==1) {
							System.out.println("�������� �����ϼ̽��ϴ�.");
							
						
						}
						else if (b2==2) {
							System.out.println("�������� �����ϼ̽��ϴ�.");
							
						
						}
				}
			}
			
			else
				System.out.println("������ �����մϴ�.");
				break;
		}

	}
}
