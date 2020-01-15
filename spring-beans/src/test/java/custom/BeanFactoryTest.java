package custom;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {
	public static void main(String[] args) {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("custom/beanFactoryTest.xml"));
		MyTestBean myTestBean = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
		System.out.println(myTestBean.getTestStr());
	}
}
