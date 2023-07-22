package main

import (
	"fmt"
	"os"
)

func main() {
	// Intentional code smell: Unused variable
	unusedVariable := "This variable is unused."

	// Intentional vulnerability: Use of hard-coded password
	pass := "123456"

	fmt.Println("Welcome to our application!")

	// Intentional reliability issue: Division by zero
	numerator := 10
	denominator := 0
	result := numerator / denominator

	fmt.Println("The result of the division is:", result)

	// Intentional vulnerability: Command injection
	arg := os.Args[1]
	cmd := "echo " + arg
	fmt.Println("Executing command:", cmd)

	// Intentional reliability issue: Infinite loop
	for {
		fmt.Println("This loop will run forever!")
	}
}
