url: https://leetcode.com/problems/encode-and-decode-tinyurl/


/**Approach 1**/
public class Codec {

    Map<String,String> map=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String tinyUrl=java.util.UUID.randomUUID().toString();
        map.put(tinyUrl,longUrl);
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

/**Approach 2**/
public class Codec {

    Map<String,String> map=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String tinyUrl="";
        tinyUrl+=longUrl.hashCode();
        map.put(tinyUrl,longUrl);
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
