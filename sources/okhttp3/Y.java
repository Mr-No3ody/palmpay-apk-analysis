package okhttp3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f40685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f40687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f40688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f40689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1943k f40690f;

    public Y(J url, String method, F headers, c0 c0Var, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f40685a = url;
        this.f40686b = method;
        this.f40687c = headers;
        this.f40688d = c0Var;
        this.f40689e = tags;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f40687c.a(name);
    }

    public final X b() {
        Intrinsics.checkNotNullParameter(this, "request");
        X x3 = new X();
        x3.f40684e = new LinkedHashMap();
        x3.f40680a = this.f40685a;
        x3.f40681b = this.f40686b;
        x3.f40683d = this.f40688d;
        Map map = this.f40689e;
        x3.f40684e = map.isEmpty() ? new LinkedHashMap() : kotlin.collections.G.l(map);
        x3.f40682c = this.f40687c.d();
        return x3;
    }

    public final Object c(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f40689e.get(type));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f40686b);
        sb2.append(", url=");
        sb2.append(this.f40685a);
        F f10 = this.f40687c;
        if (f10.size() != 0) {
            sb2.append(", headers=[");
            int i7 = 0;
            for (Object obj : f10) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    C1850q.k();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.f38891a;
                String str2 = (String) pair.f38892b;
                if (i7 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i7 = i10;
            }
            sb2.append(']');
        }
        Map map = this.f40689e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
