package Assignment2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Scanner;

@RestController
public class UserValidationController
{
    @RequestMapping(value = "/validate/{username}/{password}",method = RequestMethod.GET)
    public String validateUser(@PathVariable String  username, @PathVariable String password)
    {
        if(username.equals("Shivanshkumar") && password.equals("ricky2"))
            return "Valid User";
        else
            return "Invalid User";
    }
}
