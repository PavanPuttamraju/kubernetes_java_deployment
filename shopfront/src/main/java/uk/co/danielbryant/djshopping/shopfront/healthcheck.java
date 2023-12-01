package uk.co.danielbryant.djshopping.shopfront;
 
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class healthcheck {
    @GetMapping("/shopfronthealthcheck")
    public String healthcheck() {
        return "Hello User this response from ShopFront !! " + new Date();
    }
}
