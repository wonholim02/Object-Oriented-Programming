class Car:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year
        self.speed = 0

    def accelerate(self):
        self.speed += 10

    def brake(self):
        self.speed = max(0, self.speed - 7)

    def honk(self):
        print(f"{self.make} {self.model} honks!")


car = Car("Porsche", "911", 2023)
car.honk()