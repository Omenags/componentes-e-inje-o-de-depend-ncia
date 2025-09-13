package com.omenaguilherme.desafio;

import com.omenaguilherme.desafio.entities.Order;
import com.omenaguilherme.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	Scanner sc = new Scanner(System.in);

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Código: ");
		int code = sc.nextInt();
		System.out.print("Valor básico:");
		double basic = sc.nextDouble();
		System.out.print("Porcentagem de desconto");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total " + orderService.total(order));
		sc.close();
	}
}
