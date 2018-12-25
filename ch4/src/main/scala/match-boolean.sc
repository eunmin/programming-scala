val bools = Seq(true, false)

for ( bool <- bools ) {
  bool match {
    case true => println("T")
    case false => println("F")
  }
}å