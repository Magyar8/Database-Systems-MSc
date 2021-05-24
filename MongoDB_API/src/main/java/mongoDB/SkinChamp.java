package mongoDB;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class SkinChamp {
	
	private String id;
	private String championID;
	private String shopID;

	Service service = new Service();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChampionID() {
		return championID;
	}

	public void setChampionID(String championID) {
		this.championID = championID;
	}

	public String getShopID() {
		return shopID;
	}

	public void setShopID(String shopID) {
		this.shopID = shopID;
	}
	
	void initSkinChamp(MongoCollection<Document> collection) {
		Document skinChamp0 = new Document();
		skinChamp0.put("_id", "1");
		skinChamp0.put("championID", "100");
		skinChamp0.put("shopID", "100");
		service.insert(collection, skinChamp0);
		
		Document skinChamp1 = new Document();
		skinChamp1.put("_id", "2");
		skinChamp1.put("championID", "101");
		skinChamp1.put("shopID", "100");
		service.insert(collection, skinChamp1);
		
		Document skinChamp2 = new Document();
		skinChamp2.put("_id", "3");
		skinChamp2.put("championID", "102");
		skinChamp2.put("shopID", "100");
		service.insert(collection, skinChamp2);
		
		Document skinChamp3 = new Document();
		skinChamp3.put("_id", "4");
		skinChamp3.put("championID", "103");
		skinChamp3.put("shopID", "100");
		service.insert(collection, skinChamp3);
		
		Document skinChamp4 = new Document();
		skinChamp4.put("_id", "5");
		skinChamp4.put("championID", "104");
		skinChamp4.put("shopID", "100");
		service.insert(collection, skinChamp4);
		
		Document skinChamp5 = new Document();
		skinChamp5.put("_id", "6");
		skinChamp5.put("championID", "105");
		skinChamp5.put("shopID", "100");
		service.insert(collection, skinChamp5);
		
		Document skinChamp6 = new Document();
		skinChamp6.put("_id", "7");
		skinChamp6.put("championID", "106");
		skinChamp6.put("shopID", "100");
		service.insert(collection, skinChamp6);
		
		Document skinChamp7 = new Document();
		skinChamp7.put("_id", "8");
		skinChamp7.put("championID", "107");
		skinChamp7.put("shopID", "100");
		service.insert(collection, skinChamp7);
		
		Document skinChamp8 = new Document();
		skinChamp8.put("_id", "9");
		skinChamp8.put("championID", "107");
		skinChamp8.put("shopID", "100");
		service.insert(collection, skinChamp8);
		
		Document skinChamp9 = new Document();
		skinChamp9.put("_id", "10");
		skinChamp9.put("championID", "109");
		skinChamp9.put("shopID", "100");
		service.insert(collection, skinChamp9);
		
		Document skinChamp10 = new Document();
		skinChamp10.put("_id", "11");
		skinChamp10.put("championID", "110");
		skinChamp10.put("shopID", "100");
		service.insert(collection, skinChamp10);
		
		
		Document skinChamp11 = new Document();
		skinChamp11.put("_id", "12");
		skinChamp11.put("championID", "100");
		skinChamp11.put("shopID", "101");
		service.insert(collection, skinChamp11);
		
		Document skinChamp12 = new Document();
		skinChamp12.put("_id", "13");
		skinChamp12.put("championID", "100");
		skinChamp12.put("shopID", "102");
		service.insert(collection, skinChamp12);
		
		Document skinChamp13 = new Document();
		skinChamp13.put("_id", "14");
		skinChamp13.put("championID", "101");
		skinChamp13.put("shopID", "103");
		service.insert(collection, skinChamp13);
		
		Document skinChamp14 = new Document();
		skinChamp14.put("_id", "15");
		skinChamp14.put("championID", "101");
		skinChamp14.put("shopID", "104");
		service.insert(collection, skinChamp14);
		
		Document skinChamp15 = new Document();
		skinChamp15.put("_id", "16");
		skinChamp15.put("championID", "102");
		skinChamp15.put("shopID", "105");
		service.insert(collection, skinChamp15);
	
		Document skinChamp16 = new Document();
		skinChamp16.put("_id", "17");
		skinChamp16.put("championID", "102");
		skinChamp16.put("shopID", "106");
		service.insert(collection, skinChamp16);
		
		Document skinChamp17 = new Document();
		skinChamp17.put("_id", "18");
		skinChamp17.put("championID", "103");
		skinChamp17.put("shopID", "105");
		service.insert(collection, skinChamp17);
		
		Document skinChamp18 = new Document();
		skinChamp18.put("_id", "19");
		skinChamp18.put("championID", "103");
		skinChamp18.put("shopID", "101");
		service.insert(collection, skinChamp18);
		
		Document skinChamp19 = new Document();
		skinChamp19.put("_id", "20");
		skinChamp19.put("championID", "104");
		skinChamp19.put("shopID", "102");
		service.insert(collection, skinChamp19);
		
		Document skinChamp20 = new Document();
		skinChamp20.put("_id", "21");
		skinChamp20.put("championID", "104");
		skinChamp20.put("shopID", "110");
		service.insert(collection, skinChamp20);
		
		Document skinChamp21 = new Document();
		skinChamp21.put("_id", "22");
		skinChamp21.put("championID", "105");
		skinChamp21.put("shopID", "104");
		service.insert(collection, skinChamp21);
		
		Document skinChamp22 = new Document();
		skinChamp22.put("_id", "23");
		skinChamp22.put("championID", "105");
		skinChamp22.put("shopID", "108");
		service.insert(collection, skinChamp22);
		
		Document skinChamp23 = new Document();
		skinChamp23.put("_id", "24");
		skinChamp23.put("championID", "106");
		skinChamp23.put("shopID", "101");
		service.insert(collection, skinChamp23);
		
		Document skinChamp24 = new Document();
		skinChamp24.put("_id", "25");
		skinChamp24.put("championID", "106");
		skinChamp24.put("shopID", "108");
		service.insert(collection, skinChamp24);
		
		Document skinChamp25 = new Document();
		skinChamp25.put("_id", "26");
		skinChamp25.put("championID", "106");
		skinChamp25.put("shopID", "109");
		service.insert(collection, skinChamp25);
		
		Document skinChamp26 = new Document();
		skinChamp26.put("_id", "27");
		skinChamp26.put("championID", "107");
		skinChamp26.put("shopID", "114");
		service.insert(collection, skinChamp26);
		
		Document skinChamp27 = new Document();
		skinChamp27.put("_id", "28");
		skinChamp27.put("championID", "108");
		skinChamp27.put("shopID", "107");
		service.insert(collection, skinChamp27);
		
		Document skinChamp28 = new Document();
		skinChamp28.put("_id", "29");
		skinChamp28.put("championID", "108");
		skinChamp28.put("shopID", "111");
		service.insert(collection, skinChamp28);
		
		Document skinChamp29 = new Document();
		skinChamp29.put("_id", "30");
		skinChamp29.put("championID", "107");
		skinChamp29.put("shopID", "103");
		service.insert(collection, skinChamp29);
		
		Document skinChamp30 = new Document();
		skinChamp30.put("_id", "31");
		skinChamp30.put("championID", "107");
		skinChamp30.put("shopID", "102");
		service.insert(collection, skinChamp30);
		
		Document skinChamp31 = new Document();
		skinChamp31.put("_id", "32");
		skinChamp31.put("championID", "109");
		skinChamp31.put("shopID", "103");
		service.insert(collection, skinChamp31);
		
		Document skinChamp32 = new Document();
		skinChamp32.put("_id", "33");
		skinChamp32.put("championID", "109");
		skinChamp32.put("shopID", "115");
		service.insert(collection, skinChamp32);
		
		Document skinChamp33 = new Document();
		skinChamp33.put("_id", "34");
		skinChamp33.put("championID", "110");
		skinChamp33.put("shopID", "116");
		service.insert(collection, skinChamp33);
		
		Document skinChamp34 = new Document();
		skinChamp34.put("_id", "35");
		skinChamp34.put("championID", "110");
		skinChamp34.put("shopID", "111");
		service.insert(collection, skinChamp34);
		
		Document skinChamp35 = new Document();
		skinChamp35.put("_id", "36");
		skinChamp35.put("championID", "108");
		skinChamp35.put("shopID", "112");
		service.insert(collection, skinChamp35);
		
		Document skinChamp36 = new Document();
		skinChamp36.put("_id", "37");
		skinChamp36.put("championID", "107");
		skinChamp36.put("shopID", "113");
		service.insert(collection, skinChamp36);
		
	}
	 
	void deleteSkinChampInit(MongoDatabase db, String collection) {
			service.deleteById(db, collection, "1");
			service.deleteById(db, collection, "2");
			service.deleteById(db, collection, "3");
			service.deleteById(db, collection, "4");
			service.deleteById(db, collection, "5");
			service.deleteById(db, collection, "6");
			service.deleteById(db, collection, "7");
			service.deleteById(db, collection, "8");
			service.deleteById(db, collection, "9");
			service.deleteById(db, collection, "10");
			service.deleteById(db, collection, "11");
			service.deleteById(db, collection, "12");
			service.deleteById(db, collection, "13");
			service.deleteById(db, collection, "14");
			service.deleteById(db, collection, "15");
			service.deleteById(db, collection, "16");
			service.deleteById(db, collection, "17");
			service.deleteById(db, collection, "18");
			service.deleteById(db, collection, "19");
			service.deleteById(db, collection, "20");
			service.deleteById(db, collection, "21");
			service.deleteById(db, collection, "22");
			service.deleteById(db, collection, "23");
			service.deleteById(db, collection, "24");
			service.deleteById(db, collection, "25");
			service.deleteById(db, collection, "26");
			service.deleteById(db, collection, "27");
			service.deleteById(db, collection, "28");
			service.deleteById(db, collection, "29");
			service.deleteById(db, collection, "30");
			service.deleteById(db, collection, "31");
			service.deleteById(db, collection, "32");
			service.deleteById(db, collection, "33");
			service.deleteById(db, collection, "34");
			service.deleteById(db, collection, "35");
			service.deleteById(db, collection, "36");
			service.deleteById(db, collection, "37");
		}
		
}
	
