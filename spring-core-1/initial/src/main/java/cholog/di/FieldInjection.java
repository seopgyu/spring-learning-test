package cholog.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FieldInjection {


    @Autowired // 변수 선언부에 어노테이션 붙여 의존성 주입
    private InjectionBean injectionBean;

    public String sayHello() {
        return injectionBean.hello();
    }
}
