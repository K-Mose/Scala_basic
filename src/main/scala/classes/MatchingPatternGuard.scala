package classes

import classes.PatternMatching._

object MatchingPatternGuard extends App {

  // if 필터에 걸리면 case 실행 시키고 아니면 기존 match에 보내서 실행시킴
  def showImportantNotfication(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match {
      case Email(email, _, _) if importantPeopleInfo.contains(email) =>
        "특별한 사람한테 메일 옴"
      case SMS(number, _) if importantPeopleInfo.contains(number) =>
        "특별한 메시지옴 "
      case other => showNotfication(other) // 일치하지 않으면 showNotification 호출
    }
  }

  val importantPeopleInfo = Seq("123-456", "제니@쥐멜.컴")
  val someSms = SMS("123-456", "거기있니")
  val someVoiceRecording = VoicdeRecoding("Tom", "보이스 어쩌고 ")
  val importantSms = SMS("123-445", "중요해?")
  val importantEmail = Email("제니@쥐멜.컴", "안녕 3000", "ㅇㅇ")
  println(showImportantNotfication(someSms, importantPeopleInfo))
  println(showImportantNotfication(someVoiceRecording, importantPeopleInfo))
  println(showImportantNotfication(importantEmail, importantPeopleInfo))
  println(showImportantNotfication(importantSms, importantPeopleInfo))
}
