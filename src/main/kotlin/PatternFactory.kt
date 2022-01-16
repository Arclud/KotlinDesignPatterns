public abstract class PizzaStore {
    open fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)
        pizza?.prepare()
        pizza?.bake()
        pizza?.cut()
        pizza?.box()
        return pizza!!
    }

    abstract fun createPizza(type: String?): Pizza?
}


open class NYPizzaStore() : PizzaStore() {
    override fun createPizza(type: String?): Pizza? {
        return when(type) {
            "cheese" -> NYStyleCheezePizza()
            else -> NYStyleCheezePizza()
        }
    }
}

open class ChicagoPizzaStore() : PizzaStore() {
    override fun createPizza(type: String?): Pizza? {

        return when(type) {
            "cheese" -> ChicagoStyleCheezePizza()
            else -> ChicagoStyleCheezePizza()
        }
    }
}

public class NYStyleCheezePizza() : Pizza() {
    init {
        name = "NY Style Sauce and Cheese Pizza”; dough = “Thin Crust Dough"
        souce = "Marinara Sauce"
        topppings.add("“Grated Reggiano Cheese”")
    }
}


public class ChicagoStyleCheezePizza() : Pizza() {
    init {
        name = "Chicago Style Deep Dish Cheese Pizza”; dough = “Extra Thick Crust Dough"
        souce = "Plum Tomato Sauce"
        topppings.add("Shredded Mozzarella Cheese")
    }
}

abstract class Pizza {
    var name: String = ""
    var dough: Double = 0.0
    var souce: String = ""
    var topppings = arrayListOf<String>()

    open fun prepare() {
        println("Preparing $name")
        println("Tossing $dough")
        println("Adding $souce...")

        for (item in topppings) {
            println("   $item")
        }
    }

    open fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    open fun box() {
        println("Place pizza in official PizzaStore box")
    }
}