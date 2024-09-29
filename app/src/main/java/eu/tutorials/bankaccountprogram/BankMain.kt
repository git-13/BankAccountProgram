package eu.tutorials.bankaccountprogram

fun main(){
    val  vladBankAccount = BankAccount ("Vladislav Glovatskiy", 7789.00)
    println(vladBankAccount.accountHolder)
    println(vladBankAccount.acctBalance())
    vladBankAccount.deposit(200.00)
    vladBankAccount.withdraw(9000.00)
    vladBankAccount.displayTransactionHistory()
    vladBankAccount.withdraw(300.00)
    vladBankAccount.displayTransactionHistory()
    println("${vladBankAccount.accountHolder} 's balance is ${vladBankAccount.acctBalance()}")

    val sarahBankAccount = BankAccount("Sarah Jessica Parker",1000000.00)
    sarahBankAccount.deposit(1000000.00)
    sarahBankAccount.withdraw(5000.00) //for new Manolo Blahnik
    sarahBankAccount.displayTransactionHistory()
    println("${sarahBankAccount.accountHolder} 's balance is ${sarahBankAccount.acctBalance()}")
}