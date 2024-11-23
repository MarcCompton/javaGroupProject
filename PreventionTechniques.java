public class PreventionTechniques {
    public static void displayPreventionTechniques() {

        try {
            File file1 = new File("PreventionTechniques.txt"); // Ensure this file exists in the same directory
            Scanner sc = new Scanner(file1);
            System.out.println("\n=== Prevention Techniques ===");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the RiskFactors file: " + e.getMessage());
        }

        /*
        System.out.println("\n=== Prevention Techniques ===");
        System.out.println("1. Block and report bullies on social media platforms.");
        System.out.println("2. Keep your accounts private and share information selectively.");
        System.out.println("3. Educate yourself about digital safety and privacy settings.");
        System.out.println("4. Talk to trusted adults if you or someone you know is being bullied.");
        System.out.println("5. Avoid responding to provocative messages or engaging with bullies.");
        */
    }
}

