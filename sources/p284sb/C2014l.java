package p284sb;

import Pa.F;
import Pa.i0;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.rsp.CommonLinkRsp;
import com.transsnet.palmpay.credit.ui.activity.LoanDeepLinkEntryActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p355xf.l;

/* JADX INFO: renamed from: sb.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2014l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoanDeepLinkEntryActivity f42171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LoanDeepLinkEntryActivity f42172c;

    public /* synthetic */ C2014l(LoanDeepLinkEntryActivity loanDeepLinkEntryActivity, LoanDeepLinkEntryActivity loanDeepLinkEntryActivity2, int i7) {
        this.f42170a = i7;
        this.f42171b = loanDeepLinkEntryActivity;
        this.f42172c = loanDeepLinkEntryActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42170a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                LoanDeepLinkEntryActivity loanDeepLinkEntryActivity = this.f42171b;
                if (z3) {
                    loanDeepLinkEntryActivity.showLoadingDialog(true, true);
                } else {
                    boolean z8 = it instanceof p;
                    LoanDeepLinkEntryActivity loanDeepLinkEntryActivity2 = this.f42172c;
                    if (z8) {
                        loanDeepLinkEntryActivity.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        if (!commonBeanResult.isSuccess()) {
                            ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
                        }
                        if (!TextUtils.isEmpty(((CommonLinkRsp) commonBeanResult.data).getDeeplink())) {
                            F.g(loanDeepLinkEntryActivity2, ((CommonLinkRsp) commonBeanResult.data).getDeeplink());
                        } else if (ActivityUtils.getActivityList().size() == 1) {
                            i0.H(null);
                        }
                        loanDeepLinkEntryActivity2.finish();
                    } else if (it instanceof m) {
                        loanDeepLinkEntryActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        loanDeepLinkEntryActivity.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                        loanDeepLinkEntryActivity2.finish();
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z10 = it2 instanceof o;
                LoanDeepLinkEntryActivity loanDeepLinkEntryActivity3 = this.f42171b;
                if (z10) {
                    loanDeepLinkEntryActivity3.showLoadingDialog(true, true);
                } else {
                    boolean z11 = it2 instanceof p;
                    LoanDeepLinkEntryActivity loanDeepLinkEntryActivity4 = this.f42172c;
                    if (z11) {
                        loanDeepLinkEntryActivity3.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                        if (!commonBeanResult2.isSuccess()) {
                            ToastUtils.showLong(commonBeanResult2.getRespMsg(), new Object[0]);
                        }
                        if (!TextUtils.isEmpty(((CommonLinkRsp) commonBeanResult2.data).getDeeplink())) {
                            F.g(loanDeepLinkEntryActivity4, ((CommonLinkRsp) commonBeanResult2.data).getDeeplink());
                        } else if (ActivityUtils.getActivityList().size() == 1) {
                            i0.H(null);
                        }
                        loanDeepLinkEntryActivity4.finish();
                    } else if (it2 instanceof m) {
                        loanDeepLinkEntryActivity3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        loanDeepLinkEntryActivity3.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        loanDeepLinkEntryActivity4.finish();
                    }
                }
                return Unit.f38893a;
        }
    }
}
