package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointCut {
    private static final Logger logger = LoggerFactory.getLogger(PointCut.class);

    @Pointcut("execution(* controller.HelloController())")
    public void pointCut(){}

    @Before(value = "pointCut()")
    public void before() {
        logger.info("正在执行");
    }
}
