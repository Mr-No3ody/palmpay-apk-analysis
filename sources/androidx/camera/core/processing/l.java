package androidx.camera.core.processing;

import E.AbstractC0198c;
import android.util.Size;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.L;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0970b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.concurrent.futures.m f14422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.concurrent.futures.k f14423p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AbstractC0970b0 f14424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f14425r;

    public l(Size size, int i7) {
        super(size, i7);
        this.f14422o = AbstractC0198c.y(new L(this, 2));
    }

    @Override // androidx.camera.core.impl.AbstractC0970b0
    public final void a() {
        super.a();
        p140j8.f.B(new j(this, 2));
    }

    @Override // androidx.camera.core.impl.AbstractC0970b0
    public final ListenableFuture f() {
        return this.f14422o;
    }

    public final boolean g(AbstractC0970b0 abstractC0970b0, Runnable runnable) {
        boolean z3;
        p140j8.f.b();
        abstractC0970b0.getClass();
        AbstractC0970b0 abstractC0970b1 = this.f14424q;
        if (abstractC0970b1 == abstractC0970b0) {
            return false;
        }
        p118hf.a.k(abstractC0970b1 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
        Size size = this.f14028h;
        Size size2 = abstractC0970b0.f14028h;
        p118hf.a.g(size.equals(size2), "The provider's size(" + size + ") must match the parent(" + size2 + ")");
        int i7 = abstractC0970b0.f14029i;
        int i10 = this.f14029i;
        p118hf.a.g(i10 == i7, "The provider's format(" + i10 + ") must match the parent(" + i7 + ")");
        synchronized (this.f14021a) {
            z3 = this.f14023c;
        }
        p118hf.a.k(!z3, "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
        this.f14424q = abstractC0970b0;
        androidx.camera.core.impl.utils.futures.j.f(abstractC0970b0.c(), this.f14423p);
        abstractC0970b0.d();
        androidx.camera.core.impl.utils.futures.j.e(this.f14025e).addListener(new W8.o(abstractC0970b0, 19), org.chromium.support_lib_boundary.util.b.u());
        androidx.camera.core.impl.utils.futures.j.e(abstractC0970b0.f14027g).addListener(runnable, org.chromium.support_lib_boundary.util.b.S());
        return true;
    }
}
