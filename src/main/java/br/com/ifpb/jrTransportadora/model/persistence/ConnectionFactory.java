/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.jrTransportadora.model.persistence;

import java.sql.Connection;


/**
 *
 * @author rafael
 */
public interface ConnectionFactory {
    Connection getConnection();
    
}
