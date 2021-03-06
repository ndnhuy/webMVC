//
// Copyright (c) 2015 KMS Technology.
//
package vn.kms.launch.basicwebapp.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(TYPE)
@Retention(RUNTIME)
public @interface Column {
    /**
     * (Optional) The name of the column.
     * <p/>
     * Defaults to the entity name.
     */
    String name() default "";
}
