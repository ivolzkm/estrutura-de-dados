package model;


public class Tarefa {
	private int id;
	private int tempo;
	private String nome;		

	public Tarefa(int id, int tempo, String nome) {
		super();
		this.id = id;
		this.tempo = tempo;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
		
	}



