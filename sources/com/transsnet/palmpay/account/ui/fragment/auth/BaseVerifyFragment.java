package com.transsnet.palmpay.account.ui.fragment.auth;

import Bc.f;
import Ce.DialogInterfaceOnDismissListenerC0168j;
import F8.h;
import Je.l;
import O6.c;
import Pa.i0;
import Pa.r0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.account.ui.activity.AskEnableTouchIdActivity;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.account.ui.viewmodel.SafeVerifyViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.util.SPUtils;
import io.fastkv.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p025ba.k;
import p059e1.a;
import p115ha.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/auth/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/SafeVerifyViewModel;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseVerifyFragment extends BaseMvvmFragment<SafeVerifyViewModel> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    public final void A(TextView textView) {
        ?? r3 = this instanceof VerifyPatternFragment ? 0 : SPUtils.getInstance().getBoolean(d.l(), false);
        boolean zIsLoginPswEnabled = BaseApplication.get().getUser().isLoginPswEnabled();
        ?? V2 = this instanceof VerifyFingerPrintFragment ? 0 : n.v();
        boolean z3 = this instanceof VerifySafePinFragment;
        if ((!z3 ? 1 : 0) + r3 + V2 > 1) {
            if (textView != null) {
                String string = getString(h.ac_other_verify_methods);
                textView.setText(string != null ? string.toString() : null);
                return;
            }
            return;
        }
        if (r3 != 0) {
            if (textView != null) {
                String string2 = getString(h.ac_verify_by_pattern);
                textView.setText(string2 != null ? string2.toString() : null);
                return;
            }
            return;
        }
        if (V2 != 0) {
            if (textView != null) {
                String string3 = getString(h.ac_verify_by_fingerprint);
                textView.setText(string3 != null ? string3.toString() : null);
                return;
            }
            return;
        }
        if (z3 || textView == null) {
            return;
        }
        String string4 = getString(zIsLoginPswEnabled ? h.ac_verify_by_psw : h.ac_verify_by_pin);
        textView.setText(string4 != null ? string4.toString() : null);
    }

    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final void t() {
        ?? C10;
        f fVar;
        f fVar2;
        if (getActivity() instanceof PinSafeWithPatternActivity) {
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
            PinSafeWithPatternActivity pinSafeWithPatternActivity = (PinSafeWithPatternActivity) activity;
            Intrinsics.checkNotNullParameter(this, "fragment");
            if (this instanceof VerifyPatternFragment) {
                C10 = 0;
            } else {
                String strL = d.l();
                Intrinsics.checkNotNullExpressionValue(strL, "getPatternOnoffStateKey(...)");
                C10 = a.C(strL, false);
            }
            ?? V2 = this instanceof VerifyFingerPrintFragment ? 0 : n.v();
            boolean z3 = this instanceof VerifySafePinFragment;
            boolean z8 = !z3;
            if (C10 + (z8 ? 1 : 0) + V2 <= 1) {
                if (C10 != 0) {
                    pinSafeWithPatternActivity.m();
                    return;
                }
                if (V2 != 0) {
                    pinSafeWithPatternActivity.l();
                    return;
                } else {
                    if (z3) {
                        return;
                    }
                    int i7 = PinSafeWithPatternActivity.f25946g;
                    pinSafeWithPatternActivity.n(false);
                    return;
                }
            }
            Q8.d dVar = new Q8.d(pinSafeWithPatternActivity);
            dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC0168j(1));
            dVar.show();
            f fVar3 = dVar.f7640b;
            if (fVar3 != null) {
                p220oa.h.s((IconicsTextView) fVar3.f698d, z8);
            }
            if (!z3 && (fVar2 = dVar.f7640b) != null) {
                ((IconicsTextView) fVar2.f698d).setText(BaseApplication.get().getUser().isLoginPswEnabled() ? h.ac_verify_by_psw : h.ac_verify_pin);
            }
            f fVar4 = dVar.f7640b;
            if (fVar4 != null) {
                p220oa.h.s((IconicsTextView) fVar4.f699e, C10);
            }
            f fVar5 = dVar.f7640b;
            if (fVar5 != null) {
                p220oa.h.s((IconicsTextView) fVar5.f700f, V2);
            }
            f fVar6 = dVar.f7640b;
            if (fVar6 != null) {
                p220oa.h.s(fVar6.f703j, (z3 || C10 == 0) ? false : true);
            }
            f fVar7 = dVar.f7640b;
            if (fVar7 != null) {
                p220oa.h.s(fVar7.f696b, (C10 == 0 || V2 == 0) ? false : true);
            }
            f fVar8 = dVar.f7640b;
            if (fVar8 == null || fVar8.f696b.getVisibility() != 8 || (fVar = dVar.f7640b) == null) {
                return;
            }
            p220oa.h.s(fVar.f696b, (z3 || V2 == 0) ? false : true);
        }
    }

    public final int u() {
        if (!(getActivity() instanceof PinSafeWithPatternActivity)) {
            return 0;
        }
        E activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
        return ((PinSafeWithPatternActivity) activity).f25951e;
    }

    public final int v() {
        if (!(getActivity() instanceof PinSafeWithPatternActivity)) {
            return 0;
        }
        E activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
        return ((PinSafeWithPatternActivity) activity).f25950d;
    }

    public final void w() {
        if (getActivity() instanceof PinSafeWithPatternActivity) {
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
            PinSafeWithPatternActivity pinSafeWithPatternActivity = (PinSafeWithPatternActivity) activity;
            if (System.currentTimeMillis() - SPUtils.getInstance().getLong("KEY_LAST_SAFE_PIN_ERROR_TIME") >= 300000) {
                pinSafeWithPatternActivity.f25951e = 0;
                a.U(0, "SAFE_PIN_LOCK_ERROR_COUNT");
            }
            pinSafeWithPatternActivity.f25951e++;
            SPUtils.getInstance().put("KEY_LAST_SAFE_PIN_ERROR_TIME", System.currentTimeMillis());
            a.U(pinSafeWithPatternActivity.f25951e, "SAFE_PIN_LOCK_ERROR_COUNT");
        }
    }

    public final void x() {
        TextView textView;
        ImageView imageView;
        TextView textView2;
        View view = this.f27318b;
        if (view != null && (textView2 = (TextView) view.findViewById(F8.d.tvSwitchAccount)) != null) {
            textView2.setText(h.ac_switch_login);
            textView2.setOnClickListener(new R8.d(this, 1));
        }
        User user = BaseApplication.get().getUser();
        if (user != null) {
            View view2 = this.f27318b;
            if (view2 != null && (imageView = (ImageView) view2.findViewById(F8.d.imageViewAvatar)) != null) {
                r0.m1(user.getAvatar(), imageView);
            }
            View view3 = this.f27318b;
            if (view3 == null || (textView = (TextView) view3.findViewById(F8.d.tvPhone)) == null) {
                return;
            }
            textView.setText(i0.i("", user.getPhoneNumber()));
        }
    }

    public final void y() {
        if (getActivity() instanceof PinSafeWithPatternActivity) {
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
            PinSafeWithPatternActivity pinSafeWithPatternActivity = (PinSafeWithPatternActivity) activity;
            String string = pinSafeWithPatternActivity.getString(h.ac_finger_full_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            c cVar = new c(pinSafeWithPatternActivity);
            cVar.f6605k = true;
            cVar.e(k.core_verification_failed);
            cVar.f6598d = string;
            cVar.c(k.core_cancel, null);
            String string2 = pinSafeWithPatternActivity.getResources().getString(h.ac_verify_pin);
            l lVar = new l(pinSafeWithPatternActivity, 21);
            cVar.f6600f = string2;
            cVar.f6602h = lVar;
            O6.d dVarA = cVar.a();
            dVarA.setCanceledOnTouchOutside(false);
            dVarA.setCancelable(false);
            dVarA.show();
        }
    }

    public void z(String str) {
        String strValueOf;
        if (getActivity() instanceof PinSafeWithPatternActivity) {
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
            PinSafeWithPatternActivity pinSafeWithPatternActivity = (PinSafeWithPatternActivity) activity;
            a.U(0, "SAFE_PIN_LOCK_ERROR_COUNT");
            try {
                String string = SPUtils.getInstance().getString(d.i());
                Intrinsics.e(string);
                ArrayList arrayListZ = CollectionsKt.Z(StringsKt__StringsKt.split$default(string, new String[]{"||"}, false, 0, 6, null));
                if (arrayListZ.isEmpty() || TextUtils.isEmpty(string)) {
                    strValueOf = String.valueOf(System.currentTimeMillis());
                } else {
                    if (arrayListZ.size() == 2) {
                        arrayListZ.remove(0);
                    }
                    strValueOf = ((String) arrayListZ.get(0)) + "||" + String.valueOf(System.currentTimeMillis());
                    Intrinsics.e(strValueOf);
                }
                String strI = d.i();
                Intrinsics.checkNotNullExpressionValue(strI, "getKeyPinSafeActivityTime(...)");
                a.W(strI, strValueOf);
            } catch (Exception unused) {
            }
            pinSafeWithPatternActivity.setResult(-1);
            String strH = d.h();
            Intrinsics.checkNotNullExpressionValue(strH, "getKeyLastPinTime(...)");
            a.V(0L, strH);
            p115ha.c cVar = b.f37362a;
            cVar.f37365c = false;
            cVar.a(0L);
            if (pinSafeWithPatternActivity.getIntent().getBooleanExtra("extra_after_unlock_launch_home", false)) {
                Intent intent = new Intent();
                intent.setClassName(pinSafeWithPatternActivity, "com.transsnet.palmpay.ui.activity.HomeActivity");
                Bundle extras = pinSafeWithPatternActivity.getIntent().getExtras();
                if (extras != null) {
                    intent.putExtras(extras);
                }
                pinSafeWithPatternActivity.startActivity(intent);
            }
            if (!TextUtils.isEmpty(str)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jF = a.F("account_sp_ask_enable_touchid");
                if ((jF == 0 || jF + 1209600000 < jCurrentTimeMillis) && !n.v() && new p131id.a(BaseApplication.getContext()).W()) {
                    a.Y(jCurrentTimeMillis, "account_sp_ask_enable_touchid");
                    AskEnableTouchIdActivity.f25828b.launch(pinSafeWithPatternActivity, str);
                }
            }
            pinSafeWithPatternActivity.finish();
        }
    }
}
