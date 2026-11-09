package androidx.camera.core.streamsharing;

import E.n0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.SessionConfig$ErrorListener;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements SessionConfig$ErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f14466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UseCaseConfig f14469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0993n f14470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0993n f14471f;

    public /* synthetic */ c(d dVar, String str, String str2, UseCaseConfig useCaseConfig, C0993n c0993n, C0993n c0993n2) {
        this.f14466a = dVar;
        this.f14467b = str;
        this.f14468c = str2;
        this.f14469d = useCaseConfig;
        this.f14470e = c0993n;
        this.f14471f = c0993n2;
    }

    @Override // androidx.camera.core.impl.SessionConfig$ErrorListener
    public final void onError(H0 h7, F0 f1) {
        d dVar = this.f14466a;
        if (dVar.b() == null) {
            return;
        }
        dVar.D();
        dVar.C(dVar.E(this.f14467b, this.f14468c, this.f14469d, this.f14470e, this.f14471f));
        dVar.o();
        h hVar = dVar.f14474p;
        hVar.getClass();
        p140j8.f.b();
        Iterator it = hVar.f14491a.iterator();
        while (it.hasNext()) {
            hVar.onUseCaseReset((n0) it.next());
        }
    }
}
