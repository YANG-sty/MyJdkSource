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
        hashMap.put("111", "");
        String s = hashMap.putIfAbsent("hehe", "213");
        String s1 = hashMap.putIfAbsent("111", "222");
       /* if ("a".equals("b")) {

        }*/

        String name = "xiaoming";
        int i = name.hashCode();

        Number age = 12;
        int i1 = age.hashCode();

        String name2 = "小明";
        int i2 = name2.hashCode();


        System.out.println(hashMap.toString());

    }
}
