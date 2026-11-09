package com.transsnet.palmpay.send_money.ui.activity;

import C0.G;
import Kd.C0373f;
import L6.b;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.CompensationDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.CompensationDetailActivity;
import com.transsnet.palmpay.send_money.viewmodel.CompensationViewModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p141j9.s;
import p159kd.e;
import p159kd.f;
import p173ld.o;
import p270rd.C1963f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/compensation_detail")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/CompensationDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/CompensationViewModel;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompensationDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompensationDetailActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/CompensationDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,334:1\n171#2,12:335\n215#2:347\n*S KotlinDebug\n*F\n+ 1 CompensationDetailActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/CompensationDetailActivity\n*L\n98#1:335,12\n98#1:347\n*E\n"})
public final class CompensationDetailActivity extends BaseMvvmActivity<CompensationViewModel> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f33164o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33169g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CompensationDetailResp f33171j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startActivity(@NotNull Context context, @Nullable String str) {
            context.startActivity(G.e(context, "context", context, CompensationDetailActivity.class).putExtra("orderId", str));
        }

        private a() {
        }

        @JvmStatic
        public final void startActivity(@NotNull Context context, @Nullable String str, int i7) {
            context.startActivity(G.e(context, "context", context, CompensationDetailActivity.class).putExtra("orderId", str).putExtra("orderType", i7));
        }
    }

    static {
        new a(null);
    }

    public CompensationDetailActivity() {
        final int i7 = 0;
        this.f33165c = C2131j.b(new Function0(this) { // from class: rd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompensationDetailActivity f41739b;

            {
                this.f41739b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CompensationDetailActivity compensationDetailActivity = this.f41739b;
                switch (i7) {
                    case 0:
                        int i10 = CompensationDetailActivity.f33164o;
                        return (OrderResultCustomerServiceModel) compensationDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 1:
                        int i11 = CompensationDetailActivity.f33164o;
                        return (LinearLayout) compensationDetailActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i12 = CompensationDetailActivity.f33164o;
                        return (LinearLayout) compensationDetailActivity.findViewById(e.ll_fee_detail);
                    case 3:
                        int i13 = CompensationDetailActivity.f33164o;
                        return (OrderResultHeaderModel) compensationDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i14 = CompensationDetailActivity.f33164o;
                        return (PpTitleBar) compensationDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i10 = 1;
        this.f33166d = C2131j.b(new Function0(this) { // from class: rd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompensationDetailActivity f41739b;

            {
                this.f41739b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CompensationDetailActivity compensationDetailActivity = this.f41739b;
                switch (i10) {
                    case 0:
                        int i11 = CompensationDetailActivity.f33164o;
                        return (OrderResultCustomerServiceModel) compensationDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 1:
                        int i12 = CompensationDetailActivity.f33164o;
                        return (LinearLayout) compensationDetailActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i13 = CompensationDetailActivity.f33164o;
                        return (LinearLayout) compensationDetailActivity.findViewById(e.ll_fee_detail);
                    case 3:
                        int i14 = CompensationDetailActivity.f33164o;
                        return (OrderResultHeaderModel) compensationDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i15 = CompensationDetailActivity.f33164o;
                        return (PpTitleBar) compensationDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i11 = 2;
        this.f33167e = C2131j.b(new Function0(this) { // from class: rd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompensationDetailActivity f41739b;

            {
                this.f41739b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CompensationDetailActivity compensationDetailActivity = this.f41739b;
                switch (i11) {
                    case 0:
                        int i12 = CompensationDetailActivity.f33164o;
                        return (OrderResultCustomerServiceModel) compensationDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 1:
                        int i13 = CompensationDetailActivity.f33164o;
                        return (LinearLayout) compensationDetailActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i14 = CompensationDetailActivity.f33164o;
                        return (LinearLayout) compensationDetailActivity.findViewById(e.ll_fee_detail);
                    case 3:
                        int i15 = CompensationDetailActivity.f33164o;
                        return (OrderResultHeaderModel) compensationDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i16 = CompensationDetailActivity.f33164o;
                        return (PpTitleBar) compensationDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i12 = 3;
        this.f33168f = C2131j.b(new Function0(this) { // from class: rd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompensationDetailActivity f41739b;

            {
                this.f41739b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CompensationDetailActivity compensationDetailActivity = this.f41739b;
                switch (i12) {
                    case 0:
                        int i13 = CompensationDetailActivity.f33164o;
                        return (OrderResultCustomerServiceModel) compensationDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 1:
                        int i14 = CompensationDetailActivity.f33164o;
                        return (LinearLayout) compensationDetailActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i15 = CompensationDetailActivity.f33164o;
                        return (LinearLayout) compensationDetailActivity.findViewById(e.ll_fee_detail);
                    case 3:
                        int i16 = CompensationDetailActivity.f33164o;
                        return (OrderResultHeaderModel) compensationDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i17 = CompensationDetailActivity.f33164o;
                        return (PpTitleBar) compensationDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i13 = 4;
        this.f33169g = C2131j.b(new Function0(this) { // from class: rd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompensationDetailActivity f41739b;

            {
                this.f41739b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CompensationDetailActivity compensationDetailActivity = this.f41739b;
                switch (i13) {
                    case 0:
                        int i14 = CompensationDetailActivity.f33164o;
                        return (OrderResultCustomerServiceModel) compensationDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 1:
                        int i15 = CompensationDetailActivity.f33164o;
                        return (LinearLayout) compensationDetailActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i16 = CompensationDetailActivity.f33164o;
                        return (LinearLayout) compensationDetailActivity.findViewById(e.ll_fee_detail);
                    case 3:
                        int i17 = CompensationDetailActivity.f33164o;
                        return (OrderResultHeaderModel) compensationDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i18 = CompensationDetailActivity.f33164o;
                        return (PpTitleBar) compensationDetailActivity.findViewById(e.title_bar);
                }
            }
        });
    }

    public static OrderResultItemModel m(CompensationDetailActivity compensationDetailActivity, String str, String str2) {
        compensationDetailActivity.getClass();
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(compensationDetailActivity, 1002, str, str2);
        Object value = compensationDetailActivity.f33166d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LinearLayout) value).addView(orderResultItemModel);
        return orderResultItemModel;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_compensation_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((CompensationViewModel) l()).f33967e;
        if (lVar != null) {
            lVar.e(this, new s(new p141j9.t(this, this, 12), (byte) 0, 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    public final OrderResultHeaderModel n() {
        Object value = this.f33168f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OrderResultHeaderModel) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("orderId");
        this.f33170i = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.f33170i = getQueryParameter("orderId");
        }
        if (TextUtils.isEmpty(this.f33170i)) {
            return;
        }
        showLoadingDialog(true);
        CompensationViewModel compensationViewModel = (CompensationViewModel) l();
        String str = this.f33170i;
        compensationViewModel.getClass();
        p140j8.f.s(compensationViewModel, new C0373f(str, null), compensationViewModel.f33967e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        Object value = this.f33165c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((OrderResultCustomerServiceModel) value).setOnCustomerServiceModelListener(new C1963f(this));
        Object value2 = this.f33169g.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PpTitleBar) value2).setBackButtonClickListener(new o(this, 14));
    }
}
