import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    
    // 1 - create an array with values 3
    public ArrayList arrayList(int[] arr1) {
        ArrayList<Integer> newArr1 = new ArrayList<Integer>();
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            if (arr1[i] > 10) {
                newArr1.add(arr1[i]);
            }
        }
        System.out.println("1- The sum of all values is: " + sum);
        System.out.println("1- The new array of all values > 10 is: " + newArr1);
        return newArr1;
    }

    // 2 - String array, shuffle names
    public void shuffleStringArray(String[] arr2) {
        ArrayList<String> newArr2 = new ArrayList<String>();
        for (int i = 0; i < arr2.length; i++) {
            newArr2.add(arr2[i]);
        }
        // System.out.println(arr2);
        Collections.shuffle(newArr2);
        System.out.println("2- " + newArr2);
    }

    // Not done with this
    // 2 - Return array with names longer than 5 characters
    public void longerThan5(String[] arr2) {
        ArrayList<String> newArr2 = new ArrayList<String>();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].length() > 5) {
                newArr2.add(arr2[i]);
            }
        }
        System.out.println("2- These are the names longer than 5 characters: " + newArr2);
        // return newArr2;
    }

    // 3 - Alphabet array
    public void alphabetArray(String[] arr3, String[] vowels) {
        ArrayList<String> newArr3 = new ArrayList<String>();
        ArrayList<String> newVowels = new ArrayList<String>();

        // add all values of arr3 into newArr3
        for (int i = 0; i < arr3.length; i++) {
            newArr3.add(arr3[i]);
        }

        // add all values of vowels into newVowels
        for (int k = 0; k < vowels.length; k++) {
            newVowels.add(vowels[k]);
        }

        System.out.println("3- New array before shuffling: " + newArr3);
        // shuffle newArr3
        Collections.shuffle(newArr3);
        System.out.println("3- New array after shuffling: " + newArr3);

        // find last value in shuffled newArr3 and print
        for (int j = 0; j < newArr3.size(); j++) {
            if (j == newArr3.size() - 1) {
                System.out.println("3- Last value of array: " + newArr3.get(j));
            }
        }
        // check to see if first value of shuffled newArr3 is a vowel
        if ( newVowels.contains(newArr3.get(0))) {
            System.out.println("3- This first letter is a vowel! It is: " + newArr3.get(0));
        }
    }

    // 4 - Array of 10 random numbers
    public ArrayList randomNumArr(int num) {
        ArrayList<Integer> arr4 = new ArrayList<Integer>();
        Random r = new Random();
        
        for (int i = 1; i <= num; i++) {
            arr4.add(r.nextInt(45) + 55);
        }
        // System.out.println(arr4);
        return arr4;
    }
    // Random r = new Random();
    // int random_integer = rand.nextInt(upperbound-lowerbound) + lowerbound;
    // System.out.println(r.nextInt(45) + 55); // with bounds 55 to 100

    // 5 - RandomNumArray2
    public void randomNumArr2(int num) {
        ArrayList<Integer> arr5 = new ArrayList<Integer>();
        Random r = new Random();
        
        for (int i = 1; i <= num; i++) {
            arr5.add(r.nextInt(45) + 55);
        }
        // System.out.println(arr5);
        Collections.sort(arr5);
        int min = arr5.get(0);
        int max = arr5.get(arr5.size() - 1);
        System.out.println("5- Sorted arr5 " + arr5);
        System.out.println("5- The min value is: " + min);
        System.out.println("5- The max value is: " + max);
    }

    // 6 - Create a random string that is 5 characters long
    public String randomString(int strNum) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(strNum);

        for (int i = 0; i < strNum; i++) {
            int idx = (int) (alphabet.length() * Math.random());
            sb.append(alphabet.charAt(idx));
        }
        // System.out.println("6- " + sb.toString());
        return sb.toString();
    }

    // 7 - Random string array
    public ArrayList randomStringArray(int num) {
        ArrayList<String> arr7 = new ArrayList<String>();
        // Random r = new Random();
        
        for (int i = 0; i <= num; i++) {
            arr7.add(randomString(5));
        }
        // System.out.println("7- The array of random strings: " + arr7);
        return arr7;
    }
}