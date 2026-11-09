package p054dd;

import Pa.r0;
import Pd.f;
import Rd.C0605v;
import android.os.SystemClock;
import androidx.customview.widget.e;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashLoginActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashLoginActivity f35888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashLoginActivity f35889c;

    public /* synthetic */ k(Recharge2CashLoginActivity recharge2CashLoginActivity, Recharge2CashLoginActivity recharge2CashLoginActivity2, int i7) {
        this.f35887a = i7;
        this.f35888b = recharge2CashLoginActivity;
        this.f35889c = recharge2CashLoginActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Recharge2CashLoginActivity recharge2CashLoginActivity = this.f35889c;
        Recharge2CashLoginActivity recharge2CashLoginActivity2 = this.f35888b;
        switch (this.f35887a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    recharge2CashLoginActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    recharge2CashLoginActivity2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((p) it).f27360a;
                    if (commonResult.isSuccess()) {
                        h.x(recharge2CashLoginActivity, r0.H0(f.qt_airtime_str_send_successfully));
                        int i7 = Recharge2CashLoginActivity.f33122i;
                        recharge2CashLoginActivity.f33126g = SystemClock.elapsedRealtime() + 60000;
                        recharge2CashLoginActivity.getUIHandler().postDelayed(new e(recharge2CashLoginActivity, 24), 500L);
                    } else {
                        Recharge2CashLoginActivity.n(recharge2CashLoginActivity);
                        h.x(recharge2CashLoginActivity, commonResult.getRespMsg());
                    }
                } else if (it instanceof m) {
                    recharge2CashLoginActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    recharge2CashLoginActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    ((n) it).getClass();
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    recharge2CashLoginActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    recharge2CashLoginActivity2.showLoadingDialog(false, true);
                    CommonResult commonResult2 = (CommonResult) ((p) it2).f27360a;
                    if (commonResult2.isSuccess()) {
                        h.x(recharge2CashLoginActivity, "Login Successfully");
                        recharge2CashLoginActivity.setResult(-1);
                        recharge2CashLoginActivity.finish();
                    } else {
                        int i10 = Recharge2CashLoginActivity.f33122i;
                        C0605v c0605v = (C0605v) recharge2CashLoginActivity.f27334c;
                        if (c0605v != null) {
                            c0605v.f8531g.setText(commonResult2.getRespMsg());
                        }
                        C0605v c0605v2 = (C0605v) recharge2CashLoginActivity.f27334c;
                        if (c0605v2 != null) {
                            h.s(c0605v2.f8531g, true);
                        }
                    }
                    int i11 = Recharge2CashLoginActivity.f33122i;
                    C0605v c0605v3 = (C0605v) recharge2CashLoginActivity.f27334c;
                    if (c0605v3 != null) {
                        c0605v3.f8526b.b(false);
                    }
                } else if (it2 instanceof m) {
                    recharge2CashLoginActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    recharge2CashLoginActivity2.showLoadingDialog(false, true);
                    h.x(recharge2CashLoginActivity, ((n) it2).f27358a);
                    int i12 = Recharge2CashLoginActivity.f33122i;
                    C0605v c0605v4 = (C0605v) recharge2CashLoginActivity.f27334c;
                    if (c0605v4 != null) {
                        c0605v4.f8526b.b(false);
                    }
                }
                return Unit.f38893a;
        }
    }
}
