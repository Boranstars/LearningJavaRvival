package com.boranstars.practice;

import java.util.*;

public class Room {

    private List<Card> allCards = new ArrayList<>();

    {
        // 数字 A, 2-10, J, Q, K
        String nums[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // 花色：红心、黑桃、方块、梅花
        String colors[] = {"♥", "♠", "♦", "♣"};

        for (String num : nums) {
            for (String color : colors) {
                Card card = new Card(num, color);
                allCards.add(card);
            }
        }

        allCards.add(new Card("大王","🫅"));
        allCards.add(new Card("小王","🫅"));
        System.out.println(allCards);
    }
    public void start() {
        // 打乱牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后"+allCards);

        Map<String, List<Card>> players = new HashMap<>();

        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        players.put("A", player1);
        players.put("B", player2);
        players.put("C", player3);

        // 发牌
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card card = allCards.get(i);
            if (i % 3 == 0) {
                player1.add(card);
            }
            if (i % 3 == 1) {
                player2.add(card);
            }
            if (i % 3 == 2) {
                player3.add(card);
            }

        }

        // 拿底牌
        List<Card> lastCards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("底牌： " + lastCards);
        player3.addAll(lastCards);

        // 排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);


        // 看牌
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {

            String name = entry.getKey();
            List<Card> cards = entry.getValue();
            System.out.println(name + "拿到" + cards);
        }
    }
}
