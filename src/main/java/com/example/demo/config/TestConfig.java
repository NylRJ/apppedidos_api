package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.modelo.negocio.Cachaca;
import com.example.demo.modelo.negocio.Cerveja;
import com.example.demo.modelo.negocio.Cliente;
import com.example.demo.modelo.negocio.Comanda;
import com.example.demo.modelo.negocio.Produto;
import com.example.demo.modelo.repository.IClienteRepository;
import com.example.demo.modelo.repository.IComandaRepository;

@Configuration
@Profile("dev")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private IComandaRepository comandaRp;
	
	@Autowired
	private IClienteRepository clienteRp;

	@Override
	public void run(String... args) throws Exception {
		
		
		Cliente cliente1 = new Cliente(null,"cliente1");
		Comanda comanda1 = new Comanda(null,"comanda1");
		comanda1.setcliente(cliente1);
		
		
		Cliente cliente2 = new Cliente(null,"cliente2");
		Comanda comanda2 = new Comanda(null,"comanda2");
		comanda2.setcliente(cliente2);
		
		
		Cliente cliente3 = new Cliente(null,"cliente3");
		Comanda comanda3 = new Comanda(null,"comanda3");
		comanda3.setcliente(cliente3);
		
		Cliente cliente4 = new Cliente(null,"cliente4");
		Comanda comanda4 = new Comanda(null,"comanda4");
		comanda4.setcliente(cliente4);
	
		
		
		comandaRp.saveAll(Arrays.asList(comanda1));
		comandaRp.saveAll(Arrays.asList(comanda2));
		comandaRp.saveAll(Arrays.asList(comanda3));
		comandaRp.saveAll(Arrays.asList(comanda4));
	}
}
