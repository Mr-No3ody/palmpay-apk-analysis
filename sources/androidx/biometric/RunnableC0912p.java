package androidx.biometric;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.biometric.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0912p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13088b;

    public RunnableC0912p(FingerprintDialogFragment fingerprintDialogFragment) {
        this.f13087a = 3;
        this.f13088b = fingerprintDialogFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13087a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.f13088b;
                if (weakReference.get() != null) {
                    ((BiometricFragment) weakReference.get()).n();
                }
                break;
            case 1:
                WeakReference weakReference2 = (WeakReference) this.f13088b;
                if (weakReference2.get() != null) {
                    ((A) weakReference2.get()).f13035B = false;
                }
                break;
            case 2:
                WeakReference weakReference3 = (WeakReference) this.f13088b;
                if (weakReference3.get() != null) {
                    ((A) weakReference3.get()).f13036C = false;
                }
                break;
            default:
                FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) this.f13088b;
                Context context = fingerprintDialogFragment.getContext();
                if (context != null) {
                    fingerprintDialogFragment.f13063c.g(1);
                    fingerprintDialogFragment.f13063c.f(context.getString(T.fingerprint_dialog_touch_sensor));
                    break;
                }
                break;
        }
    }

    public RunnableC0912p(BiometricFragment biometricFragment) {
        this.f13087a = 0;
        this.f13088b = new WeakReference(biometricFragment);
    }

    public RunnableC0912p(A a3, int i7) {
        this.f13087a = i7;
        switch (i7) {
            case 2:
                this.f13088b = new WeakReference(a3);
                break;
            default:
                this.f13088b = new WeakReference(a3);
                break;
        }
    }
}
