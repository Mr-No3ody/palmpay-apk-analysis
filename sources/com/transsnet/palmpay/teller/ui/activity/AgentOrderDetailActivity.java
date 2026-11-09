package com.transsnet.palmpay.teller.ui.activity;

import L6.b;
import Pd.c;
import Rd.C0585a;
import T8.o;
import Wd.C0727a;
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
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.teller.bean.AgentOrderDetailRsp;
import com.transsnet.palmpay.teller.viewmodel.AgentOrderDetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p025ba.d;
import p086fe.C1654a;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/quick_teller/pp_online_agent_detail")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/AgentOrderDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/AgentOrderDetailViewModel;", "LRd/a;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAgentOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentOrderDetailActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/AgentOrderDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n260#2,10:310\n296#2:320\n1#3:321\n*S KotlinDebug\n*F\n+ 1 AgentOrderDetailActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/AgentOrderDetailActivity\n*L\n128#1:310,10\n128#1:320\n*E\n"})
public final class AgentOrderDetailActivity extends BaseMvvmVBActivity<AgentOrderDetailViewModel, C0585a> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f34139i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AgentOrderDetailRsp.DataBean f34142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34143g = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@Nullable Context context, @Nullable String str, @Nullable String str2) {
            if (TextUtils.isEmpty(str) || context == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) AgentOrderDetailActivity.class);
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

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f34140d)) {
            this.f34140d = getQueryParameter("orderNo");
        }
        C0585a c0585a = (C0585a) this.f27334c;
        if (c0585a != null) {
            c0585a.f8203e.d(d.core_notification);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(Pd.d.qt_activity_agent_order_detail, (ViewGroup) null, false);
        int i7 = c.layout_result_amount_list;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = c.layout_result_info_list;
            LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
            if (linearLayout2 != null) {
                i7 = c.model_order_result_customer_service;
                OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) p059e1.a.m(i7, viewInflate);
                if (orderResultCustomerServiceModel != null) {
                    i7 = c.model_order_result_header;
                    OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) p059e1.a.m(i7, viewInflate);
                    if (orderResultHeaderModel != null) {
                        i7 = c.scrollView;
                        if (((NestedScrollView) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = c.title_bar;
                            if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                C0585a c0585a = new C0585a((LinearLayout) viewInflate, linearLayout, linearLayout2, orderResultCustomerServiceModel, orderResultHeaderModel);
                                Intrinsics.checkNotNullExpressionValue(c0585a, "inflate(...)");
                                return c0585a;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String orderNo = this.f34140d;
        if (orderNo != null) {
            AgentOrderDetailViewModel agentOrderDetailViewModel = (AgentOrderDetailViewModel) l();
            agentOrderDetailViewModel.getClass();
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            f.v(agentOrderDetailViewModel, new C1654a(orderNo, null), agentOrderDetailViewModel.f34383e, 0L);
        }
        l lVar = ((AgentOrderDetailViewModel) l()).f34383e;
        if (lVar != null) {
            lVar.e(this, new T8.f(new o(7, this, this), (char) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundDark), !isDarkMode());
        C0585a c0585a = (C0585a) this.f27334c;
        if (c0585a != null) {
            c0585a.f8202d.d(Boolean.FALSE);
        }
        C0585a c0585a2 = (C0585a) this.f27334c;
        if (c0585a2 != null) {
            c0585a2.f8202d.setOnCustomerServiceModelListener(new C0727a(this));
        }
    }
}
