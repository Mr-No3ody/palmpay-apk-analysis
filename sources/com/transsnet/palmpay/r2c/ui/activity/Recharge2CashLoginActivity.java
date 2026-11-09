package com.transsnet.palmpay.r2c.ui.activity;

import L6.b;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Pd.f;
import R3.e;
import Rd.C0605v;
import Wd.I;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.airtime.bean.req.MTNLoginReq;
import com.transsnet.palmpay.airtime.bean.req.SendRecharge2CashOTPReq;
import com.transsnet.palmpay.airtime.bean.rsp.Recharge2CashProviderV2Rsp;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashLoginActivity;
import com.transsnet.palmpay.r2c.viewmodel.Recharge2CashLoginViewModel;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p054dd.k;
import p085fd.a;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/r2c/ui/activity/Recharge2CashLoginActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/r2c/viewmodel/Recharge2CashLoginViewModel;", "LRd/v;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecharge2CashLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recharge2CashLoginActivity.kt\ncom/transsnet/palmpay/r2c/ui/activity/Recharge2CashLoginActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,220:1\n171#2,12:221\n215#2:233\n260#2,10:234\n296#2:244\n*S KotlinDebug\n*F\n+ 1 Recharge2CashLoginActivity.kt\ncom/transsnet/palmpay/r2c/ui/activity/Recharge2CashLoginActivity\n*L\n108#1:221,12\n108#1:233\n117#1:234,10\n117#1:244\n*E\n"})
public final class Recharge2CashLoginActivity extends BaseMvvmVBActivity<Recharge2CashLoginViewModel, C0605v> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f33122i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Recharge2CashProviderV2Rsp f33123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33126g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static final void n(Recharge2CashLoginActivity recharge2CashLoginActivity) {
        recharge2CashLoginActivity.f33125f = true;
        C0605v c0605v = (C0605v) recharge2CashLoginActivity.f27334c;
        if (c0605v != null) {
            c0605v.f8528d.setText(recharge2CashLoginActivity.getString(f.qt_airtime_str_resend_code));
        }
        C0605v c0605v2 = (C0605v) recharge2CashLoginActivity.f27334c;
        if (c0605v2 != null) {
            c0605v2.f8528d.setTextColor(CommonViewExtKt.colorInt(b.ppColorPrimary, recharge2CashLoginActivity));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((Recharge2CashLoginViewModel) l()).f33136e;
        if (lVar != null) {
            lVar.e(this, new I(new k(this, this, 0), 29));
        }
        l lVar2 = ((Recharge2CashLoginViewModel) l()).f33137f;
        if (lVar2 != null) {
            lVar2.e(this, new I(new k(this, this, 1), 29));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_r2c_login, (ViewGroup) null, false);
        int i7 = c.airtime_login;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = c.airtime_provider_logo;
            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView != null) {
                i7 = c.airtime_resend_code;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = c.airtime_sms;
                    if (((CardView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = c.airtime_sms_edit;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) p059e1.a.m(i7, viewInflate);
                        if (appCompatEditText != null) {
                            i7 = c.airtime_tips;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = c.titleBar;
                                if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = c.tvError;
                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView3 != null) {
                                        C0605v c0605v = new C0605v((ConstraintLayout) viewInflate, ppButton, imageView, textView, appCompatEditText, textView2, textView3);
                                        Intrinsics.checkNotNullExpressionValue(c0605v, "inflate(...)");
                                        return c0605v;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void o() {
        this.f33125f = false;
        SendRecharge2CashOTPReq req = new SendRecharge2CashOTPReq();
        req.phone = this.f33124e;
        Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp = this.f33123d;
        req.code = recharge2CashProviderV2Rsp != null ? recharge2CashProviderV2Rsp.billerName : null;
        Recharge2CashLoginViewModel recharge2CashLoginViewModel = (Recharge2CashLoginViewModel) l();
        recharge2CashLoginViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(recharge2CashLoginViewModel, new p085fd.b(req, null), recharge2CashLoginViewModel.f33136e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getUIHandler().removeCallbacksAndMessages(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        o();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp = this.f33123d;
        if (recharge2CashProviderV2Rsp != null) {
            C0605v c0605v = (C0605v) this.f27334c;
            r0.l1(recharge2CashProviderV2Rsp.billerIcon, c0605v != null ? c0605v.f8527c : null);
            C0605v c0605v2 = (C0605v) this.f27334c;
            if (c0605v2 != null) {
                c0605v2.f8530f.setText(d0.j(" ", r0.Y(this.f33124e), new SpanUtils().append(getString(f.qt_airtime_str_sms_tips_2, recharge2CashProviderV2Rsp.billerName))).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, this)).create());
            }
        }
        C0605v c0605v3 = (C0605v) this.f27334c;
        if (c0605v3 != null) {
            h.r(c0605v3.f8529e, new e(this, 14), null);
        }
        C0605v c0605v4 = (C0605v) this.f27334c;
        if (c0605v4 != null) {
            final int i7 = 0;
            c0605v4.f8528d.setOnClickListener(new View.OnClickListener(this) { // from class: dd.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recharge2CashLoginActivity f35886b;

                {
                    this.f35886b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Recharge2CashLoginActivity recharge2CashLoginActivity = this.f35886b;
                    switch (i7) {
                        case 0:
                            if (recharge2CashLoginActivity.f33125f) {
                                recharge2CashLoginActivity.o();
                                n0.g().l("RechargeToCashLoginPage_ResendCodeButton");
                            }
                            break;
                        default:
                            int i10 = Recharge2CashLoginActivity.f33122i;
                            if (!r0.U0()) {
                                C0605v c0605v5 = (C0605v) recharge2CashLoginActivity.f27334c;
                                if (TextUtils.isEmpty(String.valueOf(c0605v5 != null ? c0605v5.f8529e.getText() : null))) {
                                    C0605v c0605v6 = (C0605v) recharge2CashLoginActivity.f27334c;
                                    if (c0605v6 != null) {
                                        h.s(c0605v6.f8531g, true);
                                    }
                                } else {
                                    C0605v c0605v7 = (C0605v) recharge2CashLoginActivity.f27334c;
                                    if (c0605v7 != null) {
                                        c0605v7.f8526b.b(true);
                                    }
                                    MTNLoginReq req = new MTNLoginReq();
                                    C0605v c0605v8 = (C0605v) recharge2CashLoginActivity.f27334c;
                                    req.msgCode = String.valueOf(c0605v8 != null ? c0605v8.f8529e.getText() : null);
                                    req.phone = recharge2CashLoginActivity.f33124e;
                                    Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp2 = recharge2CashLoginActivity.f33123d;
                                    req.code = recharge2CashProviderV2Rsp2 != null ? recharge2CashProviderV2Rsp2.billerName : null;
                                    Recharge2CashLoginViewModel recharge2CashLoginViewModel = (Recharge2CashLoginViewModel) recharge2CashLoginActivity.l();
                                    recharge2CashLoginViewModel.getClass();
                                    Intrinsics.checkNotNullParameter(req, "req");
                                    p140j8.f.s(recharge2CashLoginViewModel, new a(req, null), recharge2CashLoginViewModel.f33137f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                                n0.g().l("RechargeToCashLoginPage_LogInButton");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0605v c0605v5 = (C0605v) this.f27334c;
        if (c0605v5 != null) {
            final int i10 = 1;
            c0605v5.f8526b.setOnClickListener(new View.OnClickListener(this) { // from class: dd.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recharge2CashLoginActivity f35886b;

                {
                    this.f35886b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Recharge2CashLoginActivity recharge2CashLoginActivity = this.f35886b;
                    switch (i10) {
                        case 0:
                            if (recharge2CashLoginActivity.f33125f) {
                                recharge2CashLoginActivity.o();
                                n0.g().l("RechargeToCashLoginPage_ResendCodeButton");
                            }
                            break;
                        default:
                            int i11 = Recharge2CashLoginActivity.f33122i;
                            if (!r0.U0()) {
                                C0605v c0605v6 = (C0605v) recharge2CashLoginActivity.f27334c;
                                if (TextUtils.isEmpty(String.valueOf(c0605v6 != null ? c0605v6.f8529e.getText() : null))) {
                                    C0605v c0605v7 = (C0605v) recharge2CashLoginActivity.f27334c;
                                    if (c0605v7 != null) {
                                        h.s(c0605v7.f8531g, true);
                                    }
                                } else {
                                    C0605v c0605v8 = (C0605v) recharge2CashLoginActivity.f27334c;
                                    if (c0605v8 != null) {
                                        c0605v8.f8526b.b(true);
                                    }
                                    MTNLoginReq req = new MTNLoginReq();
                                    C0605v c0605v9 = (C0605v) recharge2CashLoginActivity.f27334c;
                                    req.msgCode = String.valueOf(c0605v9 != null ? c0605v9.f8529e.getText() : null);
                                    req.phone = recharge2CashLoginActivity.f33124e;
                                    Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp2 = recharge2CashLoginActivity.f33123d;
                                    req.code = recharge2CashProviderV2Rsp2 != null ? recharge2CashProviderV2Rsp2.billerName : null;
                                    Recharge2CashLoginViewModel recharge2CashLoginViewModel = (Recharge2CashLoginViewModel) recharge2CashLoginActivity.l();
                                    recharge2CashLoginViewModel.getClass();
                                    Intrinsics.checkNotNullParameter(req, "req");
                                    p140j8.f.s(recharge2CashLoginViewModel, new a(req, null), recharge2CashLoginViewModel.f33137f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                                n0.g().l("RechargeToCashLoginPage_LogInButton");
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }
}
