package com.dbconnector.mongo

import com.mongodb.casbah.commons.MongoDBObject
import com.mongodb.DBObject


class MongoCRUD {
  
  /**
   * Inserts a person into mongoDB 
   */
  def insertPerson(person: DBObject) = {
     val collection = DBConnector.fetchCollection("testData")
     collection.insert(person)
   }
  def findPerson(person: DBObject) = {
    val collection = DBConnector.fetchCollection("testData")
    collection.find(person)
  }
}