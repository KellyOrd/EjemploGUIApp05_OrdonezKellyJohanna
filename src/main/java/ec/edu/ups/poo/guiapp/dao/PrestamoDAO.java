/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.guiapp.dao;

import ec.edu.ups.poo.guiapp.idao.IPrestamoDAO;
import ec.edu.ups.poo.guiapp.modelo.Prestamo;
import ec.edu.ups.poo.guiapp.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kelly
 */
public class PrestamoDAO implements IPrestamoDAO{
    
    private List<Prestamo> listaPrestamos;

    public PrestamoDAO() {
        listaPrestamos = new ArrayList<>();
    }
    
    @Override
    public List<Prestamo> listarPrestamo() {
        return listaPrestamos;
    }

    @Override
    public void crearPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }

    @Override
    public Prestamo obtenerPrestamo(int id) {
        for (Prestamo prestamo : listaPrestamos) {
            if(prestamo.getId() == id){
                return prestamo;
            }
        }
        return null;
    }

    @Override
    public void actualizarPrestamo(int id, Prestamo prestamo) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamoEncontrado = listaPrestamos.get(i);
            if(prestamoEncontrado.getId() == id){
                listaPrestamos.set(i, prestamo);
                break;
            }            
        }
    }

    @Override
    public void eliminarPrestamo(int id) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamoEncontrado = listaPrestamos.get(i);
            if(prestamoEncontrado.getId() == id){
                listaPrestamos.remove(i);
                break;
            }            
        }
    }  
}
