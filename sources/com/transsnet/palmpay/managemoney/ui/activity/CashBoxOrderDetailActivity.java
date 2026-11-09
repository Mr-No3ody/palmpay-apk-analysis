package com.transsnet.palmpay.managemoney.ui.activity;

import Qc.C0579u;
import Qc.C0581w;
import Qc.C0583y;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_order_detail_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/CashBoxOrderDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxOrderDetailActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CashBoxOrderDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,673:1\n171#2,12:674\n215#2:686\n171#2,12:687\n215#2:699\n*S KotlinDebug\n*F\n+ 1 CashBoxOrderDetailActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CashBoxOrderDetailActivity\n*L\n85#1:674,12\n85#1:686\n89#1:687,12\n89#1:699\n*E\n"})
public final class CashBoxOrderDetailActivity extends BaseMvvmActivity<CashBoxViewModel> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f32043w = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f32047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f32048g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f32049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32050j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32052p;
    public final p355xf.t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32053v;

    public CashBoxOrderDetailActivity() {
        final int i7 = 6;
        this.f32044c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i7) {
                    case 0:
                        int i10 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i11 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i12 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i13 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i14 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i15 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i16 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i17 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i18 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i19 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
        final int i10 = 8;
        this.f32045d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i10) {
                    case 0:
                        int i11 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i12 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i13 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i14 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i15 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i16 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i17 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i18 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i19 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i110 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
        final int i11 = 9;
        this.f32046e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i11) {
                    case 0:
                        int i12 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i13 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i14 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i15 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i16 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i17 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i18 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i19 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i110 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i111 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
        final int i12 = 10;
        this.f32047f = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i12) {
                    case 0:
                        int i13 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i14 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i15 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i16 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i17 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i18 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i19 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i110 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i111 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i112 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
        final int i13 = 0;
        this.f32048g = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i13) {
                    case 0:
                        int i14 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i15 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i16 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i17 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i18 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i19 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i110 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i111 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i112 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i113 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
        final int i14 = 1;
        this.f32049i = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i14) {
                    case 0:
                        int i15 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i16 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i17 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i18 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i19 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i110 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i111 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i112 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i113 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i114 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
        final int i15 = 2;
        this.f32050j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i15) {
                    case 0:
                        int i16 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i17 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i18 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i19 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i110 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i111 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i112 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i113 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i114 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i115 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
        final int i16 = 3;
        this.f32051o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i16) {
                    case 0:
                        int i17 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i18 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i19 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i110 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i111 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i112 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i113 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i114 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i115 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i116 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
        final int i17 = 4;
        this.f32052p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i17) {
                    case 0:
                        int i18 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i19 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i110 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i111 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i112 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i113 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i114 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i115 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i116 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i117 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
        final int i18 = 5;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i18) {
                    case 0:
                        int i19 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i110 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i111 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i112 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i113 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i114 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i115 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i116 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i117 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i118 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
        final int i19 = 7;
        this.f32053v = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxOrderDetailActivity f32235b;

            {
                this.f32235b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxOrderDetailActivity cashBoxOrderDetailActivity = this.f32235b;
                switch (i19) {
                    case 0:
                        int i110 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 1:
                        int i111 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 2:
                        int i112 = CashBoxOrderDetailActivity.f32043w;
                        return (TextView) cashBoxOrderDetailActivity.findViewById(Jc.c.tvOrderDesc);
                    case 3:
                        int i113 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutOrderInfo);
                    case 4:
                        int i114 = CashBoxOrderDetailActivity.f32043w;
                        return (NestedScrollView) cashBoxOrderDetailActivity.findViewById(Jc.c.nsv);
                    case 5:
                        int i115 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("orderNo");
                    case 6:
                        int i116 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultViewReceiptModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewReceipt);
                    case 7:
                        int i117 = CashBoxOrderDetailActivity.f32043w;
                        return cashBoxOrderDetailActivity.getIntent().getStringExtra("transType");
                    case 8:
                        int i118 = CashBoxOrderDetailActivity.f32043w;
                        return (ImageView) cashBoxOrderDetailActivity.findViewById(Jc.c.ivIcon);
                    case 9:
                        int i119 = CashBoxOrderDetailActivity.f32043w;
                        return (OrderResultCustomerServiceModel) cashBoxOrderDetailActivity.findViewById(Jc.c.viewCustomerService);
                    default:
                        int i20 = CashBoxOrderDetailActivity.f32043w;
                        return (LinearLayout) cashBoxOrderDetailActivity.findViewById(Jc.c.layoutTransactionInfo);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_cash_box_transaction_detail_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) l()).f32739Q;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new C1561g(this, this, 0), 9));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((CashBoxViewModel) l()).f32754s0;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new C1561g(this, this, 1), 9));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final View m() {
        View view = new View(this);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, DensityUtil.dp2px(8.0f)));
        return view;
    }

    public final LinearLayout n() {
        Object value = this.f32047f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final String o() {
        return (String) this.f32053v.getValue();
    }

    public final TextView p() {
        Object value = this.f32048g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        boolean zEquals = TextUtils.equals(o(), TransType.TRANS_TYPE_CASH_BOX_DEPOSIT);
        p355xf.t tVar = this.t;
        if (zEquals) {
            CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) l();
            String str = (String) tVar.getValue();
            cashBoxViewModel.getClass();
            p140j8.f.s(cashBoxViewModel, new C0579u(1, str, null), cashBoxViewModel.f32739Q, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            return;
        }
        if (TextUtils.equals(o(), TransType.TRANS_TYPE_CASH_BOX_WITHDRAW)) {
            CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) l();
            String str2 = (String) tVar.getValue();
            cashBoxViewModel2.getClass();
            p140j8.f.s(cashBoxViewModel2, new C0581w(2, str2, null), cashBoxViewModel2.f32739Q, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            return;
        }
        if (TextUtils.equals(o(), TransType.TRANS_TYPE_CASH_BOX_INTEREST)) {
            CashBoxViewModel cashBoxViewModel3 = (CashBoxViewModel) l();
            String str3 = (String) tVar.getValue();
            cashBoxViewModel3.getClass();
            p140j8.f.s(cashBoxViewModel3, new C0583y(str3, null), cashBoxViewModel3.f32754s0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final OrderResultCustomerServiceModel q() {
        Object value = this.f32046e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OrderResultCustomerServiceModel) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundDark), true);
    }
}
