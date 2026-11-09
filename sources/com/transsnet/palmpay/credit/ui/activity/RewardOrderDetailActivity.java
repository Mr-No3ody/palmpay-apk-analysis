package com.transsnet.palmpay.credit.ui.activity;

import Db.D;
import L6.b;
import Ya.e;
import Ya.f;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.activity.RewardOrderDetailActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.RewardOrderDetailViewModel;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p141j9.s;
import p284sb.M;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/reward_order_detail_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/RewardOrderDetailActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/RewardOrderDetailViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRewardOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RewardOrderDetailActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/RewardOrderDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,123:1\n171#2,12:124\n215#2:136\n*S KotlinDebug\n*F\n+ 1 RewardOrderDetailActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/RewardOrderDetailActivity\n*L\n63#1:124,12\n63#1:136\n*E\n"})
public final class RewardOrderDetailActivity extends CreditBaseMvvmActivity<RewardOrderDetailViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28778j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28780g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28781i;

    public RewardOrderDetailActivity() {
        final int i7 = 0;
        this.f28779f = C2131j.b(new Function0(this) { // from class: sb.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardOrderDetailActivity f42131b;

            {
                this.f42131b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RewardOrderDetailActivity rewardOrderDetailActivity = this.f42131b;
                switch (i7) {
                    case 0:
                        int i10 = RewardOrderDetailActivity.f28778j;
                        return (OrderResultCustomerServiceModel) rewardOrderDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 1:
                        int i11 = RewardOrderDetailActivity.f28778j;
                        return (LinearLayout) rewardOrderDetailActivity.findViewById(e.ll_container_middle);
                    default:
                        int i12 = RewardOrderDetailActivity.f28778j;
                        return (OrderResultHeaderModel) rewardOrderDetailActivity.findViewById(e.orlm_heaer);
                }
            }
        });
        final int i10 = 1;
        this.f28780g = C2131j.b(new Function0(this) { // from class: sb.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardOrderDetailActivity f42131b;

            {
                this.f42131b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RewardOrderDetailActivity rewardOrderDetailActivity = this.f42131b;
                switch (i10) {
                    case 0:
                        int i11 = RewardOrderDetailActivity.f28778j;
                        return (OrderResultCustomerServiceModel) rewardOrderDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 1:
                        int i12 = RewardOrderDetailActivity.f28778j;
                        return (LinearLayout) rewardOrderDetailActivity.findViewById(e.ll_container_middle);
                    default:
                        int i13 = RewardOrderDetailActivity.f28778j;
                        return (OrderResultHeaderModel) rewardOrderDetailActivity.findViewById(e.orlm_heaer);
                }
            }
        });
        final int i11 = 2;
        this.f28781i = C2131j.b(new Function0(this) { // from class: sb.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardOrderDetailActivity f42131b;

            {
                this.f42131b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RewardOrderDetailActivity rewardOrderDetailActivity = this.f42131b;
                switch (i11) {
                    case 0:
                        int i12 = RewardOrderDetailActivity.f28778j;
                        return (OrderResultCustomerServiceModel) rewardOrderDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 1:
                        int i13 = RewardOrderDetailActivity.f28778j;
                        return (LinearLayout) rewardOrderDetailActivity.findViewById(e.ll_container_middle);
                    default:
                        int i14 = RewardOrderDetailActivity.f28778j;
                        return (OrderResultHeaderModel) rewardOrderDetailActivity.findViewById(e.orlm_heaer);
                }
            }
        });
    }

    public static final OrderResultHeaderModel n(RewardOrderDetailActivity rewardOrderDetailActivity) {
        Object value = rewardOrderDetailActivity.f28781i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OrderResultHeaderModel) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_activity_reward_order_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((RewardOrderDetailViewModel) l()).f30705e;
        if (lVar != null) {
            lVar.e(this, new s(new p141j9.t(this, this, 18), (char) 0, (char) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        RewardOrderDetailViewModel rewardOrderDetailViewModel = (RewardOrderDetailViewModel) l();
        String stringExtra = getIntent().getStringExtra("orderId");
        rewardOrderDetailViewModel.getClass();
        p140j8.f.s(rewardOrderDetailViewModel, new D(stringExtra, null), rewardOrderDetailViewModel.f30705e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(b.ppColorBackgroundDark), true);
        t tVar = this.f28779f;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((OrderResultCustomerServiceModel) value).d(Boolean.FALSE);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((OrderResultCustomerServiceModel) value2).setListener(new M());
    }
}
