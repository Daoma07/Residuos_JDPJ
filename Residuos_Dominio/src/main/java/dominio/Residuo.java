/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class Residuo {

    private ObjectId id;
    private int codigo;
    private String nombre;
    private List<Quimico> quimicos;
    private Productor productor;

    /**
     * Constructor sin argumentos.
     */
    public Residuo() {
    }

    /**
     * Constructor con argumentos.
     *
     * @param codigo El código del residuo.
     * @param nombre El nombre del residuo.
     * @param quimicos La lista de químicos asociados al residuo.
     * @param traslado El traslado del residuo.
     */
    public Residuo(int codigo, String nombre, List<Quimico> quimicos, Productor productor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.quimicos = quimicos;
        this.productor = productor;
    }

    /**
     * Constructor con identificador.
     *
     * @param id El identificador del residuo.
     * @param codigo El código del residuo.
     * @param nombre El nombre del residuo.
     * @param quimicos La lista de químicos asociados al residuo.
     * @param traslado El traslado del residuo.
     */
    public Residuo(ObjectId id, int codigo, String nombre, List<Quimico> quimicos, Productor productor) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.quimicos = quimicos;
        this.productor = productor;
    }

    /**
     * Obtiene el identificador del residuo.
     *
     * @return El identificador del residuo.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del residuo.
     *
     * @param id El identificador del residuo.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el código del residuo.
     *
     * @return El código del residuo.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del residuo.
     *
     * @param codigo El código del residuo.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del residuo.
     *
     * @return El nombre del residuo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del residuo.
     *
     * @param nombre El nombre del residuo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la lista de químicos.
     *
     * @return La lista de químicos.
     */
    public List<Quimico> getQuimicos() {
        return quimicos;
    }

    /**
     * Establece la lista de químicos.
     *
     * @param quimicos La lista de químicos a establecer.
     */
    public void setQuimicos(List<Quimico> quimicos) {
        this.quimicos = quimicos;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

}
