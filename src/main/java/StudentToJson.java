import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class StudentToJson {

    public static void main(String[] args) throws JsonProcessingException {
        Student student = new Student(1, "Tharindu", "011-1234567",
                new byte[]{25, 75, 88, -125, -65});
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(student);
        System.out.println(json);
    }
}
