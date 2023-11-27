package com.gregory.strconsumer.listener.custom;

import org.springframework.core.annotation.AliasFor;
import org.springframework.kafka.annotation.KafkaListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@KafkaListener
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StringConsumerCustom {

    @AliasFor(annotation = KafkaListener.class, attribute = "topics")
    String[] topics() default "first-topic";

    @AliasFor(annotation = KafkaListener.class, attribute = "containerFactory")
    String containerFactories() default "containerFactory";

    @AliasFor(annotation = KafkaListener.class, attribute = "groupId")
    String groupIds() default "";

}
