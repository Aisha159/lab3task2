# Lab Task 03 - Software Construction

**Course:** Software Construction (5th Semester)  
**Institution:** University of Engineering and Technology, Abbottabad Campus  
**Date:** September 05, 2026  

---

## Lab Objective

This lab introduces unit testing in Java using the JUnit 5 framework within NetBeans IDE. The objective is to construct modular, robust Java utility classes and verify their functionality, edge cases, and exception handling using comprehensive test suites.

---

## Tasks Completed

### Task 1: Temperature Converter
* **Implementation:** `TemperatureConverter.java`
  * Implements `celsiusToFahrenheit`, `fahrenheitToCelsius`, and `celsiusToKelvin` conversion formulas.
* **Testing:** `TemperatureConverterTest.java`
  * Verifies known temperature pairs (0°C → 32°F and 100°C → 212°F), round-trip consistency, and Kelvin conversions.

### Task 2: Bank Account Management
* **Implementation:** `BankAccount.java`
  * Manages account balances using `deposit()`, `withdraw()`, and `getBalance()`.
  * Throws `IllegalArgumentException` for non-positive transaction amounts or overdraft attempts.
* **Testing:** `BankAccountTest.java`
  * Validates successful deposits/withdrawals and asserts exception handling using `assertThrows`.

