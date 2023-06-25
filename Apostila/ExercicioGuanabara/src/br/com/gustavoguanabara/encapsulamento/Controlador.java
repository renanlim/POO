package br.com.gustavoguanabara.encapsulamento;

public interface Controlador {
	//Metodos abstratos
	public abstract void ligar();
	public abstract void desligar();
	public abstract void fecharMenu();
	public abstract void abrirMenu();
	public abstract void maisVolume();
	public abstract void menosVolume();
	public abstract void play();
	public abstract void pause();
}
