package hello.core;

import hello.core.Member.*;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Member member = new Member(1L,"이범기",Grade.VIP);
        memberService.join(member);

        Order order =  orderService.createOrder(1L,"피자",8000);

    }


}
