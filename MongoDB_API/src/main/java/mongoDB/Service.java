package mongoDB;

import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Service {
	
	 MongoCollection<Document> selectAll(MongoDatabase mongoDB, String collection) {
			return mongoDB.getCollection(collection);
		}
		
		 void insert(MongoCollection<Document> collection, Document newdocument) {
			collection.insertOne(newdocument);
		}
		
		 void deleteById(MongoDatabase mongoDB, String collection, String id) {
			MongoCollection<Document> coll = mongoDB.getCollection(collection);
			coll.deleteOne(eq("_id", id));
		}
		
		 void update(MongoDatabase mongoDB, String collection, String id, String field, String newValue) {
			MongoCollection<Document> coll = mongoDB.getCollection(collection);
			coll.updateOne(eq("_id", id), new Document("$set", new Document(field, newValue)));
		}

}
