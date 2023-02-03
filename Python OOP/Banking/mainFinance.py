from bank import Bank
from account import Account

account1 = Account(200211, "Wonho Lim", 1000)
account2 = Account(197502, "Jennifer Lim", 2000)
account3 = Account(24680, "Richard Lim", 3000)

bank = Bank("Chris Bank", [account1, account2, account3])
bank.display_accounts()
account = bank.find_account(200211)
if account:
    account.withdraw(500)
    account.deposit(1000000)
bank.display_accounts()