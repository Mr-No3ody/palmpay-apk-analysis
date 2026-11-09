package com.transsnet.palmpay.core.ui.fragment.verify;

import F6.d;
import Ja.s;
import Ja.t;
import Pa.r0;
import android.content.Context;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.w;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.m;
import io.fastkv.n;
import java.security.InvalidKeyException;
import kotlin.Metadata;
import kotlin.Unit;
import p025ba.e;
import p025ba.g;
import p025ba.k;
import p145jd.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckPalmPayPinWithTouchFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseCheckPinFragment;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckPalmPayPinWithTouchFragment extends BaseCheckPinFragment {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f27995Z = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f27996B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f27997C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public PpButton f27998H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public LinearLayout f27999L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public View f28000M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public w f28001Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public v f28002X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f28003Y;

    public final u E() {
        Context context;
        try {
            return new u(a.c(new a(getContext()).f38590a, Base64.decode(p059e1.a.H("main_sp_touch_id_pay_vector" + BaseApplication.get().getUser().getPhoneNumber()), 2)));
        } catch (Exception e10) {
            if ((e10 instanceof InvalidKeyException) && (context = getContext()) != null) {
                n.O(context, 0, null, "Fingerprint verifying unavailable", null, null, null, "Your Fingerprint information has been changed recently. To ensure your account security, please use PIN to continue", Integer.valueOf(k.core_confirm), null, new s(this, 4), null, null, null, null, false, 0, 8387195);
            }
            PpButton ppButton = this.f27998H;
            if (ppButton == null) {
                return null;
            }
            ppButton.setEnabled(true);
            return null;
        }
    }

    public final void F() {
        Context context;
        w wVar;
        int i7 = 0;
        d.h(this.f27317a, 3, "startAuthentication: ");
        this.f28003Y = 0;
        v vVar = this.f28002X;
        if (vVar != null) {
            try {
                u uVarE = E();
                if (uVarE != null && (wVar = this.f28001Q) != null) {
                    wVar.a(vVar, uVarE);
                }
                View view = this.f28000M;
                if (view == null || !h.e(view)) {
                    return;
                }
                h.A(view, false, m.cv_anim_bottom_out);
            } catch (Exception e10) {
                if ((e10 instanceof InvalidKeyException) && (context = getContext()) != null) {
                    n.O(context, 0, null, "Fingerprint verifying unavailable", null, null, null, "Your Fingerprint information has been changed recently. To ensure your account security, please use PIN to unlock", Integer.valueOf(k.core_confirm), null, new s(this, i7), null, null, null, null, false, 0, 8387195);
                }
                PpButton ppButton = this.f27998H;
                if (ppButton != null) {
                    ppButton.setEnabled(true);
                }
                View view2 = this.f28000M;
                if (view2 != null) {
                    h.A(view2, true, m.cv_anim_bottom_in);
                    Unit unit = Unit.f38893a;
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_fragment_check_palmpay_pin_with_touch;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        B(this.f27999L);
        TextView textView = this.f27996B;
        if (textView == null) {
            return 0;
        }
        textView.setText(r0.B(this.f27930o, true));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        this.f28001Q = new w(this, androidx.core.content.d.d(requireContext()), new t(this, 0));
        v vVar = new v();
        vVar.f13097a = getString(k.core_msg_use_touchid);
        vVar.f13099c = getString(k.core_use_pin);
        this.f28002X = vVar.a();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        this.f28000M = this.f27318b.findViewById(e.viewContainer);
        this.f27997C = this.f27318b.findViewById(e.touchIdView);
        this.f27999L = (LinearLayout) this.f27318b.findViewById(e.paymentInfoContainer);
        this.f27996B = (TextView) this.f27318b.findViewById(e.tvAmount);
        this.f27318b.findViewById(e.ivClose).setOnClickListener(new s(this, 1));
        this.f27318b.findViewById(e.tvUsePin).setOnClickListener(new s(this, 2));
        PpButton ppButton = (PpButton) this.f27318b.findViewById(e.btnPay);
        this.f27998H = ppButton;
        if (ppButton == null) {
            return 0;
        }
        ppButton.setOnClickListener(new s(this, 3));
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            w wVar = this.f28001Q;
            if (wVar != null) {
                wVar.c();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        F();
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.verify.BaseVerifyFragment
    public final void w() {
        PpButton ppButton = this.f27998H;
        if (ppButton != null) {
            ppButton.b(false);
        }
    }
}
