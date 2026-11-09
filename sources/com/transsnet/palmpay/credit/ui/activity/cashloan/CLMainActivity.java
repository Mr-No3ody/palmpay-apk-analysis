package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Ab.y;
import Pa.n0;
import Ya.f;
import android.os.Bundle;
import android.view.Window;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.interfaces.CLActiveInterface;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideCashOpenFragment;
import df.d;
import io.reactivex.internal.operators.observable.C1765q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p071ef.b;
import p161kf.e;
import p294tb.C2057t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit首页(已废弃)", path = "/credit_score/cl_main_activity")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLMainActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/cashloan/a;", "Lcom/transsnet/palmpay/credit/interfaces/CLActiveInterface;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLMainActivity extends com.transsnet.palmpay.credit.ui.activity.cashloan.a implements CLActiveInterface {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f28940q0 = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public CLMainData f28941M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public InstallmentLoanMainPageData f28942Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public CLMainFragment f28943X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public OcGuideCashOpenFragment f28944Y;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f28946k0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Integer f28945Z = -1000;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f28947p0 = true;

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

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    @Override // com.transsnet.palmpay.credit.interfaces.CLActiveInterface
    public final void activeCashLoan(String str) {
        boolean z3;
        if (str == null) {
            str = "CASH_LOAN";
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f29209v = str;
        CLMainData cLMainData = this.f28941M;
        if (!(cLMainData != null ? Intrinsics.c(cLMainData.getInstallmentUserA(), Boolean.TRUE) : false)) {
            CLMainData cLMainData2 = this.f28941M;
            z3 = cLMainData2 != null ? Intrinsics.c(cLMainData2.getInstallmentUserC(), Boolean.TRUE) : false;
        }
        this.f29197B = z3;
        com.transsnet.palmpay.credit.ui.activity.cashloan.a.o(this, "");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_main_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        getWindow().addFlags(67108864);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.cashloan.a, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.cashloan.a
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType != 355 && eventType != 356 && eventType != 358 && eventType != 359 && eventType != 361) {
            if (eventType == 372) {
                finish();
                return;
            }
            if (eventType != 546) {
                if (eventType == 549) {
                    this.f28946k0 = true;
                    v();
                    return;
                } else if (eventType != 368 && eventType != 369) {
                    return;
                }
            }
        }
        this.f28946k0 = true;
        v();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f28947p0 = false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        PushMessage.Content content;
        if (pushMessage == null || (content = pushMessage.content) == null) {
            return;
        }
        if (PushMessage.MESSAGE_TYPE_CL_APPLY_SUCCESS.equalsIgnoreCase(content.messageType) || "5065".equalsIgnoreCase(pushMessage.content.messageType) || "5066".equalsIgnoreCase(pushMessage.content.messageType) || "5067".equalsIgnoreCase(pushMessage.content.messageType)) {
            v();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f28946k0) {
            this.f28946k0 = false;
            v();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        this.f28947p0 = true;
        v();
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.cashloan.a, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        n0.g().v("PalmpayCashLoanHomePage_CashLoanHomePage");
    }

    public final void v() {
        p221ob.a aVar = p221ob.c.f40268a;
        aVar.getInstance().getClass();
        d<CLMainResp> cashLoanNew = p221ob.c.a().getCashLoanNew();
        aVar.getInstance().getClass();
        C1765q c1765qI = cashLoanNew.l(p221ob.c.a().getInstallmentLoanMainPage(), new p287se.d(new y(27), 2)).k(p298tf.f.f42629b).i(b.a());
        e eVar = new e(new p287se.d(new C2057t(this, 0), 3), new p287se.d(new C2057t(this, 1), 4), p147jf.a.f38599c);
        c1765qI.subscribe(eVar);
        addSubscription(eVar);
    }
}
