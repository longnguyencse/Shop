package bebee.shop.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nqlong on 21-Sep-17.
 */
@Controller
public class IndexController {
    @GetMapping("/")
    String index() {
        return "index";
    }
}
