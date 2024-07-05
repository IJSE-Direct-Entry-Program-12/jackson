import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public record Order (Integer id,
                     String customerName,
                     BigDecimal total,
                     @JsonFormat(pattern = "yyyy-MM-dd")
                     LocalDate date) {
}
