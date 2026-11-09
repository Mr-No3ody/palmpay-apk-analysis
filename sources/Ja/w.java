package Ja;

import C0.P;
import androidx.lifecycle.b0;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.verify.VerifySumbitAnswerRsp;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckSafetyAssessmentQAFragment f4686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CheckSafetyAssessmentQAFragment f4687c;

    public /* synthetic */ w(CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment, CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment2, int i7) {
        this.f4685a = i7;
        this.f4686b = checkSafetyAssessmentQAFragment;
        this.f4687c = checkSafetyAssessmentQAFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T t;
        CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment = this.f4687c;
        CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment2 = this.f4686b;
        switch (this.f4685a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (commonBeanResult.isSuccess() && (t = commonBeanResult.data) != 0) {
                        boolean zC = Intrinsics.c(((VerifySumbitAnswerRsp) t).isEnd, Boolean.TRUE);
                        b0 b0Var = checkSafetyAssessmentQAFragment.f28019w;
                        if (zC) {
                            CheckSafetyAssessmentQAFragment.a aVar = CheckSafetyAssessmentQAFragment.f28014A;
                            ((Ma.v) b0Var.getValue()).f5927e.k(((VerifySumbitAnswerRsp) commonBeanResult.data).finallyResultDTO);
                            P p3 = checkSafetyAssessmentQAFragment.f28018v;
                            if (p3 != null) {
                                p3.h(p025ba.e.fragmentSafetyAssessmentQaResult, null, null);
                            }
                        } else {
                            CheckSafetyAssessmentQAFragment.a aVar2 = CheckSafetyAssessmentQAFragment.f28014A;
                            ((Ma.v) b0Var.getValue()).f5926d.k(((VerifySumbitAnswerRsp) commonBeanResult.data).nextQuestionDTO);
                        }
                    } else if ("1110010106".equals(commonBeanResult.getRespCode())) {
                        checkSafetyAssessmentQAFragment.A();
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(false, true);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonResult.isSuccess()) {
                        PayVerificationCallback payVerificationCallbackU = checkSafetyAssessmentQAFragment.u();
                        if (payVerificationCallbackU != null) {
                            String str = checkSafetyAssessmentQAFragment.f28017p;
                            if (str == null) {
                                str = "";
                            }
                            payVerificationCallbackU.verifyPayMethod(str, 31);
                        }
                    } else if ("1110010106".equals(commonResult.getRespCode())) {
                        checkSafetyAssessmentQAFragment.A();
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(false, true);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof com.transsnet.palmpay.core.base.o) {
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(false, true);
                    PayVerificationActivity payVerificationActivityT = checkSafetyAssessmentQAFragment.t();
                    if (payVerificationActivityT != null) {
                        payVerificationActivityT.finish();
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    checkSafetyAssessmentQAFragment2.showLoadingDialog(false, true);
                    ((com.transsnet.palmpay.core.base.n) it3).getClass();
                    PayVerificationActivity payVerificationActivityT2 = checkSafetyAssessmentQAFragment.t();
                    if (payVerificationActivityT2 != null) {
                        payVerificationActivityT2.finish();
                    }
                }
                return Unit.f38893a;
        }
    }
}
