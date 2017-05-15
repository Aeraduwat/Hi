/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Felipe Alonso
 */
public class Dron {

    private String equipo;
    private String marca;
    private String num_serie;
    private Integer cant;
    private Integer helice;
    private Integer gimball;
    private Integer bateria;
    private Integer control;
    private Integer adaptador;
    private Integer mochila;
    private Integer protector_helice;
    private Integer helice_repuesto;
    private Integer cable_usb;
    private Integer cargador;
    private Integer enchufe_cargador;
    private Integer adaptador_bateria;
    private String  obs;
    private String otros;
    private String estado;
    private String estado_actual;

    public Dron(String equipo, String marca, String num_serie, Integer cant, Integer helice, Integer gimball, Integer bateria, Integer control, Integer adaptador, Integer mochila, Integer protector_helice, Integer helice_repuesto, Integer cable_usb, Integer cargador, Integer enchufe_cargador, Integer adaptador_bateria, String obs, String otros, String estado) {
        this.equipo = equipo;
        this.marca = marca;
        this.num_serie = num_serie;
        this.cant = cant;
        this.helice = helice;
        this.gimball = gimball;
        this.bateria = bateria;
        this.control = control;
        this.adaptador = adaptador;
        this.mochila = mochila;
        this.protector_helice = protector_helice;
        this.helice_repuesto = helice_repuesto;
        this.cable_usb = cable_usb;
        this.cargador = cargador;
        this.enchufe_cargador = enchufe_cargador;
        this.adaptador_bateria = adaptador_bateria;
        this.obs = obs;
        this.otros = otros;
        this.estado = estado;
    }

    public Dron(Dron dron) {
        this.equipo = dron.getEquipo();
        this.marca = dron.getMarca();
        this.num_serie = dron.getNum_serie();
        this.cant = dron.getCant();
        this.helice = dron.getHelice();
        this.gimball = dron.getGimball();
        this.bateria = dron.getBateria();
        this.control = dron.getControl();
        this.adaptador = dron.getAdaptador();
        this.mochila = dron.getMochila();
        this.protector_helice = dron.getProtector_helice();
        this.helice_repuesto = dron.getHelice_repuesto();
        this.cable_usb = dron.getCable_usb();
        this.cargador = dron.getCargador();
        this.enchufe_cargador = dron.getEnchufe_cargador();
        this.adaptador_bateria = dron.getAdaptador_bateria();
        this.obs = dron.getObs();
        this.otros = dron.getOtros();
        this.estado = dron.getEstado();
        this.estado_actual = dron.getEstado_actual();
    }

    public Dron() {
    }

    public String getEstado_actual() {
        return estado_actual;
    }

    public void setEstado_actual(String estado_actual) {
        this.estado_actual = estado_actual;
    }

    public Integer getHelice() {
        return helice;
    }

    public void setHelice(Integer helice) {
        this.helice = helice;
    }

    public Integer getGimball() {
        return gimball;
    }

    public void setGimball(Integer gimball) {
        this.gimball = gimball;
    }

    public Integer getBateria() {
        return bateria;
    }

    public void setBateria(Integer bateria) {
        this.bateria = bateria;
    }

    public Integer getControl() {
        return control;
    }

    public void setControl(Integer control) {
        this.control = control;
    }

    public Integer getAdaptador() {
        return adaptador;
    }

    public void setAdaptador(Integer adaptador) {
        this.adaptador = adaptador;
    }

    public Integer getMochila() {
        return mochila;
    }

    public void setMochila(Integer mochila) {
        this.mochila = mochila;
    }

    public Integer getProtector_helice() {
        return protector_helice;
    }

    public void setProtector_helice(Integer protector_helice) {
        this.protector_helice = protector_helice;
    }

    public Integer getHelice_repuesto() {
        return helice_repuesto;
    }

    public void setHelice_repuesto(Integer helice_repuesto) {
        this.helice_repuesto = helice_repuesto;
    }

    public Integer getCable_usb() {
        return cable_usb;
    }

    public void setCable_usb(Integer cable_usb) {
        this.cable_usb = cable_usb;
    }

    public Integer getCargador() {
        return cargador;
    }

    public void setCargador(Integer cargador) {
        this.cargador = cargador;
    }

    public Integer getEnchufe_cargador() {
        return enchufe_cargador;
    }

    public void setEnchufe_cargador(Integer enchufe_cargador) {
        this.enchufe_cargador = enchufe_cargador;
    }

    public Integer getAdaptador_bateria() {
        return adaptador_bateria;
    }

    public void setAdaptador_bateria(Integer adaptador_bateria) {
        this.adaptador_bateria = adaptador_bateria;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }   
}
