package com.neu.cap6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class JamesImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //不能返回null 否则会触发源码中List<SourceClass> annotatedClasses = new ArrayList<>(classNames.length); 异常
//        return null;
        return new String[]{"com.neu.cap6.bean.Fish"};
    }
}
