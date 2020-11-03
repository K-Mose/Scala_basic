package classes

object ClassTypeMatching extends App {
  abstract class Device
  case class Phone(model:String)extends Device{
    def screenOff = "Turning screen off"
  }

  case class Computer(model:String)extends Device{
    def screenSaverOn = "Turning screen saver on."
  }

  def goIdle(device:Device) = device match {
    case p:Phone =>p.screenOff
    case c:Computer => c.screenSaverOn
  }

  val phone = Phone("Galaxy100")
  val computer = Computer("Window99")

  println(goIdle(phone))
  println(goIdle(computer))
}
