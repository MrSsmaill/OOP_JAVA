package dz_5.Controller;

import dz_5.Service.Service;
import dz_5.View.View;

import java.util.List;

public class Controller {
    public static void click(){
        String line = View.inExpression();
        List<String> list = Service.parsOperatrs(line);
        View.result("%s = %.2f".formatted(line,Service.result(list)));

    }
}
