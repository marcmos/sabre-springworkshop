package mmos.sabre;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ComponentScan(value = "mmos.sabre")
@EnableAutoConfiguration
public class BaseController {

    @Autowired
    private CounterBean counterBean;

    @Resource(name = "inMemoryRepo")
    private Repo repo;

    @Autowired
    private ComposableBean composableBean;

    @Autowired
    private PrototypeBean prototypeBean;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello, " + counterBean.incrementAndGet() + "th person!<br/> " + composableBean + "<br/>" +
                "Repo: " + repo + "<br/>" +
                "PrototypeBean from BaseController: " + prototypeBean + "<br/>" +
                "PrototypeBean form ComposableBean" + composableBean.getPrototypeInfo();
    }
}
