package com.transsnet.palmpay.managemoney.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.managemoney.ui.viewmodel.PlanDetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/TransactionDetailFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/PlanDetailViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionDetailFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/TransactionDetailFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,626:1\n71#2,8:627\n112#2:635\n*S KotlinDebug\n*F\n+ 1 TransactionDetailFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/TransactionDetailFragment\n*L\n92#1:627,8\n92#1:635\n*E\n"})
public final class TransactionDetailFragment extends BaseMvvmFragment<PlanDetailViewModel> {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final a f32562M = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32563A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32564B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32565C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f32566H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f32567L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32568j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32570p;
    public final p355xf.t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32572w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransactionDetailFragment newInstance(@Nullable String str, @Nullable String str2) {
            TransactionDetailFragment transactionDetailFragment = new TransactionDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("orderNo", str);
            bundle.putString(TransType.TRANSACTION_TYPE, str2);
            transactionDetailFragment.setArguments(bundle);
            return transactionDetailFragment;
        }

        private a() {
        }
    }

    public TransactionDetailFragment() {
        final int i7 = 6;
        this.f32568j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i7) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
        final int i10 = 8;
        this.f32569o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i10) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
        final int i11 = 9;
        this.f32570p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i11) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
        final int i12 = 10;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i12) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
        final int i13 = 0;
        this.f32571v = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i13) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
        final int i14 = 1;
        this.f32572w = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i14) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
        final int i15 = 2;
        this.f32563A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i15) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
        final int i16 = 3;
        this.f32564B = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i16) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
        final int i17 = 4;
        this.f32565C = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i17) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
        final int i18 = 5;
        this.f32566H = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i18) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
        final int i19 = 7;
        this.f32567L = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailFragment f32665b;

            {
                this.f32665b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailFragment transactionDetailFragment = this.f32665b;
                switch (i19) {
                    case 0:
                        TransactionDetailFragment.a aVar = TransactionDetailFragment.f32562M;
                        View view = transactionDetailFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvOrderStatus);
                        }
                        return null;
                    case 1:
                        TransactionDetailFragment.a aVar2 = TransactionDetailFragment.f32562M;
                        View view2 = transactionDetailFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvOrderAmount);
                        }
                        return null;
                    case 2:
                        TransactionDetailFragment.a aVar3 = TransactionDetailFragment.f32562M;
                        View view3 = transactionDetailFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(Jc.c.tvOrderDesc);
                        }
                        return null;
                    case 3:
                        TransactionDetailFragment.a aVar4 = TransactionDetailFragment.f32562M;
                        View view4 = transactionDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(Jc.c.layoutOrderInfo);
                        }
                        return null;
                    case 4:
                        TransactionDetailFragment.a aVar5 = TransactionDetailFragment.f32562M;
                        View view5 = transactionDetailFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        TransactionDetailFragment.a aVar6 = TransactionDetailFragment.f32562M;
                        return transactionDetailFragment.requireArguments().getString("orderNo");
                    case 6:
                        TransactionDetailFragment.a aVar7 = TransactionDetailFragment.f32562M;
                        View view6 = transactionDetailFragment.f27318b;
                        if (view6 != null) {
                            return (OrderResultViewReceiptModel) view6.findViewById(Jc.c.viewReceipt);
                        }
                        return null;
                    case 7:
                        TransactionDetailFragment.a aVar8 = TransactionDetailFragment.f32562M;
                        String string = transactionDetailFragment.requireArguments().getString(TransType.TRANSACTION_TYPE);
                        return string == null ? TransType.TRANS_TYPE_FIXED_SAVING : string;
                    case 8:
                        TransactionDetailFragment.a aVar9 = TransactionDetailFragment.f32562M;
                        View view7 = transactionDetailFragment.f27318b;
                        if (view7 != null) {
                            return (OrderResultCustomerServiceModel) view7.findViewById(Jc.c.viewCustomerService);
                        }
                        return null;
                    case 9:
                        TransactionDetailFragment.a aVar10 = TransactionDetailFragment.f32562M;
                        View view8 = transactionDetailFragment.f27318b;
                        if (view8 != null) {
                            return (LinearLayout) view8.findViewById(Jc.c.layoutTransactionInfo);
                        }
                        return null;
                    default:
                        TransactionDetailFragment.a aVar11 = TransactionDetailFragment.f32562M;
                        View view9 = transactionDetailFragment.f27318b;
                        if (view9 != null) {
                            return (LinearLayout) view9.findViewById(Jc.c.layoutTransactionInfoExtend);
                        }
                        return null;
                }
            }
        });
    }

    /* JADX WARN: Failed to calculate best type for var: r13v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v13 ??, new type: com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp$MaturityPayoutDetail
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v14 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v15 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v17 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v19 ??, new type: java.lang.Long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v20 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v21 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v24 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v40 ??, new type: com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp$MaturityPayoutDetail
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v40 ??, new type: com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp$MaturityPayoutDetail
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v41 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v41 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v41 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v41 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v42 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v42 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v66 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v66 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r40v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r40v0 ??, new type: com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp$OrderDetailInfo
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r40v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r40v0 ??, new type: com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp$OrderDetailInfo
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v41 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void t(com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp.OrderDetailInfo r40, com.transsnet.palmpay.managemoney.ui.fragment.TransactionDetailFragment r41) {
        /*
            Method dump skipped, instruction units count: 2259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.managemoney.ui.fragment.TransactionDetailFragment.t(com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp$OrderDetailInfo, com.transsnet.palmpay.managemoney.ui.fragment.TransactionDetailFragment):void");
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_transaction_detail_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = planDetailViewModel != null ? planDetailViewModel.f32782f : null;
        if (lVar != null) {
            lVar.e(this, new T8.f(new T8.o(21, this, this), (byte) 0, 0));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) this.f27333i;
        if (planDetailViewModel != null) {
            p140j8.f.s(planDetailViewModel, new Qc.h0((String) this.f32566H.getValue(), w(), null), planDetailViewModel.f32782f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final View u() {
        View view = new View(this.f27319c);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, DensityUtil.dp2px(8.0f)));
        return view;
    }

    public final LinearLayout v() {
        return (LinearLayout) this.f32570p.getValue();
    }

    public final String w() {
        return (String) this.f32567L.getValue();
    }
}
