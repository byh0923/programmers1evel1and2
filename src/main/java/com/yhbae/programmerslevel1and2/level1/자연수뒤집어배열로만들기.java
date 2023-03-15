package com.yhbae.programmerslevel1and2.level1;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        int[] answer = {};

        String tmp = Long.toString(n);

        String reverseTmp = "";
        for(int i=tmp.length()-1; i>=0; i--) {
            reverseTmp+=tmp.charAt(i);
        }

        answer = new int[reverseTmp.length()];

        for(int i=0; i<reverseTmp.length(); i++) {
            answer[i] = reverseTmp.charAt(i) - 48;
        }

        return answer;
    }

    public static void main(String[] args) {
        자연수뒤집어배열로만들기 klazz = new 자연수뒤집어배열로만들기();
        int n = 12345;

        Arrays.stream(klazz.solution(n)).forEach(s -> System.out.println(s));
    }
}
