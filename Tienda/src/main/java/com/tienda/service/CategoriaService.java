
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
//el siguiente metodo retorna una lista con las categorias
//que estan en la tabla categoria, todas o solo las activas
public List<Categoria> getCategorias(boolean activos);  
//aaca siguen los metodos para hacer un crud de la tabla categoria
}
