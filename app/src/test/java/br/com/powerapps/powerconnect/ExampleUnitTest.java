package br.com.powerapps.powerconnect;

import org.junit.Test;

import io.reactivex.Observable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testeDeRxJavaNumerosParesLambdas() throws Exception {
        Observable.just(1, 2, 4, 8, 6, 12, 34, 13)
                .filter(num -> num % 2 == 0)
                .subscribe(integer -> assertTrue(integer % 2 == 0));
    }
}