package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.Observer;
import com.google.firebase.perf.util.Constants;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39800a})
public class BiometricFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A f13058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f13059b = new Handler(Looper.getMainLooper());

    public final void dismiss() {
        g();
        A a3 = this.f13058a;
        a3.f13056v = false;
        if (!a3.f13034A && isAdded()) {
            Z parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C1161a c1161a = new C1161a(parentFragmentManager);
            c1161a.m(this);
            c1161a.h(true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT != 29) {
                return;
            }
            int i7 = N.delay_showing_prompt_models;
            if (str == null) {
                return;
            }
            for (String str2 : context.getResources().getStringArray(i7)) {
                if (str.equals(str2)) {
                    A a10 = this.f13058a;
                    a10.f13035B = true;
                    this.f13059b.postDelayed(new RunnableC0912p(a10, 1), 600L);
                    return;
                }
            }
        }
    }

    public final void f(int i7) {
        if (i7 == 3 || !this.f13058a.f13036C) {
            if (i()) {
                this.f13058a.t = i7;
                if (i7 == 1) {
                    l(10, p140j8.f.k(10, getContext()));
                }
            }
            A a3 = this.f13058a;
            if (a3.f13049j == null) {
                a3.f13049j = new p279s5.d(19, false);
            }
            p279s5.d dVar = a3.f13049j;
            CancellationSignal cancellationSignal = (CancellationSignal) dVar.f42025b;
            if (cancellationSignal != null) {
                try {
                    C.a(cancellationSignal);
                } catch (NullPointerException e10) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
                }
                dVar.f42025b = null;
            }
            androidx.core.os.d dVar2 = (androidx.core.os.d) dVar.f42026c;
            if (dVar2 != null) {
                try {
                    dVar2.a();
                } catch (NullPointerException e11) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
                }
                dVar.f42026c = null;
            }
        }
    }

    public final void g() {
        this.f13058a.f13056v = false;
        if (isAdded()) {
            Z parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.E("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                    return;
                }
                C1161a c1161a = new C1161a(parentFragmentManager);
                c1161a.m(fingerprintDialogFragment);
                c1161a.h(true);
            }
        }
    }

    public final boolean h() {
        return Build.VERSION.SDK_INT <= 28 && com.palmpay.lib.apm.launchcounter.util.d.A(this.f13058a.d());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[LOOP:1: B:24:0x0049->B:28:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x003f, please report this as an issue */
    public final boolean i() {
        Bundle arguments;
        Context context;
        boolean z3;
        int i7;
        String str;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            Context context2 = getContext();
            if (context2 == null || this.f13058a.f13047g == null) {
                if (i11 == 28) {
                    arguments = getArguments();
                    context = getContext();
                    if (context == null && context.getPackageManager() != null && L.a(context.getPackageManager())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!arguments.getBoolean("has_fingerprint", z3)) {
                    }
                }
                return false;
            }
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (i11 != 28) {
                if (i11 == 28) {
                    arguments = getArguments();
                    context = getContext();
                    if (context == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (!arguments.getBoolean("has_fingerprint", z3)) {
                    }
                }
                return false;
            }
            int i12 = N.crypto_fingerprint_fallback_vendors;
            if (str2 == null) {
                i7 = N.crypto_fingerprint_fallback_prefixes;
                str = Build.MODEL;
                if (str == null) {
                    if (i11 == 28) {
                        arguments = getArguments();
                        context = getContext();
                        if (context == null) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (!arguments.getBoolean("has_fingerprint", z3)) {
                        }
                    }
                    return false;
                }
                for (String str4 : context2.getResources().getStringArray(i7)) {
                    if (str.startsWith(str4)) {
                    }
                }
                if (i11 == 28) {
                    arguments = getArguments();
                    context = getContext();
                    if (context == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (!arguments.getBoolean("has_fingerprint", z3)) {
                    }
                }
                return false;
            }
            for (String str5 : context2.getResources().getStringArray(i12)) {
                if (!str2.equalsIgnoreCase(str5)) {
                }
            }
            i7 = N.crypto_fingerprint_fallback_prefixes;
            str = Build.MODEL;
            if (str == null) {
                if (i11 == 28) {
                    arguments = getArguments();
                    context = getContext();
                    if (context == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (!arguments.getBoolean("has_fingerprint", z3)) {
                    }
                }
                return false;
            }
            while (i10 < r5) {
                if (str.startsWith(str4)) {
                }
            }
            if (i11 == 28) {
                arguments = getArguments();
                context = getContext();
                if (context == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (!arguments.getBoolean("has_fingerprint", z3)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void j() {
        Context context = getContext();
        KeyguardManager keyguardManagerA = context != null ? K.a(context) : null;
        if (keyguardManagerA == null) {
            k(12, getString(T.generic_error_no_keyguard));
            return;
        }
        A a3 = this.f13058a;
        v vVar = a3.f13046f;
        String str = vVar != null ? vVar.f13097a : null;
        String str2 = vVar != null ? vVar.f13098b : null;
        a3.getClass();
        Intent intentA = AbstractC0907k.a(keyguardManagerA, str, str2 != null ? str2 : null);
        if (intentA == null) {
            k(14, getString(T.generic_error_no_device_credential));
            return;
        }
        this.f13058a.f13034A = true;
        if (i()) {
            g();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    public final void k(int i7, CharSequence charSequence) {
        l(i7, charSequence);
        dismiss();
    }

    public final void l(int i7, CharSequence charSequence) {
        A a3 = this.f13058a;
        if (!a3.f13034A && a3.f13057w) {
            a3.f13057w = false;
            Executor executorC0911o = a3.f13044d;
            if (executorC0911o == null) {
                executorC0911o = new ExecutorC0911o(1);
            }
            executorC0911o.execute(new RunnableC0906j(this, i7, charSequence, 0));
        }
    }

    public final void m(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(T.default_error_msg);
        }
        this.f13058a.g(2);
        this.f13058a.f(charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf  */
    public final void n() {
        boolean z3;
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        int i7;
        boolean z8;
        boolean z10;
        boolean z11;
        if (this.f13058a.f13056v || getContext() == null) {
            return;
        }
        A a3 = this.f13058a;
        a3.f13056v = true;
        a3.f13057w = true;
        int i10 = Build.VERSION.SDK_INT;
        Context context = getContext();
        if (context != null) {
            String str = Build.MANUFACTURER;
            if (i10 != 29) {
                z11 = false;
            } else {
                int i11 = N.keyguard_biometric_and_credential_exclude_vendors;
                if (str != null) {
                    String[] stringArray = context.getResources().getStringArray(i11);
                    int length = stringArray.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            z10 = false;
                            break;
                        } else {
                            if (str.equalsIgnoreCase(stringArray[i12])) {
                                z10 = true;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
                z11 = !z10;
            }
            if (z11) {
                int iD = this.f13058a.d();
                if (((iD & 255) == 255) && com.palmpay.lib.apm.launchcounter.util.d.A(iD)) {
                    this.f13058a.f13037H = true;
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            j();
            return;
        }
        String str2 = null;
        aVar = null;
        aVar = null;
        aVar = null;
        aVar = null;
        top.zibin.luban.io.a aVar = null;
        if (i()) {
            Context applicationContext = requireContext().getApplicationContext();
            p003a0.b bVar = new p003a0.b(applicationContext);
            if (bVar.c()) {
                FingerprintManager fingerprintManagerB = p003a0.b.b(applicationContext);
                i7 = !(fingerprintManagerB != null && fingerprintManagerB.hasEnrolledFingerprints()) ? 11 : 0;
            } else {
                i7 = 12;
            }
            if (i7 != 0) {
                k(i7, p140j8.f.k(i7, applicationContext));
                return;
            }
            if (isAdded()) {
                this.f13058a.f13043Z = true;
                String str3 = Build.MODEL;
                if (Build.VERSION.SDK_INT == 28) {
                    int i13 = N.hide_fingerprint_instantly_prefixes;
                    if (str3 != null) {
                        String[] stringArray2 = applicationContext.getResources().getStringArray(i13);
                        int length2 = stringArray2.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                z8 = false;
                                break;
                            } else {
                                if (str3.startsWith(stringArray2[i14])) {
                                    z8 = true;
                                    break;
                                }
                                i14++;
                            }
                        }
                    } else {
                        z8 = false;
                        break;
                    }
                } else {
                    z8 = false;
                    break;
                }
                if (!z8) {
                    this.f13059b.postDelayed(new RunnableC0904h(this, 0), 500L);
                    FingerprintDialogFragment.h(getArguments().getBoolean("host_activity", true)).show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
                }
                A a10 = this.f13058a;
                a10.t = 0;
                u uVar = a10.f13047g;
                if (uVar != null) {
                    Cipher cipher = uVar.f13093b;
                    if (cipher != null) {
                        aVar = new top.zibin.luban.io.a(cipher);
                    } else {
                        Signature signature = uVar.f13092a;
                        if (signature != null) {
                            aVar = new top.zibin.luban.io.a(signature);
                        } else {
                            Mac mac = uVar.f13094c;
                            if (mac != null) {
                                aVar = new top.zibin.luban.io.a(mac);
                            } else if (i10 >= 30 && uVar.f13095d != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            } else if (i10 >= 33 && uVar.f13096e != null) {
                                Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
                            }
                        }
                    }
                }
                A a11 = this.f13058a;
                if (a11.f13049j == null) {
                    a11.f13049j = new p279s5.d(19, false);
                }
                p279s5.d dVar = a11.f13049j;
                if (((androidx.core.os.d) dVar.f42026c) == null) {
                    dVar.f42026c = new androidx.core.os.d();
                }
                androidx.core.os.d dVar2 = (androidx.core.os.d) dVar.f42026c;
                A a12 = this.f13058a;
                if (a12.f13048i == null) {
                    a12.f13048i = new top.zibin.luban.io.a(new y(a12));
                }
                top.zibin.luban.io.a aVar2 = a12.f13048i;
                if (((C0897a) aVar2.f42646c) == null) {
                    aVar2.f42646c = new C0897a(aVar2);
                }
                try {
                    bVar.a(aVar, dVar2, (C0897a) aVar2.f42646c);
                    return;
                } catch (NullPointerException e10) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
                    k(1, p140j8.f.k(1, applicationContext));
                    return;
                }
            }
            return;
        }
        BiometricPrompt.Builder builderD = AbstractC0908l.d(requireContext().getApplicationContext());
        A a13 = this.f13058a;
        v vVar = a13.f13046f;
        String str4 = vVar != null ? vVar.f13097a : null;
        String str5 = vVar != null ? vVar.f13098b : null;
        a13.getClass();
        if (str4 != null) {
            AbstractC0908l.g(builderD, str4);
        }
        if (str5 != null) {
            AbstractC0908l.f(builderD, str5);
        }
        A a14 = this.f13058a;
        String str6 = a14.f13052p;
        if (str6 != null) {
            str2 = str6;
        } else {
            v vVar2 = a14.f13046f;
            if (vVar2 != null && (str2 = vVar2.f13099c) == null) {
                str2 = "";
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Executor executorC0911o = this.f13058a.f13044d;
            if (executorC0911o == null) {
                executorC0911o = new ExecutorC0911o(1);
            }
            A a15 = this.f13058a;
            if (a15.f13051o == null) {
                a15.f13051o = new z(a15);
            }
            AbstractC0908l.e(builderD, str2, executorC0911o, a15.f13051o);
        }
        if (i10 >= 29) {
            v vVar3 = this.f13058a.f13046f;
            AbstractC0909m.a(builderD, true);
        }
        int iD2 = this.f13058a.d();
        if (i10 >= 30) {
            AbstractC0910n.a(builderD, iD2);
        } else if (i10 >= 29) {
            AbstractC0909m.b(builderD, com.palmpay.lib.apm.launchcounter.util.d.A(iD2));
        }
        BiometricPrompt biometricPromptC = AbstractC0908l.c(builderD);
        Context context2 = getContext();
        u uVar2 = this.f13058a.f13047g;
        BiometricPrompt.CryptoObject cryptoObjectA = null;
        if (uVar2 != null) {
            Cipher cipher2 = uVar2.f13093b;
            if (cipher2 != null) {
                cryptoObjectA = E.b(cipher2);
            } else {
                Signature signature2 = uVar2.f13092a;
                if (signature2 != null) {
                    cryptoObjectA = E.a(signature2);
                } else {
                    Mac mac2 = uVar2.f13094c;
                    if (mac2 != null) {
                        cryptoObjectA = E.c(mac2);
                    } else {
                        int i15 = Build.VERSION.SDK_INT;
                        if (i15 >= 30 && (identityCredential = uVar2.f13095d) != null) {
                            cryptoObjectA = F.a(identityCredential);
                        } else if (i15 >= 33 && (presentationSession = uVar2.f13096e) != null) {
                            cryptoObjectA = G.a(presentationSession);
                        }
                    }
                }
            }
        }
        A a16 = this.f13058a;
        if (a16.f13049j == null) {
            a16.f13049j = new p279s5.d(19, false);
        }
        p279s5.d dVar3 = a16.f13049j;
        if (((CancellationSignal) dVar3.f42025b) == null) {
            dVar3.f42025b = C.b();
        }
        CancellationSignal cancellationSignal = (CancellationSignal) dVar3.f42025b;
        ExecutorC0911o executorC0911o2 = new ExecutorC0911o(0);
        A a17 = this.f13058a;
        if (a17.f13048i == null) {
            a17.f13048i = new top.zibin.luban.io.a(new y(a17));
        }
        top.zibin.luban.io.a aVar3 = a17.f13048i;
        if (((BiometricPrompt$AuthenticationCallback) aVar3.f42645b) == null) {
            aVar3.f42645b = AbstractC0899c.a((y) aVar3.f42647d);
        }
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) aVar3.f42645b;
        try {
            if (cryptoObjectA == null) {
                AbstractC0908l.b(biometricPromptC, cancellationSignal, executorC0911o2, biometricPrompt$AuthenticationCallback);
            } else {
                AbstractC0908l.a(biometricPromptC, cryptoObjectA, cancellationSignal, executorC0911o2, biometricPrompt$AuthenticationCallback);
            }
        } catch (NullPointerException e11) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e11);
            k(1, context2 != null ? context2.getString(T.default_error_msg) : "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        int i11 = 1;
        if (i7 == 1) {
            A a3 = this.f13058a;
            a3.f13034A = false;
            if (i10 != -1) {
                k(10, getString(T.generic_error_user_canceled));
                return;
            }
            if (a3.f13037H) {
                a3.f13037H = false;
                i11 = -1;
            }
            C0915t c0915t = new C0915t(null, i11);
            if (a3.f13057w) {
                a3.f13057w = false;
                Executor executorC0911o = a3.f13044d;
                if (executorC0911o == null) {
                    executorC0911o = new ExecutorC0911o(1);
                }
                executorC0911o.execute(new RunnableC0903g(0, this, c0915t));
            }
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f13058a == null) {
            this.f13058a = w.d(this, getArguments().getBoolean("host_activity", true));
        }
        A a3 = this.f13058a;
        androidx.fragment.app.E activity = getActivity();
        a3.getClass();
        new WeakReference(activity);
        A a10 = this.f13058a;
        if (a10.f13038L == null) {
            a10.f13038L = new androidx.lifecycle.F();
        }
        final int i7 = 0;
        a10.f13038L.e(this, new Observer(this) { // from class: androidx.biometric.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricFragment f13080b;

            {
                this.f13080b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x015f  */
            /* JADX WARN: Code duplicated, block: B:104:0x016b  */
            /* JADX WARN: Code duplicated, block: B:107:0x0175 A[LOOP:0: B:103:0x0169->B:107:0x0175, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:110:0x017b  */
            /* JADX WARN: Code duplicated, block: B:113:0x0186 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:115:0x0189  */
            /* JADX WARN: Code duplicated, block: B:134:0x0158 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:135:0x0173 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:78:0x010f  */
            /* JADX WARN: Code duplicated, block: B:80:0x0117 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:82:0x011a  */
            /* JADX WARN: Code duplicated, block: B:85:0x0125  */
            /* JADX WARN: Code duplicated, block: B:89:0x012e  */
            /* JADX WARN: Code duplicated, block: B:91:0x0136  */
            /* JADX WARN: Code duplicated, block: B:93:0x013d  */
            /* JADX WARN: Code duplicated, block: B:94:0x0141  */
            /* JADX WARN: Code duplicated, block: B:96:0x0152  */
            /* JADX WARN: Code duplicated, block: B:98:0x0158  */
            /* JADX WARN: Code duplicated, block: B:99:0x015a  */
            /* JADX WARN: Instruction removed from duplicated block: B:115:0x0189, please report this as an issue */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zI;
                CharSequence charSequenceK;
                Context context;
                int i10;
                String str;
                int i11;
                String[] stringArray;
                int length;
                int i12;
                boolean z3;
                int i13;
                switch (i7) {
                    case 0:
                        C0915t c0915t = (C0915t) obj;
                        BiometricFragment biometricFragment = this.f13080b;
                        if (c0915t != null) {
                            A a11 = biometricFragment.f13058a;
                            if (a11.f13057w) {
                                a11.f13057w = false;
                                Executor executorC0911o = a11.f13044d;
                                if (executorC0911o == null) {
                                    executorC0911o = new ExecutorC0911o(1);
                                }
                                executorC0911o.execute(new RunnableC0903g(0, biometricFragment, c0915t));
                            }
                            biometricFragment.dismiss();
                            A a12 = biometricFragment.f13058a;
                            if (a12.f13038L == null) {
                                a12.f13038L = new androidx.lifecycle.F();
                            }
                            A.i(a12.f13038L, null);
                        }
                        break;
                    case 1:
                        C0902f c0902f = (C0902f) obj;
                        BiometricFragment biometricFragment2 = this.f13080b;
                        if (c0902f != null) {
                            int i14 = c0902f.f13072a;
                            switch (i14) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i14 = 8;
                                    break;
                            }
                            Context context2 = biometricFragment2.getContext();
                            int i15 = Build.VERSION.SDK_INT;
                            if (i15 >= 29 || (!(i14 == 7 || i14 == 9) || context2 == null)) {
                                zI = biometricFragment2.i();
                                charSequenceK = c0902f.f13073b;
                                if (zI) {
                                    if (charSequenceK == null) {
                                        charSequenceK = p140j8.f.k(i14, biometricFragment2.getContext());
                                    }
                                    if (i14 == 5) {
                                        i13 = biometricFragment2.f13058a.t;
                                        if (i13 != 0 || i13 == 3) {
                                            biometricFragment2.l(i14, charSequenceK);
                                        }
                                        biometricFragment2.dismiss();
                                    } else {
                                        if (biometricFragment2.f13058a.f13043Z) {
                                            biometricFragment2.k(i14, charSequenceK);
                                        } else {
                                            biometricFragment2.m(charSequenceK);
                                            Handler handler = biometricFragment2.f13059b;
                                            RunnableC0906j runnableC0906j = new RunnableC0906j(biometricFragment2, i14, charSequenceK, 1);
                                            context = biometricFragment2.getContext();
                                            if (context != null) {
                                                str = Build.MODEL;
                                                if (i15 != 28) {
                                                    z3 = false;
                                                } else {
                                                    i11 = N.hide_fingerprint_instantly_prefixes;
                                                    if (str == null) {
                                                        z3 = false;
                                                    } else {
                                                        stringArray = context.getResources().getStringArray(i11);
                                                        length = stringArray.length;
                                                        i12 = 0;
                                                        while (true) {
                                                            if (i12 < length) {
                                                                z3 = false;
                                                            } else if (str.startsWith(stringArray[i12])) {
                                                                z3 = true;
                                                            } else {
                                                                i12++;
                                                            }
                                                        }
                                                    }
                                                }
                                                i10 = z3 ? 0 : Constants.MAX_URL_LENGTH;
                                            }
                                            handler.postDelayed(runnableC0906j, i10);
                                        }
                                        biometricFragment2.f13058a.f13043Z = true;
                                    }
                                } else {
                                    if (charSequenceK == null) {
                                        charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i14;
                                    }
                                    biometricFragment2.k(i14, charSequenceK);
                                }
                            } else {
                                KeyguardManager keyguardManagerA = K.a(context2);
                                if ((keyguardManagerA == null ? false : K.b(keyguardManagerA)) && com.palmpay.lib.apm.launchcounter.util.d.A(biometricFragment2.f13058a.d())) {
                                    biometricFragment2.j();
                                } else {
                                    zI = biometricFragment2.i();
                                    charSequenceK = c0902f.f13073b;
                                    if (zI) {
                                        if (charSequenceK == null) {
                                            charSequenceK = p140j8.f.k(i14, biometricFragment2.getContext());
                                        }
                                        if (i14 == 5) {
                                            i13 = biometricFragment2.f13058a.t;
                                            if (i13 != 0) {
                                                biometricFragment2.l(i14, charSequenceK);
                                            } else {
                                                biometricFragment2.l(i14, charSequenceK);
                                            }
                                            biometricFragment2.dismiss();
                                        } else {
                                            if (biometricFragment2.f13058a.f13043Z) {
                                                biometricFragment2.k(i14, charSequenceK);
                                            } else {
                                                biometricFragment2.m(charSequenceK);
                                                Handler handler2 = biometricFragment2.f13059b;
                                                RunnableC0906j runnableC0906j2 = new RunnableC0906j(biometricFragment2, i14, charSequenceK, 1);
                                                context = biometricFragment2.getContext();
                                                if (context != null) {
                                                    str = Build.MODEL;
                                                    if (i15 != 28) {
                                                        z3 = false;
                                                    } else {
                                                        i11 = N.hide_fingerprint_instantly_prefixes;
                                                        if (str == null) {
                                                            z3 = false;
                                                        } else {
                                                            stringArray = context.getResources().getStringArray(i11);
                                                            length = stringArray.length;
                                                            i12 = 0;
                                                            while (true) {
                                                                if (i12 < length) {
                                                                    z3 = false;
                                                                } else if (str.startsWith(stringArray[i12])) {
                                                                    z3 = true;
                                                                } else {
                                                                    i12++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (z3) {
                                                    }
                                                }
                                                handler2.postDelayed(runnableC0906j2, i10);
                                            }
                                            biometricFragment2.f13058a.f13043Z = true;
                                        }
                                    } else {
                                        if (charSequenceK == null) {
                                            charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i14;
                                        }
                                        biometricFragment2.k(i14, charSequenceK);
                                    }
                                }
                            }
                            biometricFragment2.f13058a.e(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        BiometricFragment biometricFragment3 = this.f13080b;
                        if (charSequence == null) {
                            biometricFragment3.getClass();
                        } else {
                            if (biometricFragment3.i()) {
                                biometricFragment3.m(charSequence);
                            }
                            biometricFragment3.f13058a.e(null);
                        }
                        break;
                    case 3:
                        BiometricFragment biometricFragment4 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment4.i()) {
                                biometricFragment4.m(biometricFragment4.getString(T.fingerprint_not_recognized));
                            }
                            A a13 = biometricFragment4.f13058a;
                            if (a13.f13057w) {
                                Executor executorC0911o2 = a13.f13044d;
                                if (executorC0911o2 == null) {
                                    executorC0911o2 = new ExecutorC0911o(1);
                                }
                                executorC0911o2.execute(new RunnableC0904h(biometricFragment4, 1));
                            }
                            A a14 = biometricFragment4.f13058a;
                            if (a14.f13041X == null) {
                                a14.f13041X = new androidx.lifecycle.F();
                            }
                            A.i(a14.f13041X, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        BiometricFragment biometricFragment5 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment5.h()) {
                                biometricFragment5.j();
                            } else {
                                A a15 = biometricFragment5.f13058a;
                                String string = a15.f13052p;
                                if (string == null) {
                                    v vVar = a15.f13046f;
                                    if (vVar != null) {
                                        string = vVar.f13099c;
                                        if (string == null) {
                                            string = "";
                                        }
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string == null) {
                                    string = biometricFragment5.getString(T.default_error_msg);
                                }
                                biometricFragment5.k(13, string);
                                biometricFragment5.f(2);
                            }
                            biometricFragment5.f13058a.h(false);
                        }
                        break;
                    default:
                        BiometricFragment biometricFragment6 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment6.f(1);
                            biometricFragment6.dismiss();
                            A a16 = biometricFragment6.f13058a;
                            if (a16.f13050k0 == null) {
                                a16.f13050k0 = new androidx.lifecycle.F();
                            }
                            A.i(a16.f13050k0, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        A a11 = this.f13058a;
        if (a11.f13039M == null) {
            a11.f13039M = new androidx.lifecycle.F();
        }
        final int i10 = 1;
        a11.f13039M.e(this, new Observer(this) { // from class: androidx.biometric.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricFragment f13080b;

            {
                this.f13080b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x015f  */
            /* JADX WARN: Code duplicated, block: B:104:0x016b  */
            /* JADX WARN: Code duplicated, block: B:107:0x0175 A[LOOP:0: B:103:0x0169->B:107:0x0175, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:110:0x017b  */
            /* JADX WARN: Code duplicated, block: B:113:0x0186 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:115:0x0189  */
            /* JADX WARN: Code duplicated, block: B:134:0x0158 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:135:0x0173 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:78:0x010f  */
            /* JADX WARN: Code duplicated, block: B:80:0x0117 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:82:0x011a  */
            /* JADX WARN: Code duplicated, block: B:85:0x0125  */
            /* JADX WARN: Code duplicated, block: B:89:0x012e  */
            /* JADX WARN: Code duplicated, block: B:91:0x0136  */
            /* JADX WARN: Code duplicated, block: B:93:0x013d  */
            /* JADX WARN: Code duplicated, block: B:94:0x0141  */
            /* JADX WARN: Code duplicated, block: B:96:0x0152  */
            /* JADX WARN: Code duplicated, block: B:98:0x0158  */
            /* JADX WARN: Code duplicated, block: B:99:0x015a  */
            /* JADX WARN: Instruction removed from duplicated block: B:115:0x0189, please report this as an issue */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zI;
                CharSequence charSequenceK;
                Context context;
                int i11;
                String str;
                int i12;
                String[] stringArray;
                int length;
                int i13;
                boolean z3;
                int i14;
                switch (i10) {
                    case 0:
                        C0915t c0915t = (C0915t) obj;
                        BiometricFragment biometricFragment = this.f13080b;
                        if (c0915t != null) {
                            A a12 = biometricFragment.f13058a;
                            if (a12.f13057w) {
                                a12.f13057w = false;
                                Executor executorC0911o = a12.f13044d;
                                if (executorC0911o == null) {
                                    executorC0911o = new ExecutorC0911o(1);
                                }
                                executorC0911o.execute(new RunnableC0903g(0, biometricFragment, c0915t));
                            }
                            biometricFragment.dismiss();
                            A a13 = biometricFragment.f13058a;
                            if (a13.f13038L == null) {
                                a13.f13038L = new androidx.lifecycle.F();
                            }
                            A.i(a13.f13038L, null);
                        }
                        break;
                    case 1:
                        C0902f c0902f = (C0902f) obj;
                        BiometricFragment biometricFragment2 = this.f13080b;
                        if (c0902f != null) {
                            int i15 = c0902f.f13072a;
                            switch (i15) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i15 = 8;
                                    break;
                            }
                            Context context2 = biometricFragment2.getContext();
                            int i16 = Build.VERSION.SDK_INT;
                            if (i16 >= 29 || (!(i15 == 7 || i15 == 9) || context2 == null)) {
                                zI = biometricFragment2.i();
                                charSequenceK = c0902f.f13073b;
                                if (zI) {
                                    if (charSequenceK == null) {
                                        charSequenceK = p140j8.f.k(i15, biometricFragment2.getContext());
                                    }
                                    if (i15 == 5) {
                                        i14 = biometricFragment2.f13058a.t;
                                        if (i14 != 0 || i14 == 3) {
                                            biometricFragment2.l(i15, charSequenceK);
                                        }
                                        biometricFragment2.dismiss();
                                    } else {
                                        if (biometricFragment2.f13058a.f13043Z) {
                                            biometricFragment2.k(i15, charSequenceK);
                                        } else {
                                            biometricFragment2.m(charSequenceK);
                                            Handler handler2 = biometricFragment2.f13059b;
                                            RunnableC0906j runnableC0906j2 = new RunnableC0906j(biometricFragment2, i15, charSequenceK, 1);
                                            context = biometricFragment2.getContext();
                                            if (context != null) {
                                                str = Build.MODEL;
                                                if (i16 != 28) {
                                                    z3 = false;
                                                } else {
                                                    i12 = N.hide_fingerprint_instantly_prefixes;
                                                    if (str == null) {
                                                        z3 = false;
                                                    } else {
                                                        stringArray = context.getResources().getStringArray(i12);
                                                        length = stringArray.length;
                                                        i13 = 0;
                                                        while (true) {
                                                            if (i13 < length) {
                                                                z3 = false;
                                                            } else if (str.startsWith(stringArray[i13])) {
                                                                z3 = true;
                                                            } else {
                                                                i13++;
                                                            }
                                                        }
                                                    }
                                                }
                                                i11 = z3 ? 0 : Constants.MAX_URL_LENGTH;
                                            }
                                            handler2.postDelayed(runnableC0906j2, i11);
                                        }
                                        biometricFragment2.f13058a.f13043Z = true;
                                    }
                                } else {
                                    if (charSequenceK == null) {
                                        charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i15;
                                    }
                                    biometricFragment2.k(i15, charSequenceK);
                                }
                            } else {
                                KeyguardManager keyguardManagerA = K.a(context2);
                                if ((keyguardManagerA == null ? false : K.b(keyguardManagerA)) && com.palmpay.lib.apm.launchcounter.util.d.A(biometricFragment2.f13058a.d())) {
                                    biometricFragment2.j();
                                } else {
                                    zI = biometricFragment2.i();
                                    charSequenceK = c0902f.f13073b;
                                    if (zI) {
                                        if (charSequenceK == null) {
                                            charSequenceK = p140j8.f.k(i15, biometricFragment2.getContext());
                                        }
                                        if (i15 == 5) {
                                            i14 = biometricFragment2.f13058a.t;
                                            if (i14 != 0) {
                                                biometricFragment2.l(i15, charSequenceK);
                                            } else {
                                                biometricFragment2.l(i15, charSequenceK);
                                            }
                                            biometricFragment2.dismiss();
                                        } else {
                                            if (biometricFragment2.f13058a.f13043Z) {
                                                biometricFragment2.k(i15, charSequenceK);
                                            } else {
                                                biometricFragment2.m(charSequenceK);
                                                Handler handler3 = biometricFragment2.f13059b;
                                                RunnableC0906j runnableC0906j3 = new RunnableC0906j(biometricFragment2, i15, charSequenceK, 1);
                                                context = biometricFragment2.getContext();
                                                if (context != null) {
                                                    str = Build.MODEL;
                                                    if (i16 != 28) {
                                                        z3 = false;
                                                    } else {
                                                        i12 = N.hide_fingerprint_instantly_prefixes;
                                                        if (str == null) {
                                                            z3 = false;
                                                        } else {
                                                            stringArray = context.getResources().getStringArray(i12);
                                                            length = stringArray.length;
                                                            i13 = 0;
                                                            while (true) {
                                                                if (i13 < length) {
                                                                    z3 = false;
                                                                } else if (str.startsWith(stringArray[i13])) {
                                                                    z3 = true;
                                                                } else {
                                                                    i13++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (z3) {
                                                    }
                                                }
                                                handler3.postDelayed(runnableC0906j3, i11);
                                            }
                                            biometricFragment2.f13058a.f13043Z = true;
                                        }
                                    } else {
                                        if (charSequenceK == null) {
                                            charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i15;
                                        }
                                        biometricFragment2.k(i15, charSequenceK);
                                    }
                                }
                            }
                            biometricFragment2.f13058a.e(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        BiometricFragment biometricFragment3 = this.f13080b;
                        if (charSequence == null) {
                            biometricFragment3.getClass();
                        } else {
                            if (biometricFragment3.i()) {
                                biometricFragment3.m(charSequence);
                            }
                            biometricFragment3.f13058a.e(null);
                        }
                        break;
                    case 3:
                        BiometricFragment biometricFragment4 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment4.i()) {
                                biometricFragment4.m(biometricFragment4.getString(T.fingerprint_not_recognized));
                            }
                            A a14 = biometricFragment4.f13058a;
                            if (a14.f13057w) {
                                Executor executorC0911o2 = a14.f13044d;
                                if (executorC0911o2 == null) {
                                    executorC0911o2 = new ExecutorC0911o(1);
                                }
                                executorC0911o2.execute(new RunnableC0904h(biometricFragment4, 1));
                            }
                            A a15 = biometricFragment4.f13058a;
                            if (a15.f13041X == null) {
                                a15.f13041X = new androidx.lifecycle.F();
                            }
                            A.i(a15.f13041X, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        BiometricFragment biometricFragment5 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment5.h()) {
                                biometricFragment5.j();
                            } else {
                                A a16 = biometricFragment5.f13058a;
                                String string = a16.f13052p;
                                if (string == null) {
                                    v vVar = a16.f13046f;
                                    if (vVar != null) {
                                        string = vVar.f13099c;
                                        if (string == null) {
                                            string = "";
                                        }
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string == null) {
                                    string = biometricFragment5.getString(T.default_error_msg);
                                }
                                biometricFragment5.k(13, string);
                                biometricFragment5.f(2);
                            }
                            biometricFragment5.f13058a.h(false);
                        }
                        break;
                    default:
                        BiometricFragment biometricFragment6 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment6.f(1);
                            biometricFragment6.dismiss();
                            A a17 = biometricFragment6.f13058a;
                            if (a17.f13050k0 == null) {
                                a17.f13050k0 = new androidx.lifecycle.F();
                            }
                            A.i(a17.f13050k0, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        A a12 = this.f13058a;
        if (a12.f13040Q == null) {
            a12.f13040Q = new androidx.lifecycle.F();
        }
        final int i11 = 2;
        a12.f13040Q.e(this, new Observer(this) { // from class: androidx.biometric.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricFragment f13080b;

            {
                this.f13080b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x015f  */
            /* JADX WARN: Code duplicated, block: B:104:0x016b  */
            /* JADX WARN: Code duplicated, block: B:107:0x0175 A[LOOP:0: B:103:0x0169->B:107:0x0175, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:110:0x017b  */
            /* JADX WARN: Code duplicated, block: B:113:0x0186 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:115:0x0189  */
            /* JADX WARN: Code duplicated, block: B:134:0x0158 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:135:0x0173 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:78:0x010f  */
            /* JADX WARN: Code duplicated, block: B:80:0x0117 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:82:0x011a  */
            /* JADX WARN: Code duplicated, block: B:85:0x0125  */
            /* JADX WARN: Code duplicated, block: B:89:0x012e  */
            /* JADX WARN: Code duplicated, block: B:91:0x0136  */
            /* JADX WARN: Code duplicated, block: B:93:0x013d  */
            /* JADX WARN: Code duplicated, block: B:94:0x0141  */
            /* JADX WARN: Code duplicated, block: B:96:0x0152  */
            /* JADX WARN: Code duplicated, block: B:98:0x0158  */
            /* JADX WARN: Code duplicated, block: B:99:0x015a  */
            /* JADX WARN: Instruction removed from duplicated block: B:115:0x0189, please report this as an issue */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zI;
                CharSequence charSequenceK;
                Context context;
                int i12;
                String str;
                int i13;
                String[] stringArray;
                int length;
                int i14;
                boolean z3;
                int i15;
                switch (i11) {
                    case 0:
                        C0915t c0915t = (C0915t) obj;
                        BiometricFragment biometricFragment = this.f13080b;
                        if (c0915t != null) {
                            A a13 = biometricFragment.f13058a;
                            if (a13.f13057w) {
                                a13.f13057w = false;
                                Executor executorC0911o = a13.f13044d;
                                if (executorC0911o == null) {
                                    executorC0911o = new ExecutorC0911o(1);
                                }
                                executorC0911o.execute(new RunnableC0903g(0, biometricFragment, c0915t));
                            }
                            biometricFragment.dismiss();
                            A a14 = biometricFragment.f13058a;
                            if (a14.f13038L == null) {
                                a14.f13038L = new androidx.lifecycle.F();
                            }
                            A.i(a14.f13038L, null);
                        }
                        break;
                    case 1:
                        C0902f c0902f = (C0902f) obj;
                        BiometricFragment biometricFragment2 = this.f13080b;
                        if (c0902f != null) {
                            int i16 = c0902f.f13072a;
                            switch (i16) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i16 = 8;
                                    break;
                            }
                            Context context2 = biometricFragment2.getContext();
                            int i17 = Build.VERSION.SDK_INT;
                            if (i17 >= 29 || (!(i16 == 7 || i16 == 9) || context2 == null)) {
                                zI = biometricFragment2.i();
                                charSequenceK = c0902f.f13073b;
                                if (zI) {
                                    if (charSequenceK == null) {
                                        charSequenceK = p140j8.f.k(i16, biometricFragment2.getContext());
                                    }
                                    if (i16 == 5) {
                                        i15 = biometricFragment2.f13058a.t;
                                        if (i15 != 0 || i15 == 3) {
                                            biometricFragment2.l(i16, charSequenceK);
                                        }
                                        biometricFragment2.dismiss();
                                    } else {
                                        if (biometricFragment2.f13058a.f13043Z) {
                                            biometricFragment2.k(i16, charSequenceK);
                                        } else {
                                            biometricFragment2.m(charSequenceK);
                                            Handler handler3 = biometricFragment2.f13059b;
                                            RunnableC0906j runnableC0906j3 = new RunnableC0906j(biometricFragment2, i16, charSequenceK, 1);
                                            context = biometricFragment2.getContext();
                                            if (context != null) {
                                                str = Build.MODEL;
                                                if (i17 != 28) {
                                                    z3 = false;
                                                } else {
                                                    i13 = N.hide_fingerprint_instantly_prefixes;
                                                    if (str == null) {
                                                        z3 = false;
                                                    } else {
                                                        stringArray = context.getResources().getStringArray(i13);
                                                        length = stringArray.length;
                                                        i14 = 0;
                                                        while (true) {
                                                            if (i14 < length) {
                                                                z3 = false;
                                                            } else if (str.startsWith(stringArray[i14])) {
                                                                z3 = true;
                                                            } else {
                                                                i14++;
                                                            }
                                                        }
                                                    }
                                                }
                                                i12 = z3 ? 0 : Constants.MAX_URL_LENGTH;
                                            }
                                            handler3.postDelayed(runnableC0906j3, i12);
                                        }
                                        biometricFragment2.f13058a.f13043Z = true;
                                    }
                                } else {
                                    if (charSequenceK == null) {
                                        charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i16;
                                    }
                                    biometricFragment2.k(i16, charSequenceK);
                                }
                            } else {
                                KeyguardManager keyguardManagerA = K.a(context2);
                                if ((keyguardManagerA == null ? false : K.b(keyguardManagerA)) && com.palmpay.lib.apm.launchcounter.util.d.A(biometricFragment2.f13058a.d())) {
                                    biometricFragment2.j();
                                } else {
                                    zI = biometricFragment2.i();
                                    charSequenceK = c0902f.f13073b;
                                    if (zI) {
                                        if (charSequenceK == null) {
                                            charSequenceK = p140j8.f.k(i16, biometricFragment2.getContext());
                                        }
                                        if (i16 == 5) {
                                            i15 = biometricFragment2.f13058a.t;
                                            if (i15 != 0) {
                                                biometricFragment2.l(i16, charSequenceK);
                                            } else {
                                                biometricFragment2.l(i16, charSequenceK);
                                            }
                                            biometricFragment2.dismiss();
                                        } else {
                                            if (biometricFragment2.f13058a.f13043Z) {
                                                biometricFragment2.k(i16, charSequenceK);
                                            } else {
                                                biometricFragment2.m(charSequenceK);
                                                Handler handler4 = biometricFragment2.f13059b;
                                                RunnableC0906j runnableC0906j4 = new RunnableC0906j(biometricFragment2, i16, charSequenceK, 1);
                                                context = biometricFragment2.getContext();
                                                if (context != null) {
                                                    str = Build.MODEL;
                                                    if (i17 != 28) {
                                                        z3 = false;
                                                    } else {
                                                        i13 = N.hide_fingerprint_instantly_prefixes;
                                                        if (str == null) {
                                                            z3 = false;
                                                        } else {
                                                            stringArray = context.getResources().getStringArray(i13);
                                                            length = stringArray.length;
                                                            i14 = 0;
                                                            while (true) {
                                                                if (i14 < length) {
                                                                    z3 = false;
                                                                } else if (str.startsWith(stringArray[i14])) {
                                                                    z3 = true;
                                                                } else {
                                                                    i14++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (z3) {
                                                    }
                                                }
                                                handler4.postDelayed(runnableC0906j4, i12);
                                            }
                                            biometricFragment2.f13058a.f13043Z = true;
                                        }
                                    } else {
                                        if (charSequenceK == null) {
                                            charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i16;
                                        }
                                        biometricFragment2.k(i16, charSequenceK);
                                    }
                                }
                            }
                            biometricFragment2.f13058a.e(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        BiometricFragment biometricFragment3 = this.f13080b;
                        if (charSequence == null) {
                            biometricFragment3.getClass();
                        } else {
                            if (biometricFragment3.i()) {
                                biometricFragment3.m(charSequence);
                            }
                            biometricFragment3.f13058a.e(null);
                        }
                        break;
                    case 3:
                        BiometricFragment biometricFragment4 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment4.i()) {
                                biometricFragment4.m(biometricFragment4.getString(T.fingerprint_not_recognized));
                            }
                            A a15 = biometricFragment4.f13058a;
                            if (a15.f13057w) {
                                Executor executorC0911o2 = a15.f13044d;
                                if (executorC0911o2 == null) {
                                    executorC0911o2 = new ExecutorC0911o(1);
                                }
                                executorC0911o2.execute(new RunnableC0904h(biometricFragment4, 1));
                            }
                            A a16 = biometricFragment4.f13058a;
                            if (a16.f13041X == null) {
                                a16.f13041X = new androidx.lifecycle.F();
                            }
                            A.i(a16.f13041X, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        BiometricFragment biometricFragment5 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment5.h()) {
                                biometricFragment5.j();
                            } else {
                                A a17 = biometricFragment5.f13058a;
                                String string = a17.f13052p;
                                if (string == null) {
                                    v vVar = a17.f13046f;
                                    if (vVar != null) {
                                        string = vVar.f13099c;
                                        if (string == null) {
                                            string = "";
                                        }
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string == null) {
                                    string = biometricFragment5.getString(T.default_error_msg);
                                }
                                biometricFragment5.k(13, string);
                                biometricFragment5.f(2);
                            }
                            biometricFragment5.f13058a.h(false);
                        }
                        break;
                    default:
                        BiometricFragment biometricFragment6 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment6.f(1);
                            biometricFragment6.dismiss();
                            A a18 = biometricFragment6.f13058a;
                            if (a18.f13050k0 == null) {
                                a18.f13050k0 = new androidx.lifecycle.F();
                            }
                            A.i(a18.f13050k0, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        A a13 = this.f13058a;
        if (a13.f13041X == null) {
            a13.f13041X = new androidx.lifecycle.F();
        }
        final int i12 = 3;
        a13.f13041X.e(this, new Observer(this) { // from class: androidx.biometric.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricFragment f13080b;

            {
                this.f13080b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x015f  */
            /* JADX WARN: Code duplicated, block: B:104:0x016b  */
            /* JADX WARN: Code duplicated, block: B:107:0x0175 A[LOOP:0: B:103:0x0169->B:107:0x0175, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:110:0x017b  */
            /* JADX WARN: Code duplicated, block: B:113:0x0186 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:115:0x0189  */
            /* JADX WARN: Code duplicated, block: B:134:0x0158 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:135:0x0173 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:78:0x010f  */
            /* JADX WARN: Code duplicated, block: B:80:0x0117 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:82:0x011a  */
            /* JADX WARN: Code duplicated, block: B:85:0x0125  */
            /* JADX WARN: Code duplicated, block: B:89:0x012e  */
            /* JADX WARN: Code duplicated, block: B:91:0x0136  */
            /* JADX WARN: Code duplicated, block: B:93:0x013d  */
            /* JADX WARN: Code duplicated, block: B:94:0x0141  */
            /* JADX WARN: Code duplicated, block: B:96:0x0152  */
            /* JADX WARN: Code duplicated, block: B:98:0x0158  */
            /* JADX WARN: Code duplicated, block: B:99:0x015a  */
            /* JADX WARN: Instruction removed from duplicated block: B:115:0x0189, please report this as an issue */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zI;
                CharSequence charSequenceK;
                Context context;
                int i13;
                String str;
                int i14;
                String[] stringArray;
                int length;
                int i15;
                boolean z3;
                int i16;
                switch (i12) {
                    case 0:
                        C0915t c0915t = (C0915t) obj;
                        BiometricFragment biometricFragment = this.f13080b;
                        if (c0915t != null) {
                            A a14 = biometricFragment.f13058a;
                            if (a14.f13057w) {
                                a14.f13057w = false;
                                Executor executorC0911o = a14.f13044d;
                                if (executorC0911o == null) {
                                    executorC0911o = new ExecutorC0911o(1);
                                }
                                executorC0911o.execute(new RunnableC0903g(0, biometricFragment, c0915t));
                            }
                            biometricFragment.dismiss();
                            A a15 = biometricFragment.f13058a;
                            if (a15.f13038L == null) {
                                a15.f13038L = new androidx.lifecycle.F();
                            }
                            A.i(a15.f13038L, null);
                        }
                        break;
                    case 1:
                        C0902f c0902f = (C0902f) obj;
                        BiometricFragment biometricFragment2 = this.f13080b;
                        if (c0902f != null) {
                            int i17 = c0902f.f13072a;
                            switch (i17) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i17 = 8;
                                    break;
                            }
                            Context context2 = biometricFragment2.getContext();
                            int i18 = Build.VERSION.SDK_INT;
                            if (i18 >= 29 || (!(i17 == 7 || i17 == 9) || context2 == null)) {
                                zI = biometricFragment2.i();
                                charSequenceK = c0902f.f13073b;
                                if (zI) {
                                    if (charSequenceK == null) {
                                        charSequenceK = p140j8.f.k(i17, biometricFragment2.getContext());
                                    }
                                    if (i17 == 5) {
                                        i16 = biometricFragment2.f13058a.t;
                                        if (i16 != 0 || i16 == 3) {
                                            biometricFragment2.l(i17, charSequenceK);
                                        }
                                        biometricFragment2.dismiss();
                                    } else {
                                        if (biometricFragment2.f13058a.f13043Z) {
                                            biometricFragment2.k(i17, charSequenceK);
                                        } else {
                                            biometricFragment2.m(charSequenceK);
                                            Handler handler4 = biometricFragment2.f13059b;
                                            RunnableC0906j runnableC0906j4 = new RunnableC0906j(biometricFragment2, i17, charSequenceK, 1);
                                            context = biometricFragment2.getContext();
                                            if (context != null) {
                                                str = Build.MODEL;
                                                if (i18 != 28) {
                                                    z3 = false;
                                                } else {
                                                    i14 = N.hide_fingerprint_instantly_prefixes;
                                                    if (str == null) {
                                                        z3 = false;
                                                    } else {
                                                        stringArray = context.getResources().getStringArray(i14);
                                                        length = stringArray.length;
                                                        i15 = 0;
                                                        while (true) {
                                                            if (i15 < length) {
                                                                z3 = false;
                                                            } else if (str.startsWith(stringArray[i15])) {
                                                                z3 = true;
                                                            } else {
                                                                i15++;
                                                            }
                                                        }
                                                    }
                                                }
                                                i13 = z3 ? 0 : Constants.MAX_URL_LENGTH;
                                            }
                                            handler4.postDelayed(runnableC0906j4, i13);
                                        }
                                        biometricFragment2.f13058a.f13043Z = true;
                                    }
                                } else {
                                    if (charSequenceK == null) {
                                        charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i17;
                                    }
                                    biometricFragment2.k(i17, charSequenceK);
                                }
                            } else {
                                KeyguardManager keyguardManagerA = K.a(context2);
                                if ((keyguardManagerA == null ? false : K.b(keyguardManagerA)) && com.palmpay.lib.apm.launchcounter.util.d.A(biometricFragment2.f13058a.d())) {
                                    biometricFragment2.j();
                                } else {
                                    zI = biometricFragment2.i();
                                    charSequenceK = c0902f.f13073b;
                                    if (zI) {
                                        if (charSequenceK == null) {
                                            charSequenceK = p140j8.f.k(i17, biometricFragment2.getContext());
                                        }
                                        if (i17 == 5) {
                                            i16 = biometricFragment2.f13058a.t;
                                            if (i16 != 0) {
                                                biometricFragment2.l(i17, charSequenceK);
                                            } else {
                                                biometricFragment2.l(i17, charSequenceK);
                                            }
                                            biometricFragment2.dismiss();
                                        } else {
                                            if (biometricFragment2.f13058a.f13043Z) {
                                                biometricFragment2.k(i17, charSequenceK);
                                            } else {
                                                biometricFragment2.m(charSequenceK);
                                                Handler handler5 = biometricFragment2.f13059b;
                                                RunnableC0906j runnableC0906j5 = new RunnableC0906j(biometricFragment2, i17, charSequenceK, 1);
                                                context = biometricFragment2.getContext();
                                                if (context != null) {
                                                    str = Build.MODEL;
                                                    if (i18 != 28) {
                                                        z3 = false;
                                                    } else {
                                                        i14 = N.hide_fingerprint_instantly_prefixes;
                                                        if (str == null) {
                                                            z3 = false;
                                                        } else {
                                                            stringArray = context.getResources().getStringArray(i14);
                                                            length = stringArray.length;
                                                            i15 = 0;
                                                            while (true) {
                                                                if (i15 < length) {
                                                                    z3 = false;
                                                                } else if (str.startsWith(stringArray[i15])) {
                                                                    z3 = true;
                                                                } else {
                                                                    i15++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (z3) {
                                                    }
                                                }
                                                handler5.postDelayed(runnableC0906j5, i13);
                                            }
                                            biometricFragment2.f13058a.f13043Z = true;
                                        }
                                    } else {
                                        if (charSequenceK == null) {
                                            charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i17;
                                        }
                                        biometricFragment2.k(i17, charSequenceK);
                                    }
                                }
                            }
                            biometricFragment2.f13058a.e(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        BiometricFragment biometricFragment3 = this.f13080b;
                        if (charSequence == null) {
                            biometricFragment3.getClass();
                        } else {
                            if (biometricFragment3.i()) {
                                biometricFragment3.m(charSequence);
                            }
                            biometricFragment3.f13058a.e(null);
                        }
                        break;
                    case 3:
                        BiometricFragment biometricFragment4 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment4.i()) {
                                biometricFragment4.m(biometricFragment4.getString(T.fingerprint_not_recognized));
                            }
                            A a16 = biometricFragment4.f13058a;
                            if (a16.f13057w) {
                                Executor executorC0911o2 = a16.f13044d;
                                if (executorC0911o2 == null) {
                                    executorC0911o2 = new ExecutorC0911o(1);
                                }
                                executorC0911o2.execute(new RunnableC0904h(biometricFragment4, 1));
                            }
                            A a17 = biometricFragment4.f13058a;
                            if (a17.f13041X == null) {
                                a17.f13041X = new androidx.lifecycle.F();
                            }
                            A.i(a17.f13041X, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        BiometricFragment biometricFragment5 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment5.h()) {
                                biometricFragment5.j();
                            } else {
                                A a18 = biometricFragment5.f13058a;
                                String string = a18.f13052p;
                                if (string == null) {
                                    v vVar = a18.f13046f;
                                    if (vVar != null) {
                                        string = vVar.f13099c;
                                        if (string == null) {
                                            string = "";
                                        }
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string == null) {
                                    string = biometricFragment5.getString(T.default_error_msg);
                                }
                                biometricFragment5.k(13, string);
                                biometricFragment5.f(2);
                            }
                            biometricFragment5.f13058a.h(false);
                        }
                        break;
                    default:
                        BiometricFragment biometricFragment6 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment6.f(1);
                            biometricFragment6.dismiss();
                            A a19 = biometricFragment6.f13058a;
                            if (a19.f13050k0 == null) {
                                a19.f13050k0 = new androidx.lifecycle.F();
                            }
                            A.i(a19.f13050k0, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        A a14 = this.f13058a;
        if (a14.f13042Y == null) {
            a14.f13042Y = new androidx.lifecycle.F();
        }
        final int i13 = 4;
        a14.f13042Y.e(this, new Observer(this) { // from class: androidx.biometric.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricFragment f13080b;

            {
                this.f13080b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x015f  */
            /* JADX WARN: Code duplicated, block: B:104:0x016b  */
            /* JADX WARN: Code duplicated, block: B:107:0x0175 A[LOOP:0: B:103:0x0169->B:107:0x0175, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:110:0x017b  */
            /* JADX WARN: Code duplicated, block: B:113:0x0186 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:115:0x0189  */
            /* JADX WARN: Code duplicated, block: B:134:0x0158 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:135:0x0173 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:78:0x010f  */
            /* JADX WARN: Code duplicated, block: B:80:0x0117 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:82:0x011a  */
            /* JADX WARN: Code duplicated, block: B:85:0x0125  */
            /* JADX WARN: Code duplicated, block: B:89:0x012e  */
            /* JADX WARN: Code duplicated, block: B:91:0x0136  */
            /* JADX WARN: Code duplicated, block: B:93:0x013d  */
            /* JADX WARN: Code duplicated, block: B:94:0x0141  */
            /* JADX WARN: Code duplicated, block: B:96:0x0152  */
            /* JADX WARN: Code duplicated, block: B:98:0x0158  */
            /* JADX WARN: Code duplicated, block: B:99:0x015a  */
            /* JADX WARN: Instruction removed from duplicated block: B:115:0x0189, please report this as an issue */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zI;
                CharSequence charSequenceK;
                Context context;
                int i14;
                String str;
                int i15;
                String[] stringArray;
                int length;
                int i16;
                boolean z3;
                int i17;
                switch (i13) {
                    case 0:
                        C0915t c0915t = (C0915t) obj;
                        BiometricFragment biometricFragment = this.f13080b;
                        if (c0915t != null) {
                            A a15 = biometricFragment.f13058a;
                            if (a15.f13057w) {
                                a15.f13057w = false;
                                Executor executorC0911o = a15.f13044d;
                                if (executorC0911o == null) {
                                    executorC0911o = new ExecutorC0911o(1);
                                }
                                executorC0911o.execute(new RunnableC0903g(0, biometricFragment, c0915t));
                            }
                            biometricFragment.dismiss();
                            A a16 = biometricFragment.f13058a;
                            if (a16.f13038L == null) {
                                a16.f13038L = new androidx.lifecycle.F();
                            }
                            A.i(a16.f13038L, null);
                        }
                        break;
                    case 1:
                        C0902f c0902f = (C0902f) obj;
                        BiometricFragment biometricFragment2 = this.f13080b;
                        if (c0902f != null) {
                            int i18 = c0902f.f13072a;
                            switch (i18) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i18 = 8;
                                    break;
                            }
                            Context context2 = biometricFragment2.getContext();
                            int i19 = Build.VERSION.SDK_INT;
                            if (i19 >= 29 || (!(i18 == 7 || i18 == 9) || context2 == null)) {
                                zI = biometricFragment2.i();
                                charSequenceK = c0902f.f13073b;
                                if (zI) {
                                    if (charSequenceK == null) {
                                        charSequenceK = p140j8.f.k(i18, biometricFragment2.getContext());
                                    }
                                    if (i18 == 5) {
                                        i17 = biometricFragment2.f13058a.t;
                                        if (i17 != 0 || i17 == 3) {
                                            biometricFragment2.l(i18, charSequenceK);
                                        }
                                        biometricFragment2.dismiss();
                                    } else {
                                        if (biometricFragment2.f13058a.f13043Z) {
                                            biometricFragment2.k(i18, charSequenceK);
                                        } else {
                                            biometricFragment2.m(charSequenceK);
                                            Handler handler5 = biometricFragment2.f13059b;
                                            RunnableC0906j runnableC0906j5 = new RunnableC0906j(biometricFragment2, i18, charSequenceK, 1);
                                            context = biometricFragment2.getContext();
                                            if (context != null) {
                                                str = Build.MODEL;
                                                if (i19 != 28) {
                                                    z3 = false;
                                                } else {
                                                    i15 = N.hide_fingerprint_instantly_prefixes;
                                                    if (str == null) {
                                                        z3 = false;
                                                    } else {
                                                        stringArray = context.getResources().getStringArray(i15);
                                                        length = stringArray.length;
                                                        i16 = 0;
                                                        while (true) {
                                                            if (i16 < length) {
                                                                z3 = false;
                                                            } else if (str.startsWith(stringArray[i16])) {
                                                                z3 = true;
                                                            } else {
                                                                i16++;
                                                            }
                                                        }
                                                    }
                                                }
                                                i14 = z3 ? 0 : Constants.MAX_URL_LENGTH;
                                            }
                                            handler5.postDelayed(runnableC0906j5, i14);
                                        }
                                        biometricFragment2.f13058a.f13043Z = true;
                                    }
                                } else {
                                    if (charSequenceK == null) {
                                        charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i18;
                                    }
                                    biometricFragment2.k(i18, charSequenceK);
                                }
                            } else {
                                KeyguardManager keyguardManagerA = K.a(context2);
                                if ((keyguardManagerA == null ? false : K.b(keyguardManagerA)) && com.palmpay.lib.apm.launchcounter.util.d.A(biometricFragment2.f13058a.d())) {
                                    biometricFragment2.j();
                                } else {
                                    zI = biometricFragment2.i();
                                    charSequenceK = c0902f.f13073b;
                                    if (zI) {
                                        if (charSequenceK == null) {
                                            charSequenceK = p140j8.f.k(i18, biometricFragment2.getContext());
                                        }
                                        if (i18 == 5) {
                                            i17 = biometricFragment2.f13058a.t;
                                            if (i17 != 0) {
                                                biometricFragment2.l(i18, charSequenceK);
                                            } else {
                                                biometricFragment2.l(i18, charSequenceK);
                                            }
                                            biometricFragment2.dismiss();
                                        } else {
                                            if (biometricFragment2.f13058a.f13043Z) {
                                                biometricFragment2.k(i18, charSequenceK);
                                            } else {
                                                biometricFragment2.m(charSequenceK);
                                                Handler handler6 = biometricFragment2.f13059b;
                                                RunnableC0906j runnableC0906j6 = new RunnableC0906j(biometricFragment2, i18, charSequenceK, 1);
                                                context = biometricFragment2.getContext();
                                                if (context != null) {
                                                    str = Build.MODEL;
                                                    if (i19 != 28) {
                                                        z3 = false;
                                                    } else {
                                                        i15 = N.hide_fingerprint_instantly_prefixes;
                                                        if (str == null) {
                                                            z3 = false;
                                                        } else {
                                                            stringArray = context.getResources().getStringArray(i15);
                                                            length = stringArray.length;
                                                            i16 = 0;
                                                            while (true) {
                                                                if (i16 < length) {
                                                                    z3 = false;
                                                                } else if (str.startsWith(stringArray[i16])) {
                                                                    z3 = true;
                                                                } else {
                                                                    i16++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (z3) {
                                                    }
                                                }
                                                handler6.postDelayed(runnableC0906j6, i14);
                                            }
                                            biometricFragment2.f13058a.f13043Z = true;
                                        }
                                    } else {
                                        if (charSequenceK == null) {
                                            charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i18;
                                        }
                                        biometricFragment2.k(i18, charSequenceK);
                                    }
                                }
                            }
                            biometricFragment2.f13058a.e(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        BiometricFragment biometricFragment3 = this.f13080b;
                        if (charSequence == null) {
                            biometricFragment3.getClass();
                        } else {
                            if (biometricFragment3.i()) {
                                biometricFragment3.m(charSequence);
                            }
                            biometricFragment3.f13058a.e(null);
                        }
                        break;
                    case 3:
                        BiometricFragment biometricFragment4 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment4.i()) {
                                biometricFragment4.m(biometricFragment4.getString(T.fingerprint_not_recognized));
                            }
                            A a17 = biometricFragment4.f13058a;
                            if (a17.f13057w) {
                                Executor executorC0911o2 = a17.f13044d;
                                if (executorC0911o2 == null) {
                                    executorC0911o2 = new ExecutorC0911o(1);
                                }
                                executorC0911o2.execute(new RunnableC0904h(biometricFragment4, 1));
                            }
                            A a18 = biometricFragment4.f13058a;
                            if (a18.f13041X == null) {
                                a18.f13041X = new androidx.lifecycle.F();
                            }
                            A.i(a18.f13041X, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        BiometricFragment biometricFragment5 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment5.h()) {
                                biometricFragment5.j();
                            } else {
                                A a19 = biometricFragment5.f13058a;
                                String string = a19.f13052p;
                                if (string == null) {
                                    v vVar = a19.f13046f;
                                    if (vVar != null) {
                                        string = vVar.f13099c;
                                        if (string == null) {
                                            string = "";
                                        }
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string == null) {
                                    string = biometricFragment5.getString(T.default_error_msg);
                                }
                                biometricFragment5.k(13, string);
                                biometricFragment5.f(2);
                            }
                            biometricFragment5.f13058a.h(false);
                        }
                        break;
                    default:
                        BiometricFragment biometricFragment6 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment6.f(1);
                            biometricFragment6.dismiss();
                            A a110 = biometricFragment6.f13058a;
                            if (a110.f13050k0 == null) {
                                a110.f13050k0 = new androidx.lifecycle.F();
                            }
                            A.i(a110.f13050k0, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        A a15 = this.f13058a;
        if (a15.f13050k0 == null) {
            a15.f13050k0 = new androidx.lifecycle.F();
        }
        final int i14 = 5;
        a15.f13050k0.e(this, new Observer(this) { // from class: androidx.biometric.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricFragment f13080b;

            {
                this.f13080b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x015f  */
            /* JADX WARN: Code duplicated, block: B:104:0x016b  */
            /* JADX WARN: Code duplicated, block: B:107:0x0175 A[LOOP:0: B:103:0x0169->B:107:0x0175, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:110:0x017b  */
            /* JADX WARN: Code duplicated, block: B:113:0x0186 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:115:0x0189  */
            /* JADX WARN: Code duplicated, block: B:134:0x0158 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:135:0x0173 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:78:0x010f  */
            /* JADX WARN: Code duplicated, block: B:80:0x0117 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:82:0x011a  */
            /* JADX WARN: Code duplicated, block: B:85:0x0125  */
            /* JADX WARN: Code duplicated, block: B:89:0x012e  */
            /* JADX WARN: Code duplicated, block: B:91:0x0136  */
            /* JADX WARN: Code duplicated, block: B:93:0x013d  */
            /* JADX WARN: Code duplicated, block: B:94:0x0141  */
            /* JADX WARN: Code duplicated, block: B:96:0x0152  */
            /* JADX WARN: Code duplicated, block: B:98:0x0158  */
            /* JADX WARN: Code duplicated, block: B:99:0x015a  */
            /* JADX WARN: Instruction removed from duplicated block: B:115:0x0189, please report this as an issue */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zI;
                CharSequence charSequenceK;
                Context context;
                int i15;
                String str;
                int i16;
                String[] stringArray;
                int length;
                int i17;
                boolean z3;
                int i18;
                switch (i14) {
                    case 0:
                        C0915t c0915t = (C0915t) obj;
                        BiometricFragment biometricFragment = this.f13080b;
                        if (c0915t != null) {
                            A a16 = biometricFragment.f13058a;
                            if (a16.f13057w) {
                                a16.f13057w = false;
                                Executor executorC0911o = a16.f13044d;
                                if (executorC0911o == null) {
                                    executorC0911o = new ExecutorC0911o(1);
                                }
                                executorC0911o.execute(new RunnableC0903g(0, biometricFragment, c0915t));
                            }
                            biometricFragment.dismiss();
                            A a17 = biometricFragment.f13058a;
                            if (a17.f13038L == null) {
                                a17.f13038L = new androidx.lifecycle.F();
                            }
                            A.i(a17.f13038L, null);
                        }
                        break;
                    case 1:
                        C0902f c0902f = (C0902f) obj;
                        BiometricFragment biometricFragment2 = this.f13080b;
                        if (c0902f != null) {
                            int i19 = c0902f.f13072a;
                            switch (i19) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i19 = 8;
                                    break;
                            }
                            Context context2 = biometricFragment2.getContext();
                            int i110 = Build.VERSION.SDK_INT;
                            if (i110 >= 29 || (!(i19 == 7 || i19 == 9) || context2 == null)) {
                                zI = biometricFragment2.i();
                                charSequenceK = c0902f.f13073b;
                                if (zI) {
                                    if (charSequenceK == null) {
                                        charSequenceK = p140j8.f.k(i19, biometricFragment2.getContext());
                                    }
                                    if (i19 == 5) {
                                        i18 = biometricFragment2.f13058a.t;
                                        if (i18 != 0 || i18 == 3) {
                                            biometricFragment2.l(i19, charSequenceK);
                                        }
                                        biometricFragment2.dismiss();
                                    } else {
                                        if (biometricFragment2.f13058a.f13043Z) {
                                            biometricFragment2.k(i19, charSequenceK);
                                        } else {
                                            biometricFragment2.m(charSequenceK);
                                            Handler handler6 = biometricFragment2.f13059b;
                                            RunnableC0906j runnableC0906j6 = new RunnableC0906j(biometricFragment2, i19, charSequenceK, 1);
                                            context = biometricFragment2.getContext();
                                            if (context != null) {
                                                str = Build.MODEL;
                                                if (i110 != 28) {
                                                    z3 = false;
                                                } else {
                                                    i16 = N.hide_fingerprint_instantly_prefixes;
                                                    if (str == null) {
                                                        z3 = false;
                                                    } else {
                                                        stringArray = context.getResources().getStringArray(i16);
                                                        length = stringArray.length;
                                                        i17 = 0;
                                                        while (true) {
                                                            if (i17 < length) {
                                                                z3 = false;
                                                            } else if (str.startsWith(stringArray[i17])) {
                                                                z3 = true;
                                                            } else {
                                                                i17++;
                                                            }
                                                        }
                                                    }
                                                }
                                                i15 = z3 ? 0 : Constants.MAX_URL_LENGTH;
                                            }
                                            handler6.postDelayed(runnableC0906j6, i15);
                                        }
                                        biometricFragment2.f13058a.f13043Z = true;
                                    }
                                } else {
                                    if (charSequenceK == null) {
                                        charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i19;
                                    }
                                    biometricFragment2.k(i19, charSequenceK);
                                }
                            } else {
                                KeyguardManager keyguardManagerA = K.a(context2);
                                if ((keyguardManagerA == null ? false : K.b(keyguardManagerA)) && com.palmpay.lib.apm.launchcounter.util.d.A(biometricFragment2.f13058a.d())) {
                                    biometricFragment2.j();
                                } else {
                                    zI = biometricFragment2.i();
                                    charSequenceK = c0902f.f13073b;
                                    if (zI) {
                                        if (charSequenceK == null) {
                                            charSequenceK = p140j8.f.k(i19, biometricFragment2.getContext());
                                        }
                                        if (i19 == 5) {
                                            i18 = biometricFragment2.f13058a.t;
                                            if (i18 != 0) {
                                                biometricFragment2.l(i19, charSequenceK);
                                            } else {
                                                biometricFragment2.l(i19, charSequenceK);
                                            }
                                            biometricFragment2.dismiss();
                                        } else {
                                            if (biometricFragment2.f13058a.f13043Z) {
                                                biometricFragment2.k(i19, charSequenceK);
                                            } else {
                                                biometricFragment2.m(charSequenceK);
                                                Handler handler7 = biometricFragment2.f13059b;
                                                RunnableC0906j runnableC0906j7 = new RunnableC0906j(biometricFragment2, i19, charSequenceK, 1);
                                                context = biometricFragment2.getContext();
                                                if (context != null) {
                                                    str = Build.MODEL;
                                                    if (i110 != 28) {
                                                        z3 = false;
                                                    } else {
                                                        i16 = N.hide_fingerprint_instantly_prefixes;
                                                        if (str == null) {
                                                            z3 = false;
                                                        } else {
                                                            stringArray = context.getResources().getStringArray(i16);
                                                            length = stringArray.length;
                                                            i17 = 0;
                                                            while (true) {
                                                                if (i17 < length) {
                                                                    z3 = false;
                                                                } else if (str.startsWith(stringArray[i17])) {
                                                                    z3 = true;
                                                                } else {
                                                                    i17++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (z3) {
                                                    }
                                                }
                                                handler7.postDelayed(runnableC0906j7, i15);
                                            }
                                            biometricFragment2.f13058a.f13043Z = true;
                                        }
                                    } else {
                                        if (charSequenceK == null) {
                                            charSequenceK = biometricFragment2.getString(T.default_error_msg) + " " + i19;
                                        }
                                        biometricFragment2.k(i19, charSequenceK);
                                    }
                                }
                            }
                            biometricFragment2.f13058a.e(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        BiometricFragment biometricFragment3 = this.f13080b;
                        if (charSequence == null) {
                            biometricFragment3.getClass();
                        } else {
                            if (biometricFragment3.i()) {
                                biometricFragment3.m(charSequence);
                            }
                            biometricFragment3.f13058a.e(null);
                        }
                        break;
                    case 3:
                        BiometricFragment biometricFragment4 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment4.i()) {
                                biometricFragment4.m(biometricFragment4.getString(T.fingerprint_not_recognized));
                            }
                            A a18 = biometricFragment4.f13058a;
                            if (a18.f13057w) {
                                Executor executorC0911o2 = a18.f13044d;
                                if (executorC0911o2 == null) {
                                    executorC0911o2 = new ExecutorC0911o(1);
                                }
                                executorC0911o2.execute(new RunnableC0904h(biometricFragment4, 1));
                            }
                            A a19 = biometricFragment4.f13058a;
                            if (a19.f13041X == null) {
                                a19.f13041X = new androidx.lifecycle.F();
                            }
                            A.i(a19.f13041X, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        BiometricFragment biometricFragment5 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            if (biometricFragment5.h()) {
                                biometricFragment5.j();
                            } else {
                                A a110 = biometricFragment5.f13058a;
                                String string = a110.f13052p;
                                if (string == null) {
                                    v vVar = a110.f13046f;
                                    if (vVar != null) {
                                        string = vVar.f13099c;
                                        if (string == null) {
                                            string = "";
                                        }
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string == null) {
                                    string = biometricFragment5.getString(T.default_error_msg);
                                }
                                biometricFragment5.k(13, string);
                                biometricFragment5.f(2);
                            }
                            biometricFragment5.f13058a.h(false);
                        }
                        break;
                    default:
                        BiometricFragment biometricFragment6 = this.f13080b;
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment6.f(1);
                            biometricFragment6.dismiss();
                            A a111 = biometricFragment6.f13058a;
                            if (a111.f13050k0 == null) {
                                a111.f13050k0 = new androidx.lifecycle.F();
                            }
                            A.i(a111.f13050k0, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && com.palmpay.lib.apm.launchcounter.util.d.A(this.f13058a.d())) {
            A a3 = this.f13058a;
            a3.f13036C = true;
            this.f13059b.postDelayed(new RunnableC0912p(a3, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f13058a.f13034A) {
            return;
        }
        androidx.fragment.app.E activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            f(0);
        }
    }
}
