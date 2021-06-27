package model;

import com.opencsv.bean.CsvBindByPosition;

public class cliente {
	
	@CsvBindByPosition(position = 1)
	private String FECHAPROXIMA;
	@CsvBindByPosition(position = 2)
	private String IDCLIENTE;
	@CsvBindByPosition(position = 3)
	private String RAZONSOCIAL;
	@CsvBindByPosition(position = 4)
	private String DOMICILIO;
	@CsvBindByPosition(position = 5)
	private String ENTRE;
	@CsvBindByPosition(position = 6)
	private String TELEFONO;
	@CsvBindByPosition(position = 7)
	private String FAX;
	@CsvBindByPosition(position = 8)
	private String CELULAR;
	@CsvBindByPosition(position = 9)
	private String EMAIL;
	@CsvBindByPosition(position = 10)
	private String LOCALIDAD;
	@CsvBindByPosition(position = 11)
	private String CPOSTAL;
	@CsvBindByPosition(position = 12)
	private String PROVINCIA;
	@CsvBindByPosition(position = 13)
	private String PAIS;
	@CsvBindByPosition(position = 14)
	private String IMAGEN;
	@CsvBindByPosition(position = 15)
	private String IMAGENTIPO;
	@CsvBindByPosition(position = 16)
	private String RESPIVA;
	@CsvBindByPosition(position = 17)
	private String CUIT;
	@CsvBindByPosition(position = 18)
	private String DOCUMENTOTIPO;
	@CsvBindByPosition(position = 19)
	private String DOCUMENTONRO;
	@CsvBindByPosition(position = 20)
	private String NACIMIENTO;
	@CsvBindByPosition(position = 21)
	private String DATO1;
	@CsvBindByPosition(position = 22)
	private String DATO2;
	@CsvBindByPosition(position = 23)
	private String DATO3;
	@CsvBindByPosition(position = 24)
	private String DATO4;
	@CsvBindByPosition(position = 25)
	private String DATO5;
	@CsvBindByPosition(position = 26)
	private String DATO6;
	@CsvBindByPosition(position = 27)
	private String LISTADEPRECIO;
	@CsvBindByPosition(position = 28)
	private String SALDO;
	@CsvBindByPosition(position = 29)
	private String FECHASALDO;
	@CsvBindByPosition(position = 30)
	private String OSPLAN;
	@CsvBindByPosition(position = 31)
	private String OSFECHAINGRESO;
	@CsvBindByPosition(position = 32)
	private String OSCUOTA;
	@CsvBindByPosition(position = 33)
	private String OSFECHAPAGO;
	@CsvBindByPosition(position = 34)
	private String OSSOCIO;
	@CsvBindByPosition(position = 35)
	private String MILLAJEINSCRIPTO;
	@CsvBindByPosition(position = 36)
	private String MILLAJEFECHAINGRESO;
	@CsvBindByPosition(position = 37)
	private String MILLAJEACTUAL;
	@CsvBindByPosition(position = 38)
	private String MILLAJEACUMULADO;
	@CsvBindByPosition(position = 39)
	private String IDVENDEDOR;
	@CsvBindByPosition(position = 40)
	private String IDBARRIO;
	@CsvBindByPosition(position = 41)
	private String IDSUCENTREGA;
	@CsvBindByPosition(position = 42)
	private String COMENTARIO;
	
	
	public String getFECHAPROXIMA() {
		return FECHAPROXIMA;
	}
	public void setFECHAPROXIMA(String fECHAPROXIMA) {
		FECHAPROXIMA = fECHAPROXIMA;
	}
	public String getIDCLIENTE() {
		return IDCLIENTE;
	}
	public void setIDCLIENTE(String iDCLIENTE) {
		IDCLIENTE = iDCLIENTE;
	}
	public String getRAZONSOCIAL() {
		return RAZONSOCIAL;
	}
	public void setRAZONSOCIAL(String rAZONSOCIAL) {
		RAZONSOCIAL = rAZONSOCIAL;
	}
	public String getDOMICILIO() {
		return DOMICILIO;
	}
	public void setDOMICILIO(String dOMICILIO) {
		DOMICILIO = dOMICILIO;
	}
	public String getENTRE() {
		return ENTRE;
	}
	public void setENTRE(String eNTRE) {
		ENTRE = eNTRE;
	}
	public String getTELEFONO() {
		return TELEFONO;
	}
	public void setTELEFONO(String tELEFONO) {
		TELEFONO = tELEFONO;
	}
	public String getFAX() {
		return FAX;
	}
	public void setFAX(String fAX) {
		FAX = fAX;
	}
	public String getCELULAR() {
		return CELULAR;
	}
	public void setCELULAR(String cELULAR) {
		CELULAR = cELULAR;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getLOCALIDAD() {
		return LOCALIDAD;
	}
	public void setLOCALIDAD(String lOCALIDAD) {
		LOCALIDAD = lOCALIDAD;
	}
	public String getCPOSTAL() {
		return CPOSTAL;
	}
	public void setCPOSTAL(String cPOSTAL) {
		CPOSTAL = cPOSTAL;
	}
	public String getPROVINCIA() {
		return PROVINCIA;
	}
	public void setPROVINCIA(String pROVINCIA) {
		PROVINCIA = pROVINCIA;
	}
	public String getPAIS() {
		return PAIS;
	}
	public void setPAIS(String pAIS) {
		PAIS = pAIS;
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
	public String getRESPIVA() {
		return RESPIVA;
	}
	public void setRESPIVA(String rESPIVA) {
		RESPIVA = rESPIVA;
	}
	public String getCUIT() {
		return CUIT;
	}
	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}
	public String getDOCUMENTOTIPO() {
		return DOCUMENTOTIPO;
	}
	public void setDOCUMENTOTIPO(String dOCUMENTOTIPO) {
		DOCUMENTOTIPO = dOCUMENTOTIPO;
	}
	public String getDOCUMENTONRO() {
		return DOCUMENTONRO;
	}
	public void setDOCUMENTONRO(String dOCUMENTONRO) {
		DOCUMENTONRO = dOCUMENTONRO;
	}
	public String getNACIMIENTO() {
		return NACIMIENTO;
	}
	public void setNACIMIENTO(String nACIMIENTO) {
		NACIMIENTO = nACIMIENTO;
	}
	public String getDATO1() {
		return DATO1;
	}
	public void setDATO1(String dATO1) {
		DATO1 = dATO1;
	}
	public String getDATO2() {
		return DATO2;
	}
	public void setDATO2(String dATO2) {
		DATO2 = dATO2;
	}
	public String getDATO3() {
		return DATO3;
	}
	public void setDATO3(String dATO3) {
		DATO3 = dATO3;
	}
	public String getDATO4() {
		return DATO4;
	}
	public void setDATO4(String dATO4) {
		DATO4 = dATO4;
	}
	public String getDATO5() {
		return DATO5;
	}
	public void setDATO5(String dATO5) {
		DATO5 = dATO5;
	}
	public String getDATO6() {
		return DATO6;
	}
	public void setDATO6(String dATO6) {
		DATO6 = dATO6;
	}
	public String getLISTADEPRECIO() {
		return LISTADEPRECIO;
	}
	public void setLISTADEPRECIO(String lISTADEPRECIO) {
		LISTADEPRECIO = lISTADEPRECIO;
	}
	public String getSALDO() {
		return SALDO;
	}
	public void setSALDO(String sALDO) {
		SALDO = sALDO;
	}
	public String getFECHASALDO() {
		return FECHASALDO;
	}
	public void setFECHASALDO(String fECHASALDO) {
		FECHASALDO = fECHASALDO;
	}
	public String getOSPLAN() {
		return OSPLAN;
	}
	public void setOSPLAN(String oSPLAN) {
		OSPLAN = oSPLAN;
	}
	public String getOSFECHAINGRESO() {
		return OSFECHAINGRESO;
	}
	public void setOSFECHAINGRESO(String oSFECHAINGRESO) {
		OSFECHAINGRESO = oSFECHAINGRESO;
	}
	public String getOSCUOTA() {
		return OSCUOTA;
	}
	public void setOSCUOTA(String oSCUOTA) {
		OSCUOTA = oSCUOTA;
	}
	public String getOSFECHAPAGO() {
		return OSFECHAPAGO;
	}
	public void setOSFECHAPAGO(String oSFECHAPAGO) {
		OSFECHAPAGO = oSFECHAPAGO;
	}
	public String getOSSOCIO() {
		return OSSOCIO;
	}
	public void setOSSOCIO(String oSSOCIO) {
		OSSOCIO = oSSOCIO;
	}
	public String getMILLAJEINSCRIPTO() {
		return MILLAJEINSCRIPTO;
	}
	public void setMILLAJEINSCRIPTO(String mILLAJEINSCRIPTO) {
		MILLAJEINSCRIPTO = mILLAJEINSCRIPTO;
	}
	public String getMILLAJEFECHAINGRESO() {
		return MILLAJEFECHAINGRESO;
	}
	public void setMILLAJEFECHAINGRESO(String mILLAJEFECHAINGRESO) {
		MILLAJEFECHAINGRESO = mILLAJEFECHAINGRESO;
	}
	public String getMILLAJEACTUAL() {
		return MILLAJEACTUAL;
	}
	public void setMILLAJEACTUAL(String mILLAJEACTUAL) {
		MILLAJEACTUAL = mILLAJEACTUAL;
	}
	public String getMILLAJEACUMULADO() {
		return MILLAJEACUMULADO;
	}
	public void setMILLAJEACUMULADO(String mILLAJEACUMULADO) {
		MILLAJEACUMULADO = mILLAJEACUMULADO;
	}
	public String getIDVENDEDOR() {
		return IDVENDEDOR;
	}
	public void setIDVENDEDOR(String iDVENDEDOR) {
		IDVENDEDOR = iDVENDEDOR;
	}
	public String getIDBARRIO() {
		return IDBARRIO;
	}
	public void setIDBARRIO(String iDBARRIO) {
		IDBARRIO = iDBARRIO;
	}
	public String getIDSUCENTREGA() {
		return IDSUCENTREGA;
	}
	public void setIDSUCENTREGA(String iDSUCENTREGA) {
		IDSUCENTREGA = iDSUCENTREGA;
	}
	
	public String getCOMENTARIO() {
		return COMENTARIO;
	}
	public void setCOMENTARIO(String cOMENTARIO) {
		COMENTARIO = cOMENTARIO;
	}
	
	@Override
	public String toString() {
		return "cliente [FECHAPROXIMA=" + FECHAPROXIMA + ", IDCLIENTE=" + IDCLIENTE + ", RAZONSOCIAL=" + RAZONSOCIAL
				+ ", DOMICILIO=" + DOMICILIO + ", ENTRE=" + ENTRE + ", TELEFONO=" + TELEFONO + ", FAX=" + FAX
				+ ", CELULAR=" + CELULAR + ", EMAIL=" + EMAIL + ", LOCALIDAD=" + LOCALIDAD + ", CPOSTAL=" + CPOSTAL
				+ ", PROVINCIA=" + PROVINCIA + ", PAIS=" + PAIS + ", IMAGEN=" + IMAGEN + ", IMAGENTIPO=" + IMAGENTIPO
				+ ", RESPIVA=" + RESPIVA + ", CUIT=" + CUIT + ", DOCUMENTOTIPO=" + DOCUMENTOTIPO + ", DOCUMENTONRO="
				+ DOCUMENTONRO + ", NACIMIENTO=" + NACIMIENTO + ", DATO1=" + DATO1 + ", DATO2=" + DATO2 + ", DATO3="
				+ DATO3 + ", DATO4=" + DATO4 + ", DATO5=" + DATO5 + ", DATO6=" + DATO6 + ", LISTADEPRECIO="
				+ LISTADEPRECIO + ", SALDO=" + SALDO + ", FECHASALDO=" + FECHASALDO + ", OSPLAN=" + OSPLAN
				+ ", OSFECHAINGRESO=" + OSFECHAINGRESO + ", OSCUOTA=" + OSCUOTA + ", OSFECHAPAGO=" + OSFECHAPAGO
				+ ", OSSOCIO=" + OSSOCIO + ", MILLAJEINSCRIPTO=" + MILLAJEINSCRIPTO + ", MILLAJEFECHAINGRESO="
				+ MILLAJEFECHAINGRESO + ", MILLAJEACTUAL=" + MILLAJEACTUAL + ", MILLAJEACUMULADO=" + MILLAJEACUMULADO
				+ ", IDVENDEDOR=" + IDVENDEDOR + ", IDBARRIO=" + IDBARRIO + ", IDSUCENTREGA=" + IDSUCENTREGA
				+ ", COMENTARIO=" + COMENTARIO + "]";
	}
}
