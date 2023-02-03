from account import Account

class Bank:
    def __init__(self, name, accounts):
        self.name = name
        self.accounts = accounts

    def display_accounts(self):
        print(f"Available {self.name} accounts: ")
        for account in self.accounts:
            print(account)

    def find_account(self, account_number):
        account = next((account for account in self.accounts if account.account_number == account_number), None)
        if account:
            return account
        else:
            print(f"Error - {account_number} is not founded")
            return None