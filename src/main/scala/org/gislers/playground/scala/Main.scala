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

    var json = ( "firstName", "jim" ) ~ ("lastName", "gisler")
    println( pretty(json) )
    println( compact(json \ "firstName") )
  }

}