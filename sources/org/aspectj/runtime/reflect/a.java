package org.aspectj.runtime.reflect;

import Pa.C0505b;
import com.adjust.sdk.Constants;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.aspectj.lang.JoinPoint;
import p137j3.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Hashtable f40991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f40992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static /* synthetic */ Class f40993g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f40994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f40995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40997d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f40991e = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put(Constants.LONG, Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f40992f = new Object[0];
    }

    public a(Class cls, String str) {
        this.f40996c = str;
        this.f40994a = cls;
        this.f40995b = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f40991e.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class<?> cls2 = f40993g;
            if (cls2 == null) {
                try {
                    cls2 = Class.forName("java.lang.ClassNotFoundException");
                    f40993g = cls2;
                } catch (ClassNotFoundException e10) {
                    throw new NoClassDefFoundError(e10.getMessage());
                }
            }
            return cls2;
        }
    }

    public static c b(JoinPoint.StaticPart staticPart, Object obj, Object obj2) {
        return new c(staticPart, obj, obj2, f40992f);
    }

    public static c c(JoinPoint.StaticPart staticPart, Object obj, Object obj2, Object obj3) {
        return new c(staticPart, obj, obj2, new Object[]{obj3});
    }

    public final v d(String str, String str2, String str3, String str4, String str5) {
        int i7 = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.f40995b;
        Class clsA = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i10 = 0; i10 < iCountTokens; i10++) {
            clsArr[i10] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i11 = 0; i11 < iCountTokens2; i11++) {
            strArr[i11] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i12 = 0; i12 < iCountTokens3; i12++) {
            clsArr2[i12] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class clsA2 = a(classLoader, str5);
        v vVar = new v();
        vVar.f38259b = i7;
        vVar.f38260c = str;
        vVar.f38262e = clsA;
        vVar.f38264g = clsArr;
        vVar.f38265h = strArr;
        vVar.f38266i = clsArr2;
        vVar.f38268k = clsA2;
        return vVar;
    }

    public final b e(v vVar, int i7) {
        int i10 = this.f40997d;
        this.f40997d = i10 + 1;
        C0505b c0505b = new C0505b((byte) 0, 9);
        c0505b.f7073c = this.f40994a;
        c0505b.f7074d = this.f40996c;
        c0505b.f7072b = i7;
        b bVar = new b();
        bVar.f40998a = vVar;
        bVar.f40999b = c0505b;
        bVar.f41000c = i10;
        return bVar;
    }
}
