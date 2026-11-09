package com.transsnet.palmpay.teller.ui.activity;

import L6.b;
import Pd.c;
import Rd.C0597m;
import T8.f;
import T8.o;
import Wd.C0735i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.custom_view.model.OrderDetailInfoListModel;
import com.transsnet.palmpay.custom_view.model.OrderResultCopyToken;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentOrderDetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p025ba.d;
import p086fe.C0;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "场景/Order Detail", path = "/quick_teller/bill_detail")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/BillPaymentOrderDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/BillPaymentOrderDetailViewModel;", "LRd/m;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillPaymentOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillPaymentOrderDetailActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BillPaymentOrderDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,571:1\n260#2,10:572\n296#2:582\n1#3:583\n*S KotlinDebug\n*F\n+ 1 BillPaymentOrderDetailActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BillPaymentOrderDetailActivity\n*L\n142#1:572,10\n142#1:582\n*E\n"})
public final class BillPaymentOrderDetailActivity extends BaseMvvmVBActivity<BillPaymentOrderDetailViewModel, C0597m> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f34162i = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BillPaymentOrderDetailRsp f34165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f34166g = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@Nullable Context context, @Nullable String str, @Nullable String str2) {
            if (TextUtils.isEmpty(str) || context == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) BillPaymentOrderDetailActivity.class);
            intent.putExtra("orderNo", str);
            intent.putExtra("extra_type", str2);
            context.startActivity(intent);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f34163d)) {
            this.f34163d = getQueryParameter("orderNo");
        }
        C0597m c0597m = (C0597m) this.f27334c;
        if (c0597m != null) {
            c0597m.f8399f.d(d.core_notification);
        }
        l lVar = ((BillPaymentOrderDetailViewModel) l()).f34416e;
        if (lVar != null) {
            lVar.e(this, new f(new o(8, this, this), 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(Pd.d.qt_activity_bill_payment_order_detail, (ViewGroup) null, false);
        int i7 = c.layout_result_amount_list;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = c.layout_result_info_list;
            OrderDetailInfoListModel orderDetailInfoListModel = (OrderDetailInfoListModel) p059e1.a.m(i7, viewInflate);
            if (orderDetailInfoListModel != null) {
                i7 = c.layout_result_token_copy;
                OrderResultCopyToken orderResultCopyToken = (OrderResultCopyToken) p059e1.a.m(i7, viewInflate);
                if (orderResultCopyToken != null) {
                    i7 = c.model_order_result_customer_service;
                    OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) p059e1.a.m(i7, viewInflate);
                    if (orderResultCustomerServiceModel != null) {
                        i7 = c.model_order_result_header;
                        OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) p059e1.a.m(i7, viewInflate);
                        if (orderResultHeaderModel != null) {
                            i7 = c.model_order_result_view_receipt;
                            OrderResultViewReceiptModel orderResultViewReceiptModel = (OrderResultViewReceiptModel) p059e1.a.m(i7, viewInflate);
                            if (orderResultViewReceiptModel != null) {
                                i7 = c.scrollView;
                                if (((NestedScrollView) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = c.stub_result_reward;
                                    ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                                    if (viewStub != null) {
                                        i7 = c.stub_result_special_info;
                                        ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                        if (viewStub2 != null) {
                                            i7 = c.title_bar;
                                            if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                                C0597m c0597m = new C0597m((LinearLayout) viewInflate, linearLayout, orderDetailInfoListModel, orderResultCopyToken, orderResultCustomerServiceModel, orderResultHeaderModel, orderResultViewReceiptModel, viewStub, viewStub2);
                                                Intrinsics.checkNotNullExpressionValue(c0597m, "inflate(...)");
                                                return c0597m;
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

    public final void n() {
        BillPaymentOrderDetailViewModel billPaymentOrderDetailViewModel = (BillPaymentOrderDetailViewModel) l();
        String str = this.f34163d;
        String str2 = this.f34164e;
        billPaymentOrderDetailViewModel.getClass();
        p140j8.f.s(billPaymentOrderDetailViewModel, new C0(str2, str, null), billPaymentOrderDetailViewModel.f34416e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n();
        String str = this.f34164e;
        if (str == null) {
            str = "";
        }
        AutoTrackUtil.trackTransType(this, str);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundDark), true);
        C0597m c0597m = (C0597m) this.f27334c;
        if (c0597m != null) {
            c0597m.f8398e.setOnCustomerServiceModelListener(new C0735i(this));
        }
    }
}
