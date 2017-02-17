package com.epam.engx.drills.calculator

import spock.lang.Specification


class StringCalculatorSpec extends Specification {

    def "should return zero when string is empty"() {
        given: "string calculator"
        def calculator = new StringCalculator()

        expect:
        calculator.calculate("") == 0
    }

    def "should return number when only number is passed"() {
        given: "string calculator"
        def calculator = prepareCalc()

        expect:
        calculator.calculate("7") == 7
    }

    def "should return number when input string is passed 2"() {
        given: "string calculator"
        def calculator = prepareCalc()

        expect:
        calculator.calculate("4") == 4
    }

    def "should return sum of two numbers separated by delimiter"() {
        given: "string calculator"
        def calculator = prepareCalc()

        expect:
        calculator.calculate("5,3") == 8
    }

    def "should return sum of two numbers separated by delimiter 2"() {
        given: "string calculator"
        def calculator = prepareCalc()

        expect:
        calculator.calculate("4,7") == 11
    }

    def "should return sum of two number separated by new line delimiter" () {
        given: "string calculator"
        def calculator = prepareCalc()

        expect:
        calculator.calculate("4\n8") == 12
    }

    def "should return sum of 3 number separated by new line and coma delimiters" () {
        given: "string calculator"
        def calculator = prepareCalc()

        expect:
        calculator.calculate("4\n8,7") == 19
    }

    def prepareCalc() {
        new StringCalculator()
    }
}