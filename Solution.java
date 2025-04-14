import java.util.*;

class User {
    int userID, balance;

    User(int userID, int balance) {
        this.userID = userID;
        this.balance = balance;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for number of users
        System.out.print("Enter the number of users: ");
        int n = sc.nextInt();

        Map<Integer, Integer> uamt = new HashMap<>();

        // Input users
        for (int i = 0; i < n; i++) {
            System.out.print("Enter User ID for user " + (i + 1) + ": ");
            int userID = sc.nextInt();

            System.out.print("Enter Initial Balance for user " + (i + 1) + ": ");
            int balance = sc.nextInt();

            uamt.put(userID, balance);
        }

        // Prompt for number of transactions
        System.out.print("Enter the number of transactions: ");
        int T = sc.nextInt();

        // Input transactions
        for (int i = 0; i < T; i++) {
            System.out.println("Transaction " + (i + 1) + ":");

            System.out.print("Enter Sender User ID: ");
            int fromID = sc.nextInt();

            System.out.print("Enter Receiver User ID: ");
            int toID = sc.nextInt();

            System.out.print("Enter Amount to Transfer: ");
            int amt = sc.nextInt();

            if (uamt.containsKey(fromID) && uamt.get(fromID) >= amt) {
                uamt.put(fromID, uamt.get(fromID) - amt);
                uamt.put(toID, uamt.getOrDefault(toID, 0) + amt);
                System.out.println("Success");
            } else {
                System.out.println("Failure");
            }
        }

        // Display users after all transactions
        System.out.println("\nFinal Balances:");

        List<User> users = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : uamt.entrySet()) {
            users.add(new User(entry.getKey(), entry.getValue()));
        }

        // Sort by balance, then by userID
        users.sort((a, b) -> (a.balance == b.balance) ? a.userID - b.userID : a.balance - b.balance);

        for (User user : users) {
            System.out.println(user.userID + " " + user.balance);
        }

        sc.close();
    }
}
