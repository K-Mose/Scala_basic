package Collection

object SORT_GROUPING_FILTERING extends App {
  // 맵
  val list = (1 to 5)
  println(list.map(_ + 1))

  val strs = List("asd","zxc","qwe")
  println(strs.map(_.toUpperCase()))

  // 리듀스
  println(list.reduce(_ + _))
  println(list.reduceLeft(_ + _))
  println(list.reduceRight(_ + _))
  println(list.fold(10)(_ + _))
  println()
  println(list.reduce(_ - _))
  println(list.reduceLeft(_ - _))
  println(list.reduceRight(_ - _))
  println()
  println(list.reduce(_ * _))
  println(list.reduceLeft(_ * _))
  println(list.reduceRight(_ * _))

  // 그룹, 키를 기준으로 데이터를 병합.
  var datas = List(
    ("A",1),
    ("B",2),
    ("C",3),
    ("A",4),
    ("B",5),
    ("C",5),
  )
  datas.groupBy(_._1).foreach({
    case (k,v) => printf("key: %s / value : %s \n", k, v)
  })

  // 필터
  list.filter(_ > 5)

}
