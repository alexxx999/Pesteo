package com.palme.pesteo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;


/**
 * Created by ErnestoOrozco on 30/10/2014.
 */

@DatabaseTable(tableName = "producto")
public class producto implements Serializable{

	@DatabaseField (generatedId = true)
	private Integer id;
	@DatabaseField (index = true, canBeNull = true)
	private String idProd;
	@DatabaseField (canBeNull = true)
	private Integer idEmp;

	@DatabaseField private String descAlm;
	@DatabaseField private String unidad;
	@DatabaseField private Integer frccEnt1;
	@DatabaseField private Integer frccNum1;
	@DatabaseField private Integer frccDen1;
	@DatabaseField private Integer frccEnt2;
	@DatabaseField private Integer frccNum2;
	@DatabaseField private Integer frccDen2;
	@DatabaseField private String perfil;
	@DatabaseField private Double cmMed1;
	@DatabaseField private Double cmMed2;
	@DatabaseField private String medPulg;


	//region GETTERS producto
	public Integer getId() {
		return id;
	}

	public String getIdProd() {
		return idProd;
	}

	public Integer getIdEmp() {
		return idEmp;
	}

	public String getDescAlm() {
		return descAlm;
	}

	public String getUnidad() {
		return unidad;
	}

	public Integer getFrccEnt1() {
		return frccEnt1;
	}

	public Integer getFrccNum1() {
		return frccNum1;
	}

	public Integer getFrccDen1() {
		return frccDen1;
	}

	public Integer getFrccEnt2() {
		return frccEnt2;
	}

	public Integer getFrccNum2() {
		return frccNum2;
	}

	public Integer getFrccDen2() {
		return frccDen2;
	}

	public String getPerfil() {
		return perfil;
	}

	public Double getCmMed1() {
		return cmMed1;
	}

	public Double getCmMed2() {
		return cmMed2;
	}

	public String getMedPulg() {
		return medPulg;
	}
	//endregion


	//region SETTERS producto
	public void setIdProd(String idProd) {
		this.idProd = idProd;
	}

	public void setIdEmp(Integer idEmp) {
		this.idEmp = idEmp;
	}

	public void setDescAlm(String descAlm) {
		this.descAlm = descAlm;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public void setFrccEnt1(Integer frccEnt1) {
		this.frccEnt1 = frccEnt1;
	}

	public void setFrccNum1(Integer frccNum1) {
		this.frccNum1 = frccNum1;
	}

	public void setFrccDen1(Integer frccDen1) {
		this.frccDen1 = frccDen1;
	}

	public void setFrccEnt2(Integer frccEnt2) {
		this.frccEnt2 = frccEnt2;
	}

	public void setFrccNum2(Integer frccNum2) {
		this.frccNum2 = frccNum2;
	}

	public void setFrccDen2(Integer frccDen2) {
		this.frccDen2 = frccDen2;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public void setCmMed1(Double cmMed1) {
		this.cmMed1 = cmMed1;
	}

	public void setCmMed2(Double cmMed2) {
		this.cmMed2 = cmMed2;
	}

	public void setMedPulg(String medPulg) {
		this.medPulg = medPulg;
	}
	//endregion


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || ((Object)this).getClass() != o.getClass() ) return false;


		producto producto = (producto) o;

		if (cmMed1 != null ? !cmMed1.equals(producto.cmMed1) : producto.cmMed1 != null)
			return false;
		if (cmMed2 != null ? !cmMed2.equals(producto.cmMed2) : producto.cmMed2 != null)
			return false;
		if (descAlm != null ? !descAlm.equals(producto.descAlm) : producto.descAlm != null)
			return false;
		if (frccDen1 != null ? !frccDen1.equals(producto.frccDen1) : producto.frccDen1 != null)
			return false;
		if (frccDen2 != null ? !frccDen2.equals(producto.frccDen2) : producto.frccDen2 != null)
			return false;
		if (frccEnt1 != null ? !frccEnt1.equals(producto.frccEnt1) : producto.frccEnt1 != null)
			return false;
		if (frccEnt2 != null ? !frccEnt2.equals(producto.frccEnt2) : producto.frccEnt2 != null)
			return false;
		if (frccNum1 != null ? !frccNum1.equals(producto.frccNum1) : producto.frccNum1 != null)
			return false;
		if (frccNum2 != null ? !frccNum2.equals(producto.frccNum2) : producto.frccNum2 != null)
			return false;
		if (!idEmp.equals(producto.idEmp)) return false;
		if (!idProd.equals(producto.idProd)) return false;
		if (medPulg != null ? !medPulg.equals(producto.medPulg) : producto.medPulg != null)
			return false;
		if (perfil != null ? !perfil.equals(producto.perfil) : producto.perfil != null)
			return false;
		if (unidad != null ? !unidad.equals(producto.unidad) : producto.unidad != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = idProd.hashCode();
		result = 31 * result + idEmp.hashCode();
		result = 31 * result + (descAlm != null ? descAlm.hashCode() : 0);
		result = 31 * result + (unidad != null ? unidad.hashCode() : 0);
		result = 31 * result + (frccEnt1 != null ? frccEnt1.hashCode() : 0);
		result = 31 * result + (frccNum1 != null ? frccNum1.hashCode() : 0);
		result = 31 * result + (frccDen1 != null ? frccDen1.hashCode() : 0);
		result = 31 * result + (frccEnt2 != null ? frccEnt2.hashCode() : 0);
		result = 31 * result + (frccNum2 != null ? frccNum2.hashCode() : 0);
		result = 31 * result + (frccDen2 != null ? frccDen2.hashCode() : 0);
		result = 31 * result + (perfil != null ? perfil.hashCode() : 0);
		result = 31 * result + (cmMed1 != null ? cmMed1.hashCode() : 0);
		result = 31 * result + (cmMed2 != null ? cmMed2.hashCode() : 0);
		result = 31 * result + (medPulg != null ? medPulg.hashCode() : 0);
		return result;
	}
}
