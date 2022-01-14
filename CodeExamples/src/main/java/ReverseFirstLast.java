public class ReverseFirstLast {

    public static void main(String[] args) {
        // char[] str={'c','o','d','e'};
        String str2 = "GeeksForGeeks";

        // Creating array and Storing the array
        // returned by toCharArray()
        char[] str = str2.toCharArray();
        char temp = str[0];
        str[0] =str[str2.length()-1];
        str[str2.length()-1]= temp;
        String str3 = String.valueOf(str);
        System.out.println(str3);


    }
}
