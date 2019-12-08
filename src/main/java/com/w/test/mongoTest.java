package com.w.test;

//import com.mongodb.MongoClient;
//import com.mongodb.client.FindIterable;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoCursor;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.model.Filters;
//import org.bson.Document;
//
//import java.util.ArrayList;
//import java.util.List;

/**
 * @ClassNamemongoTest
 * @Description
 * @Author ANGLE0
 * @Date2019/12/4 22:07
 * @Version V1.0
 **/
public class mongoTest {
//    public static void main(String[] args) {
//
//        MongoClient mongoClient = new MongoClient( "127.0.0.1" , 27017 );
//        System.out.println("连接成功");
//        MongoDatabase mongoDatabase = mongoClient.getDatabase("itaobao");
//        System.out.println("数据库获取成功");
////        mongoDatabase.createCollection("test");
//        MongoCollection<Document> collection = mongoDatabase.getCollection("test");
//        System.out.println("获取集合成功");
//
//        System.out.println("------------------------插入文档---------------------------");
//        Document document = new Document("title", "MongoDB").
//                append("description", "database").
//                append("likes", 100).
//                append("by", "Fly");
//        List<Document> documents = new ArrayList<Document>();
//        documents.add(document);
//        collection.insertMany(documents);
//        System.out.println("文档插入成功");
//
//        System.out.println("-------------------------检索文档--------------------------");
//        FindIterable<Document> findIterable = collection.find();
//        MongoCursor<Document> mongoCursor = findIterable.iterator();
//        while(mongoCursor.hasNext()){
//            System.out.println(mongoCursor.next());
//        }
//
//        System.out.println("-------------------------更新文档--------------------------");
//        collection.updateMany(Filters.eq("likes", 100), new Document("$set",new Document("likes",200)));
//        //检索查看结果
//        FindIterable<Document> Iterable = collection.find();
//        MongoCursor<Document> Cursor = Iterable.iterator();
//        while(Cursor.hasNext()){
//            System.out.println(Cursor.next());
//        }
//    }
}
