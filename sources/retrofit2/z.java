package retrofit2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f41979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41980f;

    public /* synthetic */ z(Method method, int i7, int i10) {
        this.f41978d = i10;
        this.f41979e = method;
        this.f41980f = i7;
    }

    @Override // retrofit2.U
    public final void a(H h7, Object obj) {
        switch (this.f41978d) {
            case 0:
                okhttp3.F headers = (okhttp3.F) obj;
                if (headers == null) {
                    throw U.o(this.f41979e, this.f41980f, "Headers parameter must not be null.", new Object[0]);
                }
                F1.b bVar = h7.f41830f;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(headers, "headers");
                int size = headers.size();
                for (int i7 = 0; i7 < size; i7++) {
                    bVar.d(headers.b(i7), headers.f(i7));
                }
                return;
            default:
                if (obj == null) {
                    throw U.o(this.f41979e, this.f41980f, "@Url parameter is null.", new Object[0]);
                }
                h7.f41827c = obj.toString();
                return;
        }
    }
}
