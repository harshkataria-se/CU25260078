class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String trimmedSentence = sentence.trim();
        String[] words = trimmedSentence.split("\\s+");

        int wordCount = words.length;

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Number of Words: " + wordCount);
    }

    public static void main(String[] args) {
        WordCounter w = new WordCounter();

        w.countWords("Java is a powerful programming language");
    }
}