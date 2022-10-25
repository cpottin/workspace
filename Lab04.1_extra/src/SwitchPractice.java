public class SwitchPractice {
    private static int hexNum;
    char hexChar;

    public static void hexCharToDecimal (char hexChar){
        switch (hexChar) {
            case 'A':
                hexNum = 10;
                System.out.println(hexNum);
            break;
            case 'B':
                hexNum = 11;
                System.out.println(hexNum);
            break;
            case 'C':
                hexNum = 12;
                System.out.println(12);
            break;
            case 'D':
                System.out.println(13);
            break;
            case 'E':
                System.out.println(14);
            break;
            case 'F':
                System.out.println(15);
            break;
            default:
                hexNum = hexChar - '0';
                System.out.println("No Char was switched");
        }
    }

    public static void main(String[] args) {
        SwitchPractice newChar = new SwitchPractice();
        newChar.hexCharToDecimal('A');
        newChar.hexCharToDecimal('B');

    }
}
