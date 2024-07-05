import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeToJson {

    public static void main(String[] args) throws JsonProcessingException {
        Employee employee = new Employee(1, "Kasun",
                "Sampath", "011-1234567");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(employee);
        System.out.println(json);
    }
}
