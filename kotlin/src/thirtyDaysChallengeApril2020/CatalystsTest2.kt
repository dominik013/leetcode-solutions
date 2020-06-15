package thirtyDaysChallengeApril2020

import java.io.File
import java.lang.StringBuilder

fun main() {
    val path = "C:\\Users\\DominikReichinger\\Downloads\\level2\\level2_3.in"
    val input = getInput(path)
    val cars = input.cars.toTypedArray()
    moveCars(cars)
    val result = StringBuilder()
    for (car in cars) {
        result.append(car.time).append(",")
    }

    println(result.toString())
}

fun moveCars(cars: Array<Car>) {
    while (!allCarsFinished(cars)) {
        val capableOfDriving = mutableListOf<Int>()
        for (i in cars.indices) {
            if (cars[i].currentSegment == cars[i].endSegment && !cars[i].finished) {
                cars[i].finished = true
            }

            if (cars[i].finished) {
                continue
            }

            // Starting Position
            if (cars[i].currentSegment == -1
                && cars[i].time >= cars[i].startingTime
                && segmentFree(cars, cars[i].startSegment)
                && (segmentFree(cars, cars[i].startSegment - 1) || cars[i].startSegment == 0)) {
                capableOfDriving.add(i)
            } else if (cars[i].currentSegment != -1){
                if (segmentFree(cars, cars[i].currentSegment + 1)) {
                    capableOfDriving.add(i)
                }
            }

            // Increase time for every car
            cars[i].time += 1
        }

        // All cars capable of driving can do that now
        for (i in capableOfDriving) {
            if (cars[i].currentSegment == -1) {
                cars[i].currentSegment = cars[i].startSegment
            } else {
                cars[i].currentSegment += 1
            }
        }
    }
}

fun segmentFree(cars: Array<Car>, segment: Int): Boolean {
    for (car in cars) {
        // Ignore finished cars
        if (car.finished) {
            continue
        }

        // Ignore cars in start position
        if (car.currentSegment == -1) {
            continue
        }

        if (car.currentSegment == segment) {
            return false
        }
    }

    return true
}

fun allCarsFinished(cars: Array<Car>): Boolean {
    for (car in cars) {
        if (car.currentSegment != car.endSegment) {
            return false
        }
    }

    return true
}

fun getInput(path: String): Input {
    val file = File(path)
    val content = file.readLines()
    val segments = content[0].toInt()
    val numberOfCars = content[1].toInt()
    val carList = mutableListOf<Car>()

    for (i in 0 until numberOfCars) {
        val carInfo = content[i + 2].split(",", " ")
        val car = Car(carInfo[0].toInt(), carInfo[1].toInt(), carInfo[2].toInt())
        carList.add(car)
    }

    return Input(segments, carList)
}

data class Input(
    val roadSegments: Int,
    val cars: List<Car>
)

data class Car(
    val startSegment: Int,
    val endSegment: Int,
    val startingTime: Int,
    var finished: Boolean = false,
    var currentSegment: Int = -1,
    var time: Int = 1
)