package com.transsnet.palmpay.cash_in.ui.fragment;

import C9.C0138e;
import C9.Q;
import J9.C0322f;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.cash_in.bean.response.BindBankCardDetail;
import com.transsnet.palmpay.cash_in.ui.fragment.BindBankCardDetailFragment;
import com.transsnet.palmpay.cash_in.ui.viewmodel.BindBankCardDetailViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140j8.f;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/fragment/BindBankCardDetailFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/BindBankCardDetailViewModel;", "<init>", "()V", "a", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBindBankCardDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindBankCardDetailFragment.kt\ncom/transsnet/palmpay/cash_in/ui/fragment/BindBankCardDetailFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,233:1\n171#2,12:234\n215#2:246\n*S KotlinDebug\n*F\n+ 1 BindBankCardDetailFragment.kt\ncom/transsnet/palmpay/cash_in/ui/fragment/BindBankCardDetailFragment\n*L\n92#1:234,12\n92#1:246\n*E\n"})
public final class BindBankCardDetailFragment extends BaseMvvmFragment<BindBankCardDetailViewModel> {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f27000C = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f27001A = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BindBankCardDetail f27002B;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27003j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27005p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f27006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f27007w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BindBankCardDetailFragment newInstance(@Nullable String str) {
            BindBankCardDetailFragment bindBankCardDetailFragment = new BindBankCardDetailFragment();
            bindBankCardDetailFragment.f27001A = str;
            return bindBankCardDetailFragment;
        }

