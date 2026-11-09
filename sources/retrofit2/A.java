package retrofit2;

import N8.q0;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41805d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f41806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Converter f41808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f41809h;

    public A(Method method, int i7, okhttp3.F f10, Converter converter) {
        this.f41806e = method;
        this.f41807f = i7;
        this.f41809h = f10;
        this.f41808g = converter;
    }

    @Override // retrofit2.U
    public final void a(H h7, Object obj) {
        switch (this.f41805d) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    c0 body = (c0) this.f41808g.convert(obj);
                    okhttp3.M m7 = h7.f41833i;
                    m7.getClass();
                    Intrinsics.checkNotNullParameter(body, "body");
                    okhttp3.P part = okhttp3.P.f40599c.create((okhttp3.F) this.f41809h, body);
                    Intrinsics.checkNotNullParameter(part, "part");
                    m7.f40598c.add(part);
                    return;
                } catch (IOException e10) {
                    throw U.o(this.f41806e, this.f41807f, "Unable to convert " + obj + " to RequestBody", e10);
                }
            default:
                Map map = (Map) obj;
                Method method = this.f41806e;
                int i7 = this.f41807f;
                if (map == null) {
                    throw U.o(method, i7, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw U.o(method, i7, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw U.o(method, i7, q0.k("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    okhttp3.F fOf = okhttp3.F.f40566b.of(HttpHeaders.CONTENT_DISPOSITION, q0.k("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) this.f41809h);
                    c0 body2 = (c0) this.f41808g.convert(value);
                    okhttp3.M m10 = h7.f41833i;
                    m10.getClass();
                    Intrinsics.checkNotNullParameter(body2, "body");
                    okhttp3.P part2 = okhttp3.P.f40599c.create(fOf, body2);
                    Intrinsics.checkNotNullParameter(part2, "part");
                    m10.f40598c.add(part2);
                }
                return;
        }
    }

    public A(Method method, int i7, Converter converter, String str) {
        this.f41806e = method;
        this.f41807f = i7;
        this.f41808g = converter;
        this.f41809h = str;
    }
}
