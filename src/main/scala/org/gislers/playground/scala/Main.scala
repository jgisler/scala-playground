package org.gislers.playground.scala

import org.json4s._
import org.json4s.JsonDSL._
import org.json4s.jackson.JsonMethods._

/**
  * Created by:   jgisle 
  * Created date: 12/3/15
  */
object Main {

  def main( arg: Array[String] ) {

    val json =
      ("payload-version" -> "1.0") ~
      ("events" -> List(
        ("id" -> "939b1bfa-faf1-4f22-b10f-1f8e2a84b8e3") ~
          ("generator" -> "GEN") ~
          ("published" -> "2014-07-08T22:14:59.992Z") ~
          ("object" -> (
            ("objectType" -> "FRIEND") ~
            ("id" -> "d62f37b4-4cf5-4c96-847a-69a34c0fb35a") ~
            ("appId" -> "TheApp") ~
            ("updated" -> "1404857699992") ~
            ("toUser" -> (
              ("upmId" -> "11111") ~
              ("firstName" -> "This") ~
              ("lastName" -> "Dood") ~
              ("screenName" -> "thisDood"))) ~
            ("fromUser" -> (
              ("upmId" -> "22222") ~
              ("firstName" -> "Other") ~
              ("lastName" -> "Dood") ~
              ("screenName" -> "otherDood")))
            )) ~
          ("verb" -> "REMOVE")
        ))

    println( pretty(json) )
    println( compact(json \ "events" \ "object" \ "toUser" \ "firstName") )
  }

}