package model;

public class Veiculo{
	private String chassi; //Chassi do Ve�culo
	private String marca; //Marca do Ve�culo
	private String cor; // Cor do Ve�culo
	private String placa; // Placa do Ve�culo
	private String tipoMarcha; //Autom�tico ou manual
	private Integer potencia; //Quantidade de cavalos do ve�culo
	private Integer ano; // Ano do Ve�culo
	private Float preco; // Pre�o do Ve�culo
	private Float kilometragem; //Km's rodas por ve�culo
	
	
	//M�TODO CONSTRUTOR
	public Veiculo(String chassi, String marca, Integer ano, Float preco) {
		super();
		setChassi(chassi);
		setMarca(marca);
		setAno(ano);
		setPreco(preco);
	}
	
	//CONSTRUTOR SEM PARAMETROS
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}
	
	//GET-SET Chassi
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
			this.chassi = chassi;
	}
	//---------------------------
	
	//GET-SET Marca
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
			this.marca = marca;
	}
	//---------------------------
	
	//GET-SET Ano
	public Integer getAno() {
		return ano;
	}
	public boolean setAno(Integer ano) {
		if(ano > 1900) {
			this.ano = ano;
		return true;
		}
			else {
				return false;
			}
	}
	//---------------------------
	
	//GET-SET Preco
	public Float getPreco() {
		return preco;
	}
	public boolean setPreco(Float preco) {
		if(preco > 0) {
			this.preco = preco;
		return true;
		}
			else {
				return false;
			}
	}

	//-------------------------------------------
	
	//GET-SET Cor do Ve�culo
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	//-------------------------------------------
	
	//GET-SET Placa do Ve�culo
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	//-------------------------------------------
	
	//GET-SET Tipo da marcha do Ve�culo
	public String getTipoMarcha() {
		return tipoMarcha;
	}

	public void setTipoMarcha(String tipoMarcha) {
		this.tipoMarcha = tipoMarcha;
	}

	//-------------------------------------------
	
	//GET-SET Pot�ncia do Ve�culo
	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	//-------------------------------------------
	
	//GET-SET Kilometragem do Ve�culo
	public Float getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(Float kilometragem) {
		this.kilometragem = kilometragem;
	}
	
	
	
}
