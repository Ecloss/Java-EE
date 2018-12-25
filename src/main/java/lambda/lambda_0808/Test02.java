package lambda.lambda_0808;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author 余修文
 * @date 2018/8/8 22:18
 */
public class Test02 {

    public static void main(String[] args) {

        //() -> 5;
        //x -> 2 * x;
        //(x, y) -> x - y;
        //(Integer x, Integer y) -> x + y;
        //(String s) -> System.out.println(s);

        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);
    }

}