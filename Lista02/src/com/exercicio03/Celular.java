package com.exercicio03;

public class Celular {
	private String usuario;
	private int identificador;
	private boolean celular;
	private Bateria bateria;
	
	public Celular(String usuario, int identificador, Bateria bateria) {
		this.usuario = usuario;
		this.identificador = identificador;
		this.bateria = bateria;
	}

	public String getUsuario() {
		return usuario;
	}

	public int getIdentificador() {
		return identificador;
	}

	public Bateria getBateria() {
		return bateria;
	}
	
	public void ligarCelular() {
		if (bateria.getCarga() > 20) {
			bateria.descarga();
			bateria.descarga();
			System.out.println("Usu�rio: " + usuario);
			celular = true;
		}else {
			System.out.println("Bateria Fraca");
		}
	}
	
	public void desligarCelular() {
		System.out.println("Desligando ....");
		bateria.descarga();
		celular = false;
	}
	
	public void somLigado() {
		if (celular = true && bateria.getCarga() >= 10) {
			System.out.println("Som ligadfo ....");
		}
	}
		
	public void mostrarCelular() {
		System.out.println("Usu�rio: " + usuario);
		System.out.println("N�mero identificador: " + identificador);
		bateria.mostrarCarga();
		System.out.println("------------------------------------------");
	}
	
}
