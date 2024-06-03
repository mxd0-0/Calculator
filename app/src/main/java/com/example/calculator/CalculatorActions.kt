package com.example.calculator
//for the events of the calculator
sealed  class CalculatorActions {
    data class Number(val number : Int) : CalculatorActions()
    data object Clear: CalculatorActions()
    data object Delet: CalculatorActions()
    data object Decimal: CalculatorActions() // for (.) button
    data object Calculate: CalculatorActions()
    data class Operation(val operation: CalculatorOperation ): CalculatorActions()

} // complet the events in new class 13:    18