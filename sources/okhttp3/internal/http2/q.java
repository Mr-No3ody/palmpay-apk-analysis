package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends Fg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f40852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Pg.k f40854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f40855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f40856i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, u uVar, int i7, Pg.k kVar, int i10, boolean z3) {
        super(str, true);
        this.f40852e = uVar;
        this.f40853f = i7;
        this.f40854g = kVar;
        this.f40855h = i10;
        this.f40856i = z3;
    }

    @Override // Fg.a
    public final long a() {
        try {
            this.f40852e.f40891p.onData(this.f40853f, this.f40854g, this.f40855h, this.f40856i);
            this.f40852e.f40878Y.g(this.f40853f, EnumC1932c.CANCEL);
            synchronized (this.f40852e) {
                this.f40852e.f40889k0.remove(Integer.valueOf(this.f40853f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
