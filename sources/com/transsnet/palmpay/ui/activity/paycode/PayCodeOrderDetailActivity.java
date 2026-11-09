package com.transsnet.palmpay.ui.activity.paycode;

import Ac.e;
import Ac.f;
import Bc.C0105b;
import L6.b;
import Pe.m0;
import Wf.t0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.main.export.bean.rsp.PayCodeOrderDetailBean;
import com.transsnet.palmpay.viewmodule.PayCodeOrderDetailResultViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p025ba.d;
import p025ba.k;
import p141j9.s;
import p141j9.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/paycode_order_detail")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/paycode/PayCodeOrderDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/PayCodeOrderDetailResultViewModel;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPayCodeOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayCodeOrderDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/paycode/PayCodeOrderDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,430:1\n260#2,10:431\n296#2:441\n1#3:442\n*S KotlinDebug\n*F\n+ 1 PayCodeOrderDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/paycode/PayCodeOrderDetailActivity\n*L\n136#1:431,10\n136#1:441\n*E\n"})
public final class PayCodeOrderDetailActivity extends BaseMvvmActivity<PayCodeOrderDetailResultViewModel> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f34787g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PayCodeOrderDetailBean f34790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0105b f34791f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@Nullable Context context, @Nullable String str, @Nullable String str2) {
            if (TextUtils.isEmpty(str) || context == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) PayCodeOrderDetailActivity.class);
            intent.putExtra("orderNo", str);
            intent.putExtra("extra_type", str2);
            context.startActivity(intent);
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static final OrderInfoForCustomerService m(PayCodeOrderDetailActivity payCodeOrderDetailActivity) {
        PayCodeOrderDetailBean payCodeOrderDetailBean = payCodeOrderDetailActivity.f34790e;
        if (payCodeOrderDetailBean == null) {
            return null;
        }
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        orderInfoForCustomerService.paymentType = payCodeOrderDetailActivity.getString(k.core_pay_code);
        Long l5 = payCodeOrderDetailBean.updateTime;
        orderInfoForCustomerService.time = l5 != null ? l5.longValue() : 0L;
        Long l6 = payCodeOrderDetailBean.amount;
        orderInfoForCustomerService.amount = l6 != null ? l6.longValue() : 0L;
        orderInfoForCustomerService.orderNumber = payCodeOrderDetailBean.orderNo;
        orderInfoForCustomerService.orderStatus = payCodeOrderDetailBean.orderStatusDesc;
        orderInfoForCustomerService.faqUrl = payCodeOrderDetailBean.faqLink;
        orderInfoForCustomerService.transType = payCodeOrderDetailBean.subTransType;
        orderInfoForCustomerService.paymentMethod = payCodeOrderDetailBean.payTypeDesc;
        return orderInfoForCustomerService;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f34788c)) {
            this.f34788c = getQueryParameter("orderNo");
        }
        C0105b c0105b = this.f34791f;
        if (c0105b != null) {
            ((OrderResultHeaderModel) c0105b.f666f).d(d.core_notification);
        }
        l lVar = ((PayCodeOrderDetailResultViewModel) l()).f35399f;
        if (lVar != null) {
            lVar.e(this, new s(new t(this, this, 11), (byte) 0, (char) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_pay_code_order_detail, (ViewGroup) null, false);
        int i7 = e.layoutResultAmountList;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = e.layoutResultInfoList;
            LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
            if (linearLayout2 != null) {
                i7 = e.modelCustomerService;
                OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) p059e1.a.m(i7, viewInflate);
                if (orderResultCustomerServiceModel != null) {
                    i7 = e.modelResultHeader;
                    OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) p059e1.a.m(i7, viewInflate);
                    if (orderResultHeaderModel != null) {
                        i7 = e.modelResultReceipt;
                        OrderResultViewReceiptModel orderResultViewReceiptModel = (OrderResultViewReceiptModel) p059e1.a.m(i7, viewInflate);
                        if (orderResultViewReceiptModel != null) {
                            i7 = e.scrollView;
                            if (((NestedScrollView) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = e.titleBar;
                                if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                    C0105b c0105b = new C0105b((LinearLayout) viewInflate, linearLayout, linearLayout2, orderResultCustomerServiceModel, orderResultHeaderModel, orderResultViewReceiptModel, 3);
                                    this.f34791f = c0105b;
                                    return c0105b;
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
        PayCodeOrderDetailResultViewModel payCodeOrderDetailResultViewModel = (PayCodeOrderDetailResultViewModel) l();
        String str = this.f34788c;
        t0 t0Var = payCodeOrderDetailResultViewModel.f35398e;
        if (t0Var != null && t0Var.isActive()) {
            F6.d.h("jobGetDetail cancel", 3, new Object[0]);
            t0 t0Var2 = payCodeOrderDetailResultViewModel.f35398e;
            if (t0Var2 != null) {
                t0Var2.cancel((CancellationException) null);
            }
        }
        payCodeOrderDetailResultViewModel.f35398e = p140j8.f.s(payCodeOrderDetailResultViewModel, new m0(str, null), payCodeOrderDetailResultViewModel.f35399f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundDark), true);
        C0105b c0105b = this.f34791f;
        if (c0105b != null) {
            ((OrderResultCustomerServiceModel) c0105b.f665e).setOnCustomerServiceModelListener(new p238pe.a(this));
        }
    }
}
