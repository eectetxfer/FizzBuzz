public class fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            String output = "";
            if (i % 3 == 0) {
                output = "Fizz";
            }
            if (i % 5 == 0) {
                output = output + "Buzz";
            }
            if (output == "") {
                output = "---";
            }
            System.out.println(output);
        }
    }
}
