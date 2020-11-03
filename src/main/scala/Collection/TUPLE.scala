package Collection

object TUPLE extends App {
  val hostPort=("localhost", 100)
  println(hostPort._1)
  println(hostPort._2)

  def matchTest(hostPort:(String,Int)) = hostPort match{
    case ("localhost", port) => println(s"localhost $port")
    case (host, port) => println(s"$host $port")
  }
  val hostPort2=("localhost", 100)
  val hostPort3=("localhost", 3600)
  val hostPort4=("127.0.0.1", 8080)
  val hostPort5=("domain", 10010)

  matchTest(hostPort)
  matchTest(hostPort2)
  matchTest(hostPort3)
  matchTest(hostPort4)
  matchTest(hostPort5)

}
