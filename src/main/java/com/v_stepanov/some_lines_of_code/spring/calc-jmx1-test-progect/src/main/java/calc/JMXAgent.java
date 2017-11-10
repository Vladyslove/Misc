package calc;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class JMXAgent {
    public static void main(String[] args) throws MalformedObjectNameException,
            NotCompliantMBeanException, InstanceAlreadyExistsException,
    MBeanRegistrationException {
        // сервер для регистрации mbeans
        MBeanServer platformMBeanServer =
                ManagementFactory.getPlatformMBeanServer();
        //creation of MBean itself - with numbers intended by hardcode (1 and 2)
        CalculatorMBean calculatorMBean = new CalculatorModel(1,2);
        // definition of name for our mbean on level of JMX manager
        //          (catalog, folder, format - standard; %catalog%:name=%folder)
        ObjectName objectName = new ObjectName("calc-test-mbean:name=first-mbean");
        StandardMBean standardMBean = new StandardMBean(calculatorMBean, CalculatorMBean.class);
        platformMBeanServer.registerMBean(standardMBean, objectName);
        // it is important to understand that our program should be somehow hanging, so that we
        // can address it with help of a manager
        // therefore/that's why we will pretend 'hanging' by means of an endless loop or
        // expecting of input of any number from the keyboard
        // mbean registering
//        platformMBeanServer.registerMBean(calculatorMBean, objectName);
        for (; ;) {

        }
/*
        // Second variant with using of standard mbean. difference is absence such lines after line ObjectName ...
        StandardMBean standardMBean = new StandardMBean(calculatorMBean, CalculatorMBean.class);
        platfromMBeanServer.registerMBean(standardMBean, objectName);
*/
    }
}
