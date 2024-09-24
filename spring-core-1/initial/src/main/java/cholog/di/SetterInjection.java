package cholog.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetterInjection {
    private InjectionBean injectionBean;

  @Autowired // setter Method를 사용해서 의존성 주입
  public void setInjectionBean(InjectionBean injectionBean){
        this.injectionBean=injectionBean;
    }

    public String sayHello() {
        return injectionBean.hello();
    }
}
