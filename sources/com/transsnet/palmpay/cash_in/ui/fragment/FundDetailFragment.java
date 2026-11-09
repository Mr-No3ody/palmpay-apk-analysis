package com.transsnet.palmpay.cash_in.ui.fragment;

import C9.C0138e;
import C9.Q;
import G9.e;
import G9.f;
import J9.C0324h;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.ui.fragment.FundDetailFragment;
import com.transsnet.palmpay.cash_in.ui.view.ModelUssdInfo;
import com.transsnet.palmpay.cash_in.ui.viewmodel.FundDetailViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.ui.widget.FixedSavingsLayout;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/fragment/FundDetailFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/FundDetailViewModel;", "<init>", "()V", "a", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFundDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FundDetailFragment.kt\ncom/transsnet/palmpay/cash_in/ui/fragment/FundDetailFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n171#2,12:355\n215#2:367\n1869#3,2:368\n*S KotlinDebug\n*F\n+ 1 FundDetailFragment.kt\ncom/transsnet/palmpay/cash_in/ui/fragment/FundDetailFragment\n*L\n134#1:355,12\n134#1:367\n189#1:368,2\n*E\n"})
public final class FundDetailFragment extends BaseMvvmFragment<FundDetailViewModel> {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final a f27008X = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f27009A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f27010B;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public BillDetail f27012H;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public OrderResultItemModel f27014M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public OrderResultItemModel f27015Q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27016j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27018p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f27019v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f27020w;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f27011C = "";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final e f27013L = new e(this, 1);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FundDetailFragment newInstance(@NotNull String orderNo) {
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            FundDetailFragment fundDetailFragment = new FundDetailFragment();
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            fundDetailFragment.f27011C = orderNo;
            return fundDetailFragment;
        }

