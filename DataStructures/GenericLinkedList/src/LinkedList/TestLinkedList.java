package LinkedList;

//JUnit4 is a test framework - we are using this to create unit tests
//We downloaded this library from online (using Maven) so we could use its prebuilt functions

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*; //we imported the assert class so we do not have to write Assert. before all the commands

public class TestLinkedList {
    LinkedList<Integer> linkedList; //generics take in Class types, so we can't write int, char, double (no specific reason, just syntax - Integer allocated dynamic space and int allocated static - only 4 bytes)

    //we define the linkedList of T type and make it of Integer type in this test case
    @Before
    public void setUp() throws Exception { //throws Exception prevents you from crashing here
        linkedList = new LinkedList<Integer>(); // initialize a linkedList before running any test
    } //we created an empty list here

    @After
    public void tearDown() throws Exception {
        linkedList = null; // delete the artificially created linkedList after every test
    }

    @Test
    public void testAppend() {
        assertNull(linkedList.head);

        linkedList.append(1); //we append 1 manually
        assertNotNull(linkedList.head);
        assertEquals(1, (int) linkedList.head.data); //we check if 1 was correctly appended
        assertNull(linkedList.head.next); //here we check if the next node is null, which it should be because we only appended 1 and nothing else

        linkedList.append(2);
        assertNotNull(linkedList.head.next);
        assertEquals(2, (int) linkedList.head.next.data);
    }

    @Test
    public void testPrepend() { //test functions do not need to have a predetermined parameter (e.g. int)
        assertNull(linkedList.head); //checks if our initial head is null

        linkedList.prepend(1); //we call the prepend function and ask it to prepend 1
        assertNotNull(linkedList.head); //check if our current head is null (we expect it to not be null since we just prepended 1)
        assertNull(linkedList.head.next); //check if our next node is null, which we expect it to be since we haven't appended anything else (because we created an empty sting above)
        assertEquals(1, (int) linkedList.head.data); //we need to typecast linkedList.head.data because it is a member of Integer

        linkedList.prepend(-1); //we are prepending -1 into the list which already has a value in it
        assertEquals(-1, (int) linkedList.head.data); //checks if we inputted -1 and it became the new head
        assertNotNull(linkedList.head.next);//check if our next node is null, which it should not be since we already had 1 in it
        assertEquals(1, (int) linkedList.head.next.data); //REMEMBER TO TYPECAST! and write .data to reach the VALUE of the node (what is inside)
        assertNull(linkedList.head.next.next);//checks if the third node is null, which it should be since we only have 2 nodes now (-1 and 1)
    }

    @Test
    public void testDelete() {
        assertNull(linkedList.head);
        try {
            linkedList.delete(1); //we have not inputted 1 yet, so the list is empty - we are trying to delete an empty list to see if it will fail
            fail(); //if the program does not enter 'catch' we manually fail it
        } catch (EmptyListException | InvalidDataException e) {
            assertEquals("List is empty!", e.getMessage());
            //here we catch the error of trying to delete an empty list and we expect the program to print "List is Empty" which we wrote ourselves
        }
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        assertEquals(1, (int) linkedList.head.data);
        try {
            linkedList.delete(1);
            assertEquals(2, (int) linkedList.head.data);
            linkedList.delete(2);
            assertEquals(3, (int) linkedList.head.data);
            linkedList.delete(3);
            assertNull(linkedList.head);
        } catch (InvalidDataException |
                 EmptyListException e) { //if we incur any problems in the above try code, it will push us into the 'catch' and we will force it to fail
            fail(); //manually forcing the test to fail will give a fail report
        }

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        try {
            assertEquals(2, (int) linkedList.head.next.data);
            linkedList.delete(2);
            assertEquals(3, (int) linkedList.head.next.data);
        } catch (InvalidDataException | EmptyListException e) {
            fail();
        }
    }

    @Test
    public void testContains() {
        assertNull(linkedList.head); //expect the head to be null
        assertFalse(linkedList.contains(1));//we are testing if 1 does not exist

        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(24);
        assertTrue(linkedList.contains(24)); //checking if what we added is actually in the list
        try {
            linkedList.delete(24); //call the delete function we wrote outside
            assertFalse(linkedList.contains(24)); //checking if we actually deleted the value in the list
        } catch (InvalidDataException | EmptyListException e) {
            fail();
        }
    }

