package androidx.camera.core.processing;

import E.C0202g;
import android.view.Surface;
import androidx.camera.core.impl.C0968a0;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f14417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f14418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0202g f14420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0202g f14421e;

    public /* synthetic */ k(m mVar, l lVar, int i7, C0202g c0202g, C0202g c0202g2) {
        this.f14417a = mVar;
        this.f14418b = lVar;
        this.f14419c = i7;
        this.f14420d = c0202g;
        this.f14421e = c0202g2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        l lVar = this.f14418b;
        Surface surface = (Surface) obj;
        m mVar = this.f14417a;
        mVar.getClass();
        surface.getClass();
        try {
            lVar.d();
            n nVar = new n(surface, mVar.f14431f, this.f14419c, mVar.f14432g.f14108a, this.f14420d, this.f14421e, mVar.f14427b);
            nVar.t.addListener(new j(lVar, 1), org.chromium.support_lib_boundary.util.b.u());
            p118hf.a.k(lVar.f14425r == null, "Consumer can only be linked once.");
            lVar.f14425r = nVar;
            return androidx.camera.core.impl.utils.futures.j.d(nVar);
        } catch (C0968a0 e10) {
            return new androidx.camera.core.impl.utils.futures.l(e10, 1);
        }
    }
}
