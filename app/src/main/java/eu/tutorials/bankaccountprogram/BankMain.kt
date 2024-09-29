package eu.tutorials.bankaccountprogram

fun main(){
    val  vladBankAccount = BankAccount ("Vladislav Glovatskiy", 7789.00)
    println(vladBankAccount.accountHolder)
    println(vladBankAccount.balance)
    vladBankAccount.deposit(200.00)
    vladBankAccount.withdraw(9000.00)
    vladBankAccount.displayTransactionHistory()
    println(vladBankAccount.balance)
}