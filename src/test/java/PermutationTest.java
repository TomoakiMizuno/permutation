import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationTest {

    @Test
    void createTest() {
        // 文字列
        Set<String> testList = new TreeSet<>();
        testList.add("abc");
        testList.add("acb");
        testList.add("bac");
        testList.add("bca");
        testList.add("cab");
        testList.add("cba");

        String permutationString = new Permutation().create("abc");
//        System.out.println(permutationString);
        assertEquals(testList.toString(), permutationString);

        // 数字
        String testNum = "[1234, 1243, 1324, 1342, 1423, 1432, 2134, 2143, 2314, 2341, 2413, 2431, 3124, 3142, 3214, 3241, 3412, 3421, 4123, 4132, 4213, 4231, 4312, 4321]";
        String permutationNum = new Permutation().create("1234");
//        System.out.println(permutationNum);
        assertEquals(testNum, permutationNum);
    }
}