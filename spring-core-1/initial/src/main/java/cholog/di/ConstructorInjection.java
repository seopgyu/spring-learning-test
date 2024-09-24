package cholog.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjection {
    private InjectionBean injectionBean;

    @Autowired // Constructor 에 어노테이션 붙여서 의존성 주입
    public ConstructorInjection(InjectionBean injectionBean){
        this.injectionBean=injectionBean;
    }
    public String sayHello() {
        return injectionBean.hello();
    }
}
