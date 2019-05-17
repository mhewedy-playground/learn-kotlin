package learnkotlin.advanced.classes

typealias Name = String
typealias Email = String

typealias LocalDate = java.time.LocalDate

class Customer(customerNom: Name, customerMail: Email, dateOfBirth: LocalDate)