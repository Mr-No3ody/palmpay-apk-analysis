package kotlinx.coroutines.flow;

import Wf.C0765i;
import Zf.AbstractC0806b;
import Zf.AbstractC0808d;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class Y extends AbstractC0808d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0765i f39127b;

    @Override // Zf.AbstractC0808d
    public final boolean a(AbstractC0806b abstractC0806b) {
        W w3 = (W) abstractC0806b;
        if (this.f39126a >= 0) {
            return false;
        }
        long j6 = w3.f39119i;
        if (j6 < w3.f39120j) {
            w3.f39120j = j6;
        }
        this.f39126a = j6;
        return true;
    }

    @Override // Zf.AbstractC0808d
    public final Continuation[] b(AbstractC0806b abstractC0806b) {
        long j6 = this.f39126a;
        this.f39126a = -1L;
        this.f39127b = null;
        return ((W) abstractC0806b).q(j6);
    }
}
