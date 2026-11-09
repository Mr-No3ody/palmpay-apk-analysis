package Ja;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckFraudAlertFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ja.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0341n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckFraudAlertFragment f4667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CheckFraudAlertFragment f4668c;

    public /* synthetic */ C0341n(CheckFraudAlertFragment checkFraudAlertFragment, CheckFraudAlertFragment checkFraudAlertFragment2, int i7) {
        this.f4666a = i7;
        this.f4667b = checkFraudAlertFragment;
        this.f4668c = checkFraudAlertFragment2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CheckFraudAlertFragment checkFraudAlertFragment;
        PayVerificationCallback payVerificationCallbackU;
        switch (this.f4666a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                CheckFraudAlertFragment checkFraudAlertFragment2 = this.f4667b;
                if (z3) {
                    checkFraudAlertFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    checkFraudAlertFragment2.showLoadingDialog(false, true);
                    if (((CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a).isSuccess() && (payVerificationCallbackU = (checkFraudAlertFragment = this.f4668c).u()) != null) {
                        String str = checkFraudAlertFragment.t;
                        if (str == null) {
                            str = "";
                        }
                        payVerificationCallbackU.verifyPayMethod(str, 30);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    checkFraudAlertFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    checkFraudAlertFragment2.showLoadingDialog(false, true);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                CheckFraudAlertFragment checkFraudAlertFragment3 = this.f4667b;
                if (z8) {
                    checkFraudAlertFragment3.showLoadingDialog(true, true);
                } else {
                    boolean z10 = it2 instanceof com.transsnet.palmpay.core.base.p;
                    CheckFraudAlertFragment checkFraudAlertFragment4 = this.f4668c;
                    if (z10) {
                        checkFraudAlertFragment3.showLoadingDialog(false, true);
                        PayVerificationActivity payVerificationActivityT = checkFraudAlertFragment4.t();
                        if (payVerificationActivityT != null) {
                            payVerificationActivityT.finish();
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        checkFraudAlertFragment3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        checkFraudAlertFragment3.showLoadingDialog(false, true);
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                        PayVerificationActivity payVerificationActivityT2 = checkFraudAlertFragment4.t();
                        if (payVerificationActivityT2 != null) {
                            payVerificationActivityT2.finish();
                        }
                    }
                }
                return Unit.f38893a;
        }
    }
}
