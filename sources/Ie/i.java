package Ie;

import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckPalmPayOtpFragment;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.ui.dialog.BillerCouponListDialog;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4353c;

    public /* synthetic */ i(Object obj, int i7, int i10) {
        this.f4351a = i10;
        this.f4353c = obj;
        this.f4352b = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4351a) {
            case 0:
                j jVar = (j) this.f4353c;
                int i7 = this.f4352b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                F6.d.h(d0.q("preCheckFinanceTab >>> intercept=", zBooleanValue), 3, new Object[0]);
                if (!zBooleanValue) {
                    Eb.a.f2267a = LoanHomeSource.INSTANCE.normalize(LoanHomeSource.BOTTOM_TAB);
                    if (com.facebook.imagepipeline.nativecode.b.G(LoanHomeSource.BOTTOM_TAB)) {
                        return Unit.f38893a;
                    }
                    jVar.f4358a.H(i7);
                    jVar.f4355B = i7;
                    jVar.e(i7);
                }
                return Unit.f38893a;
            case 1:
                W3.f rsp = (W3.f) obj;
                FlexiBankCheckPalmPayOtpFragment.a aVar = FlexiBankCheckPalmPayOtpFragment.f22023p;
                Intrinsics.checkNotNullParameter(rsp, "rsp");
                boolean zC = rsp.c();
                FlexiBankCheckPalmPayOtpFragment flexiBankCheckPalmPayOtpFragment = (FlexiBankCheckPalmPayOtpFragment) this.f4353c;
                if (zC) {
                    flexiBankCheckPalmPayOtpFragment.getClass();
                    if (this.f4352b == 0) {
                        try {
                            Intrinsics.e(SmsRetriever.getClient(flexiBankCheckPalmPayOtpFragment.requireContext()).startSmsRetriever());
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    ToastUtils.showLong(com.flexibank.sdk.r.fb_one_time_code_sent);
                } else {
                    x4.i iVar = (x4.i) flexiBankCheckPalmPayOtpFragment.f21944f;
                    if (iVar != null) {
                        iVar.f43616c.setSendOtcButtonState(true);
                    }
                    x4.i iVar2 = (x4.i) flexiBankCheckPalmPayOtpFragment.f21944f;
                    if (iVar2 != null) {
                        iVar2.f43616c.setError(rsp.b());
                    }
                }
                return Unit.f38893a;
            default:
                return BillerCouponListDialog.initViews$lambda$2$lambda$1((BillerCouponListDialog) this.f4353c, this.f4352b, (BillerCouponItemBean) obj);
        }
    }
}
