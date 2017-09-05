package com.wrap;

import java.util.*;

/**
 * Created by admin on 2017/9/5.
 */
public class Dictionary {
    private static Map<String, List<String>> map = new HashMap<>();
    static {
        map.put("送审状态", Arrays.asList("未送审", "已送审"));
        map.put("审核状态", Arrays.asList("等待审核", "初审中", "初审不通过", "复审中", "复审不通过", "复审通过"));
    }

    private String type;
    private Integer index;

    public Dictionary(String type, Integer index) {
        this.type = type;
        this.index = index;
    }

    public String getValue() {
        List<String> list = map.get(type);
        if (list == null) {
            return "";
        }
        if (list.size() <= index) {
            return "";
        }
        return list.get(index);
    }
}
