package polymorphism.moreInterf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
public @interface myAnnotation {
int value() default 5;
}
