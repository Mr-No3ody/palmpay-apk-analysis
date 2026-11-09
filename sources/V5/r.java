package V5;

import N8.q0;
import com.nimbusds.jose.shaded.gson.ExclusionStrategy;
import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.annotations.JsonAdapter;
import com.nimbusds.jose.shaded.gson.annotations.SerializedName;
import com.nimbusds.jose.shaded.gson.z;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements TypeAdapterFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10046a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10049d;

    public r(F1.f fVar, com.nimbusds.jose.shaded.gson.internal.f fVar2, c cVar, ArrayList arrayList) {
        this.f10047b = fVar;
        this.f10048c = fVar2;
        this.f10049d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!com.nimbusds.jose.shaded.gson.internal.o.f23669a.a(accessibleObject, obj)) {
            throw new com.nimbusds.jose.shaded.gson.p(q0.j(X5.c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."), 10, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:75:0x0172  */
    /* JADX WARN: Code duplicated, block: B:76:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x0183  */
    /* JADX WARN: Code duplicated, block: B:82:0x0186  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f7 A[SYNTHETIC] */
    public LinkedHashMap b(com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar, Class cls, boolean z3, boolean z8) {
        Type type;
        Method methodL;
        boolean z10;
        Type typeH;
        SerializedName serializedName;
        String strValue;
        String[] strArrAlternate;
        List listSingletonList;
        int size;
        n nVar;
        int i7;
        Field[] fieldArr;
        int i10;
        int i11;
        n nVar2;
        Field field;
        boolean z11;
        boolean z12;
        boolean z13;
        com.nimbusds.jose.shaded.gson.reflect.a aVar2;
        Class cls2;
        boolean z14;
        int modifiers;
        boolean z15;
        JsonAdapter jsonAdapter;
        z zVarD;
        boolean z16;
        n nVar3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            com.nimbusds.jose.shaded.gson.reflect.a aVar3 = aVar;
            boolean z17 = z3;
            Class cls3 = cls;
            while (cls3 != Object.class) {
                Field[] declaredFields = cls3.getDeclaredFields();
                boolean z18 = true;
                boolean z19 = false;
                if (cls3 != cls && declaredFields.length > 0) {
                    com.nimbusds.jose.shaded.gson.t tVarE = com.nimbusds.jose.shaded.gson.internal.d.e((ArrayList) this.f10049d, cls3);
                    if (tVarE == com.nimbusds.jose.shaded.gson.t.f23720d) {
                        throw new com.nimbusds.jose.shaded.gson.p("ReflectionAccessFilter does not permit using reflection for " + cls3 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.", 10, false);
                    }
                    z17 = tVarE == com.nimbusds.jose.shaded.gson.t.f23719c;
                }
                int length = declaredFields.length;
                int i12 = 0;
                while (true) {
                    type = aVar3.f23690b;
                    if (i12 < length) {
                        Field field2 = declaredFields[i12];
                        boolean zC = this.c(field2, z18);
                        boolean zC2 = this.c(field2, z19);
                        if (zC || zC2) {
                            boolean z20 = z18;
                            if (z8) {
                                if (Modifier.isStatic(field2.getModifiers())) {
                                    zC2 = z19;
                                } else {
                                    methodL = X5.c.f11002a.l(cls3, field2);
                                    if (!z17) {
                                        X5.c.e(methodL);
                                    }
                                    if (methodL.getAnnotation(SerializedName.class) != null && field2.getAnnotation(SerializedName.class) == null) {
                                        throw new com.nimbusds.jose.shaded.gson.p(q0.k("@SerializedName on ", X5.c.d(methodL, false), " is not supported"), 10, false);
                                    }
                                    aVar3 = aVar3;
                                }
                                if (!z17 && methodL == null) {
                                    X5.c.e(field2);
                                }
                                z10 = z17;
                                typeH = com.nimbusds.jose.shaded.gson.internal.d.h(type, cls3, field2.getGenericType(), new HashMap());
                                serializedName = (SerializedName) field2.getAnnotation(SerializedName.class);
                                if (serializedName == null) {
                                    listSingletonList = Collections.singletonList(field2.getName());
                                } else {
                                    strValue = serializedName.value();
                                    strArrAlternate = serializedName.alternate();
                                    if (strArrAlternate.length == 0) {
                                        listSingletonList = Collections.singletonList(strValue);
                                    } else {
                                        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                                        arrayList.add(strValue);
                                        Collections.addAll(arrayList, strArrAlternate);
                                        listSingletonList = arrayList;
                                    }
                                    size = listSingletonList.size();
                                    nVar = null;
                                    i7 = 0;
                                    while (i7 < size) {
                                        String str = (String) listSingletonList.get(i7);
                                        if (i7 != 0) {
                                            zC = false;
                                        }
                                        List list = listSingletonList;
                                        aVar2 = new com.nimbusds.jose.shaded.gson.reflect.a(typeH);
                                        Type type2 = typeH;
                                        cls2 = aVar2.f23689a;
                                        if (cls2 == null && cls2.isPrimitive()) {
                                            z14 = z20;
                                        } else {
                                            z14 = false;
                                        }
                                        modifiers = field2.getModifiers();
                                        if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                                            z15 = false;
                                        } else {
                                            z15 = z20;
                                        }
                                        Field[] fieldArr2 = declaredFields;
                                        jsonAdapter = (JsonAdapter) field2.getAnnotation(JsonAdapter.class);
                                        int i13 = size;
                                        if (jsonAdapter != null) {
                                            zVarD = c.a((F1.f) this.f10047b, mVar, aVar2, jsonAdapter);
                                        } else {
                                            zVarD = null;
                                        }
                                        int i14 = i12;
                                        if (zVarD != null) {
                                            z16 = z20;
                                        } else {
                                            z16 = false;
                                        }
                                        if (zVarD == null) {
                                            zVarD = mVar.d(aVar2);
                                        }
                                        nVar3 = nVar;
                                        int i15 = i7;
                                        Field field3 = field2;
                                        int i16 = length;
                                        Method method = methodL;
                                        boolean z21 = z10;
                                        boolean z22 = z20;
                                        nVar = (n) linkedHashMap.put(str, new n(str, field3, zC, zC2, z21, method, z16, zVarD, mVar, aVar2, z14, z15));
                                        if (nVar3 == null) {
                                            nVar = nVar3;
                                        }
                                        mVar = mVar;
                                        field2 = field3;
                                        zC = zC;
                                        zC2 = zC2;
                                        z20 = z22;
                                        i12 = i14;
                                        typeH = type2;
                                        declaredFields = fieldArr2;
                                        listSingletonList = list;
                                        size = i13;
                                        i7 = i15 + 1;
                                        z10 = z21;
                                        methodL = method;
                                        length = i16;
                                        this = this;
                                    }
                                    fieldArr = declaredFields;
                                    i10 = length;
                                    i11 = i12;
                                    nVar2 = nVar;
                                    field = field2;
                                    z11 = z10;
                                    z12 = false;
                                    z13 = z20;
                                    if (nVar2 == null) {
                                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + nVar2.f10027a + "'; conflict is caused by fields " + X5.c.c(nVar2.f10028b) + " and " + X5.c.c(field));
                                    }
                                }
                                size = listSingletonList.size();
                                nVar = null;
                                i7 = 0;
                                while (i7 < size) {
                                    String str2 = (String) listSingletonList.get(i7);
                                    if (i7 != 0) {
                                        zC = false;
                                    }
                                    List list2 = listSingletonList;
                                    aVar2 = new com.nimbusds.jose.shaded.gson.reflect.a(typeH);
                                    Type type3 = typeH;
                                    cls2 = aVar2.f23689a;
                                    if (cls2 == null) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    modifiers = field2.getModifiers();
                                    if (Modifier.isStatic(modifiers)) {
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                    }
                                    Field[] fieldArr3 = declaredFields;
                                    jsonAdapter = (JsonAdapter) field2.getAnnotation(JsonAdapter.class);
                                    int i17 = size;
                                    if (jsonAdapter != null) {
                                        zVarD = c.a((F1.f) this.f10047b, mVar, aVar2, jsonAdapter);
                                    } else {
                                        zVarD = null;
                                    }
                                    int i18 = i12;
                                    if (zVarD != null) {
                                        z16 = z20;
                                    } else {
                                        z16 = false;
                                    }
                                    if (zVarD == null) {
                                        zVarD = mVar.d(aVar2);
                                    }
                                    nVar3 = nVar;
                                    int i19 = i7;
                                    Field field4 = field2;
                                    int i110 = length;
                                    Method method2 = methodL;
                                    boolean z23 = z10;
                                    boolean z24 = z20;
                                    nVar = (n) linkedHashMap.put(str2, new n(str2, field4, zC, zC2, z23, method2, z16, zVarD, mVar, aVar2, z14, z15));
                                    if (nVar3 == null) {
                                        nVar = nVar3;
                                    }
                                    mVar = mVar;
                                    field2 = field4;
                                    zC = zC;
                                    zC2 = zC2;
                                    z20 = z24;
                                    i12 = i18;
                                    typeH = type3;
                                    declaredFields = fieldArr3;
                                    listSingletonList = list2;
                                    size = i17;
                                    i7 = i19 + 1;
                                    z10 = z23;
                                    methodL = method2;
                                    length = i110;
                                    this = this;
                                }
                                fieldArr = declaredFields;
                                i10 = length;
                                i11 = i12;
                                nVar2 = nVar;
                                field = field2;
                                z11 = z10;
                                z12 = false;
                                z13 = z20;
                                if (nVar2 == null) {
                                    throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + nVar2.f10027a + "'; conflict is caused by fields " + X5.c.c(nVar2.f10028b) + " and " + X5.c.c(field));
                                }
                            }
                            methodL = null;
                            if (!z17) {
                                X5.c.e(field2);
                            }
                            z10 = z17;
                            typeH = com.nimbusds.jose.shaded.gson.internal.d.h(type, cls3, field2.getGenericType(), new HashMap());
                            serializedName = (SerializedName) field2.getAnnotation(SerializedName.class);
                            if (serializedName == null) {
                                listSingletonList = Collections.singletonList(field2.getName());
                            } else {
                                strValue = serializedName.value();
                                strArrAlternate = serializedName.alternate();
                                if (strArrAlternate.length == 0) {
                                    listSingletonList = Collections.singletonList(strValue);
                                } else {
                                    ArrayList arrayList2 = new ArrayList(strArrAlternate.length + 1);
                                    arrayList2.add(strValue);
                                    Collections.addAll(arrayList2, strArrAlternate);
                                    listSingletonList = arrayList2;
                                }
                                size = listSingletonList.size();
                                nVar = null;
                                i7 = 0;
                                while (i7 < size) {
                                    String str3 = (String) listSingletonList.get(i7);
                                    if (i7 != 0) {
                                        zC = false;
                                    }
                                    List list3 = listSingletonList;
                                    aVar2 = new com.nimbusds.jose.shaded.gson.reflect.a(typeH);
                                    Type type4 = typeH;
                                    cls2 = aVar2.f23689a;
                                    if (cls2 == null) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    modifiers = field2.getModifiers();
                                    if (Modifier.isStatic(modifiers)) {
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                    }
                                    Field[] fieldArr4 = declaredFields;
                                    jsonAdapter = (JsonAdapter) field2.getAnnotation(JsonAdapter.class);
                                    int i111 = size;
                                    if (jsonAdapter != null) {
                                        zVarD = c.a((F1.f) this.f10047b, mVar, aVar2, jsonAdapter);
                                    } else {
                                        zVarD = null;
                                    }
                                    int i112 = i12;
                                    if (zVarD != null) {
                                        z16 = z20;
                                    } else {
                                        z16 = false;
                                    }
                                    if (zVarD == null) {
                                        zVarD = mVar.d(aVar2);
                                    }
                                    nVar3 = nVar;
                                    int i113 = i7;
                                    Field field5 = field2;
                                    int i114 = length;
                                    Method method3 = methodL;
                                    boolean z25 = z10;
                                    boolean z26 = z20;
                                    nVar = (n) linkedHashMap.put(str3, new n(str3, field5, zC, zC2, z25, method3, z16, zVarD, mVar, aVar2, z14, z15));
                                    if (nVar3 == null) {
                                        nVar = nVar3;
                                    }
                                    mVar = mVar;
                                    field2 = field5;
                                    zC = zC;
                                    zC2 = zC2;
                                    z20 = z26;
                                    i12 = i112;
                                    typeH = type4;
                                    declaredFields = fieldArr4;
                                    listSingletonList = list3;
                                    size = i111;
                                    i7 = i113 + 1;
                                    z10 = z25;
                                    methodL = method3;
                                    length = i114;
                                    this = this;
                                }
                                fieldArr = declaredFields;
                                i10 = length;
                                i11 = i12;
                                nVar2 = nVar;
                                field = field2;
                                z11 = z10;
                                z12 = false;
                                z13 = z20;
                                if (nVar2 == null) {
                                    throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + nVar2.f10027a + "'; conflict is caused by fields " + X5.c.c(nVar2.f10028b) + " and " + X5.c.c(field));
                                }
                            }
                            size = listSingletonList.size();
                            nVar = null;
                            i7 = 0;
                            while (i7 < size) {
                                String str4 = (String) listSingletonList.get(i7);
                                if (i7 != 0) {
                                    zC = false;
                                }
                                List list4 = listSingletonList;
                                aVar2 = new com.nimbusds.jose.shaded.gson.reflect.a(typeH);
                                Type type5 = typeH;
                                cls2 = aVar2.f23689a;
                                if (cls2 == null) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                modifiers = field2.getModifiers();
                                if (Modifier.isStatic(modifiers)) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                Field[] fieldArr5 = declaredFields;
                                jsonAdapter = (JsonAdapter) field2.getAnnotation(JsonAdapter.class);
                                int i115 = size;
                                if (jsonAdapter != null) {
                                    zVarD = c.a((F1.f) this.f10047b, mVar, aVar2, jsonAdapter);
                                } else {
                                    zVarD = null;
                                }
                                int i116 = i12;
                                if (zVarD != null) {
                                    z16 = z20;
                                } else {
                                    z16 = false;
                                }
                                if (zVarD == null) {
                                    zVarD = mVar.d(aVar2);
                                }
                                nVar3 = nVar;
                                int i117 = i7;
                                Field field6 = field2;
                                int i118 = length;
                                Method method4 = methodL;
                                boolean z27 = z10;
                                boolean z28 = z20;
                                nVar = (n) linkedHashMap.put(str4, new n(str4, field6, zC, zC2, z27, method4, z16, zVarD, mVar, aVar2, z14, z15));
                                if (nVar3 == null) {
                                    nVar = nVar3;
                                }
                                mVar = mVar;
                                field2 = field6;
                                zC = zC;
                                zC2 = zC2;
                                z20 = z28;
                                i12 = i116;
                                typeH = type5;
                                declaredFields = fieldArr5;
                                listSingletonList = list4;
                                size = i115;
                                i7 = i117 + 1;
                                z10 = z27;
                                methodL = method4;
                                length = i118;
                                this = this;
                            }
                            fieldArr = declaredFields;
                            i10 = length;
                            i11 = i12;
                            nVar2 = nVar;
                            field = field2;
                            z11 = z10;
                            z12 = false;
                            z13 = z20;
                            if (nVar2 == null) {
                                throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + nVar2.f10027a + "'; conflict is caused by fields " + X5.c.c(nVar2.f10028b) + " and " + X5.c.c(field));
                            }
                        } else {
                            aVar3 = aVar3;
                            cls3 = cls3;
                            fieldArr = declaredFields;
                            z13 = z18;
                            z12 = z19;
                            i10 = length;
                            i11 = i12;
                            z11 = z17;
                        }
                        i12 = i11 + 1;
                        this = this;
                        mVar = mVar;
                        z17 = z11;
                        aVar3 = aVar3;
                        z18 = z13;
                        cls3 = cls3;
                        z19 = z12;
                        length = i10;
                        declaredFields = fieldArr;
                    }
                }
                Class cls4 = cls3;
                aVar3 = new com.nimbusds.jose.shaded.gson.reflect.a(com.nimbusds.jose.shaded.gson.internal.d.h(type, cls4, cls4.getGenericSuperclass(), new HashMap()));
                cls3 = aVar3.f23689a;
                z17 = z17;
            }
        }
        return linkedHashMap;
    }

    public boolean c(Field field, boolean z3) {
        Class<?> type = field.getType();
        com.nimbusds.jose.shaded.gson.internal.f fVar = (com.nimbusds.jose.shaded.gson.internal.f) this.f10048c;
        fVar.getClass();
        if (com.nimbusds.jose.shaded.gson.internal.f.b(type) || fVar.a(type, z3) || (field.getModifiers() & 136) != 0 || field.isSynthetic() || com.nimbusds.jose.shaded.gson.internal.f.b(field.getType())) {
            return false;
        }
        List list = z3 ? fVar.f23639a : fVar.f23640b;
        if (list.isEmpty()) {
            return true;
        }
        com.nimbusds.jose.shaded.gson.a aVar = new com.nimbusds.jose.shaded.gson.a(field);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ExclusionStrategy) it.next()).shouldSkipField(aVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final z create(com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        switch (this.f10046a) {
            case 0:
                Class cls = aVar.f23689a;
                if (!Object.class.isAssignableFrom(cls)) {
                    return null;
                }
                com.nimbusds.jose.shaded.gson.t tVarE = com.nimbusds.jose.shaded.gson.internal.d.e((ArrayList) this.f10049d, cls);
                if (tVarE != com.nimbusds.jose.shaded.gson.t.f23720d) {
                    boolean z3 = tVarE == com.nimbusds.jose.shaded.gson.t.f23719c;
                    return X5.c.f11002a.A(cls) ? new q(cls, b(mVar, aVar, cls, z3, true), z3) : new p(((F1.f) this.f10047b).b(aVar), b(mVar, aVar, cls, z3, false));
                }
                throw new com.nimbusds.jose.shaded.gson.p("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.", 10, false);
            default:
                Class cls2 = aVar.f23689a;
                if (cls2 == ((Class) this.f10047b) || cls2 == ((Class) this.f10048c)) {
                    return (z) this.f10049d;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10046a) {
            case 1:
                return "Factory[type=" + ((Class) this.f10048c).getName() + "+" + ((Class) this.f10047b).getName() + ",adapter=" + ((z) this.f10049d) + "]";
            default:
                return super.toString();
        }
    }

    public r(Class cls, Class cls2, z zVar) {
        this.f10047b = cls;
        this.f10048c = cls2;
        this.f10049d = zVar;
    }
}
