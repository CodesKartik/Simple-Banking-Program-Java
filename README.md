# 🏦 Banking Program — Java

A simple **console-based banking program** developed in Java. This project demonstrates fundamental Java programming concepts such as methods, loops, conditional statements, `switch`, user input using `Scanner`, and basic balance management.

## 📌 Features

* 💰 **Show Balance** — Displays the current account balance.
* 💵 **Deposit Money** — Allows the user to enter an amount to deposit.
* 💸 **Withdraw Money** — Allows the user to withdraw money from the account.
* 🛡️ **Balance Validation** — Prevents withdrawal when there are insufficient funds.
* ⚠️ **Input Validation** — Prevents negative deposit and withdrawal amounts.
* 🔄 **Menu-Driven Interface** — Continuously displays the banking menu until the user chooses to exit.
* 🚪 **Exit Option** — Safely terminates the program.

## 🛠️ Technologies Used

* **Java**
* `Scanner` for user input
* `switch` statement
* `while` loop
* Methods
* Conditional statements
* Basic arithmetic operations

## 📂 Project Structure

```text
BankingProgram-Java/
│
├── bankingprogram.java
└── README.md
```

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR-USERNAME/BankingProgram-Java.git
```

### 2. Open the project folder

```bash
cd BankingProgram-Java
```

### 3. Compile the Java program

```bash
javac bankingprogram.java
```

### 4. Run the program

```bash
java bankingprogram
```

## 💻 Program Menu

When the program starts, it displays:

```text
********************
-----BANKING PROGRAM-----
********************
1. Show Balance
2. Deposit
3. Withdraw
4. Exit
********************
Enter your choice (1 - 4):
```

## 🧪 Example Usage

### Checking Balance

```text
Enter your choice (1 - 4): 1

********************
$0.00
```

### Depositing Money

```text
Enter your choice (1 - 4): 2
Enter an amount to be deposited: 500
```

The balance is updated with the deposited amount.

### Withdrawing Money

```text
Enter your choice (1 - 4): 3
Enter the amount to be withdrawn: 200
```

The amount is deducted from the available balance.

### Insufficient Funds

If the withdrawal amount is greater than the current balance:

```text
Insufficient funds
```

### Exiting

```text
Enter your choice (1 - 4): 4

THANK YOU! HAVE A NICE DAY:
```

## 🧠 Concepts Demonstrated

This project is useful for practicing several core Java concepts:

### 1. Scanner

The program uses `Scanner` to take input from the user.

```java
static Scanner scanner = new Scanner(System.in);
```

### 2. While Loop

The banking menu continues to run while the program is active.

```java
while (isRunning) {
    // banking menu
}
```

### 3. Switch Statement

The user's menu choice is handled using a `switch` statement.

```java
switch (choice) {
    case 1 -> showBalance(balance);
    case 2 -> balance += deposit();
    case 3 -> balance -= withdraw(balance);
    case 4 -> isRunning = false;
}
```

### 4. Methods

Separate methods are used for different banking operations:

* `showBalance()`
* `deposit()`
* `withdraw()`

This makes the program easier to understand and organize.

## ⚠️ Current Limitations

This is a **basic educational console project**, not a real banking application.

Currently, the program:

* Does not store customer accounts permanently.
* Does not use a database.
* Does not have user authentication or PIN verification.
* Does not support multiple users.
* Does not save transactions after the program closes.
* Uses a single balance during program execution.

## 🔮 Future Improvements

Possible improvements for future versions include:

* 👤 Multiple customer accounts
* 🔐 PIN/password authentication
* 💾 File-based data storage
* 🗄️ Database integration
* 📜 Transaction history
* 🔄 Money transfer between accounts
* 🏦 Account creation and deletion
* 📊 Improved transaction summaries
* 🖥️ GUI version using JavaFX or Swing

## 🎯 Learning Objective

The main purpose of this project is to practice **Java fundamentals and object-oriented programming concepts** by creating a simple real-world application.

It is suitable as a beginner Java project for understanding how user input, methods, loops, conditions, and basic program logic work together.

## 👨‍💻 Author

**Kartik Saini**

GitHub: [@YOUR-USERNAME](https://github.com/YOUR-USERNAME)

## 📄 License

This project is intended for **educational and learning purposes**.

You are free to study, modify, and improve the code.
