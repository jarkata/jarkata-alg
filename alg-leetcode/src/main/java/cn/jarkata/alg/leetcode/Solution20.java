package cn.jarkata.alg.leetcode;

import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;

public class Solution20 {

    private static final Map<String, String> codeMapping = new HashMap<>();

    static {
        codeMapping.put("]", "[");
        codeMapping.put(")", "(");
        codeMapping.put("}", "{");
    }

    public static void main(String[] args) {
        String str = "][";
        int length = str.length();
        Deque<String> queue = new LinkedBlockingDeque<>();
        for (int index = 0; index < length; index++) {
            char code = str.charAt(index);
            String val = codeMapping.get(String.valueOf(code));
            if (val == null || "".equals(val)) {
                queue.push(String.valueOf(code));
            } else {
                String pop = null;
                if (queue.size() > 0) {
                    pop = queue.pop();
                }
                if (!val.equals(pop)) {
                    queue.push(String.valueOf(code));
                }
            }
        }
        queue.forEach(System.out::println);
        System.out.println(queue.size());
        System.out.println(queue.size() == 0);
    }


}
