package androidx.biometric;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class z implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13103a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13104b;

    public z(A a3) {
        this.f13104b = new WeakReference(a3);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f13103a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.f13104b;
                if (weakReference.get() != null) {
                    ((A) weakReference.get()).h(true);
                }
                break;
            default:
                ((FingerprintDialogFragment) this.f13104b).f13063c.h(true);
                break;
        }
    }

    public z(FingerprintDialogFragment fingerprintDialogFragment) {
        this.f13104b = fingerprintDialogFragment;
    }
}
