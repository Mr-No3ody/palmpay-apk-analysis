package androidx.biometric;

import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: renamed from: androidx.biometric.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897a extends J3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ top.zibin.luban.io.a f13070e;

    public C0897a(top.zibin.luban.io.a aVar) {
        this.f13070e = aVar;
    }

    @Override // J3.a
    public final void F(int i7, CharSequence charSequence) {
        ((y) this.f13070e.f42647d).a(i7, charSequence);
    }

    @Override // J3.a
    public final void G() {
        WeakReference weakReference = ((y) this.f13070e.f42647d).f13102a;
        if (weakReference.get() == null || !((A) weakReference.get()).f13057w) {
            return;
        }
        A a3 = (A) weakReference.get();
        if (a3.f13041X == null) {
            a3.f13041X = new androidx.lifecycle.F();
        }
        A.i(a3.f13041X, Boolean.TRUE);
    }

    @Override // J3.a
    public final void H(CharSequence charSequence) {
        WeakReference weakReference = ((y) this.f13070e.f42647d).f13102a;
        if (weakReference.get() != null) {
            A a3 = (A) weakReference.get();
            if (a3.f13040Q == null) {
                a3.f13040Q = new androidx.lifecycle.F();
            }
            A.i(a3.f13040Q, charSequence);
        }
    }

    @Override // J3.a
    public final void I(Ab.r rVar) {
        u uVar = null;
        top.zibin.luban.io.a aVar = (top.zibin.luban.io.a) rVar.f139b;
        if (aVar != null) {
            Cipher cipher = (Cipher) aVar.f42646c;
            if (cipher != null) {
                uVar = new u(cipher);
            } else {
                Signature signature = (Signature) aVar.f42645b;
                if (signature != null) {
                    uVar = new u(signature);
                } else {
                    Mac mac = (Mac) aVar.f42647d;
                    if (mac != null) {
                        uVar = new u(mac);
                    }
                }
            }
        }
        ((y) this.f13070e.f42647d).b(new C0915t(uVar, 2));
    }
}
