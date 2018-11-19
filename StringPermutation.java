class StringPermutation{

    public static void main(String[] args) {
        permutation("", "as");
        //String s = "ash";
        //System.out.println(s.substring(1,s.length()));
    }

//     public static void permutation(String input){
//           permutation("", input);
//    }

   
   private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);

        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) 
                                        + word.substring(i + 1, word.length()));
            }
        }

    }
}