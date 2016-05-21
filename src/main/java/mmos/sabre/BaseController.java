package mmos.sabre;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BaseController {
    @Autowired
    private CounterBean counterBean;

    @Resource(name = "${repoName}")

    private Repo repo;

    @Autowired
    private ComposableBean composableBean;

    @Autowired
    private PrototypeBean prototypeBean;

    @Autowired
    private ApplicationContextAwareMonitor applicationContextAwareMonitor;

    @Autowired
    private Passenger passenger;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        StringBuilder sb = new StringBuilder();
        for(String bean: applicationContextAwareMonitor.getAllBeans()) {
            sb.append("Bean: " + bean + "<br/>");
        }

        return "Hello, " + counterBean.incrementAndGet() + "th person!<br/> " + composableBean + "<br/>" +
                "Repo: " + repo + "<br/>" +
                "PrototypeBean from BaseController: " + prototypeBean + "<br/>" +
                "PrototypeBean form ComposableBean" + composableBean.getPrototypeInfo() +
                "AppCtxAwareMon: " + sb.toString() +
                "Passenger: " + passenger.toString();
    }
}
