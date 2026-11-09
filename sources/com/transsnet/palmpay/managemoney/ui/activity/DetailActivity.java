package com.transsnet.palmpay.managemoney.ui.activity;

import N8.q0;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderDetailFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderPreFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.TransactionDetailFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.PlanDetailViewModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/detail_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/DetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/PlanDetailViewModel;", "<init>", "()V", "DetailType", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DetailActivity extends BaseMvvmActivity<PlanDetailViewModel> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32086e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32088d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/DetailActivity$DetailType;", "", "<init>", "()V", "Companion", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    public @interface DetailType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int ORDER = 2;
        public static final int ORDER_PRE = 3;
        public static final int TRANSACTION = 1;

        /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.DetailActivity$DetailType$a, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ORDER = 2;
            public static final int ORDER_PRE = 3;
            public static final int TRANSACTION = 1;

            private Companion() {
            }
        }
    }

    public DetailActivity() {
        final int i7 = 0;
        this.f32087c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailActivity f32266b;

            {
                this.f32266b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DetailActivity detailActivity = this.f32266b;
                switch (i7) {
                    case 0:
                        int i10 = DetailActivity.f32086e;
                        return Integer.valueOf(detailActivity.getIntent().getIntExtra("detail_type", 1));
                    default:
                        int i11 = DetailActivity.f32086e;
                        return Integer.valueOf(detailActivity.getIntent().getIntExtra("order_detail_type", 1));
                }
            }
        });
        final int i10 = 1;
        this.f32088d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailActivity f32266b;

            {
                this.f32266b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DetailActivity detailActivity = this.f32266b;
                switch (i10) {
                    case 0:
                        int i11 = DetailActivity.f32086e;
                        return Integer.valueOf(detailActivity.getIntent().getIntExtra("detail_type", 1));
                    default:
                        int i12 = DetailActivity.f32086e;
                        return Integer.valueOf(detailActivity.getIntent().getIntExtra("order_detail_type", 1));
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_transaction_detail_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(m() == 2 ? -1 : getColor(Jc.a.mm_color_f6f6fa), true);
    }

    public final int m() {
        return ((Number) this.f32087c.getValue()).intValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (m() != 2 || ((Number) this.f32088d.getValue()).intValue() != 1) {
            super.onBackPressed();
        } else {
            ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        if (m() == 1) {
            Z supportFragmentManager = getSupportFragmentManager();
            C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
            c1161aE.e(Jc.c.container, TransactionDetailFragment.f32562M.newInstance(getIntent().getStringExtra("orderNo"), getIntent().getStringExtra("transType")), null);
            c1161aE.h(true);
            return;
        }
        if (m() == 2) {
            Z supportFragmentManager2 = getSupportFragmentManager();
            C1161a c1161aE2 = q0.e(supportFragmentManager2, supportFragmentManager2);
            c1161aE2.e(Jc.c.container, OrderDetailFragment.f32510k0.newInstance(getIntent().getStringExtra("orderNo"), ((Number) this.f32088d.getValue()).intValue(), getIntent().getStringExtra("transType")), null);
            c1161aE2.h(true);
            return;
        }
        if (m() == 3) {
            Z supportFragmentManager3 = getSupportFragmentManager();
            C1161a c1161aE3 = q0.e(supportFragmentManager3, supportFragmentManager3);
            c1161aE3.e(Jc.c.container, OrderPreFragment.f32526Q.newInstance((ProductBean) getIntent().getParcelableExtra("product_bean"), (GetBeforeOrderResp.StateInfo) getIntent().getParcelableExtra("state_info")), null);
            c1161aE3.h(true);
        }
    }
}
