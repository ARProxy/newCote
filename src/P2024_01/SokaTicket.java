package P2024_01;

import java.util.HashMap;
import java.util.Map;

public class SokaTicket {
    public static int getMaxGoldTickets(String[] tickets, int roll, String[][] shop, int money) {
        Map<String, Integer> ticketPrices = new HashMap<>();
        String minTicket = getCheapestTicketInfo(tickets, ticketPrices);

        // 모든 티켓 구매 및 가장 저렴한 티켓만 구매하는 방식 실행
        int goldTicketsAll = buyAllTicketsAndCalculateGold(shop, ticketPrices, roll, money);
        int goldTicketsMinOnly = buyMinPriceTicketsAndCalculateGold(shop, ticketPrices, roll, money, minTicket);

        // 두 방식의 결과 중 최대값 반환
        return Math.max(goldTicketsAll, goldTicketsMinOnly);
    }

    // 가장 저렴한 티켓 정보를 찾고, 맵에 티켓 가격 저장
    private static String getCheapestTicketInfo(String[] tickets, Map<String, Integer> ticketPrices) {
        String minTicket = "";
        int minPrice = Integer.MAX_VALUE;
        for (String t : tickets) {
            String[] parts = t.split(" ");
            int price = Integer.parseInt(parts[1]);
            ticketPrices.put(parts[0], price);
            if (price < minPrice) {
                minPrice = price;
                minTicket = parts[0];
            }
        }
        return minTicket;
    }

    // 모든 티켓을 구매하는 방식으로 황금 티켓 계산
    private static int buyAllTicketsAndCalculateGold(String[][] shop, Map<String, Integer> ticketPrices, int roll, int money) {
        int totalNormalTickets = 0;
        for (int i = 0; i < shop.length; i++) {
            money = updateMoneyForNextShop(money, roll, i);
            for (String ticket : shop[i]) {
                if (money >= ticketPrices.get(ticket)) {
                    money -= ticketPrices.get(ticket);
                    totalNormalTickets++;
                }
            }
        }
        return totalNormalTickets / 3;
    }

    // 가장 저렴한 티켓만 구매하는 방식으로 황금 티켓 계산
    private static int buyMinPriceTicketsAndCalculateGold(String[][] shop, Map<String, Integer> ticketPrices, int roll, int money, String minTicket) {
        int bTickets = 0;
        for (int i = 0; i < shop.length; i++) {
            money = updateMoneyForNextShop(money, roll, i);
            for (String ticket : shop[i]) {
                if (minTicket.equals(ticket) && money >= ticketPrices.get(minTicket)) {
                    money -= ticketPrices.get(minTicket);
                    bTickets++;
                }
            }
        }
        return bTickets / 3;
    }

    // 상점 새로고침 비용을 고려하여 다음 상점으로 넘어가기 위한 자금 업데이트
    private static int updateMoneyForNextShop(int money, int roll, int shopIndex) {
        if (shopIndex > 0) {
            money -= roll;
        }
        return money;
    }

    public static void main(String[] args) {
        String[] tickets = {"A 2", "B 1"};
        String[][] shop = {{"A", "A", "A"}, {"A", "B", "B"}, {"A", "B", "B"}, {"A", "B", "B"}};
        int roll = 5;
        int money = 19;

        int result = getMaxGoldTickets(tickets, roll, shop, money);
        System.out.println("Maximum gold tickets: " + result);
    }
}

