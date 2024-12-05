package org.esportsapp.persistencia;

import java.util.List;
import p1.t6.model.romeumusetelena.Categoria;
import p1.t6.model.romeumusetelena.Equip;
import p1.t6.model.romeumusetelena.GestorBDEsportsException;
import p1.t6.model.romeumusetelena.Jugador;
import p1.t6.model.romeumusetelena.Membre;
import p1.t6.model.romeumusetelena.Temporada;
import p1.t6.model.romeumusetelena.Usuari;

public interface IPersistencia {

    // Mètodes per gestionar Equips

    /**
     * Afegeix un nou equip al sistema.
     * @param equip L'equip a afegir.
     * @throws GestorBDEsportsException Si hi ha algun error en afegir l'equip.
     */
    void afegirEquip(Equip equip) throws GestorBDEsportsException;

    /**
     * Modifica un equip existent al sistema.
     * @param equip L'equip amb les dades actualitzades.
     * @throws GestorBDEsportsException Si hi ha algun error en modificar l'equip.
     */
    void modificarEquip(Equip equip) throws GestorBDEsportsException;

    /**
     * Elimina un equip del sistema.
     * @param idEquip L'ID de l'equip a eliminar.
     * @throws GestorBDEsportsException Si hi ha algun error en eliminar l'equip.
     */
    void eliminarEquip(int idEquip) throws GestorBDEsportsException;

    /**
     * Obté un equip específic pel seu ID.
     * @param idEquip L'ID de l'equip.
     * @return L'equip corresponent a l'ID.
     * @throws GestorBDEsportsException Si l'equip no es troba o hi ha algun error.
     */
    Equip obtenirEquip(int idEquip) throws GestorBDEsportsException;

    /**
     * Obté una llista de tots els equips.
     * @return Una llista amb tots els equips del sistema.
     * @throws GestorBDEsportsException Si hi ha algun error en recuperar els equips.
     */
    List<Equip> obtenirTotsEquips() throws GestorBDEsportsException;

    // Mètodes per gestionar Jugadors

    /**
     * Afegeix un nou jugador al sistema.
     * @param jugador El jugador a afegir.
     * @throws GestorBDEsportsException Si hi ha algun error en afegir el jugador.
     */
    void afegirJugador(Jugador jugador) throws GestorBDEsportsException;

    /**
     * Modifica un jugador existent al sistema.
     * @param jugador El jugador amb les dades actualitzades.
     * @throws GestorBDEsportsException Si hi ha algun error en modificar el jugador.
     */
    void modificarJugador(Jugador jugador) throws GestorBDEsportsException;

    /**
     * Elimina un jugador del sistema.
     * @param idJugador L'ID del jugador a eliminar.
     * @throws GestorBDEsportsException Si hi ha algun error en eliminar el jugador.
     */
    void eliminarJugador(int idJugador) throws GestorBDEsportsException;

    /**
     * Obté un jugador específic pel seu ID.
     * @param idJugador L'ID del jugador.
     * @return El jugador corresponent a l'ID.
     * @throws GestorBDEsportsException Si el jugador no es troba o hi ha algun error.
     */
    Jugador obtenirJugador(int idJugador) throws GestorBDEsportsException;

    /**
     * Obté una llista de tots els jugadors.
     * @return Una llista amb tots els jugadors del sistema.
     * @throws GestorBDEsportsException Si hi ha algun error en recuperar els jugadors.
     */
    List<Jugador> obtenirTotsJugadors() throws GestorBDEsportsException;

    // Mètodes per gestionar Jugadors en Equips (relació N:M)

    /**
     * Afegeix un membre (jugador) a un equip específic.
     * @param membre L'objecte Membre que conté l'equip, jugador i tipus.
     * @throws GestorBDEsportsException Si hi ha algun error en afegir el membre a l'equip.
     */
    void afegirMembre(Membre membre) throws GestorBDEsportsException;

    /**
     * Elimina un membre (jugador) d'un equip específic.
     * @param membre L'objecte Membre que conté l'equip i jugador a eliminar.
     * @throws GestorBDEsportsException Si hi ha algun error en eliminar el membre de l'equip.
     */
    void eliminarMembre(Membre membre) throws GestorBDEsportsException;
    
    /**
     * Modifica un membre existent al sistema.
     * @param membre El membre amb les dades actualitzades.
     * @throws GestorBDEsportsException Si hi ha algun error en modificar el membre.
     */
    void modificarMembre(Membre membre) throws GestorBDEsportsException;

    /**
     * Obté una llista de tots els membres d'un equip.
     * @param idEquip L'ID de l'equip.
     * @return Una llista de membres associats a l'equip.
     * @throws GestorBDEsportsException Si hi ha algun error en recuperar els membres de l'equip.
     */
    List<Membre> obtenirMembresDEquip(int idEquip) throws GestorBDEsportsException;
    
    // Mètodes per gestionar Categories

