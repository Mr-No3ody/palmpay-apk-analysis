package p024b9;

import C0.AbstractC0130w;
import F8.d;
import Pa.n0;
import com.transsnet.palmpay.account.bean.ApplyForTier3Req;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p051d9.C1628z;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f18791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryAddressFromBillRsp f18792c;

    public /* synthetic */ a(d dVar, QueryAddressFromBillRsp queryAddressFromBillRsp, int i7) {
        this.f18790a = i7;
        this.f18791b = dVar;
        this.f18792c = queryAddressFromBillRsp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18790a) {
            case 0:
                n0.g().l("PalmPay_KYCT3SubmitClick");
                d dVar = this.f18791b;
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity = dVar.f18797b;
                ApplyForTier3Req applyForTier3ReqBuildRequestFromParsedAddress = d.f18795f.buildRequestFromParsedAddress(palmPayLevelUpTier3V2Activity, this.f18792c, palmPayLevelUpTier3V2Activity != null ? palmPayLevelUpTier3V2Activity.f25917b : null);
                C1628z c1628z = (C1628z) dVar.f18798c.invoke();
                if (c1628z != null) {
                    c1628z.submitApplication(applyForTier3ReqBuildRequestFromParsedAddress);
                }
                break;
            default:
                d dVar2 = this.f18791b;
                QueryAddressFromBillRsp queryAddressFromBillRsp = this.f18792c;
                if (queryAddressFromBillRsp == null) {
                    dVar2.getClass();
                } else {
                    dVar2.a(queryAddressFromBillRsp);
                    AbstractC0130w abstractC0130w = (AbstractC0130w) dVar2.f18799d.invoke();
                    if (abstractC0130w != null) {
                        abstractC0130w.h(d.fragment_tier3_step_address, null, PalmPayLevelUpTier3V2Activity.a.buildSlideNavOptions$default(PalmPayLevelUpTier3V2Activity.f25915o, null, false, 3, null));
                    }
                }
                break;
        }
        return Unit.f38893a;
    }
}
