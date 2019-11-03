package ua.edu.ucu.collections.immutable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    private ImmutableArrayList arr;
    private ImmutableArrayList emptyArr;
    private ImmutableArrayList oneElArr;

    @Before
    public void setUp() {
        arr = new ImmutableArrayList(new Object[]{1, 2, 3, 4, 5});
        emptyArr = new ImmutableArrayList();
        oneElArr = new ImmutableArrayList(new Object[]{1});
    }

    @Test
    public void testAdd() {
        ImmutableArrayList actualResult = arr.add(6);
        Object[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testAddIndex() {
        ImmutableArrayList actualResult = arr.add(1, 6);
        Object[] expected = {1, 6, 2, 3, 4, 5};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndexOutOfBounds() {
        ImmutableArrayList actualResult = arr.add(10, 6);
    }

    @Test
    public void testAddAll() {
        ImmutableArrayList actualResult = arr.addAll(new Object[]{6, 7, 8});
        Object[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testAddAllIndex() {
        ImmutableArrayList actualResult = arr.addAll(1, new Object[]{6, 7, 8});
        Object[] expected = {1, 6, 7, 8, 2, 3, 4, 5};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllIndexOutOfBounds() {
        ImmutableArrayList actualResult = arr.addAll(10, new Object[]{6, 7, 8});
    }

    @Test
    public void testGet() {
        Object actualResult = arr.get(1);
        Object expected = 2;
        assertEquals(actualResult, expected);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        Object actualResult = arr.get(10);
    }

    @Test
    public void testRemove() {
        ImmutableArrayList actualResult = arr.remove(1);
        Object[] expected = {1, 3, 4, 5};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveOutOfBounds() {
        ImmutableArrayList actualResult = arr.remove(10);
    }

    @Test
    public void testSet() {
        ImmutableArrayList actualResult = arr.set(1, 6);
        Object[] expected = {1, 6, 3, 4, 5};
        assertArrayEquals(actualResult.toArray(), expected);
        assertArrayEquals(arr.toArray(), new Object[]{1, 2, 3, 4, 5});
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetOutOfBounds() {
        ImmutableArrayList actualResult = arr.set(10, 6);
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
        ImmutableArrayList actualResult = arr.clear();
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
    public void testIsEmptyWithEmpty() {
        boolean actualResult = emptyArr.isEmpty();
        boolean expected = true;
        assertEquals(actualResult, expected);
    }

    @Test
    public void testToString() {
        String actualResult = arr.toString();
        String expected = "1, 2, 3, 4, 5";
        assertEquals(actualResult, expected);
    }
}
