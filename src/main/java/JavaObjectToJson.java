import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JavaObjectToJson {

    public static void main(String[] args) throws JsonProcessingException {
        Customer customer = new Customer(1, "Kasun Sampath", "Galle");
//        String json = """
//                {
//                "id": %s,
//                "name": "%s",
//                "address": "%s",
//                }
//                """.formatted(customer.getId(), customer.getName(), customer.getAddress());
//        System.out.println(json);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = mapper.writeValueAsString(customer);
        System.out.println(json);

        /* This should be your last option */
        Map<String, Object> properties = new LinkedHashMap<>();
        properties.put("id", customer.getId());
        properties.put("name", customer.getName());
        properties.put("address", customer.getAddress());
        String json2 = mapper.writeValueAsString(properties);
        System.out.println(json2);
    }
}
