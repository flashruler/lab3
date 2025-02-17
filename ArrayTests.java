import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1,2,3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3,2,1}, input1);
	}
  @Test 
	public void testReverseInPlace3() {
    int[] input1 = { 1,2,3,4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4,3,2,1}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3,4,5,6};
    assertArrayEquals(new int[]{6,5,4,3,2,1}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testAvgWithoutLowest() {
    double[] input1 = {3.0,3.0,3.0,4.0,5.0};
    assertEquals(3.75, ArrayExamples.averageWithoutLowest(input1),1);
  }
}
