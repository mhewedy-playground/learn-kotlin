package learnkotlin.intro.inheritance

sealed class Suit(name: String)

class Heart(val numHearts: Int) : Suit("Heart")