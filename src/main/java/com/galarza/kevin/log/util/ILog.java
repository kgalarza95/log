/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.galarza.kevin.log.util;

/**
 *
 * @author kgalarza
 */
public interface ILog {

    void debug(String mensaje);

    void info(String mensaje);

    void warn(String mensaje);

    void error(String mensaje);
}
