package com.xlaser.junit.standard;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @package: com.xlaser.junit.standard
 * @author: Elijah.D
 * @time: 2019/12/3 10:55
 * @description: junit5
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class DisabledTest {
    @Disabled("测试:Disabled on method!")
    @Test
    public void skipTest() {
        System.out.println("skipped!");
    }

    @Test
    public void notSkipTest() {
        System.out.println("run!");
    }
}
