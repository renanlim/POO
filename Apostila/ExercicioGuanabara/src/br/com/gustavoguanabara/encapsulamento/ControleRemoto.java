package br.com.gustavoguanabara.encapsulamento;

public class ControleRemoto implements Controlador {
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Construtor
	public ControleRemoto(){
		this.setVolume(50);
		this.isLigado(false);
		this.isTocando(false);
	}
	//Metodos especiais
	private int getVolume() {
		return this.volume;
	}
	private void setVolume(int v) {
		this.volume = v;
	}
	private boolean isLigado() {
		return this.ligado;
	}
	private void isLigado(boolean l) {
		this.ligado = l;
	}
	private boolean isTocando() {
		return this.tocando;
	}
	private void isTocando(boolean t) {
		this.tocando = t;
	}
	//Metodos
	public void ligar() {
		if(!this.isLigado()) {
			this.isLigado(true);
		}
	}
	public void desligar() {
		if(this.isLigado()) {
			this.isLigado(false);
		}
	}
	public void abrirMenu() {
		System.out.println("--------MENU------------");
		System.out.println("Volume: "+ this.getVolume());
		System.out.println("Ligado: "+ this.isLigado());
		System.out.println("Tocando: "+ this.isTocando());
	}
	public void fecharMenu() {
		System.out.println("Menu fechado...");
	}
	public void maisVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
	}
	public void menosVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() - 1);
		}
	}
	public void ligarMudo() {
		if(this.isLigado())
			this.setVolume(0);
	}
	public void desligarMudo() {
		if(this.isLigado())
			this.setVolume(50);
	}
	public void play() {
		if(!this.isTocando())
			this.isTocando(true);
	}
	public void pause() {
		if(this.isTocando())
			this.isTocando(false);
	}
	
	
	
}
