package ua.edu.ucu.collections.immutable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    private ImmutableLinkedList arr;
    private ImmutableLinkedList emptyArr;
    private ImmutableLinkedList oneElArr;

    @Before
    public void setUp() {
        arr = new ImmutableLinkedList(new Object[]{1, 2, 3, 4, 5});
        emptyArr = new ImmutableLinkedList();
        oneElArr = new ImmutableLinkedList(new Object[]{1});
    }

    @Test
    public void testCreateWithEmptyArr() {
        ImmutableLinkedList test = new ImmutableLinkedList(new Object[]{});
        assertEquals(0, test.size());
    }

    @Test
    public void testAdd() {
        ImmutableLinkedList actualResult = arr.add(6);
        Object[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testAddIndex() {
        ImmutableLinkedList actualResult = arr.add(1, 6);
        Object[] expected = {1, 6, 2, 3, 4, 5};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndexOutOfBounds() {
        ImmutableLinkedList actualResult = arr.add(10, 6);
    }

    @Test
    public void testAddAll() {
        ImmutableLinkedList actualResult = arr.addAll(new Object[]{6, 7, 8});
        Object[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testAddAllIndex() {
        ImmutableLinkedList actualResult = arr.addAll(1, new Object[]{6, 7, 8});
        Object[] expected = {1, 6, 7, 8, 2, 3, 4, 5};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testGet() {
        Object actualResult = arr.get(1);
        Object expected = 2;
        assertEquals(actualResult, expected);
    }

    @Test
    public void testRemove() {
        ImmutableLinkedList actualResult = arr.remove(1);
        Object[] expected = {1, 3, 4, 5};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveOutOfBounds() {
        ImmutableLinkedList actualResult = arr.remove(10);
    }

    @Test
    public void testSet() {
        ImmutableLinkedList actualResult = arr.set(1, 6);
        Object[] expected = {1, 6, 3, 4, 5};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testIndexOf() {
        int actualResult = arr.indexOf(2);
        int expected = 1;
        assertEquals(actualResult, expected);
    }

    @Test
    public void testIndexOfNotInList() {
        int actualResult = arr.indexOf(10);
        int expected = -1;
        assertEquals(actualResult, expected);
    }

    @Test
    public void testSize() {
        int actualResult = arr.size();
        int expected = 5;
        assertEquals(actualResult, expected);
    }

    @Test
    public void testClear() {
        ImmutableLinkedList actualResult = arr.clear();
        Object[] expected = {};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testIsEmpty() {
        boolean actualResult = arr.isEmpty();
        boolean expected = false;
        assertEquals(actualResult, expected);
    }

    @Test
    public void testToString() {
        String actualResult = arr.toString();
        String expected = "1, 2, 3, 4, 5";
        assertEquals(actualResult, expected);
    }

    @Test
    public void testAddFirst() {
        ImmutableLinkedList actualResult = arr.addFirst(6);
        Object[] expected = {6, 1, 2, 3, 4, 5};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testAddLast() {
        ImmutableLinkedList actualResult = arr.addLast(6);
        Object[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testGetFirst() {
        Object actualResult = arr.getFirst();
        Object expected = 1;
        assertEquals(actualResult, expected);
    }

    @Test
    public void testGetLast() {
        Object actualResult = arr.getLast();
        Object expected = 5;
        assertEquals(actualResult, expected);
    }

    @Test
    public void testRemoveFirst() {
        ImmutableLinkedList actualResult = arr.removeFirst();
        Object[] expected = {2, 3, 4, 5};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testRemoveLast() {
        ImmutableLinkedList actualResult = arr.removeLast();
        Object[] expected = {1, 2, 3, 4};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }
}
