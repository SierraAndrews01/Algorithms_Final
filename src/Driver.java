public class Driver {
    // Driver to test above code
    public static void main(String[] args)
    {
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
        lst.displayList();

        lst.deleteElement(9);
        lst.deleteElement(12);
        lst.displayList();

        lst.search(9);

    }
}
