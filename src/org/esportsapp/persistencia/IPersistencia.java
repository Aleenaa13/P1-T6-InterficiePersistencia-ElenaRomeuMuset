package org.esportsapp.persistencia;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import p1.t6.model.romeumusetelena.Categoria;
import p1.t6.model.romeumusetelena.Equip;
import p1.t6.model.romeumusetelena.GestorBDEsportsException;
import p1.t6.model.romeumusetelena.Jugador;
import p1.t6.model.romeumusetelena.Membre;
import p1.t6.model.romeumusetelena.Temporada;

public interface IPersistencia {

    // Mètodes per gestionar Equips

    /**
     * Afegeix un nou equip al sistema.
     * @param equip L'equip a afegir.
     * @return Torna cert o fals.
     * @throws GestorBDEsportsException Si hi ha algun error en afegir l'equip.
     */
    boolean afegirEquip(Equip equip) throws GestorBDEsportsException;

    /**
     * Modifica un equip existent al sistema.
     * @param equip L'equip amb les dades actualitzades.
     * @throws GestorBDEsportsException Si hi ha algun error en modificar l'equip.
     */
    void modificarEquip(Equip equip) throws GestorBDEsportsException;
    
    
    /**
     * Verifica si un equipo tiene miembros asociados
     * @param idEquip ID del equipo a verificar
     * @return true si el equipo tiene miembros, false si no tiene
     * @throws SQLException Si hi ha algun error en comprovar els membres d'un equip.
     */
    boolean equipTeMembres(int idEquip) throws SQLException;
    
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
    * Busca jugadors pel seu nom.
    * @param nom El nom o part del nom del jugador.
    * @return Una llista de jugadors que coincideixen amb el nom.
    * @throws GestorBDEsportsException Si hi ha un error en la consulta.
    */
    List<Jugador> buscarNomJugador(String nom) throws GestorBDEsportsException;
    
    /**
    * Busca un jugador que tingui un NIF específic.
    * @param nif El NIF del jugador que es vol buscar.
    * @return El jugador que coincideix amb el NIF proporcionat, o null si no es troba cap coincidència.
    * @throws GestorBDEsportsException Si hi ha un error en la consulta.
    */
    List<Jugador> buscarPerNIFJugador(String nif) throws GestorBDEsportsException;
    
    /**
    * Busca una llista de jugadors que tinguin una data de naixement específica.
    * @param dataNaix La data de naixement del jugador que es vol buscar.
    * @return Una llista de jugadors que coincideixen amb la data de naixement proporcionada.
    * @throws GestorBDEsportsException Si hi ha un error en la consulta.
    */
    List<Jugador> buscarPerDataNaixJugador(Date dataNaix) throws GestorBDEsportsException;
    
    /**
    * Busca una llista de jugadors ordenats per cognom.
    * @param ordenarPerCognom Si es vol ordenar per cognom o no.
    * @return Una llista de jugadors ordenats per cognom si el paràmetre és true.
    * @throws GestorBDEsportsException Si hi ha un error en la consulta.
    */
    List<Jugador> buscarJugadorsOrdenatsPerCognom(boolean ordenarPerCognom) throws GestorBDEsportsException;
    
    
    
    /**
     * Modifica un jugador existent al sistema.
     * @param jugador El jugador amb les dades actualitzades.
     * @throws GestorBDEsportsException Si hi ha algun error en modificar el jugador.
     */
    void modificarJugador(Jugador jugador) throws GestorBDEsportsException;
    
    
    /**
    * Verifica si es posible cambiar la fecha de nacimiento de un jugador
    * sin afectar a su categoría actual en los equipos donde está inscrito.
    * 
    * @param idJugador ID del jugador a verificar
    * @param novaData Nueva fecha de nacimiento propuesta
    * @return true si se puede cambiar la fecha, false si el cambio afectaría a alguna categoría
    * @throws GestorBDEsportsException si hay error en la consulta
    */
    boolean esPermesCanviarDataNaixement(int idJugador, Date novaData) throws GestorBDEsportsException;
  
    
    /**
    * Verifica si es posible cambiar el sexo de un jugador
    * @param idJugador ID del jugador a verificar
    * @return true si se puede cambiar el sexo, false si no
    * @throws GestorBDEsportsException si hay error en la consulta
    */
    boolean esPermesCanviarSexe(int idJugador) throws GestorBDEsportsException;
    
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
     * Obté una llista de tots els membres d'un equip.
     * @param idEquip L'ID de l'equip.
     * @return Una llista de membres associats a l'equip.
     * @throws GestorBDEsportsException Si hi ha algun error en recuperar els membres de l'equip.
     */
    List<Membre> obtenirMembresDEquip(int idEquip) throws GestorBDEsportsException;
    
    // Mètodes per gestionar Categories

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
    
    // Mètodes per gestionar Temporades

    /**
     * Afegeix una nova temporada al sistema.
     * @param temporada La temporada a afegir.
     * @return Retorna cert o fals.
     * @throws GestorBDEsportsException Si hi ha algun error en afegir la temporada.
     */
    boolean afegirTemporada(Temporada temporada) throws GestorBDEsportsException;

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
     * @return Retorna cert o fals.
     * @throws GestorBDEsportsException Si hi ha algun error en eliminar la temporada.
     */
    boolean eliminarTemporada(int any) throws GestorBDEsportsException;
  
    // Mètodes per gestionar Usuaris

    /**
    * Valida un usuari pel seu login i contrasenya.
    * @param login El nom d'usuari.
    * @param contrasenya La contrasenya de l'usuari.
    * @return Retorna un booleà que indica si el login i la contrasenya són vàlids.
    * @throws GestorBDEsportsException Si hi ha un error en la validació.
    */
    boolean validarUsuari(String login, String contrasenya) throws GestorBDEsportsException;


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
