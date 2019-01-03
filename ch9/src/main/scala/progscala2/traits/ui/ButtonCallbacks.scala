package progscala2.traits.ui

class ButtonCallbacks(val label: String, val callbacks: List[() => Unit] = Nil) extends Widget {
  def click(): Unit = {
    updateUI()
    callbacks.foreach(f => f())
  }

  protected def updateUI(): Unit = {

  }
}

object ButtonWithCallbacks {
  def apply(label: String, callback: () => Unit) =
    new ButtonCallbacks(label, List(callback))

  def apply(label: String) =
    new ButtonCallbacks(label, Nil)
}

