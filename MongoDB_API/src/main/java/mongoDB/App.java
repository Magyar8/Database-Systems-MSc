package mongoDB;

import static com.mongodb.client.model.Filters.eq;

import java.util.Scanner;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class App {
	
	public static void main(String[] args) {
	
		MongoClientURI uri = new MongoClientURI("mongodb+srv://ae18rs:ae18rs@cluster0.8fdri.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		//MongoClient mongoClient = new MongoClient("cluster0-shard-00-02.8fdri.mongodb.net", 27017);
		MongoDatabase mongoDB = mongoClient.getDatabase("MongoDB_API");
		MongoCollection<Document> champions = mongoDB.getCollection("champions");
		MongoCollection<Document> shops = mongoDB.getCollection("shops");
		MongoCollection<Document> skinChamp = mongoDB.getCollection("skinChamp");
		
		Service service = new Service();
		Champion champion = new Champion();
		Shop shop = new Shop();
		SkinChamp skinChamp1 = new SkinChamp();
		
		// delete all init
		champion.deleteChampoinInit(mongoDB, "champions");
		shop.deleteShopInit(mongoDB, "shops");
		skinChamp1.deleteSkinChampInit(mongoDB, "skinChamp");
		
		champion.initChampion(champions);
		shop.initShop(shops);
		skinChamp1.initSkinChamp(skinChamp);
		
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			System.out.println("Válasszon mûveletet!");
			System.out.println("1\tchampion felvitele");
			System.out.println("2\tchampion nehézségének módosítása");
			System.out.println("3\tchampion szerepének módosítása");
			System.out.println("4\tchampion törlése");
			System.out.println("5\tskin felvitele");
			System.out.println("6\tskin árának módosítása");
			System.out.println("7\tchampion skin-ének módosítása");
			System.out.println("8\tskin törlése");
			System.out.println("9\tösszes champion lekérdezése");
			System.out.println("10\tösszes skin lekérdezése");
			System.out.println("11\tparaméterként megadott champion-hoz tartozó skin-ek");
			System.out.println("12\tchampion és skin összerendelése");
			System.out.println("0\tkilépés");
			input = scanner.nextInt();

			switch(input) {
			case 0: {
				input = 0;
				break;
			}
			
			case 1: {
				// champion felvitele
				Document document = new Document();
				System.out.println("Champion ID-ja:");
				document.put("_id", scanner.next());
				System.out.println("Champion neve:");
				document.put("nev", scanner.next());
				System.out.println("Champion szerepe:");
				document.put("szerep", scanner.next());
				System.out.println("Champion nehézsége:");
				document.put("nehézség", scanner.next());
				service.insert(champions, document);
				System.out.println("Champion tárolva.");
				break;
			}
			
			case 2: {
				// champion nehézségének módosítása
				System.out.println("Champion ID-ja:");
				String id = scanner.next();
				System.out.println("Champion új nehézsége:");
				String difficulty = scanner.next();
				service.update(mongoDB, "champions", id, "nehézség", difficulty);
				System.out.println("Champion nehézsége módosítva.");	
				break;
			}
			
			case 3: {
				// champion szerepének módosítása
				System.out.println("Champion ID-ja:");
				String id = scanner.next();
				System.out.println("Champion új szerepe:");
				String role = scanner.next();
				service.update(mongoDB, "champions", id, "szerep", role);
				System.out.println("Champion szerepe módosítva.");	
				break;
			}
			
			case 4: {
				// champion törlése
				System.out.println("Törlendõ champion ID-ja:");
				String id = scanner.next();
				service.deleteById(mongoDB, "champions", id);
				System.out.println("Törölve.");
				break;
			}
			
			case 5: {
				// skin felvitele
				Document document = new Document();
				System.out.println("Skin ID-ja:");
				document.put("_id", scanner.next());
				System.out.println("Skin neve:");
				document.put("nev", scanner.next());
				System.out.println("Skin ára:");
				document.put("ár", scanner.next());
				service.insert(shops, document);
				System.out.println("Skin tárolva.");
				break;
			}
			
			case 6: {
				// skin árának módosítása
				System.out.println("Skin ID-ja:");
				String id = scanner.next();
				System.out.println("Skin új ára:");
				String price = scanner.next();
				service.update(mongoDB, "shops", id, "ár", price);
				System.out.println("Skin ára módosítva.");	
				break;
			}
			
			case 7: {
				// champion skin-ének módosítása
				System.out.println("skinChamp ID-ja:");
				String id = scanner.next();
				System.out.println("Champion új skin-ének ID-ja:");
				String shopID = scanner.next();
				service.update(mongoDB, "skinChamp", id, "shopID", shopID);
				System.out.println("Champion skin-je módosítva.");	
				break;
			}
			
			case 8: {
				// skin törlése
				System.out.println("Törlendõ skin ID-ja:");
				String id = scanner.next();
				service.deleteById(mongoDB, "shops", id);
				System.out.println("Törölve.");
				break;
			}
			
			case 9: {
				// összes champion lekérdezése
				System.out.println("Champion-ok listája:");
				for(Document document : service.selectAll(mongoDB, "champions").find()) {
					System.out.println(document);
				}
				break;
			}
			
			case 10: {
				// összes skin lekérdezése
				System.out.println("Skin-ek listája");
				for(Document document : service.selectAll(mongoDB, "shops").find()) {
					System.out.println(document);
				}
				break;	
			}
			
			case 11: {
				// paraméterként megadott champion-hoz tartozó skin-ek
				System.out.println("Adja meg azt az champion id-t, akihez tartozó skin-ek id-t kéri listázni:");
				String championID = scanner.next();
				for(Document document : service.selectAll(mongoDB, "skinChamp").find(eq("championID", championID))) {
					System.out.println(document);	
				}
				break;
			}
			
			case 12: {
				// champion és skin összerendelése
				Document document = new Document();
				System.out.println("Új skinChamp ID-ja:");
				document.put("_id", scanner.next());
				System.out.println("Adja meg a champion ID-ját, akit skin-hez szeretne rendelni:");
				String championID = scanner.next();
				document.put("championID", championID);
				System.out.println("Adja meg a skin ID-ját, amelyhez " + championID + " ID-jû champion-t szeretné rendelni.");
				String shopID = scanner.next();
				document.put("shopID", shopID);
				service.insert(skinChamp, document);
				System.out.println("Összerendelve.");
				break;
			}
			default: {
				System.out.println("Nem létezõ menüpont.");					
				break;
			}
		}
			
		} while(input != 0);
		
		// delete all init
		champion.deleteChampoinInit(mongoDB, "champions");
		shop.deleteShopInit(mongoDB, "shops");
		skinChamp1.deleteSkinChampInit(mongoDB, "skinChamp");
		
		scanner.close();
		
		mongoClient.close();
			
	}

}
