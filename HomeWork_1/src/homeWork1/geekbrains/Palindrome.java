package homeWork1.geekbrains;

/*
Фраза является палиндромом, если после преобразования всех прописных букв в строчные
и удаления всех не алфавитно-цифровых символов она читается одинаково вперед и назад.
Буквенно-цифровые символы включают в себя буквы и цифры.
Учитывая строку, верните значение true, если это палиндром, или false в противном случае.

использовать toLowerCase метод на строке под запретом.
Посмотрите в сторону Character.toLowerCase Character.isLetterOrDigit.
Перевести символ в нижний регистр дешевле, чем создавать новую строку.
 */
public class Palindrome {
    public static void main(String[] args) {
        String stringFirst = "A man, a plan, a canal: Panama";
        String stringSecond = "race a car";
        System.out.println(isPalindrome(stringFirst));
        //System.out.println(isPalindrome(stringSecond));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            char leftSymbol = Character.toLowerCase(str.charAt(left));
            char rightSymbol = Character.toLowerCase(str.charAt(right));

            if (Character.isLetterOrDigit(leftSymbol) && Character.isLetterOrDigit(rightSymbol)) {
                left++;
                right--;
                if (leftSymbol != rightSymbol) {
                    return false;
                }
//                if (left == right) {
//                    return true;
//                }
//                if (right - left == 1) {
//                    return true;
//                }
            } else {
                if (!Character.isLetterOrDigit(leftSymbol)) {
                    left++;
                }
                if (!Character.isLetterOrDigit(rightSymbol)) {
                    right--;
                }
            }
        }
        return true;
    }
}


