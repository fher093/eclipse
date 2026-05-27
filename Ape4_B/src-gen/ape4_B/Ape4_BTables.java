/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Ape4_B/model/ape4_B.ecore
 * using:
 *   /Ape4_B/model/ape4_B.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package ape4_B;

// import ape4_B.Ape4_BPackage;
// import ape4_B.Ape4_BTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Ape4_BTables provides the dispatch tables for the ape4_B for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Ape4_BTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Ape4_BPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_ape4_B = IdManager.getNsURIPackageId("http://www.example.org/ape4_B", null, Ape4_BPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Atributo = Ape4_BTables.PACKid_http_c_s_s_www_example_org_s_ape4_B.getClassId("Atributo", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entidad = Ape4_BTables.PACKid_http_c_s_s_www_example_org_s_ape4_B.getClassId("Entidad", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Principal = Ape4_BTables.PACKid_http_c_s_s_www_example_org_s_ape4_B.getClassId("Principal", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Ape4_BTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TipoDato = Ape4_BTables.PACKid_http_c_s_s_www_example_org_s_ape4_B.getEnumerationId("TipoDato");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1000 = ValueUtil.integerValueOf("1000");
	public static final /*@NonInvalid*/ IntegerValue INT_3 = ValueUtil.integerValueOf("3");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Entidad = TypeId.BAG.getSpecializedId(Ape4_BTables.CLSSid_Entidad, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Atributo = TypeId.ORDERED_SET.getSpecializedId(Ape4_BTables.CLSSid_Atributo, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Entidad = TypeId.ORDERED_SET.getSpecializedId(Ape4_BTables.CLSSid_Entidad, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Ape4_BTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ape4_BTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Atributo = new EcoreExecutorType(Ape4_BPackage.Literals.ATRIBUTO, PACKAGE, 0);
		public static final EcoreExecutorType _Entidad = new EcoreExecutorType(Ape4_BPackage.Literals.ENTIDAD, PACKAGE, 0);
		public static final EcoreExecutorType _Principal = new EcoreExecutorType(Ape4_BPackage.Literals.PRINCIPAL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TipoDato = new EcoreExecutorEnumeration(Ape4_BPackage.Literals.TIPO_DATO, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Atributo,
			_Entidad,
			_Principal,
			_TipoDato
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ape4_BTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Atributo__Atributo = new ExecutorFragment(Types._Atributo, Ape4_BTables.Types._Atributo);
		private static final ExecutorFragment _Atributo__OclAny = new ExecutorFragment(Types._Atributo, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Atributo__OclElement = new ExecutorFragment(Types._Atributo, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Entidad__Entidad = new ExecutorFragment(Types._Entidad, Ape4_BTables.Types._Entidad);
		private static final ExecutorFragment _Entidad__OclAny = new ExecutorFragment(Types._Entidad, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entidad__OclElement = new ExecutorFragment(Types._Entidad, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Principal__OclAny = new ExecutorFragment(Types._Principal, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Principal__OclElement = new ExecutorFragment(Types._Principal, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Principal__Principal = new ExecutorFragment(Types._Principal, Ape4_BTables.Types._Principal);

		private static final ExecutorFragment _TipoDato__OclAny = new ExecutorFragment(Types._TipoDato, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TipoDato__OclElement = new ExecutorFragment(Types._TipoDato, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TipoDato__OclEnumeration = new ExecutorFragment(Types._TipoDato, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TipoDato__OclType = new ExecutorFragment(Types._TipoDato, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TipoDato__TipoDato = new ExecutorFragment(Types._TipoDato, Ape4_BTables.Types._TipoDato);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ape4_BTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ape4_BTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ape4_BTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Atributo__longitud = new EcoreExecutorProperty(Ape4_BPackage.Literals.ATRIBUTO__LONGITUD, Types._Atributo, 0);
		public static final ExecutorProperty _Atributo__name = new EcoreExecutorProperty(Ape4_BPackage.Literals.ATRIBUTO__NAME, Types._Atributo, 1);
		public static final ExecutorProperty _Atributo__requerido = new EcoreExecutorProperty(Ape4_BPackage.Literals.ATRIBUTO__REQUERIDO, Types._Atributo, 2);
		public static final ExecutorProperty _Atributo__tipoDato = new EcoreExecutorProperty(Ape4_BPackage.Literals.ATRIBUTO__TIPO_DATO, Types._Atributo, 3);
		public static final ExecutorProperty _Atributo__Entidad__contiene = new ExecutorPropertyWithImplementation("Entidad", Types._Atributo, 4, new EcoreLibraryOppositeProperty(Ape4_BPackage.Literals.ENTIDAD__CONTIENE));

		public static final ExecutorProperty _Entidad__contiene = new EcoreExecutorProperty(Ape4_BPackage.Literals.ENTIDAD__CONTIENE, Types._Entidad, 0);
		public static final ExecutorProperty _Entidad__name = new EcoreExecutorProperty(Ape4_BPackage.Literals.ENTIDAD__NAME, Types._Entidad, 1);
		public static final ExecutorProperty _Entidad__redirige = new EcoreExecutorProperty(Ape4_BPackage.Literals.ENTIDAD__REDIRIGE, Types._Entidad, 2);
		public static final ExecutorProperty _Entidad__Entidad__redirige = new ExecutorPropertyWithImplementation("Entidad", Types._Entidad, 3, new EcoreLibraryOppositeProperty(Ape4_BPackage.Literals.ENTIDAD__REDIRIGE));
		public static final ExecutorProperty _Entidad__Principal__posee = new ExecutorPropertyWithImplementation("Principal", Types._Entidad, 4, new EcoreLibraryOppositeProperty(Ape4_BPackage.Literals.PRINCIPAL__POSEE));

		public static final ExecutorProperty _Principal__name = new EcoreExecutorProperty(Ape4_BPackage.Literals.PRINCIPAL__NAME, Types._Principal, 0);
		public static final ExecutorProperty _Principal__posee = new EcoreExecutorProperty(Ape4_BPackage.Literals.PRINCIPAL__POSEE, Types._Principal, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ape4_BTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Atributo =
			{
				Fragments._Atributo__OclAny /* 0 */,
				Fragments._Atributo__OclElement /* 1 */,
				Fragments._Atributo__Atributo /* 2 */
			};
		private static final int /*@NonNull*/ [] __Atributo = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entidad =
			{
				Fragments._Entidad__OclAny /* 0 */,
				Fragments._Entidad__OclElement /* 1 */,
				Fragments._Entidad__Entidad /* 2 */
			};
		private static final int /*@NonNull*/ [] __Entidad = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Principal =
			{
				Fragments._Principal__OclAny /* 0 */,
				Fragments._Principal__OclElement /* 1 */,
				Fragments._Principal__Principal /* 2 */
			};
		private static final int /*@NonNull*/ [] __Principal = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TipoDato =
			{
				Fragments._TipoDato__OclAny /* 0 */,
				Fragments._TipoDato__OclElement /* 1 */,
				Fragments._TipoDato__OclType /* 2 */,
				Fragments._TipoDato__OclEnumeration /* 3 */,
				Fragments._TipoDato__TipoDato /* 4 */
			};
		private static final int /*@NonNull*/ [] __TipoDato = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Atributo.initFragments(_Atributo, __Atributo);
			Types._Entidad.initFragments(_Entidad, __Entidad);
			Types._Principal.initFragments(_Principal, __Principal);
			Types._TipoDato.initFragments(_TipoDato, __TipoDato);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ape4_BTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__Atributo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Entidad__Entidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entidad__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entidad__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Principal__Principal = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Principal__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Principal__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TipoDato__TipoDato = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoDato__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoDato__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoDato__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoDato__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Atributo__Atributo.initOperations(_Atributo__Atributo);
			Fragments._Atributo__OclAny.initOperations(_Atributo__OclAny);
			Fragments._Atributo__OclElement.initOperations(_Atributo__OclElement);

			Fragments._Entidad__Entidad.initOperations(_Entidad__Entidad);
			Fragments._Entidad__OclAny.initOperations(_Entidad__OclAny);
			Fragments._Entidad__OclElement.initOperations(_Entidad__OclElement);

			Fragments._Principal__OclAny.initOperations(_Principal__OclAny);
			Fragments._Principal__OclElement.initOperations(_Principal__OclElement);
			Fragments._Principal__Principal.initOperations(_Principal__Principal);

			Fragments._TipoDato__OclAny.initOperations(_TipoDato__OclAny);
			Fragments._TipoDato__OclElement.initOperations(_TipoDato__OclElement);
			Fragments._TipoDato__OclEnumeration.initOperations(_TipoDato__OclEnumeration);
			Fragments._TipoDato__OclType.initOperations(_TipoDato__OclType);
			Fragments._TipoDato__TipoDato.initOperations(_TipoDato__TipoDato);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ape4_BTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Atributo = {
			Ape4_BTables.Properties._Atributo__longitud,
			Ape4_BTables.Properties._Atributo__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Ape4_BTables.Properties._Atributo__requerido,
			Ape4_BTables.Properties._Atributo__tipoDato
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entidad = {
			Ape4_BTables.Properties._Entidad__contiene,
			Ape4_BTables.Properties._Entidad__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Ape4_BTables.Properties._Entidad__redirige
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Principal = {
			Ape4_BTables.Properties._Principal__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Ape4_BTables.Properties._Principal__posee
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TipoDato = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Atributo__Atributo.initProperties(_Atributo);
			Fragments._Entidad__Entidad.initProperties(_Entidad);
			Fragments._Principal__Principal.initProperties(_Principal);
			Fragments._TipoDato__TipoDato.initProperties(_TipoDato);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ape4_BTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _TipoDato__STRING = new EcoreExecutorEnumerationLiteral(Ape4_BPackage.Literals.TIPO_DATO.getEEnumLiteral("STRING"), Types._TipoDato, 0);
		public static final EcoreExecutorEnumerationLiteral _TipoDato__DOUBLE = new EcoreExecutorEnumerationLiteral(Ape4_BPackage.Literals.TIPO_DATO.getEEnumLiteral("DOUBLE"), Types._TipoDato, 1);
		public static final EcoreExecutorEnumerationLiteral _TipoDato__INTEGER = new EcoreExecutorEnumerationLiteral(Ape4_BPackage.Literals.TIPO_DATO.getEEnumLiteral("INTEGER"), Types._TipoDato, 2);
		public static final EcoreExecutorEnumerationLiteral _TipoDato__BOOLEAN = new EcoreExecutorEnumerationLiteral(Ape4_BPackage.Literals.TIPO_DATO.getEEnumLiteral("BOOLEAN"), Types._TipoDato, 3);
		public static final EcoreExecutorEnumerationLiteral _TipoDato__TIME = new EcoreExecutorEnumerationLiteral(Ape4_BPackage.Literals.TIPO_DATO.getEEnumLiteral("TIME"), Types._TipoDato, 4);
		public static final EcoreExecutorEnumerationLiteral _TipoDato__DATE = new EcoreExecutorEnumerationLiteral(Ape4_BPackage.Literals.TIPO_DATO.getEEnumLiteral("DATE"), Types._TipoDato, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TipoDato = {
			_TipoDato__STRING,
			_TipoDato__DOUBLE,
			_TipoDato__INTEGER,
			_TipoDato__BOOLEAN,
			_TipoDato__TIME,
			_TipoDato__DATE
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._TipoDato.initLiterals(_TipoDato);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ape4_BTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Ape4_BTables();
	}

	private Ape4_BTables() {
		super(Ape4_BPackage.eNS_URI);
	}
}
