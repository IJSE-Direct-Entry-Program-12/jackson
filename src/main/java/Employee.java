import com.fasterxml.jackson.annotation.JsonProperty;

public record Employee(Integer id,
                       @JsonProperty("first_name") String firstName,
                       @JsonProperty("last_name") String lastName,
                       String contact) {
}
