for {
  x <- Seq(1, 2, 2.7, "one", "two", 'four)
} {
  val str = x match {
    case 1 => "1"
    case _: Int => s"int: $x"
    case d: Double => s"double: $d"
    case unexpected => "unexpected!" + unexpected
  }

  println(str)
}

println("test")