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
			System.out.println("Válasszon mûveletet!");
			System.out.println("1\tchampion felvitele");
			System.out.println("2\tchampion nehézségenek módosítása");
			System.out.println("3\tchampion szerepének módosítása");
			System.out.println("4\tchampion törlése");
			System.out.println("5\tskin felvitele");
			System.out.println("6\tskin árának módosítása");
			System.out.println("7\tskin törlése");
			System.out.println("8\tösszes champion lekérdezése");
			System.out.println("9\tösszes skin lekérdezése");
			System.out.println("10\tparaméterként megadott champion-hoz tartozó skinek");
			System.out.println("0\tkilépés");
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
				System.out.println("Champion nehézsége:");
				champion.setDifficulty(scanner.next());
				dao.saveChampion(champion);
				System.out.println("Champion tárolva a következõ adatokkal: ID: " + champion.getCid() + ", Név: " + champion.getCname() + ", Szerep:" + champion.getRole() + ", Nehézség: " + champion.getDifficulty());
				break;
			}
			
			case 2: {
				// champion nehézségének módosítása
				Champion champion1 = new Champion();
				System.out.println("Champion ID-ja:");
				champion1.setCid(scanner.nextInt());
				System.out.println("Champion új nehézsége:");
				champion1.setDifficulty(scanner.next());
				dao.updateDifficulty(champion1);
				System.out.println("Champion nehézsége módosítva: ID: " + champion1.getCid() + ", új nehézség: " + champion1.getDifficulty());	
				break;
			}
			
			case 3: {
				// champion szerepének módosítása
				Champion champion2 = new Champion();
				System.out.println("Champion ID-ja:");
				champion2.setCid(scanner.nextInt());
				System.out.println("Champion új szerepe:");
				champion2.setRole(scanner.next());
				dao.updateRole(champion2);
				System.out.println("Champion szerepe módosítva: ID: " + champion2.getCid() + ", új szerep: " + champion2.getRole());
				break;
			}
			
			case 4: {
				// champion törlése
				System.out.println("Törlendõ champion ID-ja:");
				dao.deleteChampion(scanner.nextInt());
				System.out.println("Törölve.");
				break;
			}
			
			case 5: {
				// skin felvitele
				System.out.println("Skin ID-ja:");
				shop.setSid(scanner.nextInt());
				System.out.println("Skin neve:");
				shop.setSkinname(scanner.next());
				System.out.println("Skin ára:");
				shop.setPrice(scanner.nextInt());
				dao.saveShop(shop);
				System.out.println("Skin tárolva a következõ adatokkal: ID: " + shop.getSid() + ", Név: " + shop.getSkinname() + ", Ár: " + shop.getPrice());
				break;
			}
			
			case 6: {
				// Skin árának módosítása
				Shop shop1 = new Shop();
				System.out.println("Skin ID-ja:");
				shop1.setSid(scanner.nextInt());
				System.out.println("Skin új ára:");
				shop1.setPrice(scanner.nextInt());
				dao.updatePrice(shop1);
				System.out.println("Skin ára módosítva: ID: " + shop1.getSid() + ", új ár: " + shop1.getPrice());
				break;
			}
			
			case 7: {
				// Skin törlése
				System.out.println("Törlendõ skin ID-ja:");
				dao.deleteSkin(scanner.nextInt());
				System.out.println("Törölve.");
				break;
			}
			
			case 8: {
				// összes champion lekérdezése
				List<Champion> allChampion = dao.findAllChampion();
				System.out.println("Összes champion:");
				for(Champion c : allChampion) {
					System.out.println("ID: " + c.getCid() + ", Név: " + c.getCname() + ", Szerep:" + c.getRole() + ", Nehézség: " + c.getDifficulty());
				}
				break;
			}
			
			case 9: {
				// összes skin lekérdezése
				List<Shop> allSkin = dao.findAllSkin();
				System.out.println("Összes skin:");
				for(Shop s : allSkin) {
					System.out.println("ID: " + s.getSid() + ", Név: " + s.getSkinname() + ", Ár: " + s.getPrice());
				}	
				break;
			}	
			
			case 10: {
				// paraméterként megadott champion-hoz tartozó skin-ek
				System.out.println("Adja meg azt a champion ID-t, akihez tartozó skin-ek nevét kéri listázni:");
				List<Shop> SkinByChampion = dao.SkinByChampion(scanner.nextInt());
				for(Shop s : SkinByChampion) {
					System.out.println("Skin: " + s.getSkinname());
				}
				break;
			}
			
			default: {
				System.out.println("Nem létezõ menüpont.");					
				break;
			}	
		}
			
	} while(input != 0);
	
	scanner.close();

	}

}
