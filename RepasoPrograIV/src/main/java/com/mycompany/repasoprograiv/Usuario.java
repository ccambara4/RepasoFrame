/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasoprograiv;

/**
 *
 * Crear clase con atributos
 * Creación de constuctores con y sin parámetros
 * Métodos Get y Set
 */
public class Usuario {
    private String nombres;
    private String apellidos;
    private String user;
    private String pwd;
    private String estado;

    public Usuario(String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
    }

    public Usuario() {
    }

    public Usuario(String nombres, String apellidos, String user, String pwd) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.user = user;
        this.pwd = pwd;
        this.estado = "A";
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
