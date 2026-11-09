package retrofit2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f41817d = new D();

    @Override // retrofit2.U
    public final void a(H h7, Object obj) {
        okhttp3.P part = (okhttp3.P) obj;
        if (part != null) {
            okhttp3.M m7 = h7.f41833i;
            m7.getClass();
            Intrinsics.checkNotNullParameter(part, "part");
            m7.f40598c.add(part);
        }
    }
}
