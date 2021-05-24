package myBatis_LeagueofLegends;

import java.util.List;
import java.util.Scanner;



public class App {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		Champion champion = new Champion();
		Shop shop = new Shop();
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			System.out.println("V�lasszon m�veletet!");
			System.out.println("1\tchampion felvitele");
			System.out.println("2\tchampion neh�zs�genek m�dos�t�sa");
			System.out.println("3\tchampion szerep�nek m�dos�t�sa");
			System.out.println("4\tchampion t�rl�se");
			System.out.println("5\tskin felvitele");
			System.out.println("6\tskin �r�nak m�dos�t�sa");
			System.out.println("7\tskin t�rl�se");
			System.out.println("8\t�sszes champion lek�rdez�se");
			System.out.println("9\t�sszes skin lek�rdez�se");
			System.out.println("10\tparam�terk�nt megadott champion-hoz tartoz� skinek");
			System.out.println("0\tkil�p�s");
			input = scanner.nextInt();
			
			switch(input) {
			case 0: {
				input = 0;
				break;
			}
			case 1: {
				// champion felvitele
				System.out.println("Champion ID-ja:");
				champion.setCid(scanner.nextInt());
				System.out.println("Champion neve:");
				champion.setCname(scanner.next());
				System.out.println("Champion szerepe:");
				champion.setRole(scanner.next());
				System.out.println("Champion neh�zs�ge:");
				champion.setDifficulty(scanner.next());
				dao.saveChampion(champion);
				System.out.println("Champion t�rolva a k�vetkez� adatokkal: ID: " + champion.getCid() + ", N�v: " + champion.getCname() + ", Szerep:" + champion.getRole() + ", Neh�zs�g: " + champion.getDifficulty());
				break;
			}
			
			case 2: {
				// champion neh�zs�g�nek m�dos�t�sa
				Champion champion1 = new Champion();
				System.out.println("Champion ID-ja:");
				champion1.setCid(scanner.nextInt());
				System.out.println("Champion �j neh�zs�ge:");
				champion1.setDifficulty(scanner.next());
				dao.updateDifficulty(champion1);
				System.out.println("Champion neh�zs�ge m�dos�tva: ID: " + champion1.getCid() + ", �j neh�zs�g: " + champion1.getDifficulty());	
				break;
			}
			
			case 3: {
				// champion szerep�nek m�dos�t�sa
				Champion champion2 = new Champion();
				System.out.println("Champion ID-ja:");
				champion2.setCid(scanner.nextInt());
				System.out.println("Champion �j szerepe:");
				champion2.setRole(scanner.next());
				dao.updateRole(champion2);
				System.out.println("Champion szerepe m�dos�tva: ID: " + champion2.getCid() + ", �j szerep: " + champion2.getRole());
				break;
			}
			
			case 4: {
				// champion t�rl�se
				System.out.println("T�rlend� champion ID-ja:");
				dao.deleteChampion(scanner.nextInt());
				System.out.println("T�r�lve.");
				break;
			}
			
			case 5: {
				// skin felvitele
				System.out.println("Skin ID-ja:");
				shop.setSid(scanner.nextInt());
				System.out.println("Skin neve:");
				shop.setSkinname(scanner.next());
				System.out.println("Skin �ra:");
				shop.setPrice(scanner.nextInt());
				dao.saveShop(shop);
				System.out.println("Skin t�rolva a k�vetkez� adatokkal: ID: " + shop.getSid() + ", N�v: " + shop.getSkinname() + ", �r: " + shop.getPrice());
				break;
			}
			
			case 6: {
				// Skin �r�nak m�dos�t�sa
				Shop shop1 = new Shop();
				System.out.println("Skin ID-ja:");
				shop1.setSid(scanner.nextInt());
				System.out.println("Skin �j �ra:");
				shop1.setPrice(scanner.nextInt());
				dao.updatePrice(shop1);
				System.out.println("Skin �ra m�dos�tva: ID: " + shop1.getSid() + ", �j �r: " + shop1.getPrice());
				break;
			}
			
			case 7: {
				// Skin t�rl�se
				System.out.println("T�rlend� skin ID-ja:");
				dao.deleteSkin(scanner.nextInt());
				System.out.println("T�r�lve.");
				break;
			}
			
			case 8: {
				// �sszes champion lek�rdez�se
				List<Champion> allChampion = dao.findAllChampion();
				System.out.println("�sszes champion:");
				for(Champion c : allChampion) {
					System.out.println("ID: " + c.getCid() + ", N�v: " + c.getCname() + ", Szerep:" + c.getRole() + ", Neh�zs�g: " + c.getDifficulty());
				}
				break;
			}
			
			case 9: {
				// �sszes skin lek�rdez�se
				List<Shop> allSkin = dao.findAllSkin();
				System.out.println("�sszes skin:");
				for(Shop s : allSkin) {
					System.out.println("ID: " + s.getSid() + ", N�v: " + s.getSkinname() + ", �r: " + s.getPrice());
				}	
				break;
			}	
			
			case 10: {
				// param�terk�nt megadott champion-hoz tartoz� skin-ek
				System.out.println("Adja meg azt a champion ID-t, akihez tartoz� skin-ek nev�t k�ri list�zni:");
				List<Shop> SkinByChampion = dao.SkinByChampion(scanner.nextInt());
				for(Shop s : SkinByChampion) {
					System.out.println("Skin: " + s.getSkinname());
				}
				break;
			}
			
			default: {
				System.out.println("Nem l�tez� men�pont.");					
				break;
			}	
		}
			
	} while(input != 0);
	
	scanner.close();

	}

}
