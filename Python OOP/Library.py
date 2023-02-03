class Book:
    def __init__(self, title, author, ISBN):
        self.title = title
        self.author = author
        self.ISBN = ISBN
        self.borrowed = False

    def borrow_book(self):
        if self.borrowed:
            print(f"Sorry, the book {self.title} by {self.author} is currently not available.")
        else:
            self.borrowed = True
            print(f"Congratulations! You have successfully borrowed the book {self.title} by {self.author}.")

    def return_book(self):
        if self.borrowed:
            self.borrowed = False
            print(f"Congratulations! You have successfully returned the book {self.title} by {self.author}.")
        else:
            print(f"System Error - The book {self.title} by {self.author} was not borrowed.")


class Library:
    def __init__(self, name, books):
        self.name = name
        self.books = books

    def display_books(self):
        print(f"{self.name} Available book list:")
        for book in self.books:
            print(f"- {book.title} by {book.author}")

    def borrow_book(self, ISBN):
        book = next((book for book in self.books if book.ISBN == ISBN), None)
        if book:
            book.borrow_book()
        else:
            print(f"Unfortunately, the book {ISBN} is not in our library.")

    def return_book(self, ISBN):
        book = next((book for book in self.books if book.ISBN == ISBN), None)
        if book:
            book.return_book()
        else:
            print(f"Unfortunately, the book {ISBN} is not in our library.")


# Creating some books
book1 = Book("The Time Machine", "H.G. Wells", 21452)
book2 = Book("To Kill a Mockingbird", "Harper Lee", 13392)
book3 = Book("A Long Way Gone", "Ishmael Beah", 42153)

library = Library("Wonho Lim Library", [book1, book2, book3])
library.display_books()
library.borrow_book(21452)
library.display_books()
library.return_book(21452)
library.display_books()