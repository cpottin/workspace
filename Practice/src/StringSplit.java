public class StringSplit {

    public static void main(String[] args) {
        String sentence = "Hello I love Boston. Yes, you do Love Boston.";
        int wordCount = 0;
        String[] sentenceArray = sentence.split("[, ?.@]+");

        //array using length of the sentence array
        String[] uniqueWords;
        uniqueWords = new String[sentenceArray.length];

        //array for counts
        int countArray[];
        countArray = new int[sentenceArray.length];

        //length of sentence array
        System.out.println(sentenceArray.length);

        //output items in uniqueWords array
        for (String words : uniqueWords){
            System.out.println(words);
        }

        for(int i = 0; i < sentenceArray.length; i++) {
            for (int j = i + 1; j < sentenceArray.length; j++) {
                if (sentenceArray[i].equalsIgnoreCase(sentenceArray[j])) {
                    uniqueWords[i] = sentenceArray[i];



                }
            }
        }
//       for (String word : sentenceArray) {
//           System.out.println(word);
//       }

//        for (int i = 0; i < sentenceArray.length; i++) {
//            wordCount = 1;
//            for (int j = i + 1; j < sentenceArray.length; j++) {
//                if (sentenceArray[i].equalsIgnoreCase(sentenceArray[j])) {
//                    wordCount++;
//                    sentenceArray[j] ! = " ";
//                }
//            }
//            if (sentenceArray[i] !=  " ")
//                System.out.println(sentenceArray[i] + " : " + wordCount);
//        }


            }
        }

