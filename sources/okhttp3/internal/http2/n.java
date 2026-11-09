package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends Fg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f40844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f40845g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, u uVar, Object obj, int i7) {
        super(str, true);
        this.f40843e = i7;
        this.f40844f = uVar;
        this.f40845g = obj;
    }

    @Override // Fg.a
    public final long a() {
        switch (this.f40843e) {
            case 0:
                u uVar = this.f40844f;
                uVar.f40880a.a(uVar, (K) ((kotlin.jvm.internal.F) this.f40845g).f38951a);
                break;
            default:
                E e10 = (E) this.f40845g;
                u uVar2 = this.f40844f;
                try {
                    uVar2.f40880a.b(e10);
                    break;
                } catch (IOException e11) {
                    Jg.t tVar = Jg.t.f4869a.get();
                    String str = "Http2Connection.Listener failure for " + uVar2.f40882c;
                    tVar.getClass();
                    Jg.t.i(4, str, e11);
                    try {
                        e10.c(EnumC1932c.PROTOCOL_ERROR, e11);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                break;
        }
        return -1L;
    }
}
