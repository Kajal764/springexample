package bridge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
//        Sim sim=new Airtel();
//        sim.m1();
//        sim.m2();

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        Airtel airtel = (Airtel) context.getBean("airtel");
//        airtel.m1();

//
        Sim sim=context.getBean("sim",Sim.class);
        sim.m1();

    }
}
//bridge.Vodaphone
