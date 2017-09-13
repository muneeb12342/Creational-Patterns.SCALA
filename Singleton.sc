object Cat {
 private val instance = new Cat

  def getInstance = instance
}

class Cat private() extends Runnable {
 override def run(): Unit = {
     //do nothing

  }
}

