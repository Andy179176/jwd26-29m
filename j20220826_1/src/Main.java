import java.io.Console;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=List.of("11","123","hello","Java is a very easy!");

        ListToIntFunction getLongestStringIndex=new ListToIntFunction() {
            @Override
            public int apply(List<String> list) {

                int max=0;
                int index=-1;
                for (int i = 0; i <list.size() ; i++) {
                    int len=list.get(i).length();
                    if(len>max){
                        index=i;
                        max=len;
                    }
                }
                return index;
            }
        };

        ListToIntFunction getAmountLength=new ListToIntFunction() {
            @Override
            public int apply(List<String> list) {
                int sum=0;
                for(String s:list){
                    sum+=s.length();
                }
                return sum;
            }
        };

        System.out.println(listHandler(list, getLongestStringIndex));
        System.out.println(listHandler(list,getAmountLength));


    }

    public static <T>int listHandler(List<String> list, ListToIntFunction function){
        return function.apply(list);
    }

}