        private a() {
        }
    }

    public FundDetailFragment() {
        final int i7 = 0;
        this.f27016j = C2131j.b(new Function0(this) { // from class: G9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundDetailFragment f3167b;

            {
                this.f3167b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundDetailFragment fundDetailFragment = this.f3167b;
                switch (i7) {
                    case 0:
                        FundDetailFragment.a aVar = FundDetailFragment.f27008X;
                        View view = fundDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        FundDetailFragment.a aVar2 = FundDetailFragment.f27008X;
                        View view2 = fundDetailFragment.f27318b;
                        if (view2 != null) {
                            return (FrameLayout) view2.findViewById(p366y9.b.cffd_share_receipt);
                        }
                        return null;
                    case 2:
                        FundDetailFragment.a aVar3 = FundDetailFragment.f27008X;
                        View view3 = fundDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultCustomerServiceModel) view3.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 3:
                        FundDetailFragment.a aVar4 = FundDetailFragment.f27008X;
                        View view4 = fundDetailFragment.f27318b;
                        if (view4 != null) {
                            return (FixedSavingsLayout) view4.findViewById(p366y9.b.layout_fixed_savings);
                        }
                        return null;
                    case 4:
                        FundDetailFragment.a aVar5 = FundDetailFragment.f27008X;
                        View view5 = fundDetailFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 5:
                        FundDetailFragment.a aVar6 = FundDetailFragment.f27008X;
                        View view6 = fundDetailFragment.f27318b;
                        if (view6 != null) {
                            return (ModelUssdInfo) view6.findViewById(p366y9.b.cfrd_ussd_info);
                        }
                        return null;
                    case 6:
                        FundDetailFragment.a aVar7 = FundDetailFragment.f27008X;
                        View view7 = fundDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(p366y9.b.ll_container_top);
                        }
                        return null;
                    default:
                        FundDetailFragment.a aVar8 = FundDetailFragment.f27008X;
                        View view8 = fundDetailFragment.f27318b;
                        if (view8 != null) {
                            return (OrderResultHeaderModel) view8.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f27017o = C2131j.b(new Function0(this) { // from class: G9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundDetailFragment f3167b;

            {
                this.f3167b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundDetailFragment fundDetailFragment = this.f3167b;
                switch (i10) {
                    case 0:
                        FundDetailFragment.a aVar = FundDetailFragment.f27008X;
                        View view = fundDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        FundDetailFragment.a aVar2 = FundDetailFragment.f27008X;
                        View view2 = fundDetailFragment.f27318b;
                        if (view2 != null) {
                            return (FrameLayout) view2.findViewById(p366y9.b.cffd_share_receipt);
                        }
                        return null;
                    case 2:
                        FundDetailFragment.a aVar3 = FundDetailFragment.f27008X;
                        View view3 = fundDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultCustomerServiceModel) view3.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 3:
                        FundDetailFragment.a aVar4 = FundDetailFragment.f27008X;
                        View view4 = fundDetailFragment.f27318b;
                        if (view4 != null) {
                            return (FixedSavingsLayout) view4.findViewById(p366y9.b.layout_fixed_savings);
                        }
                        return null;
                    case 4:
                        FundDetailFragment.a aVar5 = FundDetailFragment.f27008X;
                        View view5 = fundDetailFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 5:
                        FundDetailFragment.a aVar6 = FundDetailFragment.f27008X;
                        View view6 = fundDetailFragment.f27318b;
                        if (view6 != null) {
                            return (ModelUssdInfo) view6.findViewById(p366y9.b.cfrd_ussd_info);
                        }
                        return null;
                    case 6:
                        FundDetailFragment.a aVar7 = FundDetailFragment.f27008X;
                        View view7 = fundDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(p366y9.b.ll_container_top);
                        }
                        return null;
                    default:
                        FundDetailFragment.a aVar8 = FundDetailFragment.f27008X;
                        View view8 = fundDetailFragment.f27318b;
                        if (view8 != null) {
                            return (OrderResultHeaderModel) view8.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f27018p = C2131j.b(new Function0(this) { // from class: G9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundDetailFragment f3167b;

            {
                this.f3167b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundDetailFragment fundDetailFragment = this.f3167b;
                switch (i11) {
                    case 0:
                        FundDetailFragment.a aVar = FundDetailFragment.f27008X;
                        View view = fundDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        FundDetailFragment.a aVar2 = FundDetailFragment.f27008X;
                        View view2 = fundDetailFragment.f27318b;
                        if (view2 != null) {
                            return (FrameLayout) view2.findViewById(p366y9.b.cffd_share_receipt);
                        }
                        return null;
                    case 2:
                        FundDetailFragment.a aVar3 = FundDetailFragment.f27008X;
                        View view3 = fundDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultCustomerServiceModel) view3.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 3:
                        FundDetailFragment.a aVar4 = FundDetailFragment.f27008X;
                        View view4 = fundDetailFragment.f27318b;
                        if (view4 != null) {
                            return (FixedSavingsLayout) view4.findViewById(p366y9.b.layout_fixed_savings);
                        }
                        return null;
                    case 4:
                        FundDetailFragment.a aVar5 = FundDetailFragment.f27008X;
                        View view5 = fundDetailFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 5:
                        FundDetailFragment.a aVar6 = FundDetailFragment.f27008X;
                        View view6 = fundDetailFragment.f27318b;
                        if (view6 != null) {
                            return (ModelUssdInfo) view6.findViewById(p366y9.b.cfrd_ussd_info);
                        }
                        return null;
                    case 6:
                        FundDetailFragment.a aVar7 = FundDetailFragment.f27008X;
                        View view7 = fundDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(p366y9.b.ll_container_top);
                        }
                        return null;
                    default:
                        FundDetailFragment.a aVar8 = FundDetailFragment.f27008X;
                        View view8 = fundDetailFragment.f27318b;
                        if (view8 != null) {
                            return (OrderResultHeaderModel) view8.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: G9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundDetailFragment f3167b;

            {
                this.f3167b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundDetailFragment fundDetailFragment = this.f3167b;
                switch (i12) {
                    case 0:
                        FundDetailFragment.a aVar = FundDetailFragment.f27008X;
                        View view = fundDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        FundDetailFragment.a aVar2 = FundDetailFragment.f27008X;
                        View view2 = fundDetailFragment.f27318b;
                        if (view2 != null) {
                            return (FrameLayout) view2.findViewById(p366y9.b.cffd_share_receipt);
                        }
                        return null;
                    case 2:
                        FundDetailFragment.a aVar3 = FundDetailFragment.f27008X;
                        View view3 = fundDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultCustomerServiceModel) view3.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 3:
                        FundDetailFragment.a aVar4 = FundDetailFragment.f27008X;
                        View view4 = fundDetailFragment.f27318b;
                        if (view4 != null) {
                            return (FixedSavingsLayout) view4.findViewById(p366y9.b.layout_fixed_savings);
                        }
                        return null;
                    case 4:
                        FundDetailFragment.a aVar5 = FundDetailFragment.f27008X;
                        View view5 = fundDetailFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 5:
                        FundDetailFragment.a aVar6 = FundDetailFragment.f27008X;
                        View view6 = fundDetailFragment.f27318b;
                        if (view6 != null) {
                            return (ModelUssdInfo) view6.findViewById(p366y9.b.cfrd_ussd_info);
                        }
                        return null;
                    case 6:
                        FundDetailFragment.a aVar7 = FundDetailFragment.f27008X;
                        View view7 = fundDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(p366y9.b.ll_container_top);
                        }
                        return null;
                    default:
                        FundDetailFragment.a aVar8 = FundDetailFragment.f27008X;
                        View view8 = fundDetailFragment.f27318b;
                        if (view8 != null) {
                            return (OrderResultHeaderModel) view8.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f27019v = C2131j.b(new Function0(this) { // from class: G9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundDetailFragment f3167b;

            {
                this.f3167b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundDetailFragment fundDetailFragment = this.f3167b;
                switch (i13) {
                    case 0:
                        FundDetailFragment.a aVar = FundDetailFragment.f27008X;
                        View view = fundDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        FundDetailFragment.a aVar2 = FundDetailFragment.f27008X;
                        View view2 = fundDetailFragment.f27318b;
                        if (view2 != null) {
                            return (FrameLayout) view2.findViewById(p366y9.b.cffd_share_receipt);
                        }
                        return null;
                    case 2:
                        FundDetailFragment.a aVar3 = FundDetailFragment.f27008X;
                        View view3 = fundDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultCustomerServiceModel) view3.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 3:
                        FundDetailFragment.a aVar4 = FundDetailFragment.f27008X;
                        View view4 = fundDetailFragment.f27318b;
                        if (view4 != null) {
                            return (FixedSavingsLayout) view4.findViewById(p366y9.b.layout_fixed_savings);
                        }
                        return null;
                    case 4:
                        FundDetailFragment.a aVar5 = FundDetailFragment.f27008X;
                        View view5 = fundDetailFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 5:
                        FundDetailFragment.a aVar6 = FundDetailFragment.f27008X;
                        View view6 = fundDetailFragment.f27318b;
                        if (view6 != null) {
                            return (ModelUssdInfo) view6.findViewById(p366y9.b.cfrd_ussd_info);
                        }
                        return null;
                    case 6:
                        FundDetailFragment.a aVar7 = FundDetailFragment.f27008X;
                        View view7 = fundDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(p366y9.b.ll_container_top);
                        }
                        return null;
                    default:
                        FundDetailFragment.a aVar8 = FundDetailFragment.f27008X;
                        View view8 = fundDetailFragment.f27318b;
                        if (view8 != null) {
                            return (OrderResultHeaderModel) view8.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f27020w = C2131j.b(new Function0(this) { // from class: G9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundDetailFragment f3167b;

            {
                this.f3167b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundDetailFragment fundDetailFragment = this.f3167b;
                switch (i14) {
                    case 0:
                        FundDetailFragment.a aVar = FundDetailFragment.f27008X;
                        View view = fundDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        FundDetailFragment.a aVar2 = FundDetailFragment.f27008X;
                        View view2 = fundDetailFragment.f27318b;
                        if (view2 != null) {
                            return (FrameLayout) view2.findViewById(p366y9.b.cffd_share_receipt);
                        }
                        return null;
                    case 2:
                        FundDetailFragment.a aVar3 = FundDetailFragment.f27008X;
                        View view3 = fundDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultCustomerServiceModel) view3.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 3:
                        FundDetailFragment.a aVar4 = FundDetailFragment.f27008X;
                        View view4 = fundDetailFragment.f27318b;
                        if (view4 != null) {
                            return (FixedSavingsLayout) view4.findViewById(p366y9.b.layout_fixed_savings);
                        }
                        return null;
                    case 4:
                        FundDetailFragment.a aVar5 = FundDetailFragment.f27008X;
                        View view5 = fundDetailFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 5:
                        FundDetailFragment.a aVar6 = FundDetailFragment.f27008X;
                        View view6 = fundDetailFragment.f27318b;
                        if (view6 != null) {
                            return (ModelUssdInfo) view6.findViewById(p366y9.b.cfrd_ussd_info);
                        }
                        return null;
                    case 6:
                        FundDetailFragment.a aVar7 = FundDetailFragment.f27008X;
                        View view7 = fundDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(p366y9.b.ll_container_top);
                        }
                        return null;
                    default:
                        FundDetailFragment.a aVar8 = FundDetailFragment.f27008X;
                        View view8 = fundDetailFragment.f27318b;
                        if (view8 != null) {
                            return (OrderResultHeaderModel) view8.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                }
            }
        });
        final int i15 = 6;
        this.f27009A = C2131j.b(new Function0(this) { // from class: G9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundDetailFragment f3167b;

            {
                this.f3167b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundDetailFragment fundDetailFragment = this.f3167b;
                switch (i15) {
                    case 0:
                        FundDetailFragment.a aVar = FundDetailFragment.f27008X;
                        View view = fundDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        FundDetailFragment.a aVar2 = FundDetailFragment.f27008X;
                        View view2 = fundDetailFragment.f27318b;
                        if (view2 != null) {
                            return (FrameLayout) view2.findViewById(p366y9.b.cffd_share_receipt);
                        }
                        return null;
                    case 2:
                        FundDetailFragment.a aVar3 = FundDetailFragment.f27008X;
                        View view3 = fundDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultCustomerServiceModel) view3.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 3:
                        FundDetailFragment.a aVar4 = FundDetailFragment.f27008X;
                        View view4 = fundDetailFragment.f27318b;
                        if (view4 != null) {
                            return (FixedSavingsLayout) view4.findViewById(p366y9.b.layout_fixed_savings);
                        }
                        return null;
                    case 4:
                        FundDetailFragment.a aVar5 = FundDetailFragment.f27008X;
                        View view5 = fundDetailFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 5:
                        FundDetailFragment.a aVar6 = FundDetailFragment.f27008X;
                        View view6 = fundDetailFragment.f27318b;
                        if (view6 != null) {
                            return (ModelUssdInfo) view6.findViewById(p366y9.b.cfrd_ussd_info);
                        }
                        return null;
                    case 6:
                        FundDetailFragment.a aVar7 = FundDetailFragment.f27008X;
                        View view7 = fundDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(p366y9.b.ll_container_top);
                        }
                        return null;
                    default:
                        FundDetailFragment.a aVar8 = FundDetailFragment.f27008X;
                        View view8 = fundDetailFragment.f27318b;
                        if (view8 != null) {
                            return (OrderResultHeaderModel) view8.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                }
            }
        });
        final int i16 = 7;
        this.f27010B = C2131j.b(new Function0(this) { // from class: G9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundDetailFragment f3167b;

            {
                this.f3167b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FundDetailFragment fundDetailFragment = this.f3167b;
                switch (i16) {
                    case 0:
                        FundDetailFragment.a aVar = FundDetailFragment.f27008X;
                        View view = fundDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        FundDetailFragment.a aVar2 = FundDetailFragment.f27008X;
                        View view2 = fundDetailFragment.f27318b;
                        if (view2 != null) {
                            return (FrameLayout) view2.findViewById(p366y9.b.cffd_share_receipt);
                        }
                        return null;
                    case 2:
                        FundDetailFragment.a aVar3 = FundDetailFragment.f27008X;
                        View view3 = fundDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultCustomerServiceModel) view3.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 3:
                        FundDetailFragment.a aVar4 = FundDetailFragment.f27008X;
                        View view4 = fundDetailFragment.f27318b;
                        if (view4 != null) {
                            return (FixedSavingsLayout) view4.findViewById(p366y9.b.layout_fixed_savings);
                        }
                        return null;
                    case 4:
                        FundDetailFragment.a aVar5 = FundDetailFragment.f27008X;
                        View view5 = fundDetailFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 5:
                        FundDetailFragment.a aVar6 = FundDetailFragment.f27008X;
                        View view6 = fundDetailFragment.f27318b;
                        if (view6 != null) {
                            return (ModelUssdInfo) view6.findViewById(p366y9.b.cfrd_ussd_info);
                        }
                        return null;
                    case 6:
                        FundDetailFragment.a aVar7 = FundDetailFragment.f27008X;
                        View view7 = fundDetailFragment.f27318b;
                        if (view7 != null) {
                            return (LinearLayout) view7.findViewById(p366y9.b.ll_container_top);
                        }
                        return null;
                    default:
                        FundDetailFragment.a aVar8 = FundDetailFragment.f27008X;
                        View view8 = fundDetailFragment.f27318b;
                        if (view8 != null) {
                            return (OrderResultHeaderModel) view8.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return c.ci_fragment_fund_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        FundDetailViewModel fundDetailViewModel = (FundDetailViewModel) this.f27333i;
        l lVar = fundDetailViewModel != null ? fundDetailViewModel.f27096e : null;
        if (lVar == null) {
            return 0;
        }
        lVar.e(this, new C0138e(new Q(16, this, this), (short) 0));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        int i7 = 0;
        super.o();
        h.q(this.f27013L, (FrameLayout) this.f27017o.getValue());
        OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) this.f27018p.getValue();
        if (orderResultCustomerServiceModel != null) {
            orderResultCustomerServiceModel.setOnCustomerServiceModelListener(new f(this));
        }
        OrderResultViewReceiptModel orderResultViewReceiptModel = (OrderResultViewReceiptModel) this.f27016j.getValue();
        if (orderResultViewReceiptModel != null) {
            orderResultViewReceiptModel.setOnClickListener(new e(this, i7));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FundDetailViewModel fundDetailViewModel = (FundDetailViewModel) this.f27333i;
        if (fundDetailViewModel != null) {
            String orderNo = this.f27011C;
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            p140j8.f.s(fundDetailViewModel, new C0324h(orderNo, null), fundDetailViewModel.f27096e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final LinearLayout t() {
        return (LinearLayout) this.f27019v.getValue();
    }

    public final OrderResultHeaderModel u() {
        return (OrderResultHeaderModel) this.f27010B.getValue();
    }
}
