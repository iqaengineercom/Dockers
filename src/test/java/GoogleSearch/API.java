package GoogleSearch;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;
import com.restfb.types.User;
import org.junit.Assert;
import org.junit.Test;

public class API {
@Test
    public static void main (String[] args ){

        String accessToken = "EAAJQdqMNCVYBAC3naZCqLGPuROF11OWJYQs7miAiDfXd33OjDYToYhZCGY2b6Jk1OoG0dWSvut5Dxkwrz5SWPaMDRFKMrcqANj9AdvA1HdjeEPznBA4vLGGrHc3nAhZBwCj27ZA0JGtDjNo989pmzfad1SwAO8YsSnXZAG5THhZCVt0UEehaZA8bO4eqNH6Hy7LzXiI7ecwtXhL7Az9R4Xo3qiAIHKBYv4ZD";
        FacebookClient fbClient = new DefaultFacebookClient(accessToken, Version.LATEST);
        User user = fbClient.fetchObject("me",User.class);
        System.out.println("UserName= "+ user.getName());
        Assert.assertEquals(user,"Victor Teste");


    }
}
