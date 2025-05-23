//(1)WAP to print natural numbers up to 'n'
// public class Question {
//     static void natural(int n) {

//         for (int i = 1; i <= n; i++) {
//             System.out.println(i);

//         }
//     }

//     public static void main(String[] args) {
//         natural(5);

//     }

// }
//(2)WAP to print all even numbers between two given range
//  public class Question {
//  static void even(int n) {
//  for (int i = 1; i <= n; i++) {
// if (i % 2 == 0) {
// System.out.println(i);
// }

// }
// }

// public static void main(String[] args) {
// even(4);
// }

// }

//(3)WAP to print 'n'natural number in revers order
// public class Question {
//     static void revers(int n) {
//         for (int i = n; i >= 1; i--) {
//             System.out.println(i);

//         }
//     }

//     public static void main(String[] args) {
//         revers(5);
//     }

// }

//(4)WAP to find sum of 'n'natural number
// class Question {
//     static int sum(int n) {
//         int sum1 = 0;
//          for (int i = 1; i <= n; i++) {
//             sum1 = sum1 + i;
//         }
//         return sum1;

//     }

//     public static void main(String[] args) {

//         System.out.println(sum(3));
//       }
//     }

//(5)WAP to find product of 'n' natural numbers
// public class Question {
//     static int product(int n) {
//         int mul = 1;
//         for (int i = 1; i <= n; i++) {
//             mul = mul * i;
//         }
//         return mul;
//     }

//     public static void main(String[] args) {
//         System.out.println(product(4));

//     }

// }

//(6) WAP to extract and display all digits from a given number
// public class Question {

//     static void display(int number) {
//         while (number > 0) {
//             int digit = number % 10;
//             System.out.println(digit);
//             number = number / 10;
//         }

//     }
//      public static void main(String[] args) {
//          display(3246);
//     }
// }
//(7) WAP to find sum of all digits in a given number
// public class Question {

//     static int digitSum(int number) {
//         int sum = 0;
//         while (number > 0) {
//             int digit = number % 10;
//             sum = sum + digit;
//             number = number / 10;
//         }
//         return sum;
//      }

//     public static void main(String[] args) {
//         System.out.println(digitSum(1235));
//     }
// }
//(8)WAP to find the count of all digits in a given number
// public class Question {

//     static int digitCount(int number) {
//         int count = 0;
//         while (number > 0) {
//             number = number / 10;
//             count++;

//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         System.err.println(digitCount(231456));
//     }
//}
// 9.WAP to print reverse of a given number
// public class Question {

//     static void rev(int number) {
//         int revers = 0;
//         int temp = number;
//         while (number > 0) {

//             int digit = number % 10;
//             revers = revers * 10 + digit;
//             System.out.println(revers);
//             number = number / 10;

//         }
//     }

//     public static void main(String[] args) {
//         rev(2345);
//     }
// }
//10.WAP to check a number is palindrome or not
public class Question {

    static void palindrome(int number) {
        int revers = 0;
        int temp = number;
        while (number > 0) {
            int digit = number % 10;
            revers = revers * 10 + digit;
            number = number / 10;

        }
        if (temp == revers) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrom");
        }
    }

    public static void main(String[] args) {
        palindrome(1221);
    }
}
// 10.WAP to check a number is palindrome or not
