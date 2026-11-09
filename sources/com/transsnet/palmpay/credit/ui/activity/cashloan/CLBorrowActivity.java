package com.transsnet.palmpay.credit.ui.activity.cashloan;

import N8.q0;
import Pa.n0;
import Ya.e;
import Ya.f;
import Za.b;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowActivity;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p285sc.x;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit借款试算页", path = "/credit_score/cl_borrow_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLBorrowActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBorrowActivity extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f28871g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28873e = "CASH_LOAN";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28874f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public CLBorrowActivity() {
        final int i7 = 0;
        this.f28872d = C2131j.b(new Function0(this) { // from class: tb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowActivity f42472b;

            {
                this.f42472b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowActivity cLBorrowActivity = this.f42472b;
                switch (i7) {
                    case 0:
                        int i10 = CLBorrowActivity.f28871g;
                        return (PpTitleBar) cLBorrowActivity.findViewById(e.cl_borrow_mtb);
                    default:
                        int i11 = CLBorrowActivity.f28871g;
                        Intent intent = cLBorrowActivity.getIntent();
                        if (intent != null) {
                            return intent.getStringExtra("cl_loan_product");
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f28874f = C2131j.b(new Function0(this) { // from class: tb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowActivity f42472b;

            {
                this.f42472b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowActivity cLBorrowActivity = this.f42472b;
                switch (i10) {
                    case 0:
                        int i11 = CLBorrowActivity.f28871g;
                        return (PpTitleBar) cLBorrowActivity.findViewById(e.cl_borrow_mtb);
                    default:
                        int i12 = CLBorrowActivity.f28871g;
                        Intent intent = cLBorrowActivity.getIntent();
                        if (intent != null) {
                            return intent.getStringExtra("cl_loan_product");
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_bw_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (TextUtils.equals((String) this.f28874f.getValue(), "LOAN_WITHDRAW")) {
            q0.u("/main/home");
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        switch (event.getEventType()) {
            case MessageEvent.EVENT_CL_BORROW_SUCCESS /* 355 */:
            case MessageEvent.EVENT_CL_BORROW_PENDING /* 356 */:
            case MessageEvent.EVENT_CL_BORROW_FAILED /* 357 */:
                SPUtils.getInstance().put("cl_borrow_last_order_id", "");
                finish();
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        n0.g().v("PalmpayLoanTrialPage_LoanTrialPage");
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        BarUtils.setStatusBarLightMode(this, !isDarkMode());
        c.b().j(this);
        CLInstallmentBorrowFragment cLInstallmentBorrowFragment = new CLInstallmentBorrowFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("cl_account_type", getIntent().getIntExtra("cl_account_type", 7));
        cLInstallmentBorrowFragment.setArguments(bundle);
        Z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1161a c1161a = new C1161a(supportFragmentManager);
        c1161a.e(e.cl_borrow_fl, cLInstallmentBorrowFragment, null);
        c1161a.h(true);
        Object value = this.f28872d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setBackButtonClickListener(new x(this, 6));
    }
}
