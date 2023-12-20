package OriginName.Service;

import lombok.experimental.UtilityClass;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
@UtilityClass
public class UrlEncoding {

    // Method to encode a string value using `UTF-8` encoding scheme
    public static String encodeValue(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }
}
