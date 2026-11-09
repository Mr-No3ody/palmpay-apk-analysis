package com.transsnet.palmpay.managemoney.ui.activity;

import android.os.Bundle;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/fixed_saving_order_for_break_result_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/FixedSavingOrderForBreakResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "Ce/G", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFixedSavingOrderForBreakResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixedSavingOrderForBreakResultActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/FixedSavingOrderForBreakResultActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,326:1\n171#2,12:327\n215#2:339\n*S KotlinDebug\n*F\n+ 1 FixedSavingOrderForBreakResultActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/FixedSavingOrderForBreakResultActivity\n*L\n105#1:327,12\n105#1:339\n*E\n"})
public final class FixedSavingOrderForBreakResultActivity extends BaseMvvmActivity<CashBoxViewModel> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f32094o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f32098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f32099g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f32100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32101j;

    public FixedSavingOrderForBreakResultActivity() {
        final int i7 = 0;
        this.f32095c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FixedSavingOrderForBreakResultActivity f32268b;

            {
                this.f32268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity = this.f32268b;
                switch (i7) {
                    case 0:
                        int i10 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (RoundedTextView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.rtvComplete);
                    case 1:
                        int i11 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView2);
                    case 2:
                        int i12 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView1);
                    case 3:
                        int i13 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (LinearLayout) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i14 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (TransactionResultHeaderModel) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.progressView);
                    case 5:
                        int i15 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (PpTitleBar) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.ctb);
                    case 6:
                        int i16 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return fixedSavingOrderForBreakResultActivity.getIntent().getStringExtra("orderNo");
                    default:
                        int i17 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return Integer.valueOf(fixedSavingOrderForBreakResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                }
            }
        });
        final int i10 = 1;
        this.f32096d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FixedSavingOrderForBreakResultActivity f32268b;

            {
                this.f32268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity = this.f32268b;
                switch (i10) {
                    case 0:
                        int i11 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (RoundedTextView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.rtvComplete);
                    case 1:
                        int i12 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView2);
                    case 2:
                        int i13 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView1);
                    case 3:
                        int i14 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (LinearLayout) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i15 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (TransactionResultHeaderModel) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.progressView);
                    case 5:
                        int i16 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (PpTitleBar) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.ctb);
                    case 6:
                        int i17 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return fixedSavingOrderForBreakResultActivity.getIntent().getStringExtra("orderNo");
                    default:
                        int i18 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return Integer.valueOf(fixedSavingOrderForBreakResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                }
            }
        });
        final int i11 = 2;
        this.f32097e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FixedSavingOrderForBreakResultActivity f32268b;

            {
                this.f32268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity = this.f32268b;
                switch (i11) {
                    case 0:
                        int i12 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (RoundedTextView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.rtvComplete);
                    case 1:
                        int i13 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView2);
                    case 2:
                        int i14 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView1);
                    case 3:
                        int i15 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (LinearLayout) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i16 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (TransactionResultHeaderModel) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.progressView);
                    case 5:
                        int i17 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (PpTitleBar) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.ctb);
                    case 6:
                        int i18 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return fixedSavingOrderForBreakResultActivity.getIntent().getStringExtra("orderNo");
                    default:
                        int i19 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return Integer.valueOf(fixedSavingOrderForBreakResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                }
            }
        });
        final int i12 = 3;
        this.f32098f = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FixedSavingOrderForBreakResultActivity f32268b;

            {
                this.f32268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity = this.f32268b;
                switch (i12) {
                    case 0:
                        int i13 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (RoundedTextView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.rtvComplete);
                    case 1:
                        int i14 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView2);
                    case 2:
                        int i15 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView1);
                    case 3:
                        int i16 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (LinearLayout) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i17 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (TransactionResultHeaderModel) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.progressView);
                    case 5:
                        int i18 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (PpTitleBar) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.ctb);
                    case 6:
                        int i19 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return fixedSavingOrderForBreakResultActivity.getIntent().getStringExtra("orderNo");
                    default:
                        int i110 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return Integer.valueOf(fixedSavingOrderForBreakResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                }
            }
        });
        final int i13 = 4;
        this.f32099g = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FixedSavingOrderForBreakResultActivity f32268b;

            {
                this.f32268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity = this.f32268b;
                switch (i13) {
                    case 0:
                        int i14 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (RoundedTextView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.rtvComplete);
                    case 1:
                        int i15 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView2);
                    case 2:
                        int i16 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView1);
                    case 3:
                        int i17 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (LinearLayout) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i18 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (TransactionResultHeaderModel) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.progressView);
                    case 5:
                        int i19 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (PpTitleBar) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.ctb);
                    case 6:
                        int i110 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return fixedSavingOrderForBreakResultActivity.getIntent().getStringExtra("orderNo");
                    default:
                        int i111 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return Integer.valueOf(fixedSavingOrderForBreakResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                }
            }
        });
        final int i14 = 5;
        this.f32100i = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FixedSavingOrderForBreakResultActivity f32268b;

            {
                this.f32268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity = this.f32268b;
                switch (i14) {
                    case 0:
                        int i15 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (RoundedTextView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.rtvComplete);
                    case 1:
                        int i16 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView2);
                    case 2:
                        int i17 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView1);
                    case 3:
                        int i18 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (LinearLayout) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i19 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (TransactionResultHeaderModel) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.progressView);
                    case 5:
                        int i110 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (PpTitleBar) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.ctb);
                    case 6:
                        int i111 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return fixedSavingOrderForBreakResultActivity.getIntent().getStringExtra("orderNo");
                    default:
                        int i112 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return Integer.valueOf(fixedSavingOrderForBreakResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                }
            }
        });
        final int i15 = 6;
        this.f32101j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FixedSavingOrderForBreakResultActivity f32268b;

            {
                this.f32268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity = this.f32268b;
                switch (i15) {
                    case 0:
                        int i16 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (RoundedTextView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.rtvComplete);
                    case 1:
                        int i17 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView2);
                    case 2:
                        int i18 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView1);
                    case 3:
                        int i19 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (LinearLayout) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i110 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (TransactionResultHeaderModel) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.progressView);
                    case 5:
                        int i111 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (PpTitleBar) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.ctb);
                    case 6:
                        int i112 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return fixedSavingOrderForBreakResultActivity.getIntent().getStringExtra("orderNo");
                    default:
                        int i113 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return Integer.valueOf(fixedSavingOrderForBreakResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                }
            }
        });
        final int i16 = 7;
        C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FixedSavingOrderForBreakResultActivity f32268b;

            {
                this.f32268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity = this.f32268b;
                switch (i16) {
                    case 0:
                        int i17 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (RoundedTextView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.rtvComplete);
                    case 1:
                        int i18 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView2);
                    case 2:
                        int i19 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (SingleAdView) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.sadView1);
                    case 3:
                        int i110 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (LinearLayout) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i111 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (TransactionResultHeaderModel) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.progressView);
                    case 5:
                        int i112 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return (PpTitleBar) fixedSavingOrderForBreakResultActivity.findViewById(Jc.c.ctb);
                    case 6:
                        int i113 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return fixedSavingOrderForBreakResultActivity.getIntent().getStringExtra("orderNo");
                    default:
                        int i114 = FixedSavingOrderForBreakResultActivity.f32094o;
                        return Integer.valueOf(fixedSavingOrderForBreakResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                }
            }
        });
    }

    public static final LinearLayout m(FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity) {
        Object value = fixedSavingOrderForBreakResultActivity.f32098f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public static final TransactionResultHeaderModel n(FixedSavingOrderForBreakResultActivity fixedSavingOrderForBreakResultActivity) {
        Object value = fixedSavingOrderForBreakResultActivity.f32099g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TransactionResultHeaderModel) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_fixed_saving_order_for_break_result_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) l()).f32756u0;
        if (lVar != null) {
            lVar.e(this, new T8.f(new T8.o(13, this, this), (byte) 0, (byte) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(com.transsnet.palmpay.custom_view.p.cv_color_ffffff), true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String cashOrderId = (String) this.f32101j.getValue();
        if (cashOrderId != null) {
            CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) l();
            cashBoxViewModel.getClass();
            Intrinsics.checkNotNullParameter(cashOrderId, "cashOrderId");
            p140j8.f.s(cashBoxViewModel, new Qc.E(cashOrderId, null), cashBoxViewModel.f32756u0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        p355xf.t tVar = this.f32100i;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setRightImageView1ClickListener(new ViewOnClickListenerC1478l(12));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PpTitleBar) value2).setRightImageView1Icon(S6.a.pay_CustomerService);
        Object value3 = this.f32095c.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RoundedTextView) value3).setOnClickListener(new ViewOnClickListenerC1478l(13));
        p355xf.t tVar2 = this.f32097e;
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        Object value5 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((SingleAdView) value4).setAdListener(new Ce.G((SingleAdView) value5, 2));
        p355xf.t tVar3 = this.f32096d;
        Object value6 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        Object value7 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((SingleAdView) value6).setAdListener(new Ce.G((SingleAdView) value7, 2));
    }
}
