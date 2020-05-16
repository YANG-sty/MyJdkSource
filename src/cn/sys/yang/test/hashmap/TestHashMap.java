package cn.sys.yang.test.hashmap;

import java.util.HashMap;

/**
 * Create by yang_zzu on 2020/5/15 on 20:36
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("haha", "哈哈");
        hashMap.put("xixi", "嘻嘻");
        hashMap.put("hehe", "呵呵");

        System.out.println(hashMap.toString());

    }
}
