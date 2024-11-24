// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class IntroductionG3 {
//     public static void displayIntroduction() {
//         try {
//             File file = new File("IntroductionG3.txt"); // Ensure this file exists in the same directory
//             Scanner sc = new Scanner(file); // Create a Scanner object to read the file
//             System.out.println("\n=== Introduction ===");
//             while (sc.hasNextLine()) {  // Check if there is another line in the file
//                 System.out.println(sc.nextLine());  // Read and display each line from the file
//             }
//             sc.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("An error occurred while reading the Introduction file: " + e.getMessage());
//         }
//     }
// }
