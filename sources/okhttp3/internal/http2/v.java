package okhttp3.internal.http2;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.W;
import okhttp3.Y;
import okhttp3.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class v {
    public /* synthetic */ v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final List<C1934e> http2HeadersList(@NotNull Y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        okhttp3.F f10 = request.f40687c;
        ArrayList arrayList = new ArrayList(f10.size() + 4);
        arrayList.add(new C1934e(C1934e.f40814f, request.f40686b));
        Pg.m mVar = C1934e.f40815g;
        okhttp3.J url = request.f40685a;
        Intrinsics.checkNotNullParameter(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new C1934e(mVar, strB));
        String strA = request.a(HttpHeaders.HOST);
        if (strA != null) {
            arrayList.add(new C1934e(C1934e.f40817i, strA));
        }
        arrayList.add(new C1934e(C1934e.f40816h, url.f40579a));
        int size = f10.size();
        for (int i7 = 0; i7 < size; i7++) {
            String strB2 = f10.b(i7);
            Locale locale = Locale.US;
            String strQ = androidx.camera.video.u.q(locale, "US", strB2, locale, "this as java.lang.String).toLowerCase(locale)");
            if (!w.f40895h.contains(strQ) || (Intrinsics.c(strQ, "te") && Intrinsics.c(f10.f(i7), "trailers"))) {
                arrayList.add(new C1934e(strQ, f10.f(i7)));
            }
        }
        return arrayList;
    }

    @NotNull
    public final d0 readHttp2HeadersList(@NotNull okhttp3.F headerBlock, @NotNull W protocol) throws IOException {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = headerBlock.size();
        Hg.k kVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            String name = headerBlock.b(i7);
            String value = headerBlock.f(i7);
            if (Intrinsics.c(name, ":status")) {
                kVar = Hg.k.f3948d.parse("HTTP/1.1 " + value);
            } else if (!w.f40896i.contains(name)) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                arrayList.add(StringsKt.V(value).toString());
            }
        }
        if (kVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        d0 d0Var = new d0();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        d0Var.f40716b = protocol;
        d0Var.f40717c = kVar.f3950b;
        String message = kVar.f3951c;
        Intrinsics.checkNotNullParameter(message, "message");
        d0Var.f40718d = message;
        d0Var.c(new okhttp3.F((String[]) arrayList.toArray(new String[0])));
        return d0Var;
    }

    private v() {
    }
}
