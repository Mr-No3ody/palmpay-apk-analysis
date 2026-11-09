package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public class H {
    public static String a(FunctionBase functionBase) {
        String string = functionBase.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
