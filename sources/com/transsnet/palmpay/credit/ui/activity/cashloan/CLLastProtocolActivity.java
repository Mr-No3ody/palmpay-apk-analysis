package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import N8.q0;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.bean.req.DoubleSignReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;
import p071ef.b;
import p294tb.C2056s;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit授信协议教育页", path = "/credit_score/cl_last_protocol_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLLastProtocolActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLLastProtocolActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f28939Y = 0;

    public static final void y(CLLastProtocolActivity cLLastProtocolActivity) {
        int i7;
        Integer num = cLLastProtocolActivity.f29250H;
        if (num == null || num.intValue() != 1) {
            cLLastProtocolActivity.u();
            return;
        }
        G.u(MessageEvent.EVENT_SIGN_PROTOCAL_CASH, c.b());
        OcApplyData ocApplyData = cLLastProtocolActivity.f29248B;
        if (TextUtils.equals("INSTALLMENT_LOAN", ocApplyData != null ? ocApplyData.getProduct() : null)) {
            i7 = 9;
        } else {
            OcApplyData ocApplyData2 = cLLastProtocolActivity.f29248B;
            i7 = TextUtils.equals("OK_CARD", ocApplyData2 != null ? ocApplyData2.getProduct() : null) ? 6 : 7;
        }
        String str = (i7 == 7 || i7 == 9) ? "LoanBorrowFlexiLoan" : "LoanBorrowHome";
        Bundle bundle = new Bundle();
        bundle.putInt("accountType", i7);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String str2 = Eb.a.f2267a;
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
        d.x(bundle, str);
        cLLastProtocolActivity.finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void goBackToHome() {
        q0.u("/main/home");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        goBackToHome();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String product;
        OcApplyData ocApplyData = this.f29248B;
        if (ocApplyData == null || (product = ocApplyData.getProduct()) == null) {
            product = "CASH_LOAN";
        }
        showLoadingDialog(true);
        G.h(p221ob.c.f40268a).querySignStatus(new DoubleSignReq(product)).k(f.f42629b).i(b.a()).subscribe(new C2056s(this, 0));
    }
}
