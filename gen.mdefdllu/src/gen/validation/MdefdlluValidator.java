package gen.validation;

import org.eclipse.xtext.validation.Check;
import pruebaModelo.ArregloInt;
import pruebaModelo.ArregloString;
import pruebaModelo.RaizFDLLU;
import pruebaModelo.PruebaModeloPackage;

public class MdefdlluValidator extends AbstractMdefdlluValidator {

    public static final String NOMBRE_VACIO = "nombreVacio";
    public static final String SIN_ARREGLOS = "sinArreglos";
    public static final String NOMBRE_MAYUSCULA = "nombreMayuscula";
    public static final String ARREGLO_SIN_VALORES = "arregloSinValores";

    // Validar que la raíz tenga al menos un arreglo
    @Check
    public void checkRaizTieneArreglos(RaizFDLLU raiz) {
        if (raiz.getArregloint().isEmpty() && raiz.getArreglostring().isEmpty()) {
            warning("La raíz debe tener al menos un arreglo",
                    PruebaModeloPackage.Literals.RAIZ_FDLLU__NAME,
                    SIN_ARREGLOS);
        }
    }

    // Validar que el nombre de la raíz empiece con mayúscula
    @Check
    public void checkNombreRaizMayuscula(RaizFDLLU raiz) {
        if (raiz.getName() != null && !raiz.getName().isEmpty()) {
            if (!Character.isUpperCase(raiz.getName().charAt(0))) {
                warning("El nombre del archivo debería empezar con mayúscula",
                        PruebaModeloPackage.Literals.RAIZ_FDLLU__NAME,
                        NOMBRE_MAYUSCULA);
            }
        }
    }

    // Validar que ArregloInt tenga al menos un valor
    @Check
    public void checkArregloIntNoVacio(ArregloInt arreglo) {
        if (arreglo.getValores().isEmpty()) {
            error("El arreglo '" + arreglo.getName() + "' debe tener al menos un valor",
                    PruebaModeloPackage.Literals.ARREGLO_INT__NAME,
                    ARREGLO_SIN_VALORES);
        }
    }

    // Validar que ArregloString tenga al menos un valor
    @Check
    public void checkArregloStringNoVacio(ArregloString arreglo) {
        if (arreglo.getValores().isEmpty()) {
            error("El arreglo '" + arreglo.getName() + "' debe tener al menos un valor",
                    PruebaModeloPackage.Literals.ARREGLO_STRING__NAME,
                    ARREGLO_SIN_VALORES);
        }
    }

    // Validar que el nombre del arreglo no empiece con número
    @Check
    public void checkNombreArregloInt(ArregloInt arreglo) {
        if (arreglo.getName() != null && !arreglo.getName().isEmpty()) {
            if (Character.isDigit(arreglo.getName().charAt(0))) {
                error("El nombre del arreglo no puede empezar con un número",
                        PruebaModeloPackage.Literals.ARREGLO_INT__NAME,
                        NOMBRE_VACIO);
            }
        }
    }

    @Check
    public void checkNombreArregloString(ArregloString arreglo) {
        if (arreglo.getName() != null && !arreglo.getName().isEmpty()) {
            if (Character.isDigit(arreglo.getName().charAt(0))) {
                error("El nombre del arreglo no puede empezar con un número",
                        PruebaModeloPackage.Literals.ARREGLO_STRING__NAME,
                        NOMBRE_VACIO);
            }
        }
    }
}