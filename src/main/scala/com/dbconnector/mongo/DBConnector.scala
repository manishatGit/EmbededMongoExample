package com.dbconnector.mongo
import com.mongodb.Mongo
import com.mongodb.casbah.MongoConnection

object DBConnector {

  // Connect to default - localhost, 27017
  val mongoConn = MongoConnection()
  //Create a testDB 
  val mongoDB = mongoConn("testDB")
  //returns a collection
  def fetchCollection(collectionName: String) = mongoDB(collectionName)
}