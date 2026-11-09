package androidx.camera.core.processing;

import E.C0204i;
import E.C0205j;
import E.l0;
import N8.J;
import android.view.Surface;
import androidx.camera.video.E;
import androidx.core.util.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14455b;

    public /* synthetic */ o(Object obj, int i7) {
        this.f14454a = i7;
        this.f14455b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f14454a) {
            case 0:
                l0 l0Var = (l0) obj;
                for (Map.Entry entry : ((Map) this.f14455b).entrySet()) {
                    int i7 = ((C0205j) l0Var).f2044b - ((H.c) entry.getKey()).f3507f;
                    if (((H.c) entry.getKey()).f3508g) {
                        i7 = -i7;
                    }
                    int iH = androidx.camera.core.impl.utils.o.h(i7);
                    m mVar = (m) entry.getValue();
                    mVar.getClass();
                    p140j8.f.B(new J(mVar, iH, -1, 1));
                }
                break;
            default:
                C0204i c0204i = (C0204i) obj;
                E e10 = (E) this.f14455b;
                e10.getClass();
                c0204i.f2040b.hashCode();
                p140j8.f.G("VideoEncoderSession");
                Surface surface = e10.f14561e;
                Surface surface2 = c0204i.f2040b;
                if (surface2 == surface) {
                    e10.f14561e = null;
                    e10.f14569m.b(e10.f14560d);
                    e10.a();
                } else {
                    surface2.release();
                }
                break;
        }
    }
}
