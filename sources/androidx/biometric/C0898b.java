package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: renamed from: androidx.biometric.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0898b extends BiometricPrompt$AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0901e f13071a;

    public C0898b(AbstractC0901e abstractC0901e) {
        this.f13071a = abstractC0901e;
    }

    public void onAuthenticationError(int i7, CharSequence charSequence) {
        this.f13071a.a(i7, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((y) this.f13071a).f13102a;
        if (weakReference.get() == null || !((A) weakReference.get()).f13057w) {
            return;
        }
        A a3 = (A) weakReference.get();
        if (a3.f13041X == null) {
            a3.f13041X = new androidx.lifecycle.F();
        }
        A.i(a3.f13041X, Boolean.TRUE);
    }

    public void onAuthenticationHelp(int i7, CharSequence charSequence) {
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObjectB;
        PresentationSession presentationSessionB;
        IdentityCredential identityCredentialB;
        u uVar = null;
        if (authenticationResult != null && (cryptoObjectB = AbstractC0899c.b(authenticationResult)) != null) {
            Cipher cipherD = E.d(cryptoObjectB);
            if (cipherD != null) {
                uVar = new u(cipherD);
            } else {
                Signature signatureF = E.f(cryptoObjectB);
                if (signatureF != null) {
                    uVar = new u(signatureF);
                } else {
                    Mac macE = E.e(cryptoObjectB);
                    if (macE != null) {
                        uVar = new u(macE);
                    } else {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 30 && (identityCredentialB = F.b(cryptoObjectB)) != null) {
                            uVar = new u(identityCredentialB);
                        } else if (i7 >= 33 && (presentationSessionB = G.b(cryptoObjectB)) != null) {
                            uVar = new u(presentationSessionB);
                        }
                    }
                }
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        int iA = -1;
        if (i10 >= 30) {
            if (authenticationResult != null) {
                iA = AbstractC0900d.a(authenticationResult);
            }
        } else if (i10 != 29) {
            iA = 2;
        }
        this.f13071a.b(new C0915t(uVar, iA));
    }
}
