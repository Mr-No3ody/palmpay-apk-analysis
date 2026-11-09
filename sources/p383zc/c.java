package p383zc;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnRichDialog;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f44636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f44637c;

    public /* synthetic */ c(m mVar, String str, int i7) {
        this.f44635a = i7;
        this.f44636b = mVar;
        this.f44637c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44635a) {
            case 0:
                CommonResult it = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ReferEarnHomePageContract.View view = (ReferEarnHomePageContract.View) this.f44636b.f27351a;
                if (view != null) {
                    view.onUpdateReInviteIsInviteDone(this.f44637c);
                }
                break;
            case 1:
                ReferEarnHomePageContract.View view2 = (ReferEarnHomePageContract.View) this.f44636b.f27351a;
                if (view2 != null) {
                    view2.onUpdateReInviteIsInviteDone(this.f44637c);
                }
                break;
            default:
                CommonResult response = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                boolean zIsSuccess = response.isSuccess();
                m mVar = this.f44636b;
                if (zIsSuccess) {
                    mVar.referEarnWithDrawCreate(this.f44637c);
                } else if ("Order_Disable".equals(response.getRespCode())) {
                    ReferEarnHomePageContract.View view3 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view3 != null) {
                        view3.showLoadingView(false);
                    }
                    ReferEarnHomePageContract.View view4 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view4 != null) {
                        view4.showRichDialog(ReferEarnRichDialog.INSTANCE.getRE_TYPE_ENABLE_ORDER_DISABLE(), response.getRespMsg(), "", "");
                    }
                } else if ("Order_Confirm".equals(response.getRespCode())) {
                    ReferEarnHomePageContract.View view5 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view5 != null) {
                        view5.showLoadingView(false);
                    }
                    ReferEarnHomePageContract.View view6 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view6 != null) {
                        view6.showRichDialog(ReferEarnRichDialog.INSTANCE.getRE_TYPE_ENALBE_ORDER_CONFIRM(), response.getRespMsg(), "", "");
                    }
                } else {
                    ReferEarnHomePageContract.View view7 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view7 != null) {
                        view7.showLoadingView(false);
                    }
                    ReferEarnHomePageContract.View view8 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view8 != null) {
                        view8.showToastDialog(response.getRespMsg());
                    }
                }
                break;
        }
        return Unit.f38893a;
    }
}
