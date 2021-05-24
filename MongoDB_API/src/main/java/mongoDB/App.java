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
			System.out.println("V�lasszon m�veletet!");
			System.out.println("1\tchampion felvitele");
			System.out.println("2\tchampion neh�zs�g�nek m�dos�t�sa");
			System.out.println("3\tchampion szerep�nek m�dos�t�sa");
			System.out.println("4\tchampion t�rl�se");
			System.out.println("5\tskin felvitele");
			System.out.println("6\tskin �r�nak m�dos�t�sa");
			System.out.println("7\tchampion skin-�nek m�dos�t�sa");
			System.out.println("8\tskin t�rl�se");
			System.out.println("9\t�sszes champion lek�rdez�se");
			System.out.println("10\t�sszes skin lek�rdez�se");
			System.out.println("11\tparam�terk�nt megadott champion-hoz tartoz� skin-ek");
			System.out.println("12\tchampion �s skin �sszerendel�se");
			System.out.println("0\tkil�p�s");
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
				System.out.println("Champion neh�zs�ge:");
				document.put("neh�zs�g", scanner.next());
				service.insert(champions, document);
				System.out.println("Champion t�rolva.");
				break;
			}
			
			case 2: {
				// champion neh�zs�g�nek m�dos�t�sa
				System.out.println("Champion ID-ja:");
				String id = scanner.next();
				System.out.println("Champion �j neh�zs�ge:");
				String difficulty = scanner.next();
				service.update(mongoDB, "champions", id, "neh�zs�g", difficulty);
				System.out.println("Champion neh�zs�ge m�dos�tva.");	
				break;
			}
			
			case 3: {
				// champion szerep�nek m�dos�t�sa
				System.out.println("Champion ID-ja:");
				String id = scanner.next();
				System.out.println("Champion �j szerepe:");
				String role = scanner.next();
				service.update(mongoDB, "champions", id, "szerep", role);
				System.out.println("Champion szerepe m�dos�tva.");	
				break;
			}
			
			case 4: {
				// champion t�rl�se
				System.out.println("T�rlend� champion ID-ja:");
				String id = scanner.next();
				service.deleteById(mongoDB, "champions", id);
				System.out.println("T�r�lve.");
				break;
			}
			
			case 5: {
				// skin felvitele
				Document document = new Document();
				System.out.println("Skin ID-ja:");
				document.put("_id", scanner.next());
				System.out.println("Skin neve:");
				document.put("nev", scanner.next());
				System.out.println("Skin �ra:");
				document.put("�r", scanner.next());
				service.insert(shops, document);
				System.out.println("Skin t�rolva.");
				break;
			}
			
			case 6: {
				// skin �r�nak m�dos�t�sa
				System.out.println("Skin ID-ja:");
				String id = scanner.next();
				System.out.println("Skin �j �ra:");
				String price = scanner.next();
				service.update(mongoDB, "shops", id, "�r", price);
				System.out.println("Skin �ra m�dos�tva.");	
				break;
			}
			
			case 7: {
				// champion skin-�nek m�dos�t�sa
				System.out.println("skinChamp ID-ja:");
				String id = scanner.next();
				System.out.println("Champion �j skin-�nek ID-ja:");
				String shopID = scanner.next();
				service.update(mongoDB, "skinChamp", id, "shopID", shopID);
				System.out.println("Champion skin-je m�dos�tva.");	
				break;
			}
			
			case 8: {
				// skin t�rl�se
				System.out.println("T�rlend� skin ID-ja:");
				String id = scanner.next();
				service.deleteById(mongoDB, "shops", id);
				System.out.println("T�r�lve.");
				break;
			}
			
			case 9: {
				// �sszes champion lek�rdez�se
				System.out.println("Champion-ok list�ja:");
				for(Document document : service.selectAll(mongoDB, "champions").find()) {
					System.out.println(document);
				}
				break;
			}
			
			case 10: {
				// �sszes skin lek�rdez�se
				System.out.println("Skin-ek list�ja");
				for(Document document : service.selectAll(mongoDB, "shops").find()) {
					System.out.println(document);
				}
				break;	
			}
			
			case 11: {
				// param�terk�nt megadott champion-hoz tartoz� skin-ek
				System.out.println("Adja meg azt az champion id-t, akihez tartoz� skin-ek id-t k�ri list�zni:");
				String championID = scanner.next();
				for(Document document : service.selectAll(mongoDB, "skinChamp").find(eq("championID", championID))) {
					System.out.println(document);	
				}
				break;
			}
			
			case 12: {
				// champion �s skin �sszerendel�se
				Document document = new Document();
				System.out.println("�j skinChamp ID-ja:");
				document.put("_id", scanner.next());
				System.out.println("Adja meg a champion ID-j�t, akit skin-hez szeretne rendelni:");
				String championID = scanner.next();
				document.put("championID", championID);
				System.out.println("Adja meg a skin ID-j�t, amelyhez " + championID + " ID-j� champion-t szeretn� rendelni.");
				String shopID = scanner.next();
				document.put("shopID", shopID);
				service.insert(skinChamp, document);
				System.out.println("�sszerendelve.");
				break;
			}
			default: {
				System.out.println("Nem l�tez� men�pont.");					
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
