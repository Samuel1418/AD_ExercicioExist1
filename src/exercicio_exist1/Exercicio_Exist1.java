/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_exist1;

import java.io.File;
import java.util.Iterator;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.CollectionManagementService;
import org.xmldb.api.modules.XPathQueryService;

/**
 *
 * @author oracle
 */
public class Exercicio_Exist1 {

    /**
     * @param args the command line arguments
     */
    public static String driver = "org.exist.xmldb.DatabaseImpl";

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, XMLDBException {
        Class<?> cl = Class.forName(driver);
        Database database = (Database) cl.newInstance();
        DatabaseManager.registerDatabase((org.xmldb.api.base.Database) database);
        String coleccion = "/db";
        Collection col;
        String uri = "xmldb:exist://localhost:8080/exist/xmlrpc";
        col = DatabaseManager.getCollection(uri + coleccion, "admin","oracle"); 
        
        //Para crear coleccion
//        CollectionManagementService mgtService = (CollectionManagementService) col.getService("CollectionManagementService", "1.0");
//        mgtService.createCollection("Hulaa");
        
        //Para borrar coleccion              
//        CollectionManagementService mgtService= (CollectionManagementService) col.getService("CollectionManagementService","1.0");
//	mgtService.removeCollection("Hulaa");
        
        //Para añadir los xml
//        File archivo = new File("/home/oracle/Downloads/empleados.xml");
//        Resource nuevoRecurso = col.createResource(archivo.getName(), "XMLResource");
//        nuevoRecurso.setContent(archivo);
//        col.storeResource(nuevoRecurso);
//        
//        File archivo2 = new File("/home/oracle/Downloads/proba.xml");
//        Resource nuevoRecurso2 = col.createResource(archivo2.getName(), "XMLResource");
//        nuevoRecurso2.setContent(archivo2);
//        col.storeResource(nuevoRecurso2);
//        
//        File archivo3 = new File("/home/oracle/Downloads/proba2.xml");
//        Resource nuevoRecurso3 = col.createResource(archivo3.getName(), "XMLResource");
//        nuevoRecurso3.setContent(archivo3);
//        col.storeResource(nuevoRecurso3);
        
        //Borrar un recurso
//        Resource recursoaborrar = col.getResource("proba.xml");
//	col.removeResource(recursoaborrar);
        
        //Mostrar recurso de empleados
//        XPathQueryService servicioXPQS = (XPathQueryService) col.getService("XPathQueryService", "1.0");

        //Aquí seleccionamos qué recurso de la colección leemos (este query solo muestra el de empleados, buscar el que muestra todos)
        //Diferencia con el siguiente apartado?: 
//        ResourceSet recursos = servicioXPQS.query("/EMPLEADOS/EMP_ROW[DEPT_NO=10]");
//
//        ResourceIterator it = (ResourceIterator) recursos.getIterator();
//
//        Resource r;
//
//        while (it.hasMoreResources()) {
//
//            r = (Resource) it.nextResource();
//
//            System.out.println(r.getContent());
//
//}
        
        //esta consulta solo muestra el contenido de una etiqueta en concreto del xml (/PLAY/fm)
        //simplemente introducimos después del nombre del fichero lo que queremos mostrar del documento
//        ResourceSet recursos2 = servicioXPQS.queryResource("proba2.xml", "/PLAY/fm");
//        ResourceIterator it2 = recursos2.getIterator();
//        Resource r2;
//        while (it2.hasMoreResources()) {
//            r2 = it2.nextResource();
//            System.out.println(r2.getContent());
//}
    
        
         //ACTUALIZAR ELEMENTO DENTRO DE UN RECURSO/DOCUMENTO DE UNA COLECCIÓN:
//        String cons2="update value /EMPLEADOS/EMP_ROW[EMP_NO=7369]/APELLIDO with 'RODROGUEZ'";
//        
//        servicioXPQS.queryResource("empleados.xml",cons2);
        
        //BORRAR ELEMENTO DENTRO DEL RECURSO/DOCUMENTO DE UNA COLECCIÓN:
//       String cons3 ="update delete /EMPLEADOS/ZONAS/zona[cod_zona=50]";
//       servicioXPQS.queryResource("empleados.xml",cons3);
        
        //OPERACIONES DE ACTUALIZACIÓN DE TODOS LOS RECURSOS/DOCUMENTOS DE UNA COLECCIÓN
        //INSERTAR ELEMENTO DENTRO DE LOS RECURSOS/DOCUMENTOS DE UNA COLECCIÓN
        //(vamos a insertar una info en los recursos de la colección cosas)
        //Lo que hace es buscar en todos los documentos por las etiquetas que le hemos especificado
        //Si las encuentra, pues actualiza/inserta su contenido (?)
//        String cons4 = "update insert <zona><cod_zona>50</cod_zona><nombre>Madrid-Oeste</nombre><director>Alicia Ramos Martin</director></zona> into /EMPLEADOS/ZONAS";
//        servicioXPQS.query(cons4);
          //otra:
//        String cons5 = "update insert <autor><cod_autor>1</cod_autor><nombre>luis</nombre><edad>30</edad></autor> into /PLAY";
//        servicioXPQS.query(cons5);
    
        //ACTUALIZAR ELEMENTO DENTRO DE LOS RECURSOS/DOCUMENTOS DE UNA COLECCIÓN
//        String cons6="update value /EMPLEADOS/EMP_ROW[EMP_NO=7369]/APELLIDO with 'RODROEGUEZ'";
//        servicioXPQS.query(cons6);
        //
        //BORRAR ELEMENTO DENTRO DE LOS RECURSOS/DOCUMENTOS DE UNA COLECCIÓN
//        String cons7 ="update delete /EMPLEADOS/ZONAS/zona[cod_zona=50]";
//        servicioXPQS.query(cons7);
}
}
