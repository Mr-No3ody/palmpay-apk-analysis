package Ng;

import C0.G;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Fg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6402e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f6403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, h hVar) {
        super(str, true);
        this.f6403f = hVar;
    }

    @Override // Fg.a
    public final long a() {
        switch (this.f6402e) {
            case 0:
                h hVar = this.f6403f;
                try {
                    return hVar.g() ? 0L : -1L;
                } catch (IOException e10) {
                    hVar.b(e10, null);
                }
                break;
            default:
                this.f6403f.cancel();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(G.r(new StringBuilder(), hVar.f6419m, " writer"), true);
        this.f6403f = hVar;
    }
}