//
//import java.util.HashMap;
//import java.util.Map;
//
//public class SokaTicket {
//    public static int getMaxGoldTickets(String[] tickets, int roll, String[][] shop, int money) {
//        Map<String, Integer> ticketPrices = new HashMap<>();
//        String minTicket = ""; // 가장 저렴한 티켓의 이름을 저장할 변수 초기화
//        int minPrice = Integer.MAX_VALUE; // 가장 낮은 가격을 저장할 변수 초기화
//        for (String t : tickets) {
//            String[] parts = t.split(" ");
//            int price = Integer.parseInt(parts[1]);
//            ticketPrices.put(parts[0], price);
//            if (price < minPrice) {
//                minPrice = price;
//                minTicket = parts[0]; // 현재 티켓의 이름(대문자 알파벳)을 minTicket에 저장
//            }
//        }
//
//        // 첫 번째 방식 실행: 모든 티켓 구매
//        int moneyForAllTickets = money; // 첫 번째 방식을 위한 자금 복사
//        int totalNormalTickets = 0;
//        for (int i = 0; i < shop.length && moneyForAllTickets >= 0; i++) {
//            if (i > 0) { // 상점 새로고침
//                moneyForAllTickets -= roll;
//            }
//            for (String ticket : shop[i]) {
//                int price = ticketPrices.get(ticket);
//                if (moneyForAllTickets >= price) {
//                    moneyForAllTickets -= price;
//                    totalNormalTickets++;
//                }
//            }
//        }
//        int goldTicketsAll = totalNormalTickets / 3; // 모든 티켓 구매 시 황금 티켓 수
//
//        // 두 번째 방식 실행: "B" 티켓만 구매
//        int moneyForBTickets = money; // 두 번째 방식을 위한 자금 복사
//        int bTickets = 0;
//
//        for (String[] currentShop : shop) {
//            boolean bTicketAvailable = false;
//            for (String ticket : currentShop) {
//                if (minTicket.equals(ticket) && moneyForBTickets >= ticketPrices.get(minTicket)) {
//                    moneyForBTickets -= ticketPrices.get(minTicket);
//                    bTickets++;
//                    bTicketAvailable = true;
//                }
//            }
//            if (!bTicketAvailable && moneyForBTickets >= roll) {
//                moneyForBTickets -= roll;
//            }
//        }
//        int goldTicketsBOnly = bTickets / 3; // "B" 티켓만 구매 시 황금 티켓 수
//
//        return Math.max(goldTicketsAll, goldTicketsBOnly);
//    }
//
//    public static void main(String[] args) {
//        String[] tickets = {"A 2", "B 1"};
//        String[][] shop = {{"A", "A", "A"}, {"A", "B", "B"}, {"A", "B", "B"}, {"A", "B", "B"}};
////        String[] tickets = {"A 2", "B 1"};
////        String[][] shop = {{"A", "A", "A"}, {"A", "B", "B"}, {"A", "B", "B"}, {"A", "B", "B"}};
//        int roll = 5;
//        int money = 19;
//
//        int result = getMaxGoldTickets(tickets, roll, shop, money);
//        System.out.println("Maximum gold tickets: " + result); // 기대 결과: 최대 황금 티켓 수
//    }
//}
////
////import java.util.HashMap;
////import java.util.Map;
////
////public class SokaTicket {
////    public static int getMaxGoldTickets(String[] tickets, int roll, String[][] shop, int money) {
////        Map<String, Integer> ticketPrices = new HashMap<>();
////        for (String t : tickets) {
////            String[] parts = t.split(" ");
////            ticketPrices.put(parts[0], Integer.parseInt(parts[1]));
////        }
////
////        int totalGoldTickets = 0;
////        int totalNormalTickets = 0;
////
////        for (int i = 0; i < shop.length && money >= 0; i++) {
////            if (i > 0) { // 상점 새로고침
////                money -= roll;
////            }
////
////            for (String ticket : shop[i]) {
////                int price = ticketPrices.get(ticket);
////                if (money >= price) {
////                    money -= price;
////                    totalNormalTickets++; // 일반 티켓 구매
////                    System.out.println(totalNormalTickets);
////                }
////            }
////
////        }
////
////        return totalGoldTickets;
////    }
////
////    public static void main(String[] args) {
////        String[] tickets = {"A 2", "B 1",};
////        String[][] shop = {{"A", "A", "A"}, {"A", "B", "B"}, {"A", "B", "B"}, {"A", "B", "B"}};
////        int roll = 1;
////        int money = 9;
////
////        int result = getMaxGoldTickets(tickets, roll, shop, money);
////        System.out.println("Maximum gold tickets: " + result);
////    }
////}
////import java.util.HashMap;
////import java.util.Map;
////
////public class SokaTicket {
////    public static int getMaxGoldTickets(String[] tickets, int roll, String[][] shop, int money) {
////        Map<String, Integer> ticketPrices = new HashMap<>();
////        for (String t : tickets) {
////            String[] parts = t.split(" ");
////            ticketPrices.put(parts[0], Integer.parseInt(parts[1]));
////        }
////
////        int totalGoldTickets = 0;
////        int bTickets = 0;
////
////        for (String[] currentShop : shop) {
////            boolean bTicketAvailable = false;
////            for (String ticket : currentShop) {
////                if ("B".equals(ticket) && money >= ticketPrices.get("B")) {
////                    money -= ticketPrices.get("B");
////                    bTickets++;
////                    bTicketAvailable = true;
////                }
////            }
////            if (!bTicketAvailable && money >= roll) {
////                // "B" 티켓을 구매할 수 없으면 새로고침 비용을 고려해 다음 상점으로 넘어갑니다.
////                money -= roll;
////            }
////        }
////
////        // "B" 티켓으로 황금 티켓 교환
////        totalGoldTickets += bTickets / 3;
////
////        return totalGoldTickets;
////    }
////
////    public static void main(String[] args) {
////        String[] tickets = {"A 2", "B 1"};
////        String[][] shop = {{"A", "A", "A"}, {"A", "B", "B"}, {"A", "B", "B"}, {"A", "B", "B"}};
////        int roll = 1;
////        int money = 9;
////
////        int result = getMaxGoldTickets(tickets, roll, shop, money);
////        System.out.println("Maximum gold tickets: " + result); // 예상 결과: 2
////    }
////}