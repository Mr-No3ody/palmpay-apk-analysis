package okhttp3;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okhttp3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1925e {
    public /* synthetic */ C1925e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final Set<String> varyFields(F f10) {
        int size = f10.size();
        TreeSet treeSet = null;
        for (int i7 = 0; i7 < size; i7++) {
            if (HttpHeaders.VARY.equalsIgnoreCase(f10.b(i7))) {
                String strF = f10.f(i7);
                if (treeSet == null) {
                    Intrinsics.checkNotNullParameter(kotlin.jvm.internal.J.f38955a, "<this>");
                    Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                    Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                }
                Iterator it = StringsKt.M(strF, new char[]{','}, 6).iterator();
                while (it.hasNext()) {
                    treeSet.add(StringsKt.V((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? kotlin.collections.B.f38895a : treeSet;
    }

    public final boolean hasVaryAll(@NotNull e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        return varyFields(e0Var.f40733f).contains("*");
    }

    @JvmStatic
    @NotNull
    public final String key(@NotNull J url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return Pg.m.f7359d.encodeUtf8(url.f40587i).c("MD5").e();
    }

    public final int readInt$okhttp(@NotNull BufferedSource source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            long decimalLong = source.readDecimalLong();
            String utf8LineStrict = source.readUtf8LineStrict();
            if (decimalLong >= 0 && decimalLong <= 2147483647L && utf8LineStrict.length() <= 0) {
                return (int) decimalLong;
            }
            throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + '\"');
        } catch (NumberFormatException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @NotNull
    public final F varyHeaders(@NotNull e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        e0 e0Var2 = e0Var.f40735i;
        Intrinsics.e(e0Var2);
        return varyHeaders(e0Var2.f40728a.f40687c, e0Var.f40733f);
    }

    public final boolean varyMatches(@NotNull e0 cachedResponse, @NotNull F cachedRequest, @NotNull Y newRequest) {
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
        Intrinsics.checkNotNullParameter(newRequest, "newRequest");
        Set<String> setVaryFields = varyFields(cachedResponse.f40733f);
        if (setVaryFields != null && setVaryFields.isEmpty()) {
            return true;
        }
        for (String name : setVaryFields) {
            List listG = cachedRequest.g(name);
            newRequest.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            if (!Intrinsics.c(listG, newRequest.f40687c.g(name))) {
                return false;
            }
        }
        return true;
    }

    private C1925e() {
    }

    private final F varyHeaders(F f10, F f11) {
        Set<String> setVaryFields = varyFields(f11);
        if (setVaryFields.isEmpty()) {
            return Dg.c.f1880b;
        }
        ArrayList arrayList = new ArrayList(20);
        int size = f10.size();
        for (int i7 = 0; i7 < size; i7++) {
            String name = f10.b(i7);
            if (setVaryFields.contains(name)) {
                String value = f10.f(i7);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                E e10 = F.f40566b;
                e10.checkName(name);
                e10.checkValue(value, name);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                arrayList.add(StringsKt.V(value).toString());
            }
        }
        return new F((String[]) arrayList.toArray(new String[0]));
    }
}
