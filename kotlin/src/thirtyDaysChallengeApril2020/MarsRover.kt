package thirtyDaysChallengeApril2020

import kotlin.math.cos
import kotlin.math.sin

fun main() {
    /*println("%.2f".format(Locale.ENGLISH, calculateTurnRadius(1.0, 30.0)))
    println("%.2f".format(Locale.ENGLISH, calculateTurnRadius(1.0, 13.76)))
    println("%.2f".format(Locale.ENGLISH, calculateTurnRadius(1.0, 2.34)))
    println("%.2f".format(Locale.ENGLISH, calculateTurnRadius(1.0, 90.00)))
    println("%.2f".format(Locale.ENGLISH, calculateTurnRadius(2.45, 90.00)))
    println("%.2f".format(Locale.ENGLISH, calculateTurnRadius(1.0, 30.0)))
    println("%.2f".format(Locale.ENGLISH, calculateTurnRadius(1.0, 30.0)))
    println("%.2f".format(Locale.ENGLISH, calculateTurnRadius(1.0, 30.0)))*/

    /*val list = mutableListOf<Triple<Double, Double, Double>>()

    list.add(Triple(1.00, 1.00, 30.00))
    list.add(Triple(2.13, 4.30, 23.00))
    list.add(Triple(1.75, 3.14, -23.00))
    list.add(Triple(2.70, 45.00, -34.00))
    list.add(Triple(4.20, -5.30, 20.00))
    list.add(Triple(9.53, 8.12, 0.00))

    for (entry in list) {
        val (x, y, newDirection) = calculatePosAndDirection(entry.first, entry.second, entry.third)
        println("$x $y $newDirection")
    }*/

    val (x, y, newDirection) = calculatePosAndDirectionAfterSegments(
        9.53, 10, -1.00, 1.00, -2.00, 2.00, 3.00, -3.00, 4.00,4.00, 5.00, -5.00, 6.00, 6.00 ,7.00, 7.00, -8.00, 8.00, 9.00 ,9.00 ,10.00, -10.00


    )
    println("$x $y $newDirection")

    // Level 4:
    // UUID
    // a432e238-a999-45cb-9bbb-f5dc7ac09b41
    // Specification
    // Wheelbase maxSteeringAngle targetX targetY targetRadius
    // 3.60      14.00            0.00    0.00    3.00

    // Result
    // PASS L4_1A25X46T46Z34 7640.0

    // Level 5:
    // UUID 436a8c9b-5f6a-4fc5-9741-71171ff8312d
    // Wheelbase maxSteeringAngle targetX targetY targetRadius
    // 3.60      14.00            80.00   65.20   1.00
}

fun getWaysToTarget(wheelBase: Double, maxSteeringAngle: Double, targetX: Double, targetY: Double, targetRadius: Double) {
    var currentX = 0.0
    var currentY = 0.0
    var currentDirection = 0.0

    // Drive rover as long as outside of target
    while (currentX > targetX + targetRadius ||
            currentX < targetY - targetRadius ||
            currentY > targetY + targetRadius ||
            currentY < targetY - targetRadius) {
        // Find best way

        // Test all available steering angles
        var curSteeringAngle = -maxSteeringAngle
        while (curSteeringAngle < maxSteeringAngle) {


            curSteeringAngle += 0.25
        }

        //val (x, y, newDirection) = calculatePosAndDirection(wheelBase, segment.first, segment.second)
    }

}


fun calculatePosAndDirectionAfterSegments(
    wheelBase: Double,
    segmentAmount: Int,
    vararg parameters: Double
): Triple<Double, Double, Double> {
    if (parameters.size != segmentAmount * 2 || parameters.size < 2) {
        throw Exception("Wrong number of arguments provided!")
    }
    val segmentList = mutableListOf<Pair<Double, Double>>()
    for (i in 0 until parameters.size - 1 step 2) {
        segmentList.add(Pair(parameters[i], parameters[i + 1]))
    }
    var x = 0.0
    var y = 0.0
    var direction = 0.0

    for (segment in segmentList) {
        val (currentX, currentY, newDirection) = calculatePosAndDirection(wheelBase, segment.first, segment.second)
        val directionRad = direction * Math.PI / 180
        val rotatedX = cos(directionRad) * currentX + sin(directionRad) * currentY
        val rotatedY = -sin(directionRad) * currentX + cos(directionRad) * currentY

        x += rotatedX
        y += rotatedY
        direction = (direction + newDirection) % 360
    }

    return Triple(x, y, direction)
}

fun calculatePosAndDirection(
    wheelBase: Double,
    distance: Double,
    steeringAngle: Double
): Triple<Double, Double, Double> {
    if (steeringAngle == 0.0) {
        return Triple(0.0.roundTwo(), distance.roundTwo(), steeringAngle.roundTwo())
    }
    val turnRadius = calculateTurnRadius(wheelBase, steeringAngle)
    var newDirection = (distance * 360 / (Math.PI * turnRadius * 2)) % 360

    if (newDirection < 0) {
        newDirection += 360
    }

    val x = turnRadius - (turnRadius * cos(newDirection * Math.PI / 180))
    val y = (turnRadius * sin(newDirection * Math.PI / 180))

    return Triple(x, y, newDirection)
}

fun calculateTurnRadius(wheelBase: Double, steeringAngle: Double): Double {
    return (wheelBase / sin((steeringAngle * Math.PI / 180)))
}

fun Double.roundTwo(): Double {
    return Math.round(this * 100) / 100.0
}

