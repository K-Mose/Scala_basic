package Scala_30Minutes.part3Method

import java.util.Date

object PartiallyAppliedFunction extends App {
  // 로그 찍는 함수
  def log(date: Date, message:String) = {
    println(date+ " : "+message)
  }

  val newLog = log(new Date, _:String)
  newLog("this is message")
  Thread.sleep(1000)
  newLog("Log1")
  Thread.sleep(500)
  newLog("Log2")
}
