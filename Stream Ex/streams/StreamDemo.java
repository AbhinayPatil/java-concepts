package streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;
class Student {
    String name;
    int score;
    Student(String name, int score) { this.name = name; this.score = score; }
}
public class StreamDemo {
    static List<Integer> numbers = List.of(1,2,3,4,11,5,6,7,8,9,10,1,2,3);
    static String str = "hehllo";
    static List<String> names = List.of("Johnny", "Jane", "Jack", "Doe", "Alice", "Bob", "Charlie", "Davidaa", "Eve","Jane");
    public static void main(String[] args) {

        //only even numbers
        //numbers.stream().filter((n)->n%2==0).forEach(System.out::println);

        //max
        //numbers.stream().max(Comparator.comparingInt(n->n)).ifPresent(System.out::println);

        //sort
        //numbers.stream().sorted().forEach(System.out::println);
        //numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //names starting with J
        //names.stream().filter((name)->name.startsWith("J")).forEach(System.out::println);

        //find first non repeating character in a string
        //Arrays.stream(str.split("")).filter(c->str.indexOf(c)==str.lastIndexOf(c)).findFirst().ifPresent(System.out::println);

        //convert all strings to uppercase
        //names.stream().map(String::toUpperCase).forEach(System.out::println);

        //sum of numbers
        //int n = numbers.stream().mapToInt(Integer::intValue).sum();
        //System.out.println(n);

        //match the string
        //boolean containsJone = names.stream().anyMatch(name -> name.equalsIgnoreCase("john"));
        //System.out.println(containsJone);

        //find duplicate element
        //Set<Integer> unique = new HashSet<>();
        //numbers.stream().filter(n -> !unique.add(n)).forEach(System.out::println);

        //group strings by length
        //Map<Integer,List<String>> map =  names.stream().collect(Collectors.groupingBy(String::length));
        //System.out.println(map);

        //concatinate the strings
        //String ans = names.stream().reduce("", String::concat);
        //System.out.println(ans);

        //find sum of lenghts
        //int len = names.stream().map(String::length).reduce(0,Integer::sum);
        //System.out.println(len);


        //find the longest string
        //String ans = names.stream().reduce((w1,w2)->w1.length()>w2.length() ? w1 : w2).orElse("");
        //System.out.println(ans);


        //count frequency in string
        //String temp = "iloeqqlitttthjc";
        //Arrays.stream(temp.split("")).collect(Collectors.groupingBy(c->c,Collectors.counting())).forEach((k,v)-> System.out.println(k + " : " + v) );

        //counting fre of the string in list
        //names.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())).forEach((k,v)-> System.out.println(k + ":"+v));

        //filter null values
        //List<String> ans=  names.stream().filter(Objects::nonNull).collect(Collectors.toList());
        //System.out.println(ans);

        //average of number
        //numbers.stream().mapToInt(Integer::intValue).average().ifPresent(e -> System.out.printf("%.2f%n", e));

        //partitioning
        //Map<Boolean,List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        //System.out.println(map.get(true));

        //find largest and smallest number
        //numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);

        //find all palindromic string
        //names.stream().filter(s->s.equalsIgnoreCase((new StringBuilder(s).reverse().toString()))).forEach(System.out::println);

        //reverse all string
        //names.stream().map(s-> new StringBuilder(s).reverse().toString()).forEach(System.out::println);

        //filter and convert to map
        //Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);
        //map.entrySet().stream().filter(e->e.getValue()>10).map(Map.Entry::getKey).forEach(System.out::println);

        //get most  frequent element
        //String temp = "iloeqqlitttthjc";
        //String character = Arrays.stream(temp.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting()))
        //        .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElseThrow();
        //System.out.println(character);

        //find common elements in list
        //List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        //List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        //list1.stream().filter(list2::contains).forEach(System.out::println);

        //sum of square of even numbers
       //int ans =  numbers.stream().filter(e->e%2==0).map(s->s*s).mapToInt(Integer::intValue).sum();
       //System.out.println(ans);

        //anagram list of all anagrams
        //String s1 = "ten";
        //String s2 = "neti";
        //String ans1 = Arrays.stream(s1.split("")).sorted().map(String::toUpperCase).collect(Collectors.joining());
        //String ans2 = Arrays.stream(s2.split("")).sorted().map(String::toUpperCase).collect(Collectors.joining());
        //Boolean ans = ans1.equals(ans2);
        //System.out.println(ans);


        //find logest word in the sentence
        //String sentence = "I love programming in Java";
        //String ans = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
        //System.out.println(ans);


        //find cartesian product of 2 list
        //List<Integer> list1 = Arrays.asList(1, 2, 3);
        //List<Integer> list2 = Arrays.asList(4, 5);
        //list1.stream().flatMap(i-> list2.stream().map(j->"("+i+","+j+")")).forEach(System.out::println);

        //find 3 toppers
//        List<Student> students = Arrays.asList(
//                new Student("Alice", 85),
//                new Student("Bob", 92),
//                new Student("Charlie", 88),
//                new Student("Dave", 78),
//                new Student("Eve", 91)
//        );
        //students.stream().max(Comparator.comparingInt((Student s)->s.score)).ifPresent(e -> System.out.println(e.name +" "+e.score));
        //students.stream().sorted(Comparator.comparingInt((Student s)->s.score).reversed()).limit(3).forEach(s-> System.out.println(s.name +" "+s.score));

        //group by starting letter
        //List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry");
        //words.stream().collect(Collectors.groupingBy(e->e.charAt(0))).forEach((k,v)->System.out.println(k+" : " + v));

        //print reverse sentence
        List<String> words = Arrays.asList("Stream", "API", "is", "awesome");
        String sentence = words.stream().sorted(Collections.reverseOrder()).collect(Collectors.joining(" "));
        System.out.println(sentence);


    }
}
