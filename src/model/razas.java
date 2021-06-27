package model;

import com.opencsv.bean.CsvBindByPosition;

public class razas {
	
	@CsvBindByPosition(position = 1)
	private String IDRAZA;
	@CsvBindByPosition(position = 2)
	private String NOMBRE;
	@CsvBindByPosition(position = 3)
	private String IDESPECIE;
	
	
	public String getIDRAZA() {
		return IDRAZA;
	}
	public void setIDRAZA(String iDRAZA) {
		IDRAZA = iDRAZA;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	public String getIDESPECIE() {
		return IDESPECIE;
	}
	public void setIDESPECIE(String iDESPECIE) {
		IDESPECIE = iDESPECIE;
	}
	@Override
	public String toString() {
		return "razas [IDRAZA=" + IDRAZA + ", NOMBRE=" + NOMBRE + ", IDESPECIE=" + IDESPECIE + "]";
	}
}
