package ObjectOrientedProgramming.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExamples {
    public static void main(String[] args){
        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        String result = joiner.add("string1").add("string2").add("string3").toString();
        System.out.println(result);

        List<String> names = Arrays.asList("Name1", "Name2", "Name3", "Name4");
        String allNames = names.stream().collect(Collectors.joining(", ", "{", "}"));
        System.out.println(allNames);
    }
}
