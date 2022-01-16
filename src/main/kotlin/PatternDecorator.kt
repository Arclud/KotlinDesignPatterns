open class PatternDecorator {
    val name : String = "rustam"
}

abstract class Beverage {
    open var description = ""
    abstract fun cost() : Double
}

public class Mocha(var beverage: Beverage) : CondimentDecorator() {

    override var description: String
        get() = beverage.description + ", Mocha"
        set(value) {
            description = value
        }

    override fun cost(): Double = .20 + beverage.cost()

}

class Espresso : Beverage() {

    init {
        description = "Espresso"
    }

    override fun cost() : Double {
        return 1.99
    }
}

class HouseBlend : Beverage() {

    init {
        description = "House Blend Coffee"
    }

    override fun cost() : Double {
        return .89
    }
}

abstract class CondimentDecorator : Beverage() {
    abstract override var description : String
}