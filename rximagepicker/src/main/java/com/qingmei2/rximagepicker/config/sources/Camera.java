package com.qingmei2.rximagepicker.config.sources;

import com.qingmei2.rximagepicker.core.DefaultImagePicker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation will be marked open Gallery，it will conflict with {@link Gallery}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Camera {

    String pickerView() default DefaultImagePicker.DEFAULT_PICKER;

}
