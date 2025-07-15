package simpletest.string;

public class TestValidCode {
    public static void main(String[] args) {
        String code1 = getCode(1);
        String code2 = getCode(9);
        System.out.println(code1);
        System.out.println(code2);
    }
    public static String getCode(int n) throws IllegalArgumentException {
        if (n < 1 || n > 10) {
            throw  new IllegalArgumentException();
        }
        String allChars = "abcdef12345";
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < n; i++) {
            code.append(allChars.charAt(
                    (int) (Math.random() * allChars.length())
            ));
        }
        return code.toString();
    }
}
