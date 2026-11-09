package E;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC0970b0;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends AbstractC0970b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2049o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f2050p;

    public j0(Surface surface, Size size, int i7) {
        super(size, i7);
        this.f2050p = surface;
    }

    @Override // androidx.camera.core.impl.AbstractC0970b0
    public final ListenableFuture f() {
        switch (this.f2049o) {
            case 0:
                return ((m0) this.f2050p).f2061g;
            default:
                return androidx.camera.core.impl.utils.futures.j.d((Surface) this.f2050p);
        }
    }

    public j0(Surface surface) {
        super(AbstractC0970b0.f14017k, 0);
        this.f2050p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, Size size) {
        super(size, 34);
        this.f2050p = m0Var;
    }
}
