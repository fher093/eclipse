package gen.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import pruebaModelo.ArregloInt;
import pruebaModelo.ArregloString;
import pruebaModelo.RaizFDLLU;

@SuppressWarnings("all")
public class MdefdlluGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final RaizFDLLU raiz = IteratorExtensions.<RaizFDLLU>head(Iterators.<RaizFDLLU>filter(resource.getAllContents(), RaizFDLLU.class));
    if ((raiz != null)) {
      String _name = raiz.getName();
      String _plus = (_name + ".java");
      fsa.generateFile(_plus, this.compilar(raiz));
    }
  }

  public CharSequence compilar(final RaizFDLLU raiz) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = raiz.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    {
      EList<ArregloInt> _arregloint = raiz.getArregloint();
      for(final ArregloInt arreglo : _arregloint) {
        _builder.append("        ");
        CharSequence _compilarInt = this.compilarInt(arreglo);
        _builder.append(_compilarInt, "        ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<ArregloString> _arreglostring = raiz.getArreglostring();
      for(final ArregloString arreglo_1 : _arreglostring) {
        _builder.append("        ");
        CharSequence _compilarString = this.compilarString(arreglo_1);
        _builder.append(_compilarString, "        ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence compilarInt(final ArregloInt arreglo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int[] ");
    String _name = arreglo.getName();
    _builder.append(_name);
    _builder.append(" = {");
    String _join = IterableExtensions.join(arreglo.getValores(), ", ");
    _builder.append(_join);
    _builder.append("};");
    _builder.newLineIfNotEmpty();
    _builder.append("for (int i = 0; i < ");
    String _name_1 = arreglo.getName();
    _builder.append(_name_1);
    _builder.append(".length; i++) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("System.out.println(");
    String _name_2 = arreglo.getName();
    _builder.append(_name_2, "    ");
    _builder.append("[i]);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence compilarString(final ArregloString arreglo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String[] ");
    String _name = arreglo.getName();
    _builder.append(_name);
    _builder.append(" = {");
    {
      EList<String> _valores = arreglo.getValores();
      boolean _hasElements = false;
      for(final String v : _valores) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append("\"");
        _builder.append(v);
        _builder.append("\"");
      }
    }
    _builder.append("};");
    _builder.newLineIfNotEmpty();
    _builder.append("for (int i = 0; i < ");
    String _name_1 = arreglo.getName();
    _builder.append(_name_1);
    _builder.append(".length; i++) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("System.out.println(");
    String _name_2 = arreglo.getName();
    _builder.append(_name_2, "    ");
    _builder.append("[i]);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
