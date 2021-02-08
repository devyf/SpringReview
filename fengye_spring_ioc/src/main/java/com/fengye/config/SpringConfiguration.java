package com.fengye.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  //标志注解：标志该类是Spring的核心配置类
@ComponentScan("com.fengye")  //配置注解扫描：相当于 <context:component-scan base-package="com.fengye" />
@Import({DataSourceConfiguration.class})  //导入数据源类分配置，多个class文件类以","隔开
public class SpringConfiguration {
}
