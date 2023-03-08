package co.develhope.deploy2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/")

public class BasicController {
    @RequestMapping("")
    public Integer sum(){
        Random random = new Random();
        Integer x = random.nextInt();
        Integer y = random.nextInt();;
        return x+y;
    }

}
