package p341wd;

import android.widget.LinearLayout;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableHomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43432b;

    public /* synthetic */ o(ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity, int i7) {
        this.f43431a = i7;
        this.f43432b = scheduleTransferForBankUnstableHomeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43432b;
        switch (this.f43431a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof p) {
                        VerifyPaymentInfoRsp verifyPaymentInfoRsp = (VerifyPaymentInfoRsp) ((p) it).f27360a;
                        int i7 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        scheduleTransferForBankUnstableHomeActivity.z(verifyPaymentInfoRsp, false);
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        String str = ((n) it).f27358a;
                        int i10 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        scheduleTransferForBankUnstableHomeActivity.y();
                        LinearLayout linearLayoutV = scheduleTransferForBankUnstableHomeActivity.v();
                        if (linearLayoutV != null) {
                            h.C(linearLayoutV);
                        }
                        scheduleTransferForBankUnstableHomeActivity.f33459k0 = null;
                        scheduleTransferForBankUnstableHomeActivity.A(str, true);
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof p) {
                        VerifyPaymentInfoRsp verifyPaymentInfoRsp2 = (VerifyPaymentInfoRsp) ((p) it2).f27360a;
                        int i11 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        scheduleTransferForBankUnstableHomeActivity.z(verifyPaymentInfoRsp2, true);
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        String str2 = ((n) it2).f27358a;
                        int i12 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        scheduleTransferForBankUnstableHomeActivity.y();
                        LinearLayout linearLayoutV2 = scheduleTransferForBankUnstableHomeActivity.v();
                        if (linearLayoutV2 != null) {
                            h.C(linearLayoutV2);
                        }
                        scheduleTransferForBankUnstableHomeActivity.f33459k0 = null;
                        scheduleTransferForBankUnstableHomeActivity.A(str2, true);
                    }
                }
                return Unit.f38893a;
        }
    }
}
