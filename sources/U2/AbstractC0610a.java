package U2;

import android.icu.util.ULocale;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: U2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0610a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f9116a = {"best fit", "lookup"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f9117b = {"base", "accent", "case", "variant"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f9118c = {"upper", "lower", "false"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f9119d = {"sort", FirebaseAnalytics.Event.SEARCH};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final A f9120e = new A();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z f9121f = new z();

    public static String a(String str, String[] strArr) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int iLastIndexOf = str.lastIndexOf("-");
            if (iLastIndexOf < 0) {
                return "";
            }
            if (iLastIndexOf >= 2 && str.charAt(iLastIndexOf - 2) == '-') {
                iLastIndexOf -= 2;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }

    public static Object b(String str, Object obj, Object obj2, Double d2, Object obj3) throws B {
        if (obj instanceof A) {
            return obj3;
        }
        if (!(obj instanceof Double)) {
            throw new B(str.concat(" value is invalid."), 0);
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue) || dDoubleValue > d2.doubleValue() || dDoubleValue < ((Double) obj2).doubleValue()) {
            throw new B(str.concat(" value is invalid."), 0);
        }
        return obj;
    }

    public static Object c(String str, Map map) {
        HashMap map2 = (HashMap) map;
        if (!map2.containsKey(str)) {
            return f9120e;
        }
        Object obj = map2.get(str);
        return obj == null ? f9121f : obj;
    }

    public static Object d(Map map, String str, int i7, Object obj, Object obj2) throws B {
        Object objC = c(str, map);
        if (objC instanceof A) {
            return obj2;
        }
        if (objC instanceof z) {
            objC = "";
        }
        if (i7 == 1 && !(objC instanceof Boolean)) {
            throw new B("Boolean option expected but not found", 0);
        }
        if (i7 == 2 && !(objC instanceof String)) {
            throw new B("String option expected but not found", 0);
        }
        if ((obj instanceof A) || Arrays.asList((Object[]) obj).contains(objC)) {
            return objC;
        }
        throw new B("String option expected but not found", 0);
    }

    public static p1.d e(String[] strArr) throws B {
        p1.d dVar = new p1.d(12);
        for (String str : strArr) {
            C cG = g(str);
            boolean[] zArr = new boolean[1];
            ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(new ULocale[]{(ULocale) cG.getLocaleWithoutExtensions()}, ULocale.getAvailableLocales(), zArr);
            if (zArr[0] || uLocaleAcceptLanguage == null) {
                uLocaleAcceptLanguage = null;
            }
            if (uLocaleAcceptLanguage != null) {
                dVar.f41178b = new C(uLocaleAcceptLanguage);
                dVar.f41179c = cG.getUnicodeExtensions();
                return dVar;
            }
        }
        dVar.f41178b = new C(ULocale.getDefault(ULocale.Category.FORMAT));
        return dVar;
    }

    public static String[] f(String[] strArr) throws B {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            boolean[] zArr = new boolean[1];
            ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(new ULocale[]{(ULocale) g(str).getLocaleWithoutExtensions()}, ULocale.getAvailableLocales(), zArr);
            if (zArr[0] || uLocaleAcceptLanguage == null) {
                uLocaleAcceptLanguage = null;
            }
            if (uLocaleAcceptLanguage != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static C g(String str) throws B {
        C c6 = new C();
        c6.f9108a = null;
        c6.f9109b = null;
        c6.f9110c = false;
        ULocale.Builder builder = new ULocale.Builder();
        c6.f9109b = builder;
        try {
            builder.setLanguageTag(str);
            c6.f9110c = true;
            return c6;
        } catch (RuntimeException e10) {
            throw new B(e10.getMessage(), 0);
        }
    }

    public static String[] h() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean i(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        int i13;
        if (i10 >= charSequence.length() || (i13 = (i10 - i7) + 1) < i11 || i13 > i12) {
            return false;
        }
        while (i7 <= i10) {
            char cCharAt = charSequence.charAt(i7);
            if (!((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) && (cCharAt < '0' || cCharAt > '9')) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public static String[] j(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] strArrH = h();
        for (String str : strArr) {
            String strA = a(g(str).toCanonicalTagWithoutExtensions(), strArrH);
            if (strA != null && !strA.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static HashMap k(List list, HashMap map, List list2) throws B {
        p1.d dVarE;
        Object obj;
        Object obj2;
        String str;
        HashMap map2 = new HashMap();
        if (((String) c("localeMatcher", map)).equals("lookup")) {
            String[] strArr = (String[]) list.toArray(new String[list.size()]);
            String[] strArrH = h();
            dVarE = new p1.d(12);
            int length = strArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    dVarE.f41178b = new C(ULocale.getDefault(ULocale.Category.FORMAT));
                    break;
                }
                C cG = g(strArr[i7]);
                String strA = a(cG.toCanonicalTagWithoutExtensions(), strArrH);
                if (!strA.isEmpty()) {
                    dVarE.f41178b = g(strA);
                    dVarE.f41179c = cG.getUnicodeExtensions();
                    break;
                }
                i7++;
            }
        } else {
            dVarE = e((String[]) list.toArray(new String[list.size()]));
        }
        HashSet<String> hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            z zVar = f9121f;
            if (((HashMap) dVarE.f41179c).isEmpty() || !((HashMap) dVarE.f41179c).containsKey(str2)) {
                obj = zVar;
            } else {
                String str3 = (String) ((HashMap) dVarE.f41179c).get(str2);
                if (str3.isEmpty()) {
                    str = str3;
                    str = "true";
                }
                str = str3;
                hashSet.add(str2);
                obj = str;
            }
            Object obj3 = obj;
            if (map.containsKey(str2)) {
                Object objC = c(str2, map);
                if ((objC instanceof String) && ((String) objC).isEmpty()) {
                    obj2 = objC;
                    obj2 = objC;
                    obj2 = Boolean.TRUE;
                }
                obj2 = objC;
                obj2 = objC;
                obj2 = objC;
                obj3 = obj;
                if (!(obj2 instanceof A) && !obj2.equals(obj)) {
                    obj3 = obj;
                    hashSet.remove(str2);
                    obj3 = obj2;
                }
            }
            obj3 = obj;
            boolean z3 = obj3 instanceof z;
            Object objC2 = obj3;
            if (!z3) {
                objC2 = E.c(obj3, str2);
            }
            if (!(objC2 instanceof String) || E.a(str2, (String) objC2, (C) dVarE.f41178b)) {
                map2.put(str2, objC2);
            } else {
                map2.put(str2, zVar);
            }
        }
        for (String str4 : hashSet) {
            ArrayList arrayList = new ArrayList();
            String str5 = (String) E.c((String) ((HashMap) dVarE.f41179c).get(str4), str4);
            if (str5 == null || E.a(str4, str5, (C) dVarE.f41178b)) {
                arrayList.add(str5);
                ((C) dVarE.f41178b).setUnicodeExtensions(str4, arrayList);
            }
        }
        map2.put("locale", (C) dVarE.f41178b);
        return map2;
    }

    public static Enum l(Class cls, Object obj) {
        try {
            if (obj instanceof A) {
                return Enum.valueOf(cls, "UNDEFINED");
            }
            if (obj instanceof z) {
                return null;
            }
            String str = (String) obj;
            if (str.equals("2-digit")) {
                return Enum.valueOf(cls, "DIGIT2");
            }
            for (Enum r3 : (Enum[]) cls.getEnumConstants()) {
                if (r3.name().compareToIgnoreCase(str) == 0) {
                    return r3;
                }
            }
            return null;
        } catch (IllegalArgumentException unused) {
        }
    }
}
