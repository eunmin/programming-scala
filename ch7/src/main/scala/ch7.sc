val states = List("Alabma", "Alaska", "Virginia", "Wyoming")

for {
  s <- states
} yield s


val results: Seq[Option[Int]] = Vector(Some(10), None, Some(20))

val result2 = for {
  Some(i) <- results
} yield (2 * i)

val results2b = results.withFilter {
    case Some(i) => true
    case None => false
  } map {
    case Some(i) => (2 * i)
  }
