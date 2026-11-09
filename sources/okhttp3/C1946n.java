package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okhttp3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1946n {
    public /* synthetic */ C1946n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1947o init(String str, int i7) {
        C1947o c1947o = new C1947o(str);
        C1947o.f40953d.put(str, c1947o);
        return c1947o;
    }

    private final String secondaryName(String str) {
        if (kotlin.text.y.m(str, "TLS_", false)) {
            StringBuilder sb2 = new StringBuilder("SSL_");
            String strSubstring = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb2.append(strSubstring);
            return sb2.toString();
        }
        if (!kotlin.text.y.m(str, "SSL_", false)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder("TLS_");
        String strSubstring2 = str.substring(4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb3.append(strSubstring2);
        return sb3.toString();
    }

    @JvmStatic
    @NotNull
    public final synchronized C1947o forJavaName(@NotNull String javaName) {
        C1947o c1947o;
        try {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = C1947o.f40953d;
            c1947o = (C1947o) linkedHashMap.get(javaName);
            if (c1947o == null) {
                c1947o = (C1947o) linkedHashMap.get(secondaryName(javaName));
                if (c1947o == null) {
                    c1947o = new C1947o(javaName);
                }
                linkedHashMap.put(javaName, c1947o);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1947o;
    }

    @NotNull
    public final Comparator<String> getORDER_BY_NAME$okhttp() {
        return C1947o.f40952c;
    }

    private C1946n() {
    }
}
