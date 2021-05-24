package mongoDB;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Shop {
	
	private String id;
	private String name;
	private String price;
	
	Service service = new Service();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	void initShop(MongoCollection<Document> collection) {
		Document insertSkin0 = new Document();
		insertSkin0.put("_id", "100");
		insertSkin0.put("nev", "Basic");
		insertSkin0.put("ár", "0");
		service.insert(collection, insertSkin0);
		
		Document insertSkin1 = new Document();
		insertSkin1.put("_id", "101");
		insertSkin1.put("nev", "K/DA");
		insertSkin1.put("ár", "750");
		service.insert(collection, insertSkin1);
		
		Document insertSkin2 = new Document();
		insertSkin2.put("_id", "102");
		insertSkin2.put("nev", "BloodMoon");
		insertSkin2.put("ár", "1150");
		service.insert(collection, insertSkin2);
		
		Document insertSkin3 = new Document();
		insertSkin3.put("_id", "103");
		insertSkin3.put("nev", "Project");
		insertSkin3.put("ár", "750");
		service.insert(collection, insertSkin3);
		
		Document insertSkin4 = new Document();
		insertSkin4.put("_id", "104");
		insertSkin4.put("nev", "IG");
		insertSkin4.put("ár", "550");
		service.insert(collection, insertSkin4);
		
		Document insertSkin5 = new Document();
		insertSkin5.put("_id", "105");
		insertSkin5.put("nev", "Championship");
		insertSkin5.put("ár", "1150");
		service.insert(collection, insertSkin5);
		
		Document insertSkin6 = new Document();
		insertSkin6.put("_id", "106");
		insertSkin6.put("nev", "DevineSword");
		insertSkin6.put("ár", "750");
		service.insert(collection, insertSkin6);
		
		Document insertSkin7 = new Document();
		insertSkin7.put("_id", "107");
		insertSkin7.put("nev", "HighNoon");
		insertSkin7.put("ár", "1150");
		service.insert(collection, insertSkin7);
		
		Document insertSkin8 = new Document();
		insertSkin8.put("_id", "108");
		insertSkin8.put("nev", "SpiritBlosson");
		insertSkin8.put("ár", "750");
		service.insert(collection, insertSkin8);
		
		Document insertSkin9 = new Document();
		insertSkin9.put("_id", "109");
		insertSkin9.put("nev", "DarkStar");
		insertSkin9.put("ár", "750");
		service.insert(collection, insertSkin9);
		
		Document insertSkin10 = new Document();
		insertSkin10.put("_id", "110");
		insertSkin10.put("nev", "Runied");
		insertSkin10.put("ár", "1150");
		service.insert(collection, insertSkin10);
		
		Document insertSkin11 = new Document();
		insertSkin11.put("_id", "111");
		insertSkin11.put("nev", "Infernal");
		insertSkin11.put("ár", "750");
		service.insert(collection, insertSkin11);
		
		Document insertSkin12 = new Document();
		insertSkin12.put("_id", "112");
		insertSkin12.put("nev", "PoolParty");
		insertSkin12.put("ár", "650");
		service.insert(collection, insertSkin12);
		
		Document insertSkin13 = new Document();
		insertSkin13.put("_id", "113");
		insertSkin13.put("nev", "GunGoddess");
		insertSkin13.put("ár", "1550");
		service.insert(collection, insertSkin13);
		
		Document insertSkin14 = new Document();
		insertSkin14.put("_id", "114");
		insertSkin14.put("nev", "BadlandsBaron");
		insertSkin14.put("ár", "1150");
		service.insert(collection, insertSkin14);
		
		Document insertSkin15 = new Document();
		insertSkin15.put("_id", "115");
		insertSkin15.put("nev", "Hextech");
		insertSkin15.put("ár", "1850");
		service.insert(collection, insertSkin15);
		
		Document insertSkin16 = new Document();
		insertSkin16.put("_id", "116");
		insertSkin16.put("nev", "Psyops");
		insertSkin16.put("ár", "1150");
		service.insert(collection, insertSkin16);
		
	}
	 
	void deleteShopInit(MongoDatabase mongoDB, String collection) {
			service.deleteById(mongoDB, collection, "100");
			service.deleteById(mongoDB, collection, "101");
			service.deleteById(mongoDB, collection, "102");
			service.deleteById(mongoDB, collection, "103");
			service.deleteById(mongoDB, collection, "104");
			service.deleteById(mongoDB, collection, "105");
			service.deleteById(mongoDB, collection, "106");
			service.deleteById(mongoDB, collection, "107");
			service.deleteById(mongoDB, collection, "108");
			service.deleteById(mongoDB, collection, "109");
			service.deleteById(mongoDB, collection, "110");
			service.deleteById(mongoDB, collection, "111");
			service.deleteById(mongoDB, collection, "112");
			service.deleteById(mongoDB, collection, "113");
			service.deleteById(mongoDB, collection, "114");
			service.deleteById(mongoDB, collection, "115");
			service.deleteById(mongoDB, collection, "116");
		}


}
