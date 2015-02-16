/**
 * Created by akulkarni on 016-16-02-15.
 *
 * The strategy pattern enables an algorithm's behavior to be selected at runtime.
 * The strategy pattern - defines a family of algorithms, encapsulates each algorithm,
 * makes the algorithms interchangeable within that family, lets the algorithm vary independently
 * from clients that use it.
 *
 */


/* Using wikipedia example - https://en.wikipedia.org/wiki/Strategy_pattern#Java */

interface Calc {
    def execute(a, b)
}

/** Implements the algorithm using the strategy interface */

class Multiply implements Calc {
    def execute(a, b) { a * b }
}

def sampleData = [
        [1, 2, 2],
        [3, 1, 3],
        [4, 2, 8]
]

Calc[] calculationStrategies = [
        new Multiply()
]

testStrategyPattern(sampleData, calculationStrategies)

/* Using Groovydoc example - http://groovy.codehaus.org/Strategy+Pattern */

class MultiplyByAddition implements Calc {
    def execute(a, b) {
        def result = 0
        b.times {
            result += a
        }
        result
    }
}

calculationStrategies = [
        new Multiply(),
        new MultiplyByAddition()
]

sampleData = [
        [3, 2, 6],
        [3, 5, 15]
]

testStrategyPattern(sampleData, calculationStrategies)

/* Groovier way of doing the above  */

calculationStrategies = [
        {a, b -> a * b},
        {a, b ->
            def result = 0
            b.times {
                result += a
            }
            result
        },
]

testStrategyPattern(sampleData, calculationStrategies)

def testStrategyPattern (sampleData, calculationStrategies) {
    sampleData.each { data ->
        calculationStrategies.each { strategy ->
            assert data[2] == strategy.execute(data[0], data[1])
        }
    }
}
