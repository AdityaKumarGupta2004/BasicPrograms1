import java.util.*;

public class CashVoiceConverter {
    static final String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static final String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                                    "sixteen", "seventeen", "eighteen", "nineteen" };
    static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty",
                                    "sixty", "seventy", "eighty", "ninety" };
    static final String[] thousands = { "", "thousand", "lakh", "crore" };

    // Helper to convert up to three digits
    static String convertUptoThreeDigits(int n) {
        String result = "";
        if(n > 99) {
            result += units[n/100] + " hundred";
            n %= 100;
            if(n > 0) result += " ";
        }
        if(n > 19) {
            result += tens[n/10];
            if(n % 10 != 0) result += " " + units[n%10];
        } else if(n > 9) {
            result += teens[n-10];
        } else if(n > 0) {
            result += units[n];
        }
        return result.trim();
    }

    // Main converter for rupees part
    static String convertNumberToWords(long n) {
        if(n == 0) return "zero";
        StringBuilder sb = new StringBuilder();
        int[] dividers = { 10000000, 100000, 1000, 1 };
        int[] thresh = new int[dividers.length];
        
        for(int i = 0; i < dividers.length; i++) {
            thresh[i] = (int)(n / dividers[i]);
            n %= dividers[i];
        }

        if(thresh[0] > 0) sb.append(convertUptoThreeDigits(thresh[0])).append(" crore ");
        if(thresh[1] > 0) sb.append(convertUptoThreeDigits(thresh[1])).append(" lakh ");
        if(thresh[2] > 0) sb.append(convertUptoThreeDigits(thresh[2])).append(" thousand ");
        if(thresh[3] > 0) sb.append(convertUptoThreeDigits(thresh[3]));
        return sb.toString().replaceAll("\\s+", " ").trim();
    }

    public static String cashVoice(String input) {
        String[] parts = input.split("\\.");
        long rupees = Long.parseLong(parts[0]);
        int paise = (parts.length > 1)? Integer.parseInt((parts[1] + "00").substring(0, 2)) : 0;

        StringBuilder result = new StringBuilder();
        result.append(convertNumberToWords(rupees)).append(" rupees");
        if(parts.length > 1 && paise > 0) {
            result.append(" ").append(convertNumberToWords(paise)).append(" paise");
        }
        return result.toString().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(cashVoice(in));
    }
}
