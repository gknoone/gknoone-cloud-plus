package com.gknoone.cloud.plus.gateway.predicates;

import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.function.Predicate;

/**
 * 检查Auth断言工厂
 *
 * @author gknoone
 * @date 2019-08-05 15:49
 */
@Component
public class CheckAuthRoutePredicateFactory extends AbstractRoutePredicateFactory<CheckAuthRoutePredicateFactory.Config> {
    public CheckAuthRoutePredicateFactory() {
        super(Config.class);
    }

    private final static String AUTH_NAME = "gknoone";

    @Getter
    @Setter
    static class Config{
        private String name;
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return serverWebExchange -> {
            System.err.println(String.format("进入了CheckAuthRoutePredicateFactory\t%s", config.getName()));
            return AUTH_NAME.equals(config.getName());
        };
    }
}