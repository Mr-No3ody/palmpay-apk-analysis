package E;

import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.H0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC0999q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1957b;

    public /* synthetic */ V(Object obj, int i7) {
        this.f1956a = i7;
        this.f1957b = obj;
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public void b(int i7, CameraCaptureResult cameraCaptureResult) {
        switch (this.f1956a) {
            case 0:
                W w3 = (W) this.f1957b;
                synchronized (w3.f1958a) {
                    try {
                        if (w3.f1962e) {
                            return;
                        }
                        w3.f1966i.put(cameraCaptureResult.getTimestamp(), new androidx.camera.core.internal.c(cameraCaptureResult));
                        w3.d();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
            default:
                return;
            case 2:
                Iterator it = ((androidx.camera.core.streamsharing.h) this.f1957b).f14491a.iterator();
                while (it.hasNext()) {
                    H0 h7 = ((n0) it.next()).f2085m;
                    Iterator it2 = h7.f13886g.f13970e.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC0999q) it2.next()).b(i7, new androidx.camera.core.streamsharing.i(cameraCaptureResult, h7.f13886g.f13972g, -1L));
                    }
                }
                return;
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public void d(int i7, int i10) {
        switch (this.f1956a) {
            case 1:
                org.chromium.support_lib_boundary.util.b.S().execute(new B3.a(this, i10, 7));
                break;
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public void e(int i7) {
        switch (this.f1956a) {
            case 1:
                org.chromium.support_lib_boundary.util.b.S().execute(new W8.o(this, 12));
                break;
        }
    }
}