        private a() {
        }
    }

    public BindBankCardDetailFragment() {
        final int i7 = 0;
        this.f27003j = C2131j.b(new Function0(this) { // from class: G9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardDetailFragment f3162b;

            {
                this.f3162b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardDetailFragment bindBankCardDetailFragment = this.f3162b;
                switch (i7) {
                    case 0:
                        BindBankCardDetailFragment.a aVar = BindBankCardDetailFragment.f27000C;
                        View view = bindBankCardDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        BindBankCardDetailFragment.a aVar2 = BindBankCardDetailFragment.f27000C;
                        View view2 = bindBankCardDetailFragment.f27318b;
                        if (view2 != null) {
                            return (OrderResultCustomerServiceModel) view2.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 2:
                        BindBankCardDetailFragment.a aVar3 = BindBankCardDetailFragment.f27000C;
                        View view3 = bindBankCardDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 3:
                        BindBankCardDetailFragment.a aVar4 = BindBankCardDetailFragment.f27000C;
                        View view4 = bindBankCardDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p366y9.b.ll_fee_detail);
                        }
                        return null;
                    case 4:
                        BindBankCardDetailFragment.a aVar5 = BindBankCardDetailFragment.f27000C;
                        View view5 = bindBankCardDetailFragment.f27318b;
                        if (view5 != null) {
                            return (OrderResultHeaderModel) view5.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                    default:
                        BindBankCardDetailFragment.a aVar6 = BindBankCardDetailFragment.f27000C;
                        View view6 = bindBankCardDetailFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(p366y9.b.title_bar);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f27004o = C2131j.b(new Function0(this) { // from class: G9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardDetailFragment f3162b;

            {
                this.f3162b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardDetailFragment bindBankCardDetailFragment = this.f3162b;
                switch (i10) {
                    case 0:
                        BindBankCardDetailFragment.a aVar = BindBankCardDetailFragment.f27000C;
                        View view = bindBankCardDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        BindBankCardDetailFragment.a aVar2 = BindBankCardDetailFragment.f27000C;
                        View view2 = bindBankCardDetailFragment.f27318b;
                        if (view2 != null) {
                            return (OrderResultCustomerServiceModel) view2.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 2:
                        BindBankCardDetailFragment.a aVar3 = BindBankCardDetailFragment.f27000C;
                        View view3 = bindBankCardDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 3:
                        BindBankCardDetailFragment.a aVar4 = BindBankCardDetailFragment.f27000C;
                        View view4 = bindBankCardDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p366y9.b.ll_fee_detail);
                        }
                        return null;
                    case 4:
                        BindBankCardDetailFragment.a aVar5 = BindBankCardDetailFragment.f27000C;
                        View view5 = bindBankCardDetailFragment.f27318b;
                        if (view5 != null) {
                            return (OrderResultHeaderModel) view5.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                    default:
                        BindBankCardDetailFragment.a aVar6 = BindBankCardDetailFragment.f27000C;
                        View view6 = bindBankCardDetailFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(p366y9.b.title_bar);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f27005p = C2131j.b(new Function0(this) { // from class: G9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardDetailFragment f3162b;

            {
                this.f3162b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardDetailFragment bindBankCardDetailFragment = this.f3162b;
                switch (i11) {
                    case 0:
                        BindBankCardDetailFragment.a aVar = BindBankCardDetailFragment.f27000C;
                        View view = bindBankCardDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        BindBankCardDetailFragment.a aVar2 = BindBankCardDetailFragment.f27000C;
                        View view2 = bindBankCardDetailFragment.f27318b;
                        if (view2 != null) {
                            return (OrderResultCustomerServiceModel) view2.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 2:
                        BindBankCardDetailFragment.a aVar3 = BindBankCardDetailFragment.f27000C;
                        View view3 = bindBankCardDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 3:
                        BindBankCardDetailFragment.a aVar4 = BindBankCardDetailFragment.f27000C;
                        View view4 = bindBankCardDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p366y9.b.ll_fee_detail);
                        }
                        return null;
                    case 4:
                        BindBankCardDetailFragment.a aVar5 = BindBankCardDetailFragment.f27000C;
                        View view5 = bindBankCardDetailFragment.f27318b;
                        if (view5 != null) {
                            return (OrderResultHeaderModel) view5.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                    default:
                        BindBankCardDetailFragment.a aVar6 = BindBankCardDetailFragment.f27000C;
                        View view6 = bindBankCardDetailFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(p366y9.b.title_bar);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: G9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardDetailFragment f3162b;

            {
                this.f3162b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardDetailFragment bindBankCardDetailFragment = this.f3162b;
                switch (i12) {
                    case 0:
                        BindBankCardDetailFragment.a aVar = BindBankCardDetailFragment.f27000C;
                        View view = bindBankCardDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        BindBankCardDetailFragment.a aVar2 = BindBankCardDetailFragment.f27000C;
                        View view2 = bindBankCardDetailFragment.f27318b;
                        if (view2 != null) {
                            return (OrderResultCustomerServiceModel) view2.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 2:
                        BindBankCardDetailFragment.a aVar3 = BindBankCardDetailFragment.f27000C;
                        View view3 = bindBankCardDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 3:
                        BindBankCardDetailFragment.a aVar4 = BindBankCardDetailFragment.f27000C;
                        View view4 = bindBankCardDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p366y9.b.ll_fee_detail);
                        }
                        return null;
                    case 4:
                        BindBankCardDetailFragment.a aVar5 = BindBankCardDetailFragment.f27000C;
                        View view5 = bindBankCardDetailFragment.f27318b;
                        if (view5 != null) {
                            return (OrderResultHeaderModel) view5.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                    default:
                        BindBankCardDetailFragment.a aVar6 = BindBankCardDetailFragment.f27000C;
                        View view6 = bindBankCardDetailFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(p366y9.b.title_bar);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f27006v = C2131j.b(new Function0(this) { // from class: G9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardDetailFragment f3162b;

            {
                this.f3162b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardDetailFragment bindBankCardDetailFragment = this.f3162b;
                switch (i13) {
                    case 0:
                        BindBankCardDetailFragment.a aVar = BindBankCardDetailFragment.f27000C;
                        View view = bindBankCardDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        BindBankCardDetailFragment.a aVar2 = BindBankCardDetailFragment.f27000C;
                        View view2 = bindBankCardDetailFragment.f27318b;
                        if (view2 != null) {
                            return (OrderResultCustomerServiceModel) view2.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 2:
                        BindBankCardDetailFragment.a aVar3 = BindBankCardDetailFragment.f27000C;
                        View view3 = bindBankCardDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 3:
                        BindBankCardDetailFragment.a aVar4 = BindBankCardDetailFragment.f27000C;
                        View view4 = bindBankCardDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p366y9.b.ll_fee_detail);
                        }
                        return null;
                    case 4:
                        BindBankCardDetailFragment.a aVar5 = BindBankCardDetailFragment.f27000C;
                        View view5 = bindBankCardDetailFragment.f27318b;
                        if (view5 != null) {
                            return (OrderResultHeaderModel) view5.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                    default:
                        BindBankCardDetailFragment.a aVar6 = BindBankCardDetailFragment.f27000C;
                        View view6 = bindBankCardDetailFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(p366y9.b.title_bar);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f27007w = C2131j.b(new Function0(this) { // from class: G9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardDetailFragment f3162b;

            {
                this.f3162b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardDetailFragment bindBankCardDetailFragment = this.f3162b;
                switch (i14) {
                    case 0:
                        BindBankCardDetailFragment.a aVar = BindBankCardDetailFragment.f27000C;
                        View view = bindBankCardDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultViewReceiptModel) view.findViewById(p366y9.b.btn_view_receipt);
                        }
                        return null;
                    case 1:
                        BindBankCardDetailFragment.a aVar2 = BindBankCardDetailFragment.f27000C;
                        View view2 = bindBankCardDetailFragment.f27318b;
                        if (view2 != null) {
                            return (OrderResultCustomerServiceModel) view2.findViewById(p366y9.b.model_order_result_customer_service);
                        }
                        return null;
                    case 2:
                        BindBankCardDetailFragment.a aVar3 = BindBankCardDetailFragment.f27000C;
                        View view3 = bindBankCardDetailFragment.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(p366y9.b.ll_container_middle);
                        }
                        return null;
                    case 3:
                        BindBankCardDetailFragment.a aVar4 = BindBankCardDetailFragment.f27000C;
                        View view4 = bindBankCardDetailFragment.f27318b;
                        if (view4 != null) {
                            return (LinearLayout) view4.findViewById(p366y9.b.ll_fee_detail);
                        }
                        return null;
                    case 4:
                        BindBankCardDetailFragment.a aVar5 = BindBankCardDetailFragment.f27000C;
                        View view5 = bindBankCardDetailFragment.f27318b;
                        if (view5 != null) {
                            return (OrderResultHeaderModel) view5.findViewById(p366y9.b.orlm_header);
                        }
                        return null;
                    default:
                        BindBankCardDetailFragment.a aVar6 = BindBankCardDetailFragment.f27000C;
                        View view6 = bindBankCardDetailFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(p366y9.b.title_bar);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return c.ci_fragment_bind_bank_card_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        BindBankCardDetailViewModel bindBankCardDetailViewModel = (BindBankCardDetailViewModel) this.f27333i;
        l lVar = bindBankCardDetailViewModel != null ? bindBankCardDetailViewModel.f27094e : null;
        if (lVar == null) {
            return 0;
        }
        lVar.e(this, new C0138e(new Q(15, this, this), 0));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        BindBankCardDetailViewModel bindBankCardDetailViewModel = (BindBankCardDetailViewModel) this.f27333i;
        if (bindBankCardDetailViewModel != null) {
            f.s(bindBankCardDetailViewModel, new C0322f(this.f27001A, null), bindBankCardDetailViewModel.f27094e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        t tVar = this.f27004o;
        OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) tVar.getValue();
        if (orderResultCustomerServiceModel != null) {
            orderResultCustomerServiceModel.d(Boolean.FALSE);
        }
        OrderResultCustomerServiceModel orderResultCustomerServiceModel2 = (OrderResultCustomerServiceModel) tVar.getValue();
        if (orderResultCustomerServiceModel2 != null) {
            orderResultCustomerServiceModel2.setOnCustomerServiceModelListener(new G9.c(this));
        }
        PpTitleBar ppTitleBar = (PpTitleBar) this.f27007w.getValue();
        if (ppTitleBar != null) {
            final int i7 = 0;
            ppTitleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: G9.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BindBankCardDetailFragment f3164b;

                {
                    this.f3164b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BindBankCardDetailFragment bindBankCardDetailFragment = this.f3164b;
                    switch (i7) {
                        case 0:
                            BindBankCardDetailFragment.a aVar = BindBankCardDetailFragment.f27000C;
                            bindBankCardDetailFragment.requireActivity().finish();
                            break;
                        default:
                            BindBankCardDetail bindBankCardDetail = bindBankCardDetailFragment.f27002B;
                            if (bindBankCardDetail != null) {
                                ARouter.getInstance().build("/cash_in_out/trans_receipt").withString("transType", bindBankCardDetail.transType).withString("orderId", bindBankCardDetail.orderId).navigation();
                            }
                            break;
                    }
                }
            });
        }
        OrderResultViewReceiptModel orderResultViewReceiptModel = (OrderResultViewReceiptModel) this.f27003j.getValue();
        if (orderResultViewReceiptModel == null) {
            return 0;
        }
        final int i10 = 1;
        orderResultViewReceiptModel.setOnClickListener(new View.OnClickListener(this) { // from class: G9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardDetailFragment f3164b;

            {
                this.f3164b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindBankCardDetailFragment bindBankCardDetailFragment = this.f3164b;
                switch (i10) {
                    case 0:
                        BindBankCardDetailFragment.a aVar = BindBankCardDetailFragment.f27000C;
                        bindBankCardDetailFragment.requireActivity().finish();
                        break;
                    default:
                        BindBankCardDetail bindBankCardDetail = bindBankCardDetailFragment.f27002B;
                        if (bindBankCardDetail != null) {
                            ARouter.getInstance().build("/cash_in_out/trans_receipt").withString("transType", bindBankCardDetail.transType).withString("orderId", bindBankCardDetail.orderId).navigation();
                        }
                        break;
                }
            }
        });
        return 0;
    }

    public final OrderResultHeaderModel t() {
        return (OrderResultHeaderModel) this.f27006v.getValue();
    }
}
