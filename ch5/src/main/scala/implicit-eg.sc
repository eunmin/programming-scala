 implicit class Trans[A](val x: A) {
  def ->> [B] (y : B) : Tuple2[A, B] = Tuple2(x, y)
}

 val x = new Trans[String]("X")

 x ->> "Y"

 "Z" ->> "Z"