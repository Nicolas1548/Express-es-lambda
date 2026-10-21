import entities.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter full file path: ");
    String path = sc.nextLine();
    System.out.print("Enter salary: ");
    Double value = sc.nextDouble();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

        List<Employee> emp = new ArrayList<>();
        String line = br.readLine();
        while (line != null) {
            String[] fields = line.split(",");
            String name = fields[0];
            String email = fields[1];
            Double salary = Double.parseDouble(fields[2]);
            emp.add(new Employee(name, email, salary));
            line = br.readLine();
        }


        List<String> emails = emp.stream()
                .filter(x -> x.getSalary() > value)
                .map(x -> x.getEmail())
                .sorted()
                .collect(Collectors.toList());

        System.out.printf("Email of people whose salary is more than %.2f:\n", value);
        emails.forEach(System.out::println);


        double sum = emp.stream()
                .filter(e -> e.getName().startsWith("M"))
                .mapToDouble(e -> e.getSalary())
                .sum();

        System.out.printf("Sum of salary of people whose name starts with 'M': %.2f:\n", sum);


    } catch (Exception e) {
        System.err.println("Error" + e.getMessage());
    }
    sc.close();
}
