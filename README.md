# Digital Wallet Management System 💰

This is a basic Java program that allows users to manage digital wallet transactions. It supports transferring funds between users and displays the final balance sorted in ascending order.

## 📌 Features

- Add users with initial balances
- Perform fund transfers between users
- Validate balance before each transaction
- Show "Success" or "Failure" for each transaction
- Display all users sorted by their final balance

## 🧾 Input Format

The program will ask for the following inputs in the console:

1. Number of users  
2. For each user:  
   - Enter User ID  
   - Enter Initial Balance  

3. Number of transactions  
4. For each transaction:  
   - Enter Sender User ID  
   - Enter Receiver User ID  
   - Enter Amount to Transfer  

💡 Example:
Enter number of users: 4
Enter User ID: 1
Enter Initial Balance: 9000
Enter User ID: 2
Enter Initial Balance: 3000
Enter User ID: 3
Enter Initial Balance: 7500
Enter User ID: 4
Enter Initial Balance: 2000

Enter number of transactions: 5
Transaction 1 - Enter Sender User ID: 1
Transaction 1 - Enter Receiver User ID: 2
Transaction 1 - Enter Amount to Transfer: 1000
...

## ✅ Sample Output
Success
Success
Success
Failure
Success

2 3500
3 5000
1 6500
4 6500

## 🚀 How to Run

1. Save the Java file as Solution.java
2. Open terminal or command prompt in the directory
3. Compile using:
   javac Solution.java
4. Run using:
   java Solution

---

Made with ❤️ in Java.
