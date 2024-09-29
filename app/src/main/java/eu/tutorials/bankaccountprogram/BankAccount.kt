package eu.tutorials.bankaccountprogram

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }
    fun withdraw(amount: Double){
        if (balance>amount){
           //you can withdraw money
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }else{
           //Insufficient funds
            println("You don't have funds to withdraw $$amount")
        }
    }
    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for (i in transactionHistory){
            println(i)
        }
    }
}