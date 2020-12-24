bean注入IOC容器流程：
1：org.springframework.context.support.AbstractApplicationContext.getBean(java.lang.String)
 ->2:org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean
   2.1)transformedBeanName(name):解析beanName别名
   2.2)getSingleton(java.lang.String) 尝试从单例缓存池获取对象
   2.3)getParentBeanFactory() 判断有无父工厂
   2.4)getMergedLocalBeanDefinition(beanName) bean定义获取
   2.5)checkMergedBeanDefinition(mbd, beanName, args);bean抽象校验
   2.6)DependsOn 优先级校验
   2.7)org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(java.lang.String, org.springframework.beans.factory.ObjectFactory<?>)
       

