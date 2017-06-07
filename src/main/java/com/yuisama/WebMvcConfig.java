package com.yuisama;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by yuisama on 2017/6/6.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{
//    @Bean
//    public MultipartConfigElement multipartResolver(){
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        // 设置文件大小限制 ,超出设置页面会抛出异常信息，
//        // 这样在文件上传的地方就需要进行异常信息的处理了;
//        factory.setMaxFileSize("256KB"); // KB,MB
//        /// 设置总上传数据总大小
//        factory.setMaxRequestSize("512KB");
//        // Sets the directory location where files will be stored.
//        // factory.setLocation("路径地址");
//        return factory.createMultipartConfig();
//    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/toUpload").setViewName("/test");
    }
}
