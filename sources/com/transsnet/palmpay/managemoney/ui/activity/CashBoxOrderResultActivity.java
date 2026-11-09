package com.transsnet.palmpay.managemoney.ui.activity;

import Qc.C0579u;
import Qc.C0581w;
import Qc.C0582x;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_order_result_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/CashBoxOrderResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "Ce/G", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxOrderResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxOrderResultActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CashBoxOrderResultActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,341:1\n171#2,12:342\n215#2:354\n115#2,8:355\n145#2:363\n115#2,8:364\n145#2:372\n*S KotlinDebug\n*F\n+ 1 CashBoxOrderResultActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CashBoxOrderResultActivity\n*L\n168#1:342,12\n168#1:354\n296#1:355,8\n296#1:363\n299#1:364,8\n299#1:372\n*E\n"})
public final class CashBoxOrderResultActivity extends BaseMvvmActivity<CashBoxViewModel> {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f32054B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32055A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f32059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f32060g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f32061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32062j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32064p;
    public final p355xf.t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Nc.c f32065v = new Nc.c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32066w;

    public CashBoxOrderResultActivity() {
        final int i7 = 5;
        this.f32056c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i7) {
                    case 0:
                        int i10 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i11 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i12 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i13 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i14 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i15 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i16 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i17 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i18 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i19 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i10 = 8;
        this.f32057d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i10) {
                    case 0:
                        int i11 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i12 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i13 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i14 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i15 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i16 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i17 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i18 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i19 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i11 = 9;
        this.f32058e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i11) {
                    case 0:
                        int i12 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i13 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i14 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i15 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i16 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i17 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i18 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i19 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i111 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i12 = 10;
        this.f32059f = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i12) {
                    case 0:
                        int i13 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i14 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i15 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i16 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i17 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i18 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i19 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i111 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i112 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i13 = 11;
        this.f32060g = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i13) {
                    case 0:
                        int i14 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i15 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i16 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i17 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i18 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i19 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i111 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i112 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i113 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i14 = 0;
        this.f32061i = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i14) {
                    case 0:
                        int i15 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i16 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i17 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i18 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i19 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i111 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i112 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i113 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i114 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i15 = 1;
        this.f32062j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i15) {
                    case 0:
                        int i16 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i17 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i18 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i19 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i111 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i112 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i113 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i114 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i115 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i16 = 2;
        this.f32063o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i16) {
                    case 0:
                        int i17 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i18 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i19 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i111 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i112 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i113 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i114 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i115 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i116 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i17 = 3;
        this.f32064p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i17) {
                    case 0:
                        int i18 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i19 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i111 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i112 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i113 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i114 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i115 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i116 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i117 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i18 = 4;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i18) {
                    case 0:
                        int i19 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i111 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i112 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i113 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i114 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i115 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i116 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i117 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i118 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i19 = 6;
        this.f32066w = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i19) {
                    case 0:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i111 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i112 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i113 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i114 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i115 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i116 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i117 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i118 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i119 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i20 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
        final int i20 = 7;
        this.f32055A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32244b;

            {
                this.f32244b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32244b;
                switch (i20) {
                    case 0:
                        int i110 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView1);
                    case 1:
                        int i111 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutADs);
                    case 2:
                        int i112 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 3:
                        int i113 = CashBoxOrderResultActivity.f32054B;
                        return (TransactionResultHeaderModel) cashBoxOrderResultActivity.findViewById(Jc.c.progressView);
                    case 4:
                        int i114 = CashBoxOrderResultActivity.f32054B;
                        return (PpTitleBar) cashBoxOrderResultActivity.findViewById(Jc.c.ctb);
                    case 5:
                        int i115 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvSaveMore);
                    case 6:
                        int i116 = CashBoxOrderResultActivity.f32054B;
                        return cashBoxOrderResultActivity.getIntent().getStringExtra("orderNo");
                    case 7:
                        int i117 = CashBoxOrderResultActivity.f32054B;
                        return Integer.valueOf(cashBoxOrderResultActivity.getIntent().getIntExtra("key_cash_box_type", 1));
                    case 8:
                        int i118 = CashBoxOrderResultActivity.f32054B;
                        return (RoundedTextView) cashBoxOrderResultActivity.findViewById(Jc.c.rtvComplete);
                    case 9:
                        int i119 = CashBoxOrderResultActivity.f32054B;
                        return (RecyclerView) cashBoxOrderResultActivity.findViewById(Jc.c.rvProductList);
                    case 10:
                        int i21 = CashBoxOrderResultActivity.f32054B;
                        return (LinearLayout) cashBoxOrderResultActivity.findViewById(Jc.c.layoutFixedSavings);
                    default:
                        int i22 = CashBoxOrderResultActivity.f32054B;
                        return (SingleAdView) cashBoxOrderResultActivity.findViewById(Jc.c.sadView2);
                }
            }
        });
    }

    public static final TransactionResultHeaderModel m(CashBoxOrderResultActivity cashBoxOrderResultActivity) {
        Object value = cashBoxOrderResultActivity.f32064p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TransactionResultHeaderModel) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_cash_box_order_result_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) l()).f32739Q;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new T8.o(12, this, this), 10));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((CashBoxViewModel) l()).f32735C;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new C1566l(this, 0), 10));
        }
        com.transsnet.palmpay.core.base.l lVar3 = ((CashBoxViewModel) l()).f32742Z;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new C1566l(this, 1), 10));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(com.transsnet.palmpay.custom_view.p.cv_color_ffffff), true);
    }

    public final int n() {
        return ((Number) this.f32055A.getValue()).intValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        ARouter.getInstance().build("/manage_money/cash_box_main_activity").navigation();
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) l();
        cashBoxViewModel.getClass();
        p140j8.f.s(cashBoxViewModel, new C0582x(1, null), cashBoxViewModel.f32735C, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        int iN = n();
        p355xf.t tVar = this.f32066w;
        if (iN != 1) {
            CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) l();
            String str = (String) tVar.getValue();
            int iN2 = n();
            cashBoxViewModel2.getClass();
            p140j8.f.s(cashBoxViewModel2, new C0581w(iN2, str, null), cashBoxViewModel2.f32739Q, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            return;
        }
        CashBoxViewModel cashBoxViewModel3 = (CashBoxViewModel) l();
        String str2 = (String) tVar.getValue();
        int iN3 = n();
        cashBoxViewModel3.getClass();
        p140j8.f.s(cashBoxViewModel3, new C0579u(iN3, str2, null), cashBoxViewModel3.f32739Q, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        CashBoxViewModel cashBoxViewModel4 = (CashBoxViewModel) l();
        cashBoxViewModel4.getClass();
        Intrinsics.checkNotNullParameter(TransType.TRANS_TYPE_CASH_BOX_DEPOSIT, "transType");
        Intrinsics.checkNotNullParameter("", "subTransType");
        p140j8.f.s(cashBoxViewModel4, new Qc.F(1, null), cashBoxViewModel4.f32742Z, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        Object value = this.f32062j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LinearLayout) value).setVisibility(n() == 1 ? 0 : 8);
        Object value2 = this.f32059f.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((LinearLayout) value2).setVisibility(n() == 1 ? 8 : 0);
        p355xf.t tVar = this.f32056c;
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RoundedTextView) value3).setVisibility(n() == 1 ? 0 : 8);
        p355xf.t tVar2 = this.f32057d;
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((RoundedTextView) value4).setTextColor(n() == 1 ? getColor(L6.b.ppColorPrimary) : getColor(com.transsnet.palmpay.custom_view.p.cv_color_ffffff));
        Object value5 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((RoundedTextView) value5).setRoundedBackgroundColor(n() == 1 ? getColor(L6.b.ppColorSecondary) : getColor(L6.b.ppColorPrimary));
        Object value6 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        final int i7 = 0;
        ((PpTitleBar) value6).setBackButtonClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32242b;

            {
                this.f32242b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32242b;
                switch (i7) {
                    case 0:
                        int i10 = CashBoxOrderResultActivity.f32054B;
                        ARouter.getInstance().build("/manage_money/cash_box_main_activity").navigation();
                        cashBoxOrderResultActivity.finish();
                        break;
                    case 1:
                        int i11 = CashBoxOrderResultActivity.f32054B;
                        ARouter.getInstance().build("/manage_money/cash_box_main_activity").navigation();
                        cashBoxOrderResultActivity.finish();
                        break;
                    default:
                        int i12 = CashBoxOrderResultActivity.f32054B;
                        ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").navigation();
                        cashBoxOrderResultActivity.finish();
                        break;
                }
            }
        });
        Object value7 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i10 = 1;
        ((RoundedTextView) value7).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32242b;

            {
                this.f32242b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32242b;
                switch (i10) {
                    case 0:
                        int i11 = CashBoxOrderResultActivity.f32054B;
                        ARouter.getInstance().build("/manage_money/cash_box_main_activity").navigation();
                        cashBoxOrderResultActivity.finish();
                        break;
                    case 1:
                        int i12 = CashBoxOrderResultActivity.f32054B;
                        ARouter.getInstance().build("/manage_money/cash_box_main_activity").navigation();
                        cashBoxOrderResultActivity.finish();
                        break;
                    default:
                        int i13 = CashBoxOrderResultActivity.f32054B;
                        ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").navigation();
                        cashBoxOrderResultActivity.finish();
                        break;
                }
            }
        });
        Object value8 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        final int i11 = 2;
        ((RoundedTextView) value8).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderResultActivity f32242b;

            {
                this.f32242b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32242b;
                switch (i11) {
                    case 0:
                        int i12 = CashBoxOrderResultActivity.f32054B;
                        ARouter.getInstance().build("/manage_money/cash_box_main_activity").navigation();
                        cashBoxOrderResultActivity.finish();
                        break;
                    case 1:
                        int i13 = CashBoxOrderResultActivity.f32054B;
                        ARouter.getInstance().build("/manage_money/cash_box_main_activity").navigation();
                        cashBoxOrderResultActivity.finish();
                        break;
                    default:
                        int i14 = CashBoxOrderResultActivity.f32054B;
                        ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").navigation();
                        cashBoxOrderResultActivity.finish();
                        break;
                }
            }
        });
        p355xf.t tVar3 = this.f32061i;
        Object value9 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        Object value10 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        ((SingleAdView) value9).setAdListener(new Ce.G((SingleAdView) value10, 1));
        p355xf.t tVar4 = this.f32060g;
        Object value11 = tVar4.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        Object value12 = tVar4.getValue();
        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
        ((SingleAdView) value11).setAdListener(new Ce.G((SingleAdView) value12, 1));
        p355xf.t tVar5 = this.f32058e;
        Object value13 = tVar5.getValue();
        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
        ((RecyclerView) value13).setLayoutManager(new LinearLayoutManager(this, 1, false));
        Object value14 = tVar5.getValue();
        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
        C1548f c1548f = new C1548f(getColor(com.transsnet.palmpay.custom_view.p.transparent), DensityUtil.dp2px(12.0f));
        c1548f.f31336e = false;
        ((RecyclerView) value14).addItemDecoration(c1548f);
        Object value15 = tVar5.getValue();
        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
        ((RecyclerView) value15).setAdapter(this.f32065v);
    }
}
