package com.transsnet.palmpay.cash_in.ui.fragment;

import C9.C0138e;
import C9.Q;
import Ce.ViewOnClickListenerC0159a;
import G9.p;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawRecordDetailFragment;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawDetailViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.r;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140j8.f;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/fragment/WithdrawRecordDetailFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawDetailViewModel;", "<init>", "()V", "a", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawRecordDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawRecordDetailFragment.kt\ncom/transsnet/palmpay/cash_in/ui/fragment/WithdrawRecordDetailFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,287:1\n171#2,12:288\n215#2:300\n*S KotlinDebug\n*F\n+ 1 WithdrawRecordDetailFragment.kt\ncom/transsnet/palmpay/cash_in/ui/fragment/WithdrawRecordDetailFragment\n*L\n88#1:288,12\n88#1:300\n*E\n"})
public final class WithdrawRecordDetailFragment extends BaseMvvmFragment<WithdrawDetailViewModel> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f27042w = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27043j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27045p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public BillDetail f27046v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final WithdrawRecordDetailFragment newInstance(@Nullable String str, @Nullable String str2) {
            WithdrawRecordDetailFragment withdrawRecordDetailFragment = new WithdrawRecordDetailFragment();
            withdrawRecordDetailFragment.t = str2;
            return withdrawRecordDetailFragment;
        }

        private a() {
        }
    }

    public WithdrawRecordDetailFragment() {
        final int i7 = 0;
        this.f27043j = C2131j.b(new Function0(this) { // from class: G9.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawRecordDetailFragment f3182b;

            {
                this.f3182b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawRecordDetailFragment withdrawRecordDetailFragment = this.f3182b;
                switch (i7) {
                    case 0:
                        WithdrawRecordDetailFragment.a aVar = WithdrawRecordDetailFragment.f27042w;
                        View view = withdrawRecordDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultCustomerServiceModel) view.findViewById(p366y9.b.m_customer_service);
                        }
                        return null;
                    case 1:
                        WithdrawRecordDetailFragment.a aVar2 = WithdrawRecordDetailFragment.f27042w;
                        View view2 = withdrawRecordDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(p366y9.b.ll_head_item);
                        }
                        return null;
                    default:
                        WithdrawRecordDetailFragment.a aVar3 = WithdrawRecordDetailFragment.f27042w;
                        View view3 = withdrawRecordDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultHeaderModel) view3.findViewById(p366y9.b.orhm_head);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f27044o = C2131j.b(new Function0(this) { // from class: G9.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawRecordDetailFragment f3182b;

            {
                this.f3182b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawRecordDetailFragment withdrawRecordDetailFragment = this.f3182b;
                switch (i10) {
                    case 0:
                        WithdrawRecordDetailFragment.a aVar = WithdrawRecordDetailFragment.f27042w;
                        View view = withdrawRecordDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultCustomerServiceModel) view.findViewById(p366y9.b.m_customer_service);
                        }
                        return null;
                    case 1:
                        WithdrawRecordDetailFragment.a aVar2 = WithdrawRecordDetailFragment.f27042w;
                        View view2 = withdrawRecordDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(p366y9.b.ll_head_item);
                        }
                        return null;
                    default:
                        WithdrawRecordDetailFragment.a aVar3 = WithdrawRecordDetailFragment.f27042w;
                        View view3 = withdrawRecordDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultHeaderModel) view3.findViewById(p366y9.b.orhm_head);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f27045p = C2131j.b(new Function0(this) { // from class: G9.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawRecordDetailFragment f3182b;

            {
                this.f3182b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawRecordDetailFragment withdrawRecordDetailFragment = this.f3182b;
                switch (i11) {
                    case 0:
                        WithdrawRecordDetailFragment.a aVar = WithdrawRecordDetailFragment.f27042w;
                        View view = withdrawRecordDetailFragment.f27318b;
                        if (view != null) {
                            return (OrderResultCustomerServiceModel) view.findViewById(p366y9.b.m_customer_service);
                        }
                        return null;
                    case 1:
                        WithdrawRecordDetailFragment.a aVar2 = WithdrawRecordDetailFragment.f27042w;
                        View view2 = withdrawRecordDetailFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(p366y9.b.ll_head_item);
                        }
                        return null;
                    default:
                        WithdrawRecordDetailFragment.a aVar3 = WithdrawRecordDetailFragment.f27042w;
                        View view3 = withdrawRecordDetailFragment.f27318b;
                        if (view3 != null) {
                            return (OrderResultHeaderModel) view3.findViewById(p366y9.b.orhm_head);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return c.ci_fragment_withdraw_record_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        WithdrawDetailViewModel withdrawDetailViewModel = (WithdrawDetailViewModel) this.f27333i;
        l lVar = withdrawDetailViewModel != null ? withdrawDetailViewModel.f27105e : null;
        if (lVar == null) {
            return 0;
        }
        lVar.e(this, new C0138e(new Q(17, this, this), (byte) 0, false));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        WithdrawDetailViewModel withdrawDetailViewModel = (WithdrawDetailViewModel) this.f27333i;
        if (withdrawDetailViewModel != null) {
            f.s(withdrawDetailViewModel, new J9.t(this.t, null), withdrawDetailViewModel.f27105e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        LinearLayout orderStatusLayout;
        ImageView bodyBgIv;
        super.o();
        ARouter.getInstance().inject(this);
        OrderResultHeaderModel orderResultHeaderModelU = u();
        if (orderResultHeaderModelU != null && (bodyBgIv = orderResultHeaderModelU.getBodyBgIv()) != null) {
            bodyBgIv.setBackgroundResource(r.cv_shape_rect_corner_12_bg_white);
        }
        OrderResultHeaderModel orderResultHeaderModelU2 = u();
        if (orderResultHeaderModelU2 != null && (orderStatusLayout = orderResultHeaderModelU2.getOrderStatusLayout()) != null) {
            orderStatusLayout.setOnClickListener(new ViewOnClickListenerC0159a(this, 14));
        }
        OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) this.f27043j.getValue();
        if (orderResultCustomerServiceModel == null) {
            return 0;
        }
        orderResultCustomerServiceModel.setOnCustomerServiceModelListener(new p(this));
        return 0;
    }

    public final void t(int i7, String str, String str2) {
        E eRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(eRequireActivity, i7, str, str2);
        LinearLayout linearLayout = (LinearLayout) this.f27044o.getValue();
        if (linearLayout != null) {
            linearLayout.addView(orderResultItemModel);
        }
    }

    public final OrderResultHeaderModel u() {
        return (OrderResultHeaderModel) this.f27045p.getValue();
    }
}