    /**
     * Afegeix una nova categoria al sistema.
     * @param categoria La categoria a afegir.
     * @throws GestorBDEsportsException Si hi ha algun error en afegir la categoria.
     */
    void afegirCategoria(Categoria categoria) throws GestorBDEsportsException;

    /**
     * Modifica una categoria existent.
     * @param categoria La categoria amb les dades actualitzades.
     * @throws GestorBDEsportsException Si hi ha algun error en modificar la categoria.
     */
    void modificarCategoria(Categoria categoria) throws GestorBDEsportsException;

    /**
     * Elimina una categoria del sistema.
     * @param idCategoria L'ID de la categoria a eliminar.
     * @throws GestorBDEsportsException Si hi ha algun error en eliminar la categoria.
     */
    void eliminarCategoria(int idCategoria) throws GestorBDEsportsException;

    /**
     * Obté una categoria específica pel seu ID.
     * @param idCategoria L'ID de la categoria.
     * @return La categoria corresponent a l'ID.
     * @throws GestorBDEsportsException Si la categoria no es troba o hi ha algun error.
     */
    Categoria obtenirCategoria(int idCategoria) throws GestorBDEsportsException;

    /**
     * Obté una llista de totes les categories.
     * @return Una llista amb totes les categories del sistema.
     * @throws GestorBDEsportsException Si hi ha algun error en recuperar les categories.
     */
    List<Categoria> obtenirTotesCategories() throws GestorBDEsportsException;
    
     /**
     * Obté una llista de tots els equips associats a una categoria específica.
     * @param idCategoria L'ID de la categoria.
     * @return Una llista amb els equips que pertanyen a la categoria especificada.
     * @throws GestorBDEsportsException Si hi ha algun error en recuperar els equips de la categoria.
     */
    List<Equip> obtenirEquipsDeCategoria(int idCategoria) throws GestorBDEsportsException;

    
    // Mètodes per gestionar Temporades

    /**
     * Afegeix una nova temporada al sistema.
     * @param temporada La temporada a afegir.
     * @throws GestorBDEsportsException Si hi ha algun error en afegir la temporada.
     */
    void afegirTemporada(Temporada temporada) throws GestorBDEsportsException;

    /**
     * Obté una temporada específica per un any.
     * @param any L'any de la temporada.
     * @return La temporada corresponent a l'any.
     * @throws GestorBDEsportsException Si la temporada no es troba o hi ha algun error.
     */
    Temporada obtenirTemporada(int any) throws GestorBDEsportsException;

    /**
     * Obté una llista de totes les temporades.
     * @return Una llista amb totes les temporades del sistema.
     * @throws GestorBDEsportsException Si hi ha algun error en recuperar les temporades.
     */
    List<Temporada> obtenirTotesTemporades() throws GestorBDEsportsException;

    /**
     * Elimina una temporada específica del sistema.
     * @param any L'any de la temporada a eliminar.
     * @throws GestorBDEsportsException Si hi ha algun error en eliminar la temporada.
     */
    void eliminarTemporada(int any) throws GestorBDEsportsException;
    
    /**
     * Obté una llista de tots els equips associats a una temporada específica.
     * @param anyTemporada L'any de la temporada.
     * @return Una llista amb els equips que participen en la temporada especificada.
     * @throws GestorBDEsportsException Si hi ha algun error en recuperar els equips de la temporada.
     */
    List<Equip> obtenirEquipsDeTemporada(int anyTemporada) throws GestorBDEsportsException;

    
    // Mètodes per gestionar Usuaris

    /**
     * Afegeix un usuari al sistema.
     * @param usuari L'usuari a afegir.
     * @throws GestorBDEsportsException Si hi ha algun error en afegir l'usuari.
     */
    void afegirUsuari(Usuari usuari) throws GestorBDEsportsException;

    /**
     * Obté un usuari específic pel seu login.
     * @param login El nom d'usuari per identificar-lo.
     * @return L'usuari corresponent al login.
     * @throws GestorBDEsportsException Si l'usuari no es troba o hi ha algun error.
     */
    Usuari obtenirUsuari(String login) throws GestorBDEsportsException;

    /**
     * Elimina un usuari pel seu login.
     * @param login El nom d'usuari a eliminar.
     * @throws GestorBDEsportsException Si hi ha algun error en eliminar l'usuari.
     */
    void eliminarUsuari(String login) throws GestorBDEsportsException;

    // Gestió de transaccions i connexions

    /**
     * Confirma tots els canvis en una transacció.
     * @throws GestorBDEsportsException Si hi ha algun error en confirmar els canvis.
     */
    void confirmarCanvis() throws GestorBDEsportsException;

    /**
     * Desfà tots els canvis en una transacció.
     * @throws GestorBDEsportsException Si hi ha algun error en desfer els canvis.
     */
    void desferCanvis() throws GestorBDEsportsException;

    /**
     * Tanca la connexió amb la base de dades.
     * @throws GestorBDEsportsException Si hi ha algun error en tancar la connexió.
     */
    void tancarConnexio() throws GestorBDEsportsException;
}
