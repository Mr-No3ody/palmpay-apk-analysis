package p131id;

import Ab.r;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import androidx.core.os.d;
import com.transsnet.palmpay.security.utils.FingerPrintHelper$AuthenticationCallback;
import javax.crypto.Cipher;
import p003a0.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends J3.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f37572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f37573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f37574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FingerPrintHelper$AuthenticationCallback f37575h;

    public a(Context context) {
        this.f37573f = context;
        this.f37572e = new b(context);
    }

    @Override // J3.a
    public final void F(int i7, CharSequence charSequence) {
        F6.d.c("a", "onAuthenticationError: " + ((Object) charSequence));
        FingerPrintHelper$AuthenticationCallback fingerPrintHelper$AuthenticationCallback = this.f37575h;
        if (fingerPrintHelper$AuthenticationCallback != null) {
            fingerPrintHelper$AuthenticationCallback.onAuthenticationError();
        }
    }

    @Override // J3.a
    public final void G() {
        F6.d.c("a", "onAuthenticationFailed: ");
        FingerPrintHelper$AuthenticationCallback fingerPrintHelper$AuthenticationCallback = this.f37575h;
        if (fingerPrintHelper$AuthenticationCallback != null) {
            fingerPrintHelper$AuthenticationCallback.onAuthenticationFailed();
        }
    }

    @Override // J3.a
    public final void I(r rVar) {
        F6.d.c("a", "onAuthenticationSucceeded: ");
        FingerPrintHelper$AuthenticationCallback fingerPrintHelper$AuthenticationCallback = this.f37575h;
        if (fingerPrintHelper$AuthenticationCallback != null) {
            top.zibin.luban.io.a aVar = (top.zibin.luban.io.a) rVar.f139b;
            if (aVar == null) {
                fingerPrintHelper$AuthenticationCallback.onAuthenticationSucceeded(null);
            } else {
                fingerPrintHelper$AuthenticationCallback.onAuthenticationSucceeded((Cipher) aVar.f42646c);
            }
        }
    }

    public final boolean W() {
        FingerprintManager fingerprintManagerB;
        if (androidx.core.content.d.a(this.f37573f, "android.permission.USE_FINGERPRINT") == 0) {
            b bVar = this.f37572e;
            if (bVar.c() && (fingerprintManagerB = b.b(bVar.f11816a)) != null && fingerprintManagerB.hasEnrolledFingerprints()) {
                return true;
            }
        }
        return false;
    }

    public final void X(FingerPrintHelper$AuthenticationCallback fingerPrintHelper$AuthenticationCallback) {
        this.f37575h = fingerPrintHelper$AuthenticationCallback;
        d dVar = new d();
        this.f37574g = dVar;
        try {
            this.f37572e.a(null, dVar, this);
        } catch (Exception e10) {
            F6.d.c("a", "startListen: ", e10);
            Y();
        }
    }

    public final void Y() {
        try {
            d dVar = this.f37574g;
            if (dVar != null) {
                dVar.a();
                this.f37574g = null;
            }
        } catch (Exception e10) {
            this.f37574g = null;
            F6.d.c("a", "stopsListen: ", e10);
        }
        this.f37575h = null;
    }
}
