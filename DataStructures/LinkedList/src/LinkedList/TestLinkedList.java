package LinkedList;

import org.junit.*;

//JUnit4 is a test framework - we are using this to create unit tests
//We downloaded this library from online (using Maven) so we could use its prebuilt functions

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
        Assert.assertNull(linkedList.head);

        linkedList.append(1); //we append 1 manually
        Assert.assertNotNull(linkedList.head);
        Assert.assertEquals(1, (int)linkedList.head.data); //we check if 1 was correctly appended
        Assert.assertNull(linkedList.head.next); //here we check if the next node is null, which it should be because we only appended 1 and nothing else

        linkedList.append(2);
        Assert.assertNotNull(linkedList.head.next);
        Assert.assertEquals(2,(int)linkedList.head.next.data);
    }

    @Test
    public void prepend(){ //test functions do not need to have a predetermined parameter (e.g. int)
        Assert.assertNull(linkedList.head); //checks if our initial head is null

        linkedList.prepend(1); //we call the prepend function and ask it to prepend 1
        Assert.assertNotNull(linkedList.head); //check if our current head is null (we expect it to not be null since we just prepended 1)
        Assert.assertNull(linkedList.head.next); //check if our next node is null, which we expect it to be since we haven't appended anything else (because we created an empty sting above)
        Assert.assertEquals(1,(int)linkedList.head.data); //we need to typecast linkedList.head.data because it is a member of Integer

        linkedList.prepend(-1); //we are prepending -1 into the list which already has a value in it
        Assert.assertEquals(-1,(int)linkedList.head.data); //checks if we inputted -1 and it became the new head
        Assert.assertNotNull(linkedList.head.next);//check if our next node is null, which it should not be since we already had 1 in it
        Assert.assertEquals(1,(int)linkedList.head.next.data); //REMEMBER TO TYPECAST! and write .data to reach the VALUE of the node (what is inside)
        Assert.assertNull(linkedList.head.next.next);//checks if the third node is null, which it should be since we only have 2 nodes now (-1 and 1)
    }

    @Test
    public void testDelete() {
        Assert.assertNull(linkedList.head);
        try {
            linkedList.delete(1); //we have not inputted 1 yet, so the list is empty - we are trying to delete an empty list to see if it will fail
            fail(); //if the program does not enter 'catch' we manually fail it
        } catch (EmptyListException e) {
            Assert.assertEquals("List is empty!", e.getMessage());
            //here we catch the error of trying to delete an empty list and we expect the program to print "List is Empty" which we wrote ourselves
        }
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        Assert.assertEquals(1, (int)linkedList.head.data);
        try {
            linkedList.delete(1);
            Assert.assertEquals(2, (int)linkedList.head.data);
            linkedList.delete(2);
            Assert.assertEquals(3, (int)linkedList.head.data);
            linkedList.delete(3);
            Assert.assertNull(linkedList.head);
        } catch (InvalidDataException e) { //if we incur any problems in the above try code, it will push us into the 'catch' and we will force it to fail
            fail();
        }

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        try {
            Assert.assertEquals(2, (int)linkedList.head.next.data);
            linkedList.delete(2);
            Assert.assertEquals(3, (int)linkedList.head.next.data);
        } catch (InvalidDataException e) {
            fail();
        }
    }

}
