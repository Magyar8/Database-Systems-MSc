package mongoDB;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Champion {
	
	private String id;
	private String name;
	private String role;
	private String difficulty;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	void initChampion(MongoCollection<Document> collection) {
		Document champion0 = new Document();
		champion0.put("_id", "100");
		champion0.put("nev", "Akali");
		champion0.put("szerep", "assasin");
		champion0.put("nehézség", "moderate");
		service.insert(collection, champion0);
		Document champion1 = new Document();
		champion1.put("_id", "101");
		champion1.put("nev", "Ashe");
		champion1.put("szerep", "marksam");
		champion1.put("nehézség", "moderate");
		service.insert(collection, champion1);
		Document champion2 = new Document();
		champion2.put("_id", "102");
		champion2.put("nev", "Irelia");
		champion2.put("szerep", "fighter");
		champion2.put("nehézség", "moderate");
		service.insert(collection, champion2);
		Document champion3 = new Document();
		champion3.put("_id", "103");
		champion3.put("nev", "Kaisa");
		champion3.put("szerep", "marksam");
		champion3.put("nehézség", "moderate");
		service.insert(collection, champion3);
		Document champion4 = new Document();
		champion4.put("_id", "104");
		champion4.put("nev", "Kennen");
		champion4.put("szerep", "mage");
		champion4.put("nehézség", "moderate");
		service.insert(collection, champion4);
		Document champion5 = new Document();
		champion5.put("_id", "105");
		champion5.put("nev", "Ryze");
		champion5.put("szerep", "mage");
		champion5.put("nehézség", "moderate");
		service.insert(collection, champion5);
		Document champion6 = new Document();
		champion6.put("_id", "106");
		champion6.put("nev", "Sett");
		champion6.put("szerep", "fighter");
		champion6.put("nehézség", "low");
		service.insert(collection, champion6);
		Document champion7 = new Document();
		champion7.put("_id", "107");
		champion7.put("nev", "Swain");
		champion7.put("szerep", "mage");
		champion7.put("nehézség", "high");
		service.insert(collection, champion7);
		Document champion8 = new Document();
		champion8.put("_id", "108");
		champion8.put("nev", "Urgot");
		champion8.put("szerep", "fighter");
		champion8.put("nehézség", "high");
		service.insert(collection, champion8);
		Document champion9 = new Document();
		champion9.put("_id", "109");
		champion9.put("nev", "Viktor");
		champion9.put("szerep", "mage");
		champion9.put("nehézség", "high");
		service.insert(collection, champion9);
		Document champion10 = new Document();
		champion10.put("_id", "110");
		champion10.put("nev", "Yone");
		champion10.put("szerep", "assasin");
		champion10.put("nehézség", "high");
		service.insert(collection, champion10);
	}
	
	void deleteChampoinInit(MongoDatabase mongoDB, String collection) {
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
		}
	
}
