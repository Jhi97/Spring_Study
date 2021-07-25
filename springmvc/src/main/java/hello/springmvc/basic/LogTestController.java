package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    // @Slf4j 애노테이션으로 인한 생략
    /*private final Logger log = LoggerFactory.getLogger(getClass());*/

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "String";

        System.out.println("name = " + name);

        /*
        자바 언어 특성상 밑과 같이 ( + ) 연산으로 불필요한 CPU와 메모리 사용
        log.info(" trace my log = "+ name);

        따라서, 밑과 같은 식으로 로그 찍는 것을 권장함
        */

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
