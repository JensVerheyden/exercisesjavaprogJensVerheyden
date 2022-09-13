public class Exercise1 {

    public enum Gender {
        MALE,
        FEMALE,
        OTHER;
    }

    public static void main(String[] args) {

        String firstName = "Bob";
        int age = 43;
        String[] domains = {"Java", "Spring", "Angular"};
        Gender gender = Gender.MALE;

        String possessivePronoun = "";
        String reflexivePronoun = "";
        String personalPronoun = "";


        double grossSalary = 3216.54;
        Boolean senior = false;
        double netSalary = grossSalary * 0.48;
        double grossSalaryYearly = grossSalary * 12;
        double netSalaryYearly;

        if (grossSalaryYearly <= 13.870) {
            netSalaryYearly = grossSalary * 0.25;
        } else if (grossSalaryYearly <= 24.480) {
            netSalaryYearly = grossSalary * 0.40;
        } else if (grossSalaryYearly <= 42.370) {
            netSalaryYearly = grossSalary * 0.45;
        } else {
            netSalaryYearly = grossSalary * 0.50;
        }




        System.out.println(firstName + " is " + age + " years old. Gross salary is " + grossSalary + ". " + firstName + ((senior) ? " is a senior" : " is not a senior"));

        System.out.println("Net salary is " + netSalary);
        System.out.println("Net salary based on gross total income per year: " + netSalaryYearly);

        double monthlySalaryGross = 2700.0;
        double yearlySalaryGross;
        double monthlyNetSalary;
        int count = 0;

       for (int startAge = 23; startAge <= age; startAge = startAge + 2) {

           yearlySalaryGross = monthlySalaryGross * 12;

           if (yearlySalaryGross <= 13.870) {
                monthlyNetSalary = monthlySalaryGross * 0.75;
           } else if (yearlySalaryGross <= 24.480) {
                monthlyNetSalary = monthlySalaryGross * 0.60;
           } else if (yearlySalaryGross <= 42.370) {
                monthlyNetSalary = monthlySalaryGross * 0.55;
           } else {
                monthlyNetSalary = monthlySalaryGross * 0.50;
           }

           if (count <= 35) {
               monthlySalaryGross = monthlySalaryGross + monthlySalaryGross * 0.05;
           }

           count++;

           System.out.println(firstName + "'s net salary at " + startAge + " is " + monthlyNetSalary );
       }

       int domainCount = 0;
       for (String d : domains) {
           domainCount++;
           System.out.println(d);
       }

        System.out.println("Number of domains " + domainCount);

       switch(gender) {
           case MALE : possessivePronoun = "his";  reflexivePronoun = "himself"; personalPronoun = "he"; break;
           case FEMALE: possessivePronoun = "her"; reflexivePronoun = "herself"; personalPronoun = "she"; break;
           case OTHER: possessivePronoun = "theirs"; reflexivePronoun = "itself";  personalPronoun = "they"; break;
        }

        String personalPronounCapitalized = personalPronoun.substring(0, 1).toUpperCase() + personalPronoun.substring(1);
        String possessivePronounCapitalized = possessivePronoun.substring(0, 1).toUpperCase() + possessivePronoun.substring(1);

        System.out.println(firstName + " is " + age + " years old. " +  possessivePronounCapitalized + " salary is " + grossSalary + ". " +
                personalPronounCapitalized + ((senior) ? " is a senior" : " is not a senior"));




    }
}
