package com.example.demo.add;

import java.util.ArrayList;
import java.util.List;

public class Add {

    public int add(int a, int b){
        return 10;
    }

    public static void main(String[] args) {
        List<Long> tagIds = new ArrayList<>();
        tagIds.add(1L);
        tagIds.add(2L);
        tagIds.add(3L);
        String condition = "";
        condition = "tag_id in (";


        StringBuilder finalCondition = new StringBuilder(condition);
        tagIds.forEach(id -> finalCondition.append(id).append(","));
        condition = finalCondition.replace(finalCondition.length() - 1, finalCondition.length(), ")").toString();
        System.out.println("======" + condition);
    }
}
