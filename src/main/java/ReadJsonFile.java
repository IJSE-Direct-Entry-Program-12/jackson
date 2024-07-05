import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ReadJsonFile {

    public static void main(String[] args) throws IOException {
        InputStream is = ReadJsonFile.class.getResourceAsStream("/todos.json");
        ObjectMapper mapper = new ObjectMapper();
//        TodoItem[] todoItems = mapper.readValue(is, TodoItem[].class);
//        for (TodoItem todoItem : todoItems) {
//            System.out.println(todoItem);
//        }

        /* In Java, the following syntax is not valid. Even if it is valid, it doesn't matter
         * because the diamond syntax will be erased at the compile-time by the compiler during the
         * type erasure process. */

//        ArrayList<TodoItem> todoItems = mapper.readValue(is, ArrayList<TodoItem>.class);

        /* Here we take the advantage of the inheritance. We have created an anonymous inner class here
         * by extending the abstract class 'TypeReference'. Now Java compiler can't erase these type
         * parameters at the compile-time because JVM needs these type information at run-time process it
         * properly. Otherwise, JVM will not be able to recognize the differences between subclasses */

        ArrayList<TodoItem> todoItems = mapper.readValue(is, new TypeReference<ArrayList<TodoItem>>() {});

//        for (int i = 0; i < todoItems.size(); i++) {
//            System.out.println(todoItems.get(i));
//        }
        for (TodoItem todoItem : todoItems) {
            System.out.println(todoItem);
        }
    }
}
