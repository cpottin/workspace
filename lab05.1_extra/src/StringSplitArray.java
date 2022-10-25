import java.util.Arrays;

//public class StringSplitArray {
//    public static void main(String[] args) {
//        String initialString = "I love Boston.  Yes, you do love boston.";
//        String[] strings = initialString.split("[, ?.@&$]+");
//        String[] lowerCaseString = new String[strings.length];
//        String[] uniqueWords = new String[strings.length];
//        int currentIndex = 0;
//
//        for (int i = 0; i < strings.length; i++) {
//            boolean isTheWorldAlreadyEncountered = isTheWorldAlreadyEncountered(uniqueWords,
//                    strings[i], currentIndex);
//
//            if(isTheWorldAlreadyEncountered){
//                continue;
//            }
//            else {
//                uniqueWords[currentIndex] = strings[i];
//            }
//
//        }
//        System.out.println(Arrays.toString(uniqueWords));
//
//
//    }
//
//    private static boolean isTheWorldAlreadyEncountered(
//            String[] uniqueWords, String string, int currentIndex) {
//        for(int i = 0; i < currentIndex; i++){
//            if(uniqueWords[i].equalsIgnoreCase(wordToFind)){
//                found = true;
//            }
//        }
//        return found;
//    }
//}
