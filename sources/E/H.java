package E;

import androidx.camera.core.ForwardingImageProxy$OnImageCloseListener;
import androidx.camera.core.ImageProxy;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H implements ForwardingImageProxy$OnImageCloseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1927b;

    public /* synthetic */ H(Object obj, int i7) {
        this.f1926a = i7;
        this.f1927b = obj;
    }

    @Override // androidx.camera.core.ForwardingImageProxy$OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        ForwardingImageProxy$OnImageCloseListener forwardingImageProxy$OnImageCloseListener;
        switch (this.f1926a) {
            case 0:
                J j6 = (J) ((WeakReference) ((I) this.f1927b).f1929e).get();
                if (j6 != null) {
                    j6.f1930M.execute(new Ae.n(j6, 10));
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f1927b;
                synchronized (d0Var.f2006a) {
                    try {
                        int i7 = d0Var.f2007b - 1;
                        d0Var.f2007b = i7;
                        if (d0Var.f2008c && i7 == 0) {
                            d0Var.close();
                        }
                        forwardingImageProxy$OnImageCloseListener = d0Var.f2011f;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (forwardingImageProxy$OnImageCloseListener != null) {
                    forwardingImageProxy$OnImageCloseListener.onImageClose(imageProxy);
                    return;
                }
                return;
        }
    }
}
