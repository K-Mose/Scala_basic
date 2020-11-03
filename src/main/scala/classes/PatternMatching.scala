package classes

//param match {
//  case value => "value1"
//  case _ => "default value"
//}
object PatternMatching extends App {
  def matching(x: Int): String = x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "I don't know?"
  }

  println(matching(0))
  println(matching(2))
  println(matching(3))
  println(matching(1))
  println(matching(100))

  // 케이스 클래스 매칭
  abstract class Notification

  case class Email(sender: String, title: String, body: String) extends Notification

  case class SMS(caller: String, message: String) extends Notification

  case class VoicdeRecoding(contactName: String, link: String) extends Notification

  def showNotfication(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        s"You got email from \'$email\' with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoicdeRecoding(name, link) =>
        s"You received a Voice Recording from $name! Click the link to hear it : $link"
    }
  }

  val email = Email("to@mail,com", "Help Me", "I lost my way")
  val email2 = Email("이메일", "내용", "")
  val someSms = SMS("0101010", "Are you OK?")
  val someVoiceRecording = VoicdeRecoding("Tom", "voiceRecording.org/12/25")

  println(showNotfication(email))
  println(showNotfication(someSms))
  println(showNotfication(someVoiceRecording))
  println(showNotfication(email2))
}
