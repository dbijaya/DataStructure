package streams.creation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FromCollectionOrIterator {
    public static void main(String[] args) {
        Collection<String> strings = List.of("one", "two", "three", "four", "five");
        Iterator<String> iterator = strings.iterator();

        long estimateSize =  3L;
        int characteristics = 0;
        Spliterator<String> spliterator = Spliterators.spliterator(strings.iterator(), estimateSize, characteristics);

        boolean parallel = false;
        Stream<String> stream = StreamSupport.stream(spliterator, parallel);
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }
}
