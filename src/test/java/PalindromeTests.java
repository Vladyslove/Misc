import org.junit.Test;

import static tasks.palindrome.Palindrome.isPalindrome;
import static tasks.palindrome.Palindrome.isSimpleNumber;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class PalindromeTests {

    @Test
    public void test_isSimpleNumber() {

        assertThat((isSimpleNumber(13)), is(true));
        assertThat((isSimpleNumber(11)), is(true));
        assertThat((isSimpleNumber(17)), is(true));
        assertThat((isSimpleNumber(3)), is(true));
    }

    @Test
    public void test_isNotSimpleNumber() {

        assertThat((isSimpleNumber(15_452)), is(false));
        assertThat((isSimpleNumber(150_000)), is(false));
        assertThat((isSimpleNumber(17_245)), is(false));
        assertThat((isSimpleNumber(99)), is(false));
    }

    @Test
    public void test_isPalindrome() {

        assertThat(isPalindrome("ABBA"), is(true));
        assertThat(isPalindrome("12321"), is(true));
        assertThat(isPalindrome("racecar"), is(true));
    }

    @Test
    public void test_isNotPalindrome() {

        assertThat(isPalindrome("12345"), is(false));
        assertThat(isPalindrome("palindrome"), is(false));
        assertThat(isPalindrome("simple"), is(false));
    }

/*
    @Ignore
    @Test
    public void test_maxOfPalindromes() {

        List listOfPalindromes = new ArrayList();

        listOfPalindromes.add(111);
        listOfPalindromes.add(353);
        listOfPalindromes.add(959);
        listOfPalindromes.add(252);

        assertThat(maxOfPalindromes(), is(959));

    }
*/

}
