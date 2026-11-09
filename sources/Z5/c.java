package Z5;

import N8.q0;
import androidx.camera.camera2.internal.F;
import com.nimbusds.jose.shaded.gson.internal.f;
import com.nimbusds.jose.shaded.gson.m;
import com.nimbusds.jose.shaded.gson.p;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f11523a;

    static {
        f fVar = f.f23638c;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z3 = Y5.b.f11299a;
        f11523a = new m(fVar, new HashMap(map), new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, new ArrayList(linkedList));
    }

    public static b a(String str, Map map) {
        String strD = d(str, map);
        if (strD == null) {
            return null;
        }
        return new b(strD);
    }

    public static Object b(Map map, String str, Class cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        Object obj = map.get(str);
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        throw new ParseException(q0.k("Unexpected type of JSON object member with key ", str, ""), 0);
    }

    public static long c(String str, Map map) throws ParseException {
        Number number = (Number) b(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException(q0.k("JSON object member with key ", str, " is missing or null"), 0);
    }

    public static String d(String str, Map map) {
        return (String) b(map, str, String.class);
    }

    public static List e(String str, Map map) throws ParseException {
        String[] strArr;
        List list = (List) b(map, str, List.class);
        if (list == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) list.toArray(new String[0]);
            } catch (ArrayStoreException unused) {
                throw new ParseException(q0.k("JSON object member with key \"", str, "\" is not an array of strings"), 0);
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public static URI f(String str, Map map) throws ParseException {
        String str2 = (String) b(map, str, String.class);
        if (str2 == null) {
            return null;
        }
        try {
            return new URI(str2);
        } catch (URISyntaxException e10) {
            throw new ParseException(e10.getMessage(), 0);
        }
    }

    public static Map g(int i7, String str) throws ParseException {
        if (str.trim().isEmpty()) {
            throw new ParseException("Invalid JSON object", 0);
        }
        if (i7 >= 0 && str.length() > i7) {
            throw new ParseException(F.c(i7, "The parsed string is longer than the max accepted size of ", " characters"), 0);
        }
        Type[] typeArr = {String.class, Object.class};
        TypeVariable[] typeParameters = Map.class.getTypeParameters();
        int length = typeParameters.length;
        if (2 != length) {
            throw new IllegalArgumentException(Map.class.getName() + " requires " + length + " type arguments, but got 2");
        }
        for (int i10 = 0; i10 < length; i10++) {
            Type type = typeArr[i10];
            Class<?> clsG = com.nimbusds.jose.shaded.gson.internal.d.g(type);
            TypeVariable typeVariable = typeParameters[i10];
            for (Type type2 : typeVariable.getBounds()) {
                if (!com.nimbusds.jose.shaded.gson.internal.d.g(type2).isAssignableFrom(clsG)) {
                    throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + Map.class);
                }
            }
        }
        Type typeA = com.nimbusds.jose.shaded.gson.internal.d.a(new com.nimbusds.jose.shaded.gson.internal.b(null, Map.class, typeArr));
        com.nimbusds.jose.shaded.gson.internal.d.g(typeA);
        typeA.hashCode();
        try {
            return (Map) f11523a.c(str, typeA);
        } catch (Exception e10) {
            throw new ParseException("Invalid JSON: " + e10.getMessage(), 0);
        } catch (StackOverflowError unused) {
            throw new ParseException("Excessive JSON object and / or array nesting", 0);
        }
    }

    public static String h(Map map) {
        m mVar = f11523a;
        mVar.getClass();
        if (map == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                mVar.g(mVar.f(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new p(10, e10);
            }
        }
        Class<?> cls = map.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            mVar.h(map, cls, mVar.f(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e11) {
            throw new p(10, e11);
        }
    }
}
