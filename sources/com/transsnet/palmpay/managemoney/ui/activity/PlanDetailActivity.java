package com.transsnet.palmpay.managemoney.ui.activity;

import Pa.n0;
import Pa.r0;
import Qc.i0;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.ui.view.PlanInfoItem;
import com.transsnet.palmpay.managemoney.ui.viewmodel.PlanDetailViewModel;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/plan_detail_activity")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/PlanDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/PlanDetailViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlanDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanDetailActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/PlanDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1144:1\n171#2,12:1145\n215#2:1157\n171#2,12:1158\n215#2:1170\n171#2,12:1171\n215#2:1183\n257#3,2:1184\n257#3,2:1186\n1#4:1188\n*S KotlinDebug\n*F\n+ 1 PlanDetailActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/PlanDetailActivity\n*L\n139#1:1145,12\n139#1:1157\n157#1:1158,12\n157#1:1170\n188#1:1171,12\n188#1:1183\n268#1:1184,2\n284#1:1186,2\n*E\n"})
public final class PlanDetailActivity extends BaseMvvmActivity<PlanDetailViewModel> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f32158s0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public AppCompatImageView f32167Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ProductBean f32168Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f32176k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f32179p0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f32181r0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32169c = C2131j.b(new G(this, 0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32170d = C2131j.b(new G(this, 2));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32171e = C2131j.b(new G(this, 3));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f32172f = C2131j.b(new G(this, 4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f32173g = C2131j.b(new G(this, 5));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f32174i = C2131j.b(new G(this, 6));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32175j = C2131j.b(new G(this, 7));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32177o = C2131j.b(new G(this, 8));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32178p = C2131j.b(new G(this, 9));
    public final p355xf.t t = C2131j.b(new G(this, 10));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32182v = C2131j.b(new G(this, 11));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32183w = C2131j.b(new G(this, 15));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32159A = C2131j.b(new G(this, 17));

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32160B = C2131j.b(new G(this, 18));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32161C = C2131j.b(new G(this, 19));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f32162H = C2131j.b(new G(this, 20));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f32163L = C2131j.b(new G(this, 21));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p355xf.t f32164M = C2131j.b(new G(this, 22));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final p355xf.t f32165Q = C2131j.b(new G(this, 23));

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final p355xf.t f32166X = C2131j.b(new G(this, 1));

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f32180q0 = "";

    public static String m(Float f10) {
        Object obj = f10;
        if (f10 == null) {
            obj = 0;
        }
        String strZ0 = r0.z0(r0.w1(String.valueOf(obj), "100").toString());
        Intrinsics.checkNotNullExpressionValue(strZ0, "getPrettyNumber(...)");
        return strZ0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_plan_detail_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f32179p0 = getIntent().getBooleanExtra("source", false);
        com.transsnet.palmpay.core.base.l lVar = ((PlanDetailViewModel) l()).f32781e;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new L(this, this, 0), 13));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((PlanDetailViewModel) l()).f32786o;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new L(this, this, 1), 13));
        }
        com.transsnet.palmpay.core.base.l lVar3 = ((PlanDetailViewModel) l()).f32787p;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new L(this, this, 2), 13));
        }
        p355xf.t tVar = this.f32182v;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PpTitleBar ppTitleBar = (PpTitleBar) value;
        if (ppTitleBar != null) {
            ppTitleBar.setRightImageView2Icon(S6.a.pay_Question);
        }
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        PpTitleBar ppTitleBar2 = (PpTitleBar) value2;
        if (ppTitleBar2 != null) {
            ppTitleBar2.setRightImageView2ClickListener(new ViewOnClickListenerC1478l(15));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(Jc.a.mm_color_f6f6fa), true);
    }

    public final LinearLayout n() {
        Object value = this.f32175j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final LinearLayout o() {
        Object value = this.f32174i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        org.greenrobot.eventbus.c.b().l(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        PlanDetailViewModel planDetailViewModel;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() != 548 || (planDetailViewModel = (PlanDetailViewModel) l()) == null) {
            return;
        }
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("orderNo") : null;
        Intent intent2 = getIntent();
        p140j8.f.s(planDetailViewModel, new i0(stringExtra, intent2 != null ? intent2.getStringExtra("transType") : null, null), planDetailViewModel.f32781e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0 ? true : true, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f32181r0) {
            this.f32181r0 = false;
            PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) l();
            String stringExtra = getIntent().getStringExtra("orderNo");
            String stringExtra2 = getIntent().getStringExtra("transType");
            planDetailViewModel.getClass();
            p140j8.f.s(planDetailViewModel, new i0(stringExtra, stringExtra2, null), planDetailViewModel.f32781e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            C0.G.u(MessageEvent.EVENT_CREATE_SAVINGS_BREAK, org.greenrobot.eventbus.c.b());
        }
    }

    public final TextView p() {
        Object value = this.f32170d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) l();
        String stringExtra = getIntent().getStringExtra("orderNo");
        String stringExtra2 = getIntent().getStringExtra("transType");
        planDetailViewModel.getClass();
        p140j8.f.s(planDetailViewModel, new i0(stringExtra, stringExtra2, null), planDetailViewModel.f32781e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0 ? true : true, (28 & 16) == 0);
    }

    public final void q(ProductBean productBean) {
        AppCompatImageView appCompatImageView;
        Object value = this.f32173g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        View view = (View) value;
        if (view != null) {
            view.setVisibility(0);
        }
        Object value2 = this.f32172f.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final LinearLayout linearLayout = (LinearLayout) value2;
        if (linearLayout != null) {
            View viewInflate = View.inflate(linearLayout.getContext(), Jc.d.mm_auto_renewal_item, null);
            this.f32167Y = (AppCompatImageView) viewInflate.findViewById(Jc.c.switchWidget);
            IconicsTextView iconicsTextView = (IconicsTextView) viewInflate.findViewById(Jc.c.tvBalanceAmount);
            IconicsImageView iconicsImageView = (IconicsImageView) viewInflate.findViewById(Jc.c.iconImageInfo);
            iconicsTextView.setTextColor(linearLayout.getResources().getColor(L6.b.ppColorTextPrimary));
            int i7 = this.f32176k0 ? com.transsnet.palmpay.custom_view.r.cv_switch_open_green : com.transsnet.palmpay.custom_view.r.cv_switch_close_gray;
            AppCompatImageView appCompatImageView2 = this.f32167Y;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setImageResource(i7);
            }
            AppCompatImageView appCompatImageView3 = this.f32167Y;
            if (appCompatImageView3 != null) {
                appCompatImageView3.setVisibility(productBean.getPlanStatus() != 2 ? 8 : 0);
            }
            if (productBean.getPlanStatus() == 2 && (appCompatImageView = this.f32167Y) != null) {
                appCompatImageView.setOnClickListener(new J(productBean, 0, this, linearLayout));
            }
            if (iconicsImageView != null) {
                final int i10 = 0;
                iconicsImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.managemoney.ui.activity.K
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PlanDetailActivity planDetailActivity = this;
                        LinearLayout linearLayout2 = linearLayout;
                        switch (i10) {
                            case 0:
                                int i11 = PlanDetailActivity.f32158s0;
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, linearLayout2.getResources().getString(Jc.f.mm_auto_renewal), linearLayout2.getResources().getString(Jc.f.mm_auto_renewal_dialog_text), linearLayout2.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                                Z supportFragmentManager = planDetailActivity.getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showUpgradeLevelDialog");
                                break;
                            default:
                                int i12 = PlanDetailActivity.f32158s0;
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, linearLayout2.getResources().getString(Jc.f.mm_auto_renewal), linearLayout2.getResources().getString(Jc.f.mm_auto_renewal_dialog_text), linearLayout2.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                                Z supportFragmentManager2 = planDetailActivity.getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(supportFragmentManager2, "showUpgradeLevelDialog");
                                break;
                        }
                    }
                });
            }
            final int i11 = 1;
            iconicsTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.managemoney.ui.activity.K
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PlanDetailActivity planDetailActivity = this;
                    LinearLayout linearLayout2 = linearLayout;
                    switch (i11) {
                        case 0:
                            int i12 = PlanDetailActivity.f32158s0;
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, linearLayout2.getResources().getString(Jc.f.mm_auto_renewal), linearLayout2.getResources().getString(Jc.f.mm_auto_renewal_dialog_text), linearLayout2.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                            Z supportFragmentManager = planDetailActivity.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showUpgradeLevelDialog");
                            break;
                        default:
                            int i13 = PlanDetailActivity.f32158s0;
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, linearLayout2.getResources().getString(Jc.f.mm_auto_renewal), linearLayout2.getResources().getString(Jc.f.mm_auto_renewal_dialog_text), linearLayout2.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                            Z supportFragmentManager2 = planDetailActivity.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default2.show(supportFragmentManager2, "showUpgradeLevelDialog");
                            break;
                    }
                }
            });
            linearLayout.addView(viewInflate);
            if (productBean.getPlanStatus() == 2) {
                TextView textView = new TextView(this);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                String strMillis2String = TimeUtils.millis2String(productBean.getMaturityDate(), new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH));
                textView.setText(this.f32176k0 ? C0.G.o("Your plan will automatically renew for a new cycle on ", strMillis2String) : androidx.camera.video.u.n(r0.B(productBean.getTotalPayback(), true), " will be paid to your ", this.f32180q0, " by around 6:00 AM on ", strMillis2String));
                textView.setTextSize(12.0f);
                textView.setTextColor(textView.getResources().getColor(L6.b.ppColorTextAssist));
                linearLayout.addView(textView);
            }
            if (productBean.getRenewDepositNum() == 0) {
                com.transsnet.palmpay.managemoney.ui.view.d dVar = new com.transsnet.palmpay.managemoney.ui.view.d(linearLayout.getResources().getString(Jc.f.mm_auto_times_renewad), 12.0f, L6.b.ppColorTextAssist, null, null, false, null, 504);
                com.transsnet.palmpay.managemoney.ui.view.d dVar2 = new com.transsnet.palmpay.managemoney.ui.view.d(String.valueOf(productBean.getRenewDepositNum()), 12.0f, 0, null, null, false, null, 508);
                DensityUtil.dp2px(36.0f);
                linearLayout.addView(new PlanInfoItem(this, dVar, dVar2));
                return;
            }
            View viewInflate2 = View.inflate(this, Jc.d.mm_plan_info_click_payment_item, null);
            viewInflate2.setLayoutParams(new LinearLayout.LayoutParams(-1, DensityUtil.dp2px(36.0f)));
            IconicsTextView iconicsTextView2 = (IconicsTextView) viewInflate2.findViewById(Jc.c.tvName);
            if (iconicsTextView2 != null) {
                iconicsTextView2.setText(linearLayout.getResources().getString(Jc.f.mm_auto_times_renewad));
            }
            IconicsImageView iconicsImageView2 = (IconicsImageView) viewInflate2.findViewById(Jc.c.iconImageInfo);
            if (iconicsImageView2 != null) {
                iconicsImageView2.setVisibility(8);
            }
            IconicsTextView iconicsTextView3 = (IconicsTextView) viewInflate2.findViewById(Jc.c.tvPayment);
            if (iconicsTextView3 != null) {
                iconicsTextView3.setText(String.valueOf(productBean.getRenewDepositNum()));
            }
            if (iconicsTextView3 != null) {
                iconicsTextView3.setTextColor(linearLayout.getResources().getColor(L6.b.ppColorTextPrimary));
            }
            IconicsImageView iconicsImageView3 = (IconicsImageView) viewInflate2.findViewById(Jc.c.ivArrowRight);
            if (iconicsImageView3 != null) {
                iconicsImageView3.setColorFilter(linearLayout.getResources().getColor(L6.b.ppColorTextAssist));
            }
            if (iconicsTextView3 != null) {
                iconicsTextView3.setOnClickListener(new I(this, 1));
            }
            if (iconicsImageView3 != null) {
                iconicsImageView3.setOnClickListener(new I(this, 2));
            }
            linearLayout.addView(viewInflate2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        org.greenrobot.eventbus.c.b().j(this);
        n0.g().v("DetailsPage_View");
        super.setupView();
    }
}
