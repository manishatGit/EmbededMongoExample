package com.crud.mongo

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import com.github.simplyscala.MongodProps
import com.github.simplyscala.MongoEmbedDatabase
import com.dbconnector.mongo.MongoCRUD
import com.mongodb.casbah.commons.MongoDBObject
import com.dbconnector.mongo.DBConnector

class InsertPersonTest extends FunSuite with BeforeAndAfter with MongoEmbedDatabase {

  //declares a variable which will hold the reference to running mongoDB Instance
  var mongoInstance: MongodProps = null
  // Start In-memory Mongo instance in before statement
  before {
    try{ mongoInstance = mongoStart(27017) } //Try starting mongo on this default port
    catch { case ex:Exception => } // Handle exception In case local mongo is running
  }
  
  //Stop mongo Instance After Running test Case
  after {
    mongoStop(mongoInstance)
  }
  
  val mongoCRUD = new MongoCRUD
  test("Should be able to insert person Object into MongoDB"){
    val person = MongoDBObject("name"->"Manish")
    val queryResult = mongoCRUD.insertPerson(person)
    //assert if the document was inserted into database
    println(mongoCRUD.findPerson(person).toList)
    assert(mongoCRUD.findPerson(person).count === 1)
  }
}