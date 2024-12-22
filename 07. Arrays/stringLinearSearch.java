public class stringLinearSearch {
    
    public static int string_linear_search (String str[], String key) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str[] = {"Dosa", "Chole Bhatoore", "Chicken", "Fish", "Mutton", "Kabab Paratha", "Samosa"};
        String key = "Fish";
        int index = string_linear_search(str, key);
        if (index == -1) {
            System.out.println("NOT FOUND !!!");
        } else {
            System.out.println("Key is at the index: " + index);
        }
    }
}