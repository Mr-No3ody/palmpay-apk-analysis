package com.google.android.gms.internal.measurement;

import C0.G;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzafe {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzafc zzafcVar, String str) {
        StringBuilder sbT = G.t("# ", str);
        zzc(zzafcVar, sbT, 0);
        return sbT.toString();
    }

    public static void zzb(StringBuilder sb2, int i7, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzd(i7, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof zzacr) {
                sb2.append(": \"");
                sb2.append(zzafx.zza(((zzacr) obj).zzm()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof zzadu) {
                sb2.append(" {");
                zzc((zzadu) obj, sb2, i7 + 2);
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                zzd(i7, sb2);
                sb2.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb2.append(": ");
                sb2.append(obj);
                return;
            }
            int i11 = i7 + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            zzb(sb2, i11, "key", entry.getKey());
            zzb(sb2, i11, "value", entry.getValue());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            zzd(i7, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": \"");
        String strReplace2 = (String) obj;
        boolean z3 = false;
        boolean z8 = false;
        boolean z10 = false;
        for (int i12 = 0; i12 < strReplace2.length(); i12++) {
            char cCharAt2 = strReplace2.charAt(i12);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = zzafx.zza(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb2.append(strReplace);
                sb2.append('\"');
            } else {
                if (cCharAt2 == '\"') {
                    z10 = true;
                } else if (cCharAt2 == '\'') {
                    z8 = true;
                } else if (cCharAt2 == '\\') {
                    z3 = true;
                }
            }
        }
        if (z3) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z8 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z10) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb2.append(strReplace);
        sb2.append('\"');
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x017f  */
    private static void zzc(zzafc zzafcVar, StringBuilder sb2, int i7) {
        int i10;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzafcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i10);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i7, strSubstring.substring(0, strSubstring.length() - 4), zzadu.zzcu(method2, zzafcVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i7, strSubstring.substring(0, strSubstring.length() - 3), zzadu.zzcu(method, zzafcVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzcu = zzadu.zzcu(method4, zzafcVar, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) zzadu.zzcu(method5, zzafcVar, new Object[0])).booleanValue();
                    } else if (objZzcu instanceof Boolean) {
                        if (((Boolean) objZzcu).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objZzcu instanceof Integer) {
                        if (((Integer) objZzcu).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objZzcu instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objZzcu).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objZzcu instanceof Double)) {
                        if (objZzcu instanceof String) {
                            zEquals = objZzcu.equals("");
                        } else if (objZzcu instanceof zzacr) {
                            zEquals = objZzcu.equals(zzacr.zza);
                        } else if (!(objZzcu instanceof zzafc) ? !((objZzcu instanceof Enum) && ((Enum) objZzcu).ordinal() == 0) : objZzcu != ((zzafc) objZzcu).zzcK()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objZzcu).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        zzb(sb2, i7, strSubstring, objZzcu);
                    }
                }
            }
            i10 = 3;
        }
        if (zzafcVar instanceof zzadr) {
            Iterator itZzc = ((zzadr) zzafcVar).zzb.zzc();
            if (itZzc.hasNext()) {
                throw null;
            }
        }
        zzaga zzagaVar = ((zzadu) zzafcVar).zzc;
        if (zzagaVar != null) {
            zzagaVar.zzj(sb2, i7);
        }
    }

    private static void zzd(int i7, StringBuilder sb2) {
        while (i7 > 0) {
            int i10 = 80;
            if (i7 <= 80) {
                i10 = i7;
            }
            sb2.append(zza, 0, i10);
            i7 -= i10;
        }
    }
}
