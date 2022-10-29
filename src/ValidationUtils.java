public class ValidationUtils {
    protected static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        }else{
            return value;
        }
    }
}
