package com.sam.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Doc {
    /** Description of Class or Method. */
    String desc() default "";

    /** Description of Parameters, if the annotated element is a method & has parameters. */
    String [] params() default {};

    /** Description of return value, if the annotated element is a method and isn't void. */
    String returnVal() default "";
}
