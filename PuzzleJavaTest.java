public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava pj = new PuzzleJava();

        // 1 - Create an array of numbers. Return values greater than 10 in an array
        int[] arr1 = { 3,5,1,2,7,9,8,13,25,32 };
        pj.arrayList(arr1);

        // 2 - Create an array of strings. Shuffle the array and print names of each person. Return a new array with all names longer than 5 characters.
        String[] arr2 = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        pj.shuffleStringArray(arr2);
        pj.longerThan5(arr2);

        // 3 - Create an array with all 26 letters of the alphabet. Shuffle the array and print the last letter from the array and the first letter of the array. If the first letter of the array is a vowel, display a message.
        String[] arr3 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        String[] vowels = { "a", "e", "i", "o", "u" };
        pj.alphabetArray(arr3, vowels);
        
        // 4 - Generate and return an array with 10 random numbers between 55 and 100
        int num = 10;
        pj.randomNumArr(num);

        // 5 - Generate and return an array with 10 random numbers between 55 and 100 and have it be sorted (smallest number in beginning). Display all numbers in the array. Display min and max values in array.
        pj.randomNumArr2(num);

        // 6 - Create a random string that is 5 characters long
        int strNum = 5;
        pj.randomString(strNum);

        // 7 - Generate an array with 10 random strings that are each 5 characters long.
        pj.randomStringArray(num);
    }
}