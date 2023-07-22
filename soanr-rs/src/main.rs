use std::io;

// Intentional code smell: Unused variable
fn unused_variable() {
    let unused_variable = "This variable is unused.";
}

// Intentional vulnerability: Use of hard-coded password
fn hardcoded_password() {
    let password = "123456";
}

// Intentional reliability issue: Division by zero
fn division_by_zero() {
    let numerator = 10;
    let denominator = 0;
    // let result = numerator / denominator;
    // println!("The result of the division is: {}", result);
}

// Intentional vulnerability: Command injection
fn command_injection() {
    let mut cmd = String::new();
    println!("Enter a command:");
    io::stdin().read_line(&mut cmd).expect("Failed to read input");
    println!("Executing command: {}", cmd);
}

// Intentional reliability issue: Infinite loop
fn infinite_loop() {
    loop {
        println!("This loop will run forever!");
    }
}

fn main() {
    unused_variable();
    hardcoded_password();
    division_by_zero();
    command_injection();
    infinite_loop();
}
