package com.zs.day11.pack3;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zs.day11.pack1.Investor;
import com.zs.day11.pack1.Member;

public class Success_Test extends BaseTest {
    Member zs = null;
    @BeforeClass
    public void beforeClass(){
        zs= new Investor();
    }

    @Test // 测试
    public void fun1() {
        // 创建一个投资人，
        double before = zs.getMoney();
        // 充值100
        zs.recharge(100);
        double after = zs.getMoney();// 1.实际结果
        // 2.预期结果：：： // 3.对比
        double as = before + 100;
        boolean b = (after == as);
        Assert.assertTrue(b);

    }

    @Test
    public void fun4() {
        double before = zs.getMoney();
        // 充值100000
        zs.recharge(100000);
        double after = zs.getMoney();
        boolean b = (after == (before + 100000));
        Assert.assertTrue(b);
    }

    @Test
    public void fun5() {
        double before = zs.getMoney();
        // 充值100001
        zs.recharge(100001);
        double after = zs.getMoney();
        boolean b = (after == before);
        Assert.assertTrue(b);
    }

}
