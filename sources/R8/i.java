package R8;

import Bc.C0105b;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.widget.TextView;
import androidx.biometric.C0915t;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends p059e1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VerifyFingerPrintFragment f7948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f7949f;

    public i(VerifyFingerPrintFragment verifyFingerPrintFragment, Context context) {
        super(9);
        this.f7948e = verifyFingerPrintFragment;
        this.f7949f = context;
    }

    @Override // p059e1.a
    public final void P(int i7, CharSequence errString) {
        Intrinsics.checkNotNullParameter(errString, "errString");
        VerifyFingerPrintFragment verifyFingerPrintFragment = this.f7948e;
        C0105b c0105b = verifyFingerPrintFragment.f26114B;
        if (c0105b != null) {
            p220oa.h.c(c0105b.f667g);
        }
        verifyFingerPrintFragment.f26117p = false;
        F6.d.h(verifyFingerPrintFragment.f27317a, 3, "onAuthenticationError: " + i7 + " " + ((Object) errString));
        D3.a.O(D3.a.s(i7, errString, "login", "safe_lock", verifyFingerPrintFragment.f26113A));
        if (i7 != 5) {
            if (i7 != 7) {
                if (i7 == 13) {
                    verifyFingerPrintFragment.I(false);
                    return;
                } else if (i7 != 9) {
                    if (i7 != 10) {
                        verifyFingerPrintFragment.f26118v = true;
                        VerifyFingerPrintFragment.B(verifyFingerPrintFragment);
                        verifyFingerPrintFragment.F();
                        return;
                    }
                }
            }
            verifyFingerPrintFragment.w();
            verifyFingerPrintFragment.E(errString);
            C0105b c0105b2 = verifyFingerPrintFragment.f26114B;
            L8.a.c(c0105b2 != null ? (TextView) c0105b2.f663c : null);
            verifyFingerPrintFragment.f26118v = true;
            verifyFingerPrintFragment.F();
            return;
        }
        verifyFingerPrintFragment.f26119w++;
        p220oa.h.x(this.f7949f, errString.toString());
        verifyFingerPrintFragment.f26118v = true;
        verifyFingerPrintFragment.F();
        if (verifyFingerPrintFragment.f26119w >= 3) {
            verifyFingerPrintFragment.I(false);
        }
    }

    @Override // p059e1.a
    public final void Q() {
        VerifyFingerPrintFragment verifyFingerPrintFragment = this.f7948e;
        verifyFingerPrintFragment.f26113A++;
        VerifyFingerPrintFragment.B(verifyFingerPrintFragment);
        verifyFingerPrintFragment.f26118v = true;
        verifyFingerPrintFragment.F();
        verifyFingerPrintFragment.f26117p = false;
    }

    @Override // p059e1.a
    public final void R(C0915t result) {
        Intrinsics.checkNotNullParameter(result, "result");
        VerifyFingerPrintFragment verifyFingerPrintFragment = this.f7948e;
        C0105b c0105b = verifyFingerPrintFragment.f26114B;
        if (c0105b != null) {
            p220oa.h.c(c0105b.f667g);
        }
        verifyFingerPrintFragment.f26117p = false;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(verifyFingerPrintFragment);
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new h(result, verifyFingerPrintFragment, null), 2);
    }
}
