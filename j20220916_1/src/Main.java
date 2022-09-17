/*
Используя стримы, сформировать список из первых N чисел Fibonacci
getFibonacciList(5) = {0,1,1,2,3}
getFibonacciList(10) = {0,1,1,2,3,5,8,13,21,34}
getFibonacciList(1) = {0}
getFibonacciList(0) = {}
getFibonacciList(-10) = {}

 */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = Stream.of("qwe", "qwer", "dfghjkl", "y","t").collect(Collectors.toMap(
                s -> s.length(),
                s -> s,
                (s1,s2) -> s2+"|"+s1
       ));
        System.out.println(map);
    }


    public static List<Integer> getFibonacciList1(int n){
        if(n<=0) return List.of();
        return Stream.iterate(new int[]{0,1}, arr-> new int[]{arr[1], arr[1]+arr[0]})
                .limit(n)
                .map(arr->arr[0])
                .collect(Collectors.toList());
    }



    public static List<Integer> getFibonacciList(int n){
        if(n<=0) return List.of();
        return Stream.generate(
                new Supplier<Integer>() {
                    int n1=0;
                    int n2=1;                                 //1  2  3
                    @Override
                    public Integer get() {
                        int fib=n1;
                        n1=n2;
                        n2+=fib;
                        return fib;
                    }
                }
        ).limit(n).collect(Collectors.toList());
    }

    @Test
    public void testGetFibonacciList(){
        List<Integer> list5 = List.of(0,1,1,2,3);
        List<Integer> list10 = List.of(0,1,1,2,3,5,8,13,21,34);
        List<Integer> list1 = List.of(0);
        List<Integer> list0 = List.of();

        Assertions.assertAll(

                ()->{Assertions.assertIterableEquals(list5, getFibonacciList(5),"Test1");},
                ()->{Assertions.assertIterableEquals(list10, getFibonacciList(10));},
                ()->{Assertions.assertIterableEquals(list1, getFibonacciList(1));},
                ()->{Assertions.assertIterableEquals(list0, getFibonacciList(0));},
                ()->{ List<Integer> list_10 = List.of();
                      Assertions.assertIterableEquals(list_10, getFibonacciList(-10));
                },
                ()->{
                  int k=12;
                    List<Integer> fibonacciList = getFibonacciList(k);
                    boolean flag=true;
                    for (int i=2;i<fibonacciList.size()&&flag;i++){
                        flag = fibonacciList.get(i)== fibonacciList.get(i-1)+fibonacciList.get(i-2);
                    }
                    Assertions.assertTrue(flag);

                }

        );
    }
    /*
    methodName_scenario_expectedBehavior
    getFibonacciList_normalList_listWithFibonacci

    methodName_expectedBehavior_scenario

    should_expectedBehavior_when_scenario
        [should_]getlistWithFibonacci_[when_]normalListInput

    given_precondition_scenario_then_expectedBehavior


    [test][tested feature]
        testGetFibonacciList

     */

    @Test
    void getFibonacciTest1() {
        Assertions.assertEquals(List.of(0, 1, 1, 2, 3), Main.getFibonacciList(5));
    }

    @Test
    void getFibonacciTest2() {
        Assertions.assertEquals(List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), Main.getFibonacciList(10));
    }

    @Test
    void getFibonacciTest3() {
        Assertions.assertEquals(List.of(0), Main.getFibonacciList(1));
    }

    @Test
    void getFibonacciTest4() {
        Assertions.assertEquals(List.of(), Main.getFibonacciList(0));
    }

    @Test
    void getFibonacciTest5() {
        Assertions.assertEquals(List.of(), Main.getFibonacciList(-10));
    }




}
