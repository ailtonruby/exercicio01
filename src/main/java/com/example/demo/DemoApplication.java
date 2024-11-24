package com.example.demo;

import com.example.demo.Order.Order;
import com.example.demo.Services.OrderService;
import com.example.demo.Services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.example.demo"})
public class DemoApplication implements CommandLineRunner {

	public ShippingService ShippingService;

	public DemoApplication(com.example.demo.Services.ShippingService shippingService) {
		ShippingService = shippingService;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("digite o codico");
		int code = input.nextInt();
		System.out.println("digite o valor do produto");
		double basic = input.nextDouble();
		System.out.println("digite o valor do desconto");
		double discount = input.nextDouble();

		Order ordem = new Order(code, basic, discount);
		ShippingService ShippingService = new ShippingService();
		OrderService OrderService = new OrderService(ShippingService);
		System.out.println("O numemo do pedido " + ordem.getCode());
		System.out.println("Valor total " + OrderService.Service(ordem));
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner input = new Scanner(System.in);
		System.out.println("digite o codico");
		int code = input.nextInt();
		System.out.println("digite o num");
		double basic = input.nextDouble();
		System.out.println("digite o valor do desconto");
		double discount = input.nextDouble();

		Order ordem = new Order(code, basic, discount);
		ShippingService ShippingService = new ShippingService();
		OrderService OrderService = new OrderService(ShippingService);
		System.out.println("O numemo do pedido " + ordem.getCode());
		System.out.println("Valor total " + OrderService.Service(ordem));
	}
}
