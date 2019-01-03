package progscala2.traits.ui2

import progscala2.traits.observer.Subject
;

trait ObservableClicks extends Clickable with Subject[Clickable] {
  abstract override def click(): Unit = {
    super.click()
    notifyObservers(this)
  }
}
