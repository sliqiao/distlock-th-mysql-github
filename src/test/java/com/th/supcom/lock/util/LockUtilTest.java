package com.th.supcom.lock.util;

import com.th.supcom.lock.util.LockUtil;

public class LockUtilTest {

    public static void main(String[] args) {
        System.out.println("当前JVM Process ID: " + LockUtil.getJvmPid());
        System.out.println("当前机器IP地址: " + LockUtil.getLocalIpByNetcard());
    }
}
