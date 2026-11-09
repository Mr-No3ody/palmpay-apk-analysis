package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Fg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f40846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f40848g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, u uVar, int i7, int i10) {
        super(str, true);
        this.f40846e = uVar;
        this.f40847f = i7;
        this.f40848g = i10;
    }

    @Override // Fg.a
    public final long a() {
        int i7 = this.f40847f;
        int i10 = this.f40848g;
        u uVar = this.f40846e;
        uVar.getClass();
        try {
            uVar.f40878Y.f(true, i7, i10);
            return -1L;
        } catch (IOException e10) {
            uVar.b(e10);
            return -1L;
        }
    }
}
