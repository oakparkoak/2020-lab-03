package com.xlaser4j.junit.category;

import cn.hutool.core.lang.Console;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @package: com.xlaser4j.junit.category
 * @author: Elijah.D
 * @time: 2019/11/25 10:41
 * @description: 测试categories注解在类上
 * @modified: Elijah.D
 */
@Category({SlowTests.class})
public class CategoryB {
    @Test
    public void testB() {
        Console.log("【testB】:{}", true);
    }
}
