package androidx.biometric;

import N8.q0;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.transsnet.palmpay.core.base.BaseFragment;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Z f13100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13101b;

    public w(BaseFragment baseFragment, Executor executor, p059e1.a aVar) {
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        Z childFragmentManager = baseFragment.getChildFragmentManager();
        final A a3 = (A) new androidx.camera.video.internal.c(baseFragment).h(A.class);
        baseFragment.getLifecycle().a(new DefaultLifecycleObserver(a3) { // from class: androidx.biometric.BiometricPrompt$ResetCallbackObserver

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference f13060a;

            {
                this.f13060a = new WeakReference(a3);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(LifecycleOwner lifecycleOwner) {
                WeakReference weakReference = this.f13060a;
                if (weakReference.get() != null) {
                    ((A) weakReference.get()).f13045e = null;
                }
            }
        });
        this.f13101b = false;
        this.f13100a = childFragmentManager;
        a3.f13044d = executor;
        a3.f13045e = aVar;
    }

    public static A d(Fragment fragment, boolean z3) {
        ViewModelStoreOwner activity = z3 ? fragment.getActivity() : null;
        if (activity == null) {
            activity = fragment.getParentFragment();
        }
        if (activity != null) {
            return (A) new androidx.camera.video.internal.c(activity).h(A.class);
        }
        throw new IllegalStateException("view model not found");
    }

    public final void a(v vVar, u uVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        if ((15 & 255) == 255) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && com.palmpay.lib.apm.launchcounter.util.d.A(15)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        b(vVar, uVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0165  */
    /* JADX WARN: Code duplicated, block: B:74:0x016a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0170  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x0179  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0185  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code duplicated, block: B:86:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x018c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x0196  */
    /* JADX WARN: Code duplicated, block: B:91:0x019b  */
    /* JADX WARN: Code duplicated, block: B:93:0x019f  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b0  */
    public final void b(v vVar, u uVar) {
        p1.d dVar;
        C0914s c0914s;
        int iD;
        BiometricManager biometricManager;
        BiometricManager biometricManager2;
        Z z3 = this.f13100a;
        if (z3 == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (z3.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        BiometricFragment biometricFragment = (BiometricFragment) this.f13100a.E("androidx.biometric.BiometricFragment");
        boolean z8 = false;
        if (biometricFragment == null) {
            boolean z10 = this.f13101b;
            BiometricFragment biometricFragment2 = new BiometricFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("host_activity", z10);
            biometricFragment2.setArguments(bundle);
            Z z11 = this.f13100a;
            C1161a c1161aE = q0.e(z11, z11);
            c1161aE.d(0, biometricFragment2, "androidx.biometric.BiometricFragment", 1);
            c1161aE.h(true);
            Z z12 = this.f13100a;
            z12.y(true);
            z12.G();
            biometricFragment = biometricFragment2;
        }
        biometricFragment.f13058a.f13046f = vVar;
        vVar.getClass();
        char c6 = uVar != null ? (char) 15 : (char) 255;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 && c6 == 15 && uVar == null) {
            A a3 = biometricFragment.f13058a;
            u uVar2 = null;
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                KeyGenParameterSpec.Builder builderB = D.b("androidxBiometric", 3);
                D.d(builderB);
                D.e(builderB);
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                D.c(keyGenerator, D.a(builderB));
                keyGenerator.generateKey();
                SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, secretKey);
                uVar2 = new u(cipher);
            } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
            }
            a3.f13047g = uVar2;
        } else {
            biometricFragment.f13058a.f13047g = uVar;
        }
        if (biometricFragment.h()) {
            biometricFragment.f13058a.f13052p = biometricFragment.getString(T.confirm_device_credential_password);
        } else {
            biometricFragment.f13058a.f13052p = null;
        }
        Context context = biometricFragment.getContext();
        if (i7 == 29) {
            Bundle arguments = biometricFragment.getArguments();
            Context context2 = biometricFragment.getContext();
            if (!arguments.getBoolean("has_fingerprint", (context2 == null || context2.getPackageManager() == null || !L.a(context2.getPackageManager())) ? false : true)) {
                Bundle arguments2 = biometricFragment.getArguments();
                Context context3 = biometricFragment.getContext();
                if (!arguments2.getBoolean("has_face", i7 >= 29 && context3 != null && context3.getPackageManager() != null && M.a(context3.getPackageManager()))) {
                    Bundle arguments3 = biometricFragment.getArguments();
                    Context context4 = biometricFragment.getContext();
                    if (!arguments3.getBoolean("has_iris", i7 >= 29 && context4 != null && context4.getPackageManager() != null && M.b(context4.getPackageManager()))) {
                        z8 = true;
                    } else if (biometricFragment.h()) {
                        c0914s = new C0914s(context);
                        dVar = new p1.d(c0914s);
                        if (i7 >= 30) {
                            biometricManager2 = (BiometricManager) dVar.f41178b;
                            if (biometricManager2 == null) {
                                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                iD = 1;
                            } else {
                                iD = r.a(biometricManager2, 255);
                            }
                        } else if (!com.palmpay.lib.apm.launchcounter.util.d.B(255)) {
                            iD = -2;
                        } else if (c0914s.isDeviceSecurable()) {
                            iD = 12;
                        } else if (com.palmpay.lib.apm.launchcounter.util.d.A(255)) {
                            if (c0914s.isDeviceSecuredWithCredential()) {
                                iD = 0;
                            } else {
                                iD = 11;
                            }
                        } else if (i7 == 29) {
                            biometricManager = (BiometricManager) dVar.f41178b;
                            if (biometricManager == null) {
                                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                iD = 1;
                            } else {
                                iD = AbstractC0913q.a(biometricManager);
                            }
                        } else if (i7 == 28) {
                            iD = dVar.d();
                        } else if (c0914s.isFingerprintHardwarePresent()) {
                            iD = 12;
                        } else if (!c0914s.isDeviceSecuredWithCredential()) {
                            iD = dVar.d();
                        } else if (dVar.d() == 0) {
                            iD = 0;
                        } else {
                            iD = -1;
                        }
                        if (iD != 0) {
                            z8 = true;
                        }
                    }
                } else if (biometricFragment.h()) {
                    c0914s = new C0914s(context);
                    dVar = new p1.d(c0914s);
                    if (i7 >= 30) {
                        biometricManager2 = (BiometricManager) dVar.f41178b;
                        if (biometricManager2 == null) {
                            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                            iD = 1;
                        } else {
                            iD = r.a(biometricManager2, 255);
                        }
                    } else if (!com.palmpay.lib.apm.launchcounter.util.d.B(255)) {
                        iD = -2;
                    } else if (c0914s.isDeviceSecurable()) {
                        iD = 12;
                    } else if (com.palmpay.lib.apm.launchcounter.util.d.A(255)) {
                        if (c0914s.isDeviceSecuredWithCredential()) {
                            iD = 0;
                        } else {
                            iD = 11;
                        }
                    } else if (i7 == 29) {
                        biometricManager = (BiometricManager) dVar.f41178b;
                        if (biometricManager == null) {
                            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                            iD = 1;
                        } else {
                            iD = AbstractC0913q.a(biometricManager);
                        }
                    } else if (i7 == 28) {
                        iD = dVar.d();
                    } else if (c0914s.isFingerprintHardwarePresent()) {
                        iD = 12;
                    } else if (!c0914s.isDeviceSecuredWithCredential()) {
                        iD = dVar.d();
                    } else if (dVar.d() == 0) {
                        iD = 0;
                    } else {
                        iD = -1;
                    }
                    if (iD != 0) {
                        z8 = true;
                    }
                }
            } else if (biometricFragment.h()) {
                c0914s = new C0914s(context);
                dVar = new p1.d(c0914s);
                if (i7 >= 30) {
                    biometricManager2 = (BiometricManager) dVar.f41178b;
                    if (biometricManager2 == null) {
                        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                        iD = 1;
                    } else {
                        iD = r.a(biometricManager2, 255);
                    }
                } else if (!com.palmpay.lib.apm.launchcounter.util.d.B(255)) {
                    iD = -2;
                } else if (c0914s.isDeviceSecurable()) {
                    iD = 12;
                } else if (com.palmpay.lib.apm.launchcounter.util.d.A(255)) {
                    if (c0914s.isDeviceSecuredWithCredential()) {
                        iD = 0;
                    } else {
                        iD = 11;
                    }
                } else if (i7 == 29) {
                    biometricManager = (BiometricManager) dVar.f41178b;
                    if (biometricManager == null) {
                        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                        iD = 1;
                    } else {
                        iD = AbstractC0913q.a(biometricManager);
                    }
                } else if (i7 == 28) {
                    iD = dVar.d();
                } else if (c0914s.isFingerprintHardwarePresent()) {
                    iD = 12;
                } else if (!c0914s.isDeviceSecuredWithCredential()) {
                    iD = dVar.d();
                } else if (dVar.d() == 0) {
                    iD = 0;
                } else {
                    iD = -1;
                }
                if (iD != 0) {
                    z8 = true;
                }
            }
        } else if (biometricFragment.h()) {
            c0914s = new C0914s(context);
            dVar = new p1.d(c0914s);
            if (i7 >= 30) {
                biometricManager2 = (BiometricManager) dVar.f41178b;
                if (biometricManager2 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    iD = 1;
                } else {
                    iD = r.a(biometricManager2, 255);
                }
            } else if (!com.palmpay.lib.apm.launchcounter.util.d.B(255)) {
                iD = -2;
            } else if (c0914s.isDeviceSecurable()) {
                iD = 12;
            } else if (com.palmpay.lib.apm.launchcounter.util.d.A(255)) {
                if (c0914s.isDeviceSecuredWithCredential()) {
                    iD = 0;
                } else {
                    iD = 11;
                }
            } else if (i7 == 29) {
                biometricManager = (BiometricManager) dVar.f41178b;
                if (biometricManager == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    iD = 1;
                } else {
                    iD = AbstractC0913q.a(biometricManager);
                }
            } else if (i7 == 28) {
                iD = dVar.d();
            } else if (c0914s.isFingerprintHardwarePresent()) {
                iD = 12;
            } else if (!c0914s.isDeviceSecuredWithCredential()) {
                iD = dVar.d();
            } else if (dVar.d() == 0) {
                iD = 0;
            } else {
                iD = -1;
            }
            if (iD != 0) {
                z8 = true;
            }
        }
        if (z8) {
            biometricFragment.f13058a.f13057w = true;
            biometricFragment.j();
        } else if (biometricFragment.f13058a.f13035B) {
            biometricFragment.f13059b.postDelayed(new RunnableC0912p(biometricFragment), 600L);
        } else {
            biometricFragment.n();
        }
    }

    public final void c() {
        Z z3 = this.f13100a;
        if (z3 == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        BiometricFragment biometricFragment = (BiometricFragment) z3.E("androidx.biometric.BiometricFragment");
        if (biometricFragment == null) {
            Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            biometricFragment.f(3);
        }
    }
}
