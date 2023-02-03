class Account:
    def __init__(self, account_number, account_holder, balance):
        self.account_number = account_number
        self.account_holder = account_holder
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount
        print(f"${amount} has been added to your account successfully. Current balance: {self.balance}")

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
            print(f"${amount} has been withdrawn from the account successfully. Current balance: {self.balance}")
        else:
            print(f"Transaction Declined - Insufficient Balance. Current balance: {self.balance}")

    def __str__(self):
        return f"Account Number: {self.account_number}\n Holder: {self.account_holder}\n Current Balance: {self.balance}"