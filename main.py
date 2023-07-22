import os

# Intentional code smell: Unused variable
unused_variable = "This variable is unused."

# Intentional vulnerability: Use of hard-coded password
password = "123456"

print("Welcome to our Python script!")

# Intentional reliability issue: Division by zero
numerator = 10
denominator = 0
result = numerator / denominator

print("The result of the division is:", result)

# Intentional vulnerability: Command injection
arg = input("Enter a command: ")
os.system("echo " + arg)

# Intentional reliability issue: Infinite loop
while True:
    print("This loop will run forever!")
