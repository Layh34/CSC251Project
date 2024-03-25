import java.util.Scanner;

public class Project_alayis_howard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input from the user
        System.out.println("Please enter the Policy Number: ");
        String policyNumber = scanner.nextLine();

        System.out.println("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.println("Please enter the Policyholder's First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter the Policyholder's Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Please enter the Policyholder's Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        System.out.println("Please enter the Policyholder's Height (in inches): ");
        double height = scanner.nextDouble();

        System.out.println("Please enter the Policyholder's Weight (in pounds): ");
        double weight = scanner.nextDouble();

        // Creating a Policy object
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                                    age, smokingStatus, height, weight);

        // Displaying policy information
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");

        // Calculate and display BMI
        double bmi = policy.calculateBMI();
        System.out.println("Policyholder's BMI: " + bmi);

        // Calculate and display policy price
        double price = policy.calculatePrice();
        System.out.println("Policy Price: $" + price);

        scanner.close();
    }
}
