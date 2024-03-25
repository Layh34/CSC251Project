import java.util.Scanner;

public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height; // in inches
    private double weight; // in pounds

    // No-arg constructor
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "";
        this.height = 0.0;
        this.weight = 0.0;
    }

    // Constructor with arguments
    public Policy(String policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters and setters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method to calculate BMI
public double calculateBMI() {
    double bmi = (weight * 703) / (height * height);
    return Double.parseDouble(String.format("%.2f", bmi)); // Round to two decimal places
}

// Method to calculate insurance policy price
public double calculatePrice() {
    double baseFee = 600;
    double additionalFee = 0;

    if (age > 50) {
        additionalFee += 75;
    }
    if (smokingStatus.equalsIgnoreCase("smoker")) {
        additionalFee += 100;
    }
    double bmi = calculateBMI();
    if (bmi > 35) {
        additionalFee += (bmi - 35) * 20;
    }

    double price = baseFee + additionalFee;
    return Double.parseDouble(String.format("%.2f", price)); // Round to two decimal places
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Please enter the Policy Number: ");
        String policyNumber = scanner.nextLine();

        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please enter the Policyholder's Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double height = scanner.nextDouble();

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double weight = scanner.nextDouble();

        // Create a policy object
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                                    age, smokingStatus, height, weight);

        // Display policy information
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
