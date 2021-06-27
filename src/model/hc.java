package model;

import com.opencsv.bean.CsvBindByPosition;

public class hc {
	
	@CsvBindByPosition(position = 1)
	private String TIPO;
	@CsvBindByPosition(position = 2)
	private String IDHC;
	@CsvBindByPosition(position = 3)
	private String IDPACIENTE;
	@CsvBindByPosition(position = 4)
	private String IDCLIENTE;
	@CsvBindByPosition(position = 5)
	private String FECHAVISITA;
	@CsvBindByPosition(position = 6)
	private String HORAVISITA;
	@CsvBindByPosition(position = 7)
	private String PESO;
	@CsvBindByPosition(position = 8)
	private String TEMPERATURA;
	@CsvBindByPosition(position = 9)
	private String IDATENDIO;
	@CsvBindByPosition(position = 10)
	private String AREALIZAR;
	@CsvBindByPosition(position = 11)
	private String DETALLE;
	
	
	public String getTIPO() {
		return TIPO;
	}
	public void setTIPO(String tIPO) {
		TIPO = tIPO;
	}
	public String getIDHC() {
		return IDHC;
	}
	public void setIDHC(String iDHC) {
		IDHC = iDHC;
	}
	public String getIDPACIENTE() {
		return IDPACIENTE;
	}
	public void setIDPACIENTE(String iDPACIENTE) {
		IDPACIENTE = iDPACIENTE;
	}
	public String getIDCLIENTE() {
		return IDCLIENTE;
	}
	public void setIDCLIENTE(String iDCLIENTE) {
		IDCLIENTE = iDCLIENTE;
	}
	public String getFECHAVISITA() {
		return FECHAVISITA;
	}
	public void setFECHAVISITA(String fECHAVISITA) {
		FECHAVISITA = fECHAVISITA;
	}
	public String getHORAVISITA() {
		return HORAVISITA;
	}
	public void setHORAVISITA(String hORAVISITA) {
		HORAVISITA = hORAVISITA;
	}
	public String getPESO() {
		return PESO;
	}
	public void setPESO(String pESO) {
		PESO = pESO;
	}
	public String getTEMPERATURA() {
		return TEMPERATURA;
	}
	public void setTEMPERATURA(String tEMPERATURA) {
		TEMPERATURA = tEMPERATURA;
	}
	public String getIDATENDIO() {
		return IDATENDIO;
	}
	public void setIDATENDIO(String iDATENDIO) {
		IDATENDIO = iDATENDIO;
	}
	public String getAREALIZAR() {
		return AREALIZAR;
	}
	public void setAREALIZAR(String aREALIZAR) {
		AREALIZAR = aREALIZAR;
	}
	public String getDETALLE() {
		return DETALLE;
	}
	public void setDETALLE(String dETALLE) {
		DETALLE = dETALLE;
	}
	
	@Override
	public String toString() {
		return "hc [TIPO=" + TIPO + ", IDHC=" + IDHC + ", IDPACIENTE=" + IDPACIENTE + ", IDCLIENTE=" + IDCLIENTE
				+ ", FECHAVISITA=" + FECHAVISITA + ", HORAVISITA=" + HORAVISITA + ", PESO=" + PESO + ", TEMPERATURA="
				+ TEMPERATURA + ", IDATENDIO=" + IDATENDIO + ", AREALIZAR=" + AREALIZAR + ", DETALLE=" + DETALLE + "]";
	}
}
