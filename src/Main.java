public class Main {
    public static int generateRandom(int min, int max) {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(min) + max;
        return number;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee[] employees = new Employee[20];
        Service serviceForCompany = new ServiceForCompany();

        employees[0] = new Employee("Joseph","Aulsford", "Manager", generateRandom(80,90),generateRandom(115_000,140_000));
        employees[1] = new Employee("Richard","Selby", "Manager", generateRandom(80,90),generateRandom(115_000,140_000));
        employees[2] = new Employee("Cheston", "Furrow", "Manager", generateRandom(80,90),generateRandom(115_000,140_000));

        employees[3] = new Employee("Gordon","Ramsay", "TopManager", generateRandom(120,140), null);
        employees[4] = new Employee("Ron","Holmes", "TopManager", generateRandom(120,140), null);
        employees[5] = new Employee("Lucy", "Liu", "TopManager", generateRandom(120,140), null);

        employees[6] = new Employee("Bill","Thomson", "Operator", generateRandom(40,50), null);
        employees[7] = new Employee("Peter","Jackson", "Operator", generateRandom(40,50), null);
        employees[8] = new Employee("Julie", "Smith", "Operator", generateRandom(40,50), null);

       serviceForCompany.getIncome();
       serviceForCompany.getTopSalaryStaff();
       serviceForCompany.getLowestSalaryStaff();

       serviceForCompany.hire(new Employee("Ivanov", "Ivanov", "TopManager", generateRandom(120,140), null));
       serviceForCompany.printEmployees();
       serviceForCompany.hire(new Employee("Ivanov", "Ivanov", "TopManager", generateRandom(120,140), null));
    }
}