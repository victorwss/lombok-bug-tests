//import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import lombok.experimental.Wither;

@Value
@Wither
@Getter
@AllArgsConstructor
//@SuppressFBWarnings({"ES_COMPARING_PARAMETER_STRING_WITH_EQ", "RC_REF_COMPARISON"})
public class Example {
    String element1;
    Integer element2;
}