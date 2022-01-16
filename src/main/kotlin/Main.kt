fun main(args: Array<String>) {

   var patternDecorator  : Beverage = Espresso()

    patternDecorator = Mocha(patternDecorator)

    println(patternDecorator.description)

}

data class Cats(val name: String, val age: String,val id: String)
data class Dogs(val name: String, val age: String,val id: String)

class Dog : Animal() {
    init {
        animal = DogBehaviour()
    }

    private fun test() {
        performQuack()
    }

}

open class Animal {
   protected lateinit var animal: AnimalBehhaviour

    open fun performQuack() {
        animal.going()
    }
}

interface AnimalBehhaviour {
    fun going()
}

class DogBehaviour : AnimalBehhaviour {
    override fun going() {

    }
}

