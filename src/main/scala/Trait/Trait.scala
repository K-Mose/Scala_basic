package Trait

trait Machine{
  val serialNumber:Int = 1
  def work(message:String)
}
trait KrMachine{
  var countryCode:String = "kr"
  def print() = println("한글 출력")// 기본 구현
}

//
class Computer(location:String)extends Machine with KrMachine{
  this.countryCode = "us"
  def work(message: String)=println(message)
}
class tCar(location:String) extends Machine with KrMachine{
  def work(message:String) = println(message)
  override def print() = println("운전중입니다. ")//재정의
}
object Trait extends App{
  var machine = new Computer("노트북")
  var car = new tCar("포르쉐")
  println(machine.work("computing..."))
  machine.print()
  println(machine.countryCode)
  println(car.work("driving.."))
  car.print()
}
