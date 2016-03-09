package com.incipience.utils;

import com.incipience.anotations.Delegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by tripvi on 13/10/15.
 */
public class BaseUtility {

    private static final Logger log = LoggerFactory.getLogger(BaseUtility.class);

    Map<String,String> delegateMap = new LinkedHashMap<String,String>();

    public static void collectDelegateInformation(){

        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(true);
        String fullyQualifiedDelegateName;

        scanner.addIncludeFilter(new AnnotationTypeFilter(Delegate.class));
        String applicationContext = "com.incipience";
        for (BeanDefinition bd : scanner.findCandidateComponents(applicationContext)){
            fullyQualifiedDelegateName = bd.getBeanClassName();
            System.out.println("Loaded Command : "+fullyQualifiedDelegateName);
            log.info("Loaded Command : "+fullyQualifiedDelegateName);

        }
    }

    public static void test(){
        System.out.println("This is a test.");
    }

}
