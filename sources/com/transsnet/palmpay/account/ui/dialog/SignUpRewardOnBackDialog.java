package com.transsnet.palmpay.account.ui.dialog;

import F8.d;
import F8.e;
import M7.s;
import Nc.x;
import Pa.F;
import Pa.i0;
import Pa.n0;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.rsp.RegisterCouponResp;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/SignUpRewardOnBackDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/app/Activity;", "activity", "Lcom/transsnet/palmpay/account/bean/rsp/RegisterCouponResp;", "couponLink", "<init>", "(Landroid/app/Activity;Lcom/transsnet/palmpay/account/bean/rsp/RegisterCouponResp;)V", "", "initViews", "()V", "show", PPRNBridge.DIALOG_ACTION_DISMISS, "Landroid/app/Activity;", "Lcom/transsnet/palmpay/account/bean/rsp/RegisterCouponResp;", "Landroid/animation/AnimatorSet;", "mFingerAnimator", "Landroid/animation/AnimatorSet;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "fingerAnimRunnable", "Ljava/lang/Runnable;", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSignUpRewardOnBackDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpRewardOnBackDialog.kt\ncom/transsnet/palmpay/account/ui/dialog/SignUpRewardOnBackDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class SignUpRewardOnBackDialog extends b {

    @NotNull
    private final Activity activity;

    @Nullable
    private final RegisterCouponResp couponLink;

    @NotNull
    private Runnable fingerAnimRunnable;

    @Nullable
    private AnimatorSet mFingerAnimator;

    @Nullable
    private Handler mHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpRewardOnBackDialog(@NotNull Activity activity, @Nullable RegisterCouponResp registerCouponResp) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.couponLink = registerCouponResp;
        this.fingerAnimRunnable = new s(this, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fingerAnimRunnable$lambda$0(SignUpRewardOnBackDialog signUpRewardOnBackDialog) {
        AnimatorSet animatorSet = signUpRewardOnBackDialog.mFingerAnimator;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(SignUpRewardOnBackDialog signUpRewardOnBackDialog, View view) {
        int id2 = view.getId();
        if (id2 == d.ivIcon) {
            n0.g().m("retain_popup_element_clicks", "关闭", "");
            signUpRewardOnBackDialog.dismiss();
            return;
        }
        if (id2 == d.tvGiveUp) {
            n0.g().m("retain_popup_element_clicks", "Give up", "");
            signUpRewardOnBackDialog.dismiss();
            i0.H(null);
            signUpRewardOnBackDialog.activity.finish();
            return;
        }
        if (id2 == d.tvUseCoupon) {
            n0.g().m("retain_popup_element_clicks", "Use Coupon", "");
            signUpRewardOnBackDialog.dismiss();
            RegisterCouponResp registerCouponResp = signUpRewardOnBackDialog.couponLink;
            if (TextUtils.isEmpty(registerCouponResp != null ? registerCouponResp.androidLinkUrl : null)) {
                com.palmpay.lib.apm.launchcounter.util.d.F("/airtime/top_up_airtime");
            } else {
                Context context = signUpRewardOnBackDialog.getContext();
                RegisterCouponResp registerCouponResp2 = signUpRewardOnBackDialog.couponLink;
                ActivityUtils.startActivity(F.a(context, registerCouponResp2 != null ? registerCouponResp2.androidLinkUrl : null));
            }
            signUpRewardOnBackDialog.activity.finish();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        AnimatorSet animatorSet = this.mFingerAnimator;
        if (animatorSet != null) {
            Intrinsics.e(animatorSet);
            animatorSet.cancel();
            this.mFingerAnimator = null;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.fingerAnimRunnable);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(e.ac_dialog_signup_reward_onback);
        showAtCenter(getWindow());
        PpButton ppButton = (PpButton) findViewById(d.tvUseCoupon);
        h.q(new x(this, 19), findViewById(d.ivIcon), findViewById(d.tvGiveUp), ppButton);
        this.mHandler = new Handler(Looper.getMainLooper());
        RegisterCouponResp registerCouponResp = this.couponLink;
        if (registerCouponResp != null) {
            if (TextUtils.isEmpty(registerCouponResp.button)) {
                registerCouponResp = null;
            }
            if (registerCouponResp == null || ppButton == null) {
                return;
            }
            ppButton.setText(registerCouponResp.button);
        }
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        n0.g().l("registration_page_result_page_retention_popup");
    }
}