    @Test // usually use 'public void' in test functions
    public void testIsEmpty() {
        assertNull(linkedList.head); //head should be null - we're confirming this
        assertTrue(linkedList.isEmpty()); //calling the function, because the function will give you true/false
        linkedList.append(1);
        assertFalse(linkedList.isEmpty());//after appending the number we no longer have a null head/linkedlist so our output should be false

        try {
            linkedList.delete(1); //we have to use try catch because if we delete a number that is not in the linkedlist it will give us an error
            assertTrue(linkedList.isEmpty());
        } catch (EmptyListException | InvalidDataException e) { // EmptyListException OR InvalidDataException
            fail();
        }
    }

    @Test
    public void testIndexOf() {
        assertNull(linkedList.head);

        try {
            linkedList.indexOf(5);
            fail();
        } catch (InvalidDataException e) {
            assertEquals("List does not contain 5", e.getMessage());
        }
        try {
            linkedList.append(10);
            assertEquals(0, linkedList.indexOf(10));
            linkedList.append(3);
            linkedList.append(7);
            linkedList.append(2);
            assertEquals(3, linkedList.indexOf(2));
            linkedList.delete(7);
            assertEquals(2, linkedList.indexOf(2));
        } catch (InvalidDataException | EmptyListException e) {
            fail();
        }
    }

    @Test
    public void testGet() {
        try {
            linkedList.get(5);
            fail();
        } catch (InvalidIndexException e) {
            assertEquals("Invalid Index!", e.getMessage());
        }
        linkedList.append(15);
        linkedList.append(5);
        linkedList.append(35);
        linkedList.append(27);
        try {
            assertEquals(35, (int) linkedList.get(2)); //our parameter T was general - which is interpreted as an object- so for us to use it, we must define the type of variable it will be holding
            linkedList.delete(35);
            assertEquals(27, (int) linkedList.get(2));
        } catch (InvalidIndexException | InvalidDataException | EmptyListException e) {
            fail();
        }
    }

    @Test
    public void testClear() {
        assertNull(linkedList.head);
        linkedList.append(3);
        linkedList.append(5);
        assertNotNull(linkedList.head);
        linkedList.clear();
        assertNull(linkedList.head);
    }

    @Test
    public void testGetFirst() {
        assertNull(linkedList.head);
        try {
            linkedList.getFirst(); //if it is null and the program continues we force the test to fail, because the program should realize it is empty and jump to the 'catch'
            fail();
        } catch (EmptyListException e) {
            assertEquals("List is empty!", e.getMessage()); //the message we get in our catch should be the same as the one being thrown in the original
        }

        linkedList.append(1);
        try {
            assertEquals(1, (int) linkedList.getFirst()); //we are checking if our head is equal to 1
            linkedList.delete(1); //then we delete our appended integer
        } catch (EmptyListException |
                 InvalidDataException e) { //we are checking if 1 (our inputted integer) exists in this list. if it does not exist and the program gives us an error we should fail the test
            fail();
        }

        try {
            linkedList.getFirst(); //if an exception does not occur because after deleting 1 our list is now empty, the test should fail (because we expect it to enter an exception and continue running)
            fail();
        } catch (
                EmptyListException e) { //if the program gives us an emptylistexception by entering the catch, we are checking if the exception it gives us is the correct exception
            assertEquals("List is empty!", e.getMessage());
        }
    }

    @Test
    public void testGetLast() {
        assertNull(linkedList.head);

        try {
            linkedList.getLast(); //if null and the test does not enter the exception it should fail
            fail();
        } catch (EmptyListException e) { //when it enters the exception we expect it to print the below message
            assertEquals("List is empty!", e.getMessage());
        }

        linkedList.append(1);
        linkedList.append(11);
        linkedList.append(21);
        try {
            assertEquals(21, (int)linkedList.getLast());
            linkedList.delete(21);
            assertEquals(11, (int)linkedList.getLast());
        } catch (EmptyListException | InvalidDataException e) { //we write InvalidDataException because we are deleting a value above, if the value we delete is not in the list we need to have it throw an exception
            fail(); //the fail is checking the try component (it should not throw the above excpetions because the value is in the list), if it does we want it to fail
        }
    }

    @Test
    public void testSize() {
        assertNull(linkedList.head);
        assertEquals(0,linkedList.size());

        for(int i = 0; i<3; i++){ //instead of individually adding components to the list we created a for loop to add a few
            linkedList.append(i);
            assertEquals(i+1,linkedList.size());
        }

        for(int i = 2; i>=0; i--){
            try {
                linkedList.delete(i);
                assertEquals(i,linkedList.size());
            } catch (InvalidDataException | EmptyListException e) {
                fail();
            }
        }
    }
}
