package homeWork1.geekbrains;

/*
Учитывая входную строку s, измените порядок слов в обратном порядке.
Input: s = "the sky is blue"
Output: "blue is sky the"
использовать функции replace, indexOf, split под запретом. Для накопления ответа используем StringBuilder
 */
public class WordsInString {
    public static void main(String[] args) {
        String string = "the sky is blue";
        System.out.println(string);
        reverseWords(string);
    }

    public static void reverseWords(String str) {

        int end = str.length() - 1;
        int start = end - 1;
        StringBuilder sb = new StringBuilder();
        while (end >= 0) {
            while (start >= 0 && str.charAt(start) != ' ') {
                start--;
            }
            // sb.append(str.substring(start + 1, end + 1));
            sb.append(str, start + 1, end + 1);
            sb.append(" ");

            while (start >= 0 && str.charAt(start) == ' ') {
                start--;
            }
            end = start;
        }
        System.out.println(sb.toString().trim());
    }
}

