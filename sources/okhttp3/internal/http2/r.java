package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends Fg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f40857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f40859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f40860h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, u uVar, int i7, List list, boolean z3) {
        super(str, true);
        this.f40857e = uVar;
        this.f40858f = i7;
        this.f40859g = list;
        this.f40860h = z3;
    }

    @Override // Fg.a
    public final long a() {
        this.f40857e.f40891p.onHeaders(this.f40858f, this.f40859g, this.f40860h);
        try {
            this.f40857e.f40878Y.g(this.f40858f, EnumC1932c.CANCEL);
            synchronized (this.f40857e) {
                this.f40857e.f40889k0.remove(Integer.valueOf(this.f40858f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
