package com.beandefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class TestBeanFactoryPostprocessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("进来了");
//		GenericBeanDefinition a = (GenericBeanDefinition)
//				beanFactory.getBeanDefinition("a");
//		//打印A 的注入模型
//		System.out.println("a mode="+a.getAutowireMode());
	}
}
