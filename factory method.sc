trait Animal {
  def speak: String
}

object Animal{
  class Dog extends Animal{
    override def speak: String = "its a DOG"
  }
  class Cat extends Animal{
    override def speak: String = "its a CAT"
  }

  def apply(kind:String): Animal=kind match {
    case "Dog"=>new Dog()
    case "Cat" => new Cat()
  }
}
val animal:Animal=Animal("Dog")

println(animal.speak)
