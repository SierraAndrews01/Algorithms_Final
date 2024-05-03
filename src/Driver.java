import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Driver {
    // Driver to test above code
    public static ArrayList<Long> insertionTimes = new ArrayList<>();
    public static ArrayList<Long> searchTimes = new ArrayList<>();
    public static ArrayList<Long> deleteTimes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // create SkipList object with MAXLVL and P
        SkipList lst = new SkipList(3, 0.5f);

        lst.insertElement(3);
        lst.insertElement(6);
        lst.insertElement(7);
        lst.insertElement(9);
        lst.insertElement(30);
        lst.insertElement(12);
        lst.insertElement(19);
        lst.insertElement(17);
        lst.insertElement(26);
        lst.insertElement(21);
        lst.insertElement(25);

        System.out.println("P = 0.5");

        lst.displayList();

        lst.deleteElement(9);
        lst.deleteElement(12);
        lst.displayList();

        lst.search(9);
        lst.search(3);
        lst.search(6);
        lst.search(7);
        lst.search(30);
        lst.search(12);
        lst.search(19);
        lst.search(17);
        lst.search(26);
        lst.search(21);
        lst.search(25);

        //different P levels
        System.out.println("\n");
        pLevelTest0_25();
        System.out.println("\n");
        pLevelTest0_75();
        System.out.println("\n");
        pLevelTest0_90();

        // run max level testing
        // 0 = worst case = same as linked list
        ArrayList<Integer> maxLevels = new ArrayList<>(Arrays.asList(0, 2, 4, 6, 8, 10));
        maxLevelTesting(maxLevels);


        //Boundary testing
        BoundaryInsertionTest();
        BoundaryDeletionTest();
        EmptyTest();
    }

    //different P levels
    public static void pLevelTest0_25() {
        // create SkipList object with MAXLVL and P
        SkipList lst = new SkipList(3, 0.25f);

        lst.insertElement(3);
        lst.insertElement(6);
        lst.insertElement(7);
        lst.insertElement(9);
        lst.insertElement(30);
        lst.insertElement(12);
        lst.insertElement(19);
        lst.insertElement(17);
        lst.insertElement(26);
        lst.insertElement(21);
        lst.insertElement(25);

        System.out.println("P = 0.25");

        lst.displayList();
    }

    public static void pLevelTest0_75() {
        // create SkipList object with MAXLVL and P
        SkipList lst = new SkipList(3, 0.75f);

        lst.insertElement(3);
        lst.insertElement(6);
        lst.insertElement(7);
        lst.insertElement(9);
        lst.insertElement(30);
        lst.insertElement(12);
        lst.insertElement(19);
        lst.insertElement(17);
        lst.insertElement(26);
        lst.insertElement(21);
        lst.insertElement(25);

        System.out.println("P = 0.75");

        lst.displayList();
    }

    public static void pLevelTest0_90() {
        // create SkipList object with MAXLVL and P
        SkipList lst = new SkipList(3, 0.90f);

        lst.insertElement(3);
        lst.insertElement(6);
        lst.insertElement(7);
        lst.insertElement(9);
        lst.insertElement(30);
        lst.insertElement(12);
        lst.insertElement(19);
        lst.insertElement(17);
        lst.insertElement(26);
        lst.insertElement(21);
        lst.insertElement(25);

        System.out.println("P = 0.90");

        lst.displayList();
    }

    public static void max_level_test(int maxLevel) {
        // create SkipList object with MAXLVL and P
        SkipList lst = new SkipList(maxLevel, 0.50f);

        lst.insertElement(3);
        lst.insertElement(6);
        lst.insertElement(7);
        lst.insertElement(9);
        lst.insertElement(30);
        lst.insertElement(12);
        lst.insertElement(19);
        lst.insertElement(17);
        lst.insertElement(26);
        lst.insertElement(21);
        lst.insertElement(25);

        System.out.println("\n");
        System.out.println("P = 0.50");
        System.out.println("Max level = " + maxLevel);

        lst.displayList();
    }

    public static void maxLevelTesting(ArrayList<Integer> maxLevels) {
        for(int i = 0; i < maxLevels.size(); i++){
            int tempLevel = maxLevels.get(i);
            max_level_test(tempLevel);
        }
    }

    public static void BoundaryInsertionTest(){
        SkipList lst = new SkipList(3, 0.5f);
        lst.insertElement(0);
        lst.insertElement(1000);
        lst.displayList();
    }

    public static void BoundaryDeletionTest(){
        SkipList lst = new SkipList(3, 0.5f);
        lst.insertElement(0);
        lst.insertElement(500);
        lst.insertElement(1000);

        lst.deleteElement(0);
        lst.deleteElement(1000);
        lst.displayList();
    }

    public static void EmptyTest(){
        SkipList lst = new SkipList(3, 0.5f);

       lst.search(10);

    }
}
