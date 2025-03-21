// DigitalMarketingInternship.java
public class DigitalMarketingInternship {

    // Attributes
    private String companyName;
    private String duration;
    private String[] responsibilities;
    private String[] toolsUsed;
    private String[] keyTakeaways;

    // Constructor
    public DigitalMarketingInternship() {
        this.companyName = "Upskill Campus";
        this.duration = "February 2025 – April 2025";
        this.responsibilities = new String[]{
            "Conducted keyword research and optimized website content for SEO.",
            "Managed social media posts and analyzed engagement metrics.",
            "Executed PPC campaigns on Google Ads and optimized ROI.",
            "Developed email marketing campaigns and automated workflows.",
            "Created performance reports using Google Analytics."
        };
        this.toolsUsed = new String[]{
            "Google Search Console", "Ahrefs", "SEMrush",
            "Hootsuite", "Buffer", "Google Ads", "Google Analytics",
            "Mailchimp", "Canva", "Adobe Photoshop"
        };
        this.keyTakeaways = new String[]{
            "Gained hands-on experience in executing digital marketing strategies.",
            "Learned advanced PPC and SEO techniques.",
            "Enhanced skills in audience engagement and campaign analytics."
        };
    }

    // Method to display internship details
    public void displayInternshipDetails() {
        System.out.println("Digital Marketing Internship at " + companyName);
        System.out.println("Duration: " + duration);
        
        System.out.println("\nKey Responsibilities:");
        for (String task : responsibilities) {
            System.out.println("- " + task);
        }

        System.out.println("\nTools Used:");
        for (String tool : toolsUsed) {
            System.out.println("- " + tool);
        }

        System.out.println("\nKey Takeaways:");
        for (String takeaway : keyTakeaways) {
            System.out.println("- " + takeaway);
        }
    }

    // Main method
    public static void main(String[] args) {
        DigitalMarketingInternship internship = new DigitalMarketingInternship();
        internship.displayInternshipDetails();
    }
}
