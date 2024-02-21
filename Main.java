//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//
        Scanner scanner = new Scanner(System.in);

//      Q1:
//        try {
//            System.out.print("Input a string: ");
//            String str = scanner.nextLine();
//            System.out.print("Input a number: ");
//            int index = scanner.nextInt();
//
//            if (index >= 0 && index < str.length()) {
//                System.out.println(str.charAt(index));
//            } else {
//                throw new IndexOutOfBoundsException("Index is out of bounds.");
//            }
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Invalid index: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter valid data.");
//        } finally {
//
//        }
//    Q2:
//        try {
//            System.out.print("Input first integer: ");
//            int num1 = scanner.nextInt();
//
//            System.out.print("Input second integer: ");
//            int num2 = scanner.nextInt();
//
//            if (num1 != num2) {
//                System.out.println(num1 + " != " + num2);
//            }
//            if (num1 < num2) {
//                System.out.println(num1 + " < " + num2);
//            }
//            if (num1 <= num2) {
//                System.out.println(num1 + " <= " + num2);
//            }
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter valid integers.");
//        } finally {
//
//        }
//    }
//}

//    Q3:
//        int largest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//
//        try {
//            System.out.println("Enter numbers (enter -1 to stop):");
//
//            while (true) {
//                int number = scanner.nextInt();
//
//                if (number == -1) {
//                    break;
//                }
//
//                if (number > largest) {
//                    largest = number;
//                }
//
//                if (number < smallest) {
//                    smallest = number;
//                }
//            }
//
//            if (largest == Integer.MIN_VALUE || smallest == Integer.MAX_VALUE) {
//                throw new IllegalStateException("No numbers were entered.");
//            }
//
//            System.out.println("The largest number: " + largest);
//            System.out.println("The smallest number: " + smallest);
//        } catch (Exception e) {
//            System.out.println("An error occurred: " + e.getMessage());
//            throw e;
//        } finally {
//
//        }
//    }

//      Q4:
//        try {
//            System.out.println("Enter a string:");
//            String input = scanner.nextLine();
//
//            int count = countOccurrences(input, 'a');
//
//            System.out.println("Number of a's: " + count);
//        } catch (Exception e) {
//            System.out.println("An error occurred: " + e.getMessage());
//            throw e;
//        } finally {
//
//        }
//    }
//
//    public static int countOccurrences(String str, char target) {
//        int count = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch == target) {
//                count++;
//            }
//        }
//        return count;
//    }


//     Q5:
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int zeroCount = 0;
//
//        try {
//            System.out.println("Enter numbers (enter -1 to stop):");
//
//            while (true) {
//                int number = scanner.nextInt();
//
//                if (number == -1) {
//                    break;
//                } else if (number > 0) {
//                    positiveCount++;
//                } else if (number < 0) {
//                    negativeCount++;
//                } else {
//                    zeroCount++;
//                }
//            }
//
//            System.out.println(positiveCount + " positive");
//            System.out.println(negativeCount + " negative");
//            System.out.println(zeroCount + " zero");
//
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter valid integers.");
//            throw e;
//        } finally {
//
//        }


//     Q6:
//        try {
//            System.out.print("Enter a number: ");
//            int number = scanner.nextInt();
//
//            if (number % 2 == 0) {
//                System.out.println("The number is Even");
//            } else {
//                System.out.println("The number is Odd");
//            }
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter a valid number.");
//        }
//

//   Q7:
//        try {
//            System.out.print("Input a string: ");
//            String str = scanner.nextLine();
//
//            System.out.print("Input a number: ");
//            int index = scanner.nextInt();
//
//            if (index >= 0 && index < str.length()) {
//                char character = str.charAt(index);
//                System.out.println("Character at index " + index + ": " + character);
//            } else {
//                System.out.println("Invalid index.");
//            }
//        }catch (Exception e){
//            System.out.println("Invalid index");
//        }
//
//
//      Q8:
//        try {
//            System.out.print("Input first number: ");
//            int num1 = scanner.nextInt();
//            System.out.print("Input second number: ");
//            int num2 = scanner.nextInt();
//            System.out.print("Input third number: ");
//            int num3 = scanner.nextInt();
//            System.out.print("Input fourth number: ");
//            int num4 = scanner.nextInt();
//
//            if (num1 == num2 && num1 == num3 && num1 == num4) {
//                System.out.println("Numbers are equal!");
//            } else {
//                System.out.println("Numbers are not equal!");
//            }
//
//        } catch (Exception e) {
//            System.out.println("Invalid index");
//     }

////     Q9:
//        try {
//            System.out.print("Input a number: ");
//            int number = scanner.nextInt();
//
//            if (number < 0) {
//                System.out.println("Number is negative");
//            } else if (number == 0) {
//                System.out.println("Number is zero");
//            } else {
//                System.out.println("Number is positive");
//            }
//        }catch (Exception e){
//            System.out.println("Invalid index");
//        }
//

//
//        Q10:
//        try {
//            int large = Integer.MIN_VALUE;
//            int small = Integer.MAX_VALUE;
//            while (true) {
//                System.out.print("Enter a number (or 9 to stop): ");
//                int number = scanner.nextInt();
//
//                if (number == 9) {
//                    break;
//                }
//                if (number > large) {
//                    large = number;
//                }
//                if (number < small) {
//                    small = number;
//                }
//            }
//            System.out.println("The large number: " + large);
//            System.out.println("The small number: " + small);
//        }catch (Exception e){
//            System.out.println("Invalid index");
//        }
//
//

//     Q11:
//        try {
//            System.out.print("Enter String:");
//            String input = scanner.nextLine();
//
//            int count = 0;
//            for (int i = 0; i < input.length(); i++) {
//                if (input.charAt(i) == 'a') {
//                    count++;
//                }
//            }
//            System.out.println("Number of a's: " + count);
//        }catch (Exception e){
//            System.out.println("Invalid index");
//        }


        }
    }
