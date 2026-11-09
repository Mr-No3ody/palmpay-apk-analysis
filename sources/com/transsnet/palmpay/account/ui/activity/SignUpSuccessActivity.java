package com.transsnet.palmpay.account.ui.activity;

import Bc.B;
import C9.C0139f;
import F8.c;
import F8.d;
import F8.e;
import Gb.L;
import Gb.T;
import M3.f;
import M7.s;
import N8.C0457a;
import N8.f0;
import N8.g0;
import N8.h0;
import P8.b;
import Pa.C0525w;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.u;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.SignUpCouponItem;
import com.transsnet.palmpay.account.bean.req.SignUpSuccessCouponReq;
import com.transsnet.palmpay.account.bean.rsp.RegisterCouponBean;
import com.transsnet.palmpay.account.bean.rsp.RegisterCouponResp;
import com.transsnet.palmpay.account.ui.dialog.SignUpInviteSuccDialog;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.util.statistic.IAutoTrack;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.StatusBarView;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p051d9.d0;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/sign_up_success")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/SignUpSuccessActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Ld9/d0;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/SignUpContract$View;", "Lcom/alibaba/android/arouter/facade/callback/NavigationCallback;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrack;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSignUpSuccessActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpSuccessActivity.kt\ncom/transsnet/palmpay/account/ui/activity/SignUpSuccessActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,439:1\n574#2,4:440\n*S KotlinDebug\n*F\n+ 1 SignUpSuccessActivity.kt\ncom/transsnet/palmpay/account/ui/activity/SignUpSuccessActivity\n*L\n127#1:440,4\n*E\n"})
public final class SignUpSuccessActivity extends i implements SignUpContract.View, NavigationCallback, IAutoTrack {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f26045o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26047c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B f26049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L f26050f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RegisterCouponResp f26052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26053j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26048d = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f26051g = C2131j.b(new f(this, 5));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@Nullable Context context) {
            if (context != null) {
                context.startActivity(new Intent(context, (Class<?>) SignUpSuccessActivity.class));
            }
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrack
    public final String getPageAlias() {
        return "RegistrationResult";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.View
    public final void handleRegisterCoupon(CommonBeanResult commonBeanResult) {
        String respMsg;
        SignUpSuccessActivity signUpSuccessActivity;
        List<SignUpCouponItem.DataBean> list;
        B b7;
        B b10;
        List<RegisterCouponBean> list2;
        RegisterCouponBean registerCouponBean;
        B b11 = this.f26049e;
        if (b11 != null) {
            h.s((ConstraintLayout) b11.f593d, true);
        }
        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
            B b12 = this.f26049e;
            if (b12 != null) {
                h.s((AppCompatImageView) b12.f599o, true);
            }
            if (commonBeanResult == null || (respMsg = commonBeanResult.getRespMsg()) == null) {
                return;
            }
            h.z(this, respMsg, null, null, 61);
            return;
        }
        RegisterCouponResp registerCouponResp = (RegisterCouponResp) commonBeanResult.data;
        if (registerCouponResp != null) {
            this.f26052i = registerCouponResp;
            if (i0.W(this)) {
                ArrayList arrayList = new ArrayList();
                List<RegisterCouponBean> list3 = registerCouponResp.couponDtoList;
                if (list3 != null && (!list3.isEmpty())) {
                    List<RegisterCouponBean> couponDtoList = registerCouponResp.couponDtoList;
                    Intrinsics.checkNotNullExpressionValue(couponDtoList, "couponDtoList");
                    arrayList.addAll(couponDtoList);
                }
                B b13 = this.f26049e;
                if (b13 != null) {
                    ((PpButton) b13.f589B).postDelayed(new s(this, 6), 100L);
                }
                if (arrayList.isEmpty()) {
                    B b14 = this.f26049e;
                    if (b14 != null) {
                        h.d((AppCompatImageView) b14.f597i);
                    }
                } else {
                    n0.g().l("registration_result_page_element_show");
                    B b15 = this.f26049e;
                    if (b15 != null) {
                        h.C((AppCompatImageView) b15.f597i);
                    }
                    B b16 = this.f26049e;
                    if (b16 != null) {
                        h.c(b16.f598j);
                    }
                    B b17 = this.f26049e;
                    if (b17 != null) {
                        h.C((LinearLayout) b17.f592c);
                    }
                    B b18 = this.f26049e;
                    if (b18 != null) {
                        ((LinearLayout) b18.f592c).removeAllViews();
                    }
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        RegisterCouponBean registerCouponBean2 = (RegisterCouponBean) arrayList.get(i7);
                        View view = LayoutInflater.from(this).inflate(arrayList.size() == 1 ? e.ac_register_coupon_item_layout : e.ac_register_coupon_item_small_layout, (ViewGroup) null);
                        Intrinsics.e(view);
                        Intrinsics.checkNotNullParameter(view, "view");
                        TextView textView = (TextView) view.findViewById(d.text1);
                        TextView textView2 = (TextView) view.findViewById(d.text2);
                        TextView textView3 = (TextView) view.findViewById(d.tvExpireTime);
                        Intrinsics.checkNotNullParameter(registerCouponBean2, "registerCouponBean");
                        textView.setText(registerCouponBean2.couponName);
                        r0.R1(textView2, "fonts/PalmPayNum-Bold.ttf");
                        textView2.setText(r0.F(registerCouponBean2.nominaValue));
                        textView3.setText(registerCouponBean2.desc);
                        view.setOnClickListener(new T(24, registerCouponBean2, this));
                        if (arrayList.size() > 1) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                            layoutParams.weight = 1.0f;
                            int dimensionPixelOffset = getResources().getDimensionPixelOffset(q.dp6);
                            layoutParams.leftMargin = dimensionPixelOffset;
                            layoutParams.rightMargin = dimensionPixelOffset;
                            B b19 = this.f26049e;
                            if (b19 != null) {
                                ((LinearLayout) b19.f592c).addView(view, layoutParams);
                            }
                        } else {
                            B b20 = this.f26049e;
                            if (b20 != null) {
                                ((LinearLayout) b20.f592c).addView(view);
                            }
                        }
                    }
                }
                List<RegisterCouponBean> list4 = registerCouponResp.couponDtoList;
                if (list4 == null || !(!list4.isEmpty())) {
                    B b21 = this.f26049e;
                    if (b21 != null) {
                        h.s((AppCompatImageView) b21.f599o, true);
                    }
                } else {
                    String str = registerCouponResp.titleImage;
                    B b22 = this.f26049e;
                    if (b22 != null) {
                        h.s((AppCompatImageView) b22.f599o, true);
                    }
                    if (str != null && str.length() != 0) {
                        B b23 = this.f26049e;
                        r0.l1(str, b23 != null ? (AppCompatImageView) b23.f599o : null);
                    }
                }
                String str2 = registerCouponResp.actionImage;
                CharSequence title = getTitle();
                if (title != null && title.length() != 0) {
                    B b24 = this.f26049e;
                    if (b24 != null) {
                        ((AppCompatImageView) b24.t).setVisibility(0);
                    }
                    B b25 = this.f26049e;
                    r0.l1(str2, b25 != null ? (AppCompatImageView) b25.t : null);
                }
                String str3 = registerCouponResp.bottomPicLinkUrl;
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                B b26 = this.f26049e;
                r0.l1(str3, b26 != null ? (AppCompatImageView) b26.f600p : null);
                B b27 = this.f26049e;
                if (b27 != null) {
                    ((AppCompatImageView) b27.f600p).setOnClickListener(new f0(this, 3));
                }
                if (TextUtils.isEmpty(registerCouponResp.fatherMemberName) || TextUtils.isEmpty(registerCouponResp.memberName) || TextUtils.isEmpty(registerCouponResp.content) || (list2 = registerCouponResp.couponDtoList) == null || !(!list2.isEmpty())) {
                    signUpSuccessActivity = this;
                } else {
                    String str4 = registerCouponResp.memberName;
                    String str5 = registerCouponResp.fatherMemberName;
                    String str6 = registerCouponResp.content;
                    List<RegisterCouponBean> list5 = registerCouponResp.couponDtoList;
                    signUpSuccessActivity = this;
                    new SignUpInviteSuccDialog(signUpSuccessActivity, str4, str5, str6, (list5 == null || (registerCouponBean = list5.get(0)) == null) ? null : registerCouponBean.androidLinkUrl, new h0(this)).show();
                }
                B b28 = signUpSuccessActivity.f26049e;
                r0.h1(b28 != null ? (AppCompatImageView) b28.f601v : null, registerCouponResp.bounsOuterFrame, c.ac_sign_up_rewards_title);
                B b29 = signUpSuccessActivity.f26049e;
                if (b29 != null) {
                    b29.f594e.setText(registerCouponResp.bounsSubtitle);
                }
                if (!TextUtils.isEmpty(registerCouponResp.button) && (b10 = signUpSuccessActivity.f26049e) != null) {
                    ((PpButton) b10.f589B).setText(registerCouponResp.button);
                }
                if (!TextUtils.isEmpty(registerCouponResp.androidLinkUrl) && (b7 = signUpSuccessActivity.f26049e) != null) {
                    ((PpButton) b7.f589B).setOnClickListener(new T(23, this, registerCouponResp));
                }
                if (TextUtils.isEmpty(registerCouponResp.bounsDetails)) {
                    return;
                }
                C0525w c0525wF = C0525w.f();
                String str7 = registerCouponResp.bounsDetails;
                c0525wF.getClass();
                SignUpCouponItem signUpCouponItem = (SignUpCouponItem) C0525w.d(str7, SignUpCouponItem.class);
                if (signUpCouponItem == null || (list = signUpCouponItem.data) == null || !(!list.isEmpty())) {
                    B b30 = signUpSuccessActivity.f26049e;
                    if (b30 != null) {
                        ((RecyclerView) b30.f588A).removeCallbacks(null);
                    }
                    B b31 = signUpSuccessActivity.f26049e;
                    if (b31 != null) {
                        h.c((ConstraintLayout) b31.f602w);
                        return;
                    }
                    return;
                }
                B b32 = signUpSuccessActivity.f26049e;
                if (b32 != null) {
                    h.C((ConstraintLayout) b32.f602w);
                }
                B b33 = signUpSuccessActivity.f26049e;
                if (b33 != null) {
                    ((RecyclerView) b33.f588A).setNestedScrollingEnabled(false);
                }
                B b34 = signUpSuccessActivity.f26049e;
                if (b34 != null) {
                    ((RecyclerView) b34.f588A).setLayoutManager(new LinearLayoutManager(this, 0, false));
                }
                b bVar = new b(e.ac_rewards_item_layout, null);
                bVar.setNewInstance(signUpCouponItem.data);
                B b35 = signUpSuccessActivity.f26049e;
                if (b35 != null) {
                    ((RecyclerView) b35.f588A).setAdapter(bVar);
                }
                bVar.setOnItemClickListener(new C0457a(this, 6));
                C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(p.transparent, this), CommonViewExtKt.getDp(12.0f), CommonViewExtKt.getDp(4.0f), CommonViewExtKt.getDp(4.0f));
                c1548f.f31336e = false;
                B b36 = signUpSuccessActivity.f26049e;
                if (b36 != null) {
                    ((RecyclerView) b36.f588A).addItemDecoration(c1548f);
                }
                B b37 = signUpSuccessActivity.f26049e;
                if (b37 != null) {
                    ((RecyclerView) b37.f588A).removeCallbacks(null);
                }
                signUpSuccessActivity.f26047c = 0;
                B b38 = signUpSuccessActivity.f26049e;
                if (b38 != null) {
                    ((RecyclerView) b38.f588A).postDelayed(new g0(this), 2000L);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        u.a(getOnBackPressedDispatcher(), this, new C0139f(this, 16));
        B b7 = this.f26049e;
        r0.d1(b7 != null ? (AppCompatImageView) b7.f596g : null, c.ac_sign_success_coupon);
        B b10 = this.f26049e;
        if (b10 != null) {
            ((PpButton) b10.f589B).setOnClickListener(new f0(this, 2));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
        BarUtils.setStatusBarLightMode((Activity) this, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_sign_up_success, (ViewGroup) null, false);
        int i7 = d.couponView;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = d.ivBack;
            IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
            if (iconicsTextView != null) {
                i7 = d.ivBg;
                AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                if (appCompatImageView != null) {
                    i7 = d.ivCouponBg1;
                    if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = d.ivCouponBg2;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                        if (appCompatImageView2 != null) {
                            i7 = d.ivCouponBg3;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                            if (appCompatImageView3 != null) {
                                i7 = d.ivHeaderTitle;
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                                if (appCompatImageView4 != null) {
                                    i7 = d.ivHowTo;
                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                                    if (appCompatImageView5 != null) {
                                        i7 = d.ivMiddle;
                                        AppCompatImageView appCompatImageView6 = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                                        if (appCompatImageView6 != null) {
                                            i7 = d.ivTitle;
                                            AppCompatImageView appCompatImageView7 = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                                            if (appCompatImageView7 != null) {
                                                i7 = d.layoutCoupon;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                                if (constraintLayout != null) {
                                                    i7 = d.layoutRewards;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                                    if (constraintLayout2 != null) {
                                                        i7 = d.offeringRv;
                                                        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                                        if (recyclerView != null) {
                                                            i7 = d.statusBarView;
                                                            if (((StatusBarView) p059e1.a.m(i7, viewInflate)) != null) {
                                                                i7 = d.tvRewardTitle;
                                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                if (textView != null) {
                                                                    i7 = d.tvUseNow;
                                                                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                                                                    if (ppButton != null) {
                                                                        B b7 = new B((LinearLayout) viewInflate, linearLayout, iconicsTextView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, constraintLayout, constraintLayout2, recyclerView, textView, ppButton);
                                                                        this.f26049e = b7;
                                                                        return b7;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new d0();
    }

    public final void m() {
        RegisterCouponResp registerCouponResp = this.f26052i;
        if (TextUtils.isEmpty(registerCouponResp != null ? registerCouponResp.androidLinkUrl : null)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/airtime/top_up_airtime");
        } else {
            RegisterCouponResp registerCouponResp2 = this.f26052i;
            ActivityUtils.startActivity(F.a(this, registerCouponResp2 != null ? registerCouponResp2.androidLinkUrl : null));
        }
        this.f26053j = true;
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        L l5 = this.f26050f;
        if (l5 != null) {
            l5.cancel();
        }
        this.f26050f = null;
        B b7 = this.f26049e;
        if (b7 != null) {
            ((RecyclerView) b7.f588A).removeCallbacks(null);
        }
        B b10 = this.f26049e;
        if (b10 != null) {
            ((PpButton) b10.f589B).clearAnimation();
        }
        super.onDestroy();
    }

    @Override // com.alibaba.android.arouter.facade.callback.NavigationCallback
    public final void onFound(Postcard postcard) {
    }

    @Override // com.alibaba.android.arouter.facade.callback.NavigationCallback
    public final void onInterrupt(Postcard postcard) {
    }

    @Override // com.alibaba.android.arouter.facade.callback.NavigationCallback
    public final void onLost(Postcard postcard) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f26053j) {
            i0.H(null);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        if (this.f26048d) {
            L l5 = new L(this);
            this.f26050f = l5;
            l5.start();
        } else {
            d0 d0Var = (d0) this.f27350a;
            if (d0Var != null) {
                d0Var.queryRegisterCoupon(new SignUpSuccessCouponReq());
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        requestLayoutFullScreen();
        B b7 = this.f26049e;
        if (b7 != null) {
            ((IconicsTextView) b7.f595f).setOnClickListener(new f0(this, 0));
        }
        B b10 = this.f26049e;
        if (b10 != null) {
            ((ConstraintLayout) b10.f593d).setOnClickListener(new f0(this, 1));
        }
    }
}
