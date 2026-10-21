//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Map<String, Integer> votes = new LinkedHashMap<>();

    System.out.print("Enter file full path: ");
    String path = sc.nextLine();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
        String line = br.readLine();
        while (line != null) {
            String[] fields = line.split(",");
            String name = fields[0];
            int count = Integer.parseInt(fields[1]);

            if (votes.containsKey(name)) {
                int vote = votes.get(name);
                votes.put(name, count + vote);

            } else {
                votes.put(name, count);
            }
            line = br.readLine();

        }
        for (String key : votes.keySet()) {
            System.out.println(key + ": " + votes.get(key));
        }
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
    sc.close();
}
