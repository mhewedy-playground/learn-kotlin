package learnkotlin.inheritance

sealed class Suit(name: String)

class Heart(val numHearts: Int) : Suit("Heart")