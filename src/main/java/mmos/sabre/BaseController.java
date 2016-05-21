package mmos.sabre;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ComponentScan(value = "mmos.sabre")
@EnableAutoConfiguration
public class BaseController {

    @Autowired
    private CounterBean counterBean;

    @Autowired
    private Repo repo;

    @Autowired
    private ComposableBean composableBean;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello, " + counterBean.incrementAndGet() + "th person!<br /> " + composableBean + "<br/>" + repo;
    }
}
