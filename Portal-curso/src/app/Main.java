//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    Set<Integer> a = new HashSet<>();
    Set<Integer> b = new HashSet<>();
    Set<Integer> c = new HashSet<>();

    System.out.println("How many students for course A?  ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        int number = sc.nextInt();
        a.add(number);
    }
    System.out.println("How many students for course B?  ");
    n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        int number = sc.nextInt();
        b.add(number);
    }
    System.out.println("How many students for course C?  ");
    n = sc.nextInt();    
    for (int i = 1; i <= n; i++) {
        int number = sc.nextInt();
        c.add(number);
    }

    Set<Integer> total = new HashSet<>(a);
    total.addAll(b);
    total.addAll(c);

    System.out.println("Total students: " + total.size());

    sc.close();
}
