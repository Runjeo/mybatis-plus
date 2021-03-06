package com.baomidou.mybatisplus.annotation;

import java.lang.annotation.*;

/**
 * 内置插件的一些过滤规则
 * <p>
 * 支持注解在 mapper 上以及 mapper.method 上
 * 同时存在则 mapper.method 比 mapper 优先级高
 * 各属性返回 false 表示不走插件(在配置了插件的情况下)
 *
 * @author miemie
 * @since 2020-07-31
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface InterceptorIgnore {

    /**
     * 行级租户 {@link com.baomidou.mybatisplus.extension.plugins.inner.TenantLineInnerInterceptor}
     */
    String tenantLine() default "";

    /**
     * 动态表名 {@link com.baomidou.mybatisplus.extension.plugins.inner.DynamicTableNameInnerInterceptor}
     */
    String dynamicTableName() default "";

    /**
     * 攻击 SQL 阻断解析器,防止全表更新与删除 {@link com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor}
     */
    String blockAttack() default "";

    /**
     * 垃圾SQL拦截 {@link com.baomidou.mybatisplus.extension.plugins.inner.IllegalSQLInnerInterceptor}
     */
    String illegalSql() default "";

    /**
     * 非mp提供的 {@link com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor}
     */
    String[] additional() default {};
}
