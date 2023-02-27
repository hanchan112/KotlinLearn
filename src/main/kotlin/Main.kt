import Direction.Directions
import kotlinx.coroutines.delay
import rx_learn.justOperator

//fun simple(): List<Int> = listOf(1, 2, 3)

fun simple(): Sequence<Int> = sequence { // sequence builder
    for (i in 1..3) {
        Thread.sleep(500) // pretend we are computing it
        yield(i) // yield next value
    }
}

suspend fun simpleS(): List<Int> {
    delay(1000) // pretend we are doing something asynchronous here
    return listOf(1, 2, 3)
}


fun main() {
    /*simple().forEach { value ->
        println(value)
    }

    println(Directions.SOUTH)

    Direction.Directions.values().forEach {
        println(it)
    }*/
    justOperator()
}