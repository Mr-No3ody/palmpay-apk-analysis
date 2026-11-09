package androidx.biometric;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AbstractC0901e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f13102a;

    public y(A a3) {
        this.f13102a = new WeakReference(a3);
    }

    @Override // androidx.biometric.AbstractC0901e
    public final void a(int i7, CharSequence charSequence) {
        WeakReference weakReference = this.f13102a;
        if (weakReference.get() == null || ((A) weakReference.get()).f13034A || !((A) weakReference.get()).f13057w) {
            return;
        }
        ((A) weakReference.get()).e(new C0902f(i7, charSequence));
    }

    @Override // androidx.biometric.AbstractC0901e
    public final void b(C0915t c0915t) {
        WeakReference weakReference = this.f13102a;
        if (weakReference.get() == null || !((A) weakReference.get()).f13057w) {
            return;
        }
        int i7 = -1;
        if (c0915t.f13091b == -1) {
            int iD = ((A) weakReference.get()).d();
            if ((iD & 32767) != 0 && !com.palmpay.lib.apm.launchcounter.util.d.A(iD)) {
                i7 = 2;
            }
            c0915t = new C0915t(c0915t.f13090a, i7);
        }
        A a3 = (A) weakReference.get();
        if (a3.f13038L == null) {
            a3.f13038L = new androidx.lifecycle.F();
        }
        A.i(a3.f13038L, c0915t);
    }
}
