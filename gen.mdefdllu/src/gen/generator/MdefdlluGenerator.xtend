package gen.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import pruebaModelo.RaizFDLLU
import pruebaModelo.ArregloInt
import pruebaModelo.ArregloString

class MdefdlluGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        
        // Obtener la raíz del modelo
        val raiz = resource.allContents.filter(RaizFDLLU).head
        
        if (raiz !== null) {
            // Generar archivo .java con el nombre de la raíz
            fsa.generateFile(raiz.name + '.java', raiz.compilar)
        }
    }

    // Método principal que genera la clase Java
    def compilar(RaizFDLLU raiz) '''
        public class «raiz.name» {
            public static void main(String[] args) {
                «FOR arreglo : raiz.arregloint»
                    «arreglo.compilarInt»
                «ENDFOR»
                «FOR arreglo : raiz.arreglostring»
                    «arreglo.compilarString»
                «ENDFOR»
            }
        }
    '''

    // Genera el código para ArregloInt
    def compilarInt(ArregloInt arreglo) '''
        int[] «arreglo.name» = {«arreglo.valores.join(', ')»};
        for (int i = 0; i < «arreglo.name».length; i++) {
            System.out.println(«arreglo.name»[i]);
        }
    '''

    // Genera el código para ArregloString
    def compilarString(ArregloString arreglo) '''
        String[] «arreglo.name» = {«FOR v : arreglo.valores SEPARATOR ', '»"«v»"«ENDFOR»};
        for (int i = 0; i < «arreglo.name».length; i++) {
            System.out.println(«arreglo.name»[i]);
        }
    '''
}