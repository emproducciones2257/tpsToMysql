package model;

import com.opencsv.bean.CsvBindByPosition;

public class vacuna {
	
	@CsvBindByPosition(position = 1)
	private String IDHC;
	@CsvBindByPosition(position = 2)
	private String IDPACIENTE;
	@CsvBindByPosition(position = 3)
	private String IDCLIENTE;
	@CsvBindByPosition(position = 4)
	private String FECHAVISITA;
	@CsvBindByPosition(position = 5)
	private String RESALTADO;
	@CsvBindByPosition(position = 6)
	private String FECHAPROXIMA;
	@CsvBindByPosition(position = 7)
	private String INCLUIR;
	@CsvBindByPosition(position = 8)
	private String IDITEM;
	@CsvBindByPosition(position = 9)
	private String IDRUBRO;
	@CsvBindByPosition(position = 10)
	private String IMAGEN;
	@CsvBindByPosition(position = 11)
	private String IMAGENTIPO;
	@CsvBindByPosition(position = 12)
	private String OBSERVACION;
	@CsvBindByPosition(position = 13)
	private String PRECIO;
	@CsvBindByPosition(position = 14)
	private String CANTIDA;
	@CsvBindByPosition(position = 15)
	private String TOTAL;
	@CsvBindByPosition(position = 16)
	private String FACTURAR;
	@CsvBindByPosition(position = 17)
	private String NROFACTURA;
	@CsvBindByPosition(position = 18)
	private String IDATENDIDO;
	@CsvBindByPosition(position = 19)
	private String AREALIZAR;
	@CsvBindByPosition(position = 20)
	private String NUMERO;
	
	
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
	public String getRESALTADO() {
		return RESALTADO;
	}
	public void setRESALTADO(String rESALTADO) {
		RESALTADO = rESALTADO;
	}
	public String getFECHAPROXIMA() {
		return FECHAPROXIMA;
	}
	public void setFECHAPROXIMA(String fECHAPROXIMA) {
		FECHAPROXIMA = fECHAPROXIMA;
	}
	public String getINCLUIR() {
		return INCLUIR;
	}
	public void setINCLUIR(String iNCLUIR) {
		INCLUIR = iNCLUIR;
	}
	public String getIDITEM() {
		return IDITEM;
	}
	public void setIDITEM(String iDITEM) {
		IDITEM = iDITEM;
	}
	public String getIDRUBRO() {
		return IDRUBRO;
	}
	public void setIDRUBRO(String iDRUBRO) {
		IDRUBRO = iDRUBRO;
	}
	public String getIMAGEN() {
		return IMAGEN;
	}
	public void setIMAGEN(String iMAGEN) {
		IMAGEN = iMAGEN;
	}
	public String getIMAGENTIPO() {
		return IMAGENTIPO;
	}
	public void setIMAGENTIPO(String iMAGENTIPO) {
		IMAGENTIPO = iMAGENTIPO;
	}
	public String getOBSERVACION() {
		return OBSERVACION;
	}
	public void setOBSERVACION(String oBSERVACION) {
		OBSERVACION = oBSERVACION;
	}
	public String getPRECIO() {
		return PRECIO;
	}
	public void setPRECIO(String pRECIO) {
		PRECIO = pRECIO;
	}
	public String getCANTIDA() {
		return CANTIDA;
	}
	public void setCANTIDA(String cANTIDA) {
		CANTIDA = cANTIDA;
	}
	public String getTOTAL() {
		return TOTAL;
	}
	public void setTOTAL(String tOTAL) {
		TOTAL = tOTAL;
	}
	public String getFACTURAR() {
		return FACTURAR;
	}
	public void setFACTURAR(String fACTURAR) {
		FACTURAR = fACTURAR;
	}
	public String getNROFACTURA() {
		return NROFACTURA;
	}
	public void setNROFACTURA(String nROFACTURA) {
		NROFACTURA = nROFACTURA;
	}
	public String getIDATENDIDO() {
		return IDATENDIDO;
	}
	public void setIDATENDIDO(String iDATENDIDO) {
		IDATENDIDO = iDATENDIDO;
	}
	public String getAREALIZAR() {
		return AREALIZAR;
	}
	public void setAREALIZAR(String aREALIZAR) {
		AREALIZAR = aREALIZAR;
	}
	public String getNUMERO() {
		return NUMERO;
	}
	public void setNUMERO(String nUMERO) {
		NUMERO = nUMERO;
	}
	
	@Override
	public String toString() {
		return "vacuna [IDHC=" + IDHC + ", IDPACIENTE=" + IDPACIENTE + ", IDCLIENTE=" + IDCLIENTE + ", FECHAVISITA="
				+ FECHAVISITA + ", RESALTADO=" + RESALTADO + ", FECHAPROXIMA=" + FECHAPROXIMA + ", INCLUIR=" + INCLUIR
				+ ", IDITEM=" + IDITEM + ", IDRUBRO=" + IDRUBRO + ", IMAGEN=" + IMAGEN + ", IMAGENTIPO=" + IMAGENTIPO
				+ ", OBSERVACION=" + OBSERVACION + ", PRECIO=" + PRECIO + ", CANTIDA=" + CANTIDA + ", TOTAL=" + TOTAL
				+ ", FACTURAR=" + FACTURAR + ", NROFACTURA=" + NROFACTURA + ", IDATENDIDO=" + IDATENDIDO
				+ ", AREALIZAR=" + AREALIZAR + ", NUMERO=" + NUMERO + "]";
	}
}
