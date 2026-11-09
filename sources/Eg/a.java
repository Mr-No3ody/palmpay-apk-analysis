package Eg;

import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okhttp3.F;
import okhttp3.d0;
import okhttp3.e0;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F combine(F f10, F f11) {
        ArrayList arrayList = new ArrayList(20);
        int size = f10.size();
        for (int i7 = 0; i7 < size; i7++) {
            String name = f10.b(i7);
            String value = f10.f(i7);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(name) || !y.m(value, "1", false)) && (isContentSpecificHeader(name) || !isEndToEnd(name) || f11.a(name) == null)) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                arrayList.add(StringsKt.V(value).toString());
            }
        }
        int size2 = f11.size();
        for (int i10 = 0; i10 < size2; i10++) {
            String name2 = f11.b(i10);
            if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                String value2 = f11.f(i10);
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(value2, "value");
                arrayList.add(name2);
                arrayList.add(StringsKt.V(value2).toString());
            }
        }
        return new F((String[]) arrayList.toArray(new String[0]));
    }

    private final boolean isContentSpecificHeader(String str) {
        return HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str);
    }

    private final boolean isEndToEnd(String str) {
        return ("Connection".equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || HttpHeaders.TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e0 stripBody(e0 e0Var) {
        if ((e0Var != null ? e0Var.f40734g : null) == null) {
            return e0Var;
        }
        d0 d0VarC = e0Var.c();
        d0VarC.f40721g = null;
        return d0VarC.a();
    }

    private a() {
    }
}
