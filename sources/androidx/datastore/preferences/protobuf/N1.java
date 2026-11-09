package androidx.datastore.preferences.protobuf;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f16517a;

    static {
        char[] cArr = new char[80];
        f16517a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i7, StringBuilder sb2) {
        while (i7 > 0) {
            int i10 = 80;
            if (i7 <= 80) {
                i10 = i7;
            }
            sb2.append(f16517a, 0, i10);
            i7 -= i10;
        }
    }

    public static void b(StringBuilder sb2, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i7, sb2);
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
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(AbstractC1102h.q(AbstractC1123n.d((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1123n) {
            sb2.append(": \"");
            sb2.append(AbstractC1102h.q((AbstractC1123n) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1145u1) {
            sb2.append(" {");
            c((AbstractC1145u1) obj, sb2, i7 + 2);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            a(i7, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i7 + 2;
        b(sb2, i11, "key", entry.getKey());
        b(sb2, i11, "value", entry.getValue());
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        a(i7, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:133:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0172  */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:70:0x0181  */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:74:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    /* JADX WARN: Code duplicated, block: B:78:0x0196  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x01be  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d0  */
    public static void c(AbstractC1145u1 abstractC1145u1, StringBuilder sb2, int i7) {
        int i10;
        Method method;
        Method method2;
        Object objF;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC1145u1.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method5 = declaredMethods[i11];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i10);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                b(sb2, i7, androidx.camera.video.u.f(4, 0, strSubstring), AbstractC1145u1.f(method4, abstractC1145u1, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb2, i7, androidx.camera.video.u.f(3, 0, strSubstring), AbstractC1145u1.f(method3, abstractC1145u1, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objF = AbstractC1145u1.f(method, abstractC1145u1, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objF instanceof Boolean) {
                                    zEquals = !((Boolean) objF).booleanValue();
                                } else if (objF instanceof Integer) {
                                    if (((Integer) objF).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objF instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objF).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objF instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objF).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objF instanceof String) {
                                    zEquals = objF.equals("");
                                } else if (objF instanceof AbstractC1123n) {
                                    zEquals = objF.equals(AbstractC1123n.f16699b);
                                } else if ((objF instanceof MessageLite) ? !((objF instanceof Enum) && ((Enum) objF).ordinal() == 0) : objF != ((MessageLite) objF).getDefaultInstanceForType()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC1145u1.f(method2, abstractC1145u1, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb2, i7, strSubstring, objF);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objF = AbstractC1145u1.f(method, abstractC1145u1, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objF instanceof Boolean) {
                                zEquals = !((Boolean) objF).booleanValue();
                            } else if (objF instanceof Integer) {
                                if (((Integer) objF).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objF instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objF).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objF instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objF).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objF instanceof String) {
                                zEquals = objF.equals("");
                            } else if (objF instanceof AbstractC1123n) {
                                zEquals = objF.equals(AbstractC1123n.f16699b);
                            } else if (objF instanceof MessageLite) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC1145u1.f(method2, abstractC1145u1, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb2, i7, strSubstring, objF);
                        }
                    }
                }
            }
            i10 = 3;
        }
        if (abstractC1145u1 instanceof AbstractC1142t1) {
            Iterator itH = ((AbstractC1142t1) abstractC1145u1).extensions.h();
            if (itH.hasNext()) {
                ((Map.Entry) itH.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        q2 q2Var = abstractC1145u1.unknownFields;
        if (q2Var != null) {
            for (int i12 = 0; i12 < q2Var.f16752a; i12++) {
                b(sb2, i7, String.valueOf(q2Var.f16753b[i12] >>> 3), q2Var.f16754c[i12]);
            }
        }
    }
}
