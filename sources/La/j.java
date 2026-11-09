package La;

import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethodResp;
import com.transsnet.palmpay.core.bean.rsp.BindActionRsp;
import com.transsnet.palmpay.core.bean.rsp.CardNoBankInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.GetFundActivityConfigRsp;
import com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f5584b;

    public /* synthetic */ j(l lVar, int i7) {
        this.f5583a = i7;
        this.f5584b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5583a) {
            case 0:
                CommonBeanResult<GetFundActivityConfigRsp> it = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                AddNewCardContract$IView addNewCardContract$IView = (AddNewCardContract$IView) this.f5584b.f27351a;
                if (addNewCardContract$IView != null) {
                    addNewCardContract$IView.handleFundActivityConfig(it);
                }
                break;
            case 1:
                CardNoBankInfoRsp it2 = (CardNoBankInfoRsp) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                AddNewCardContract$IView addNewCardContract$IView2 = (AddNewCardContract$IView) this.f5584b.f27351a;
                if (addNewCardContract$IView2 != null) {
                    addNewCardContract$IView2.handleGetBankInfoByCardNoRsp(it2);
                }
                break;
            case 2:
                CommonResult it3 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                AddNewCardContract$IView addNewCardContract$IView3 = (AddNewCardContract$IView) this.f5584b.f27351a;
                if (addNewCardContract$IView3 != null) {
                    addNewCardContract$IView3.handleCheckCardBindNum(it3);
                }
                break;
            case 3:
                PaymentMethodResp it4 = (PaymentMethodResp) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                AddNewCardContract$IView addNewCardContract$IView4 = (AddNewCardContract$IView) this.f5584b.f27351a;
                if (addNewCardContract$IView4 != null) {
                    addNewCardContract$IView4.handlePaymentMethods(it4.data);
                }
                break;
            case 4:
                BindActionRsp it5 = (BindActionRsp) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                l lVar = this.f5584b;
                AddNewCardContract$IView addNewCardContract$IView5 = (AddNewCardContract$IView) lVar.f27351a;
                if (addNewCardContract$IView5 != null) {
                    addNewCardContract$IView5.handleCheckCardBindNum(it5);
                }
                if (it5.isSuccess() && TextUtils.isEmpty(it5.token)) {
                    BaseApplication.getInstance().getUserDataSource().a().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new k(lVar, it5));
                } else {
                    AddNewCardContract$IView addNewCardContract$IView6 = (AddNewCardContract$IView) lVar.f27351a;
                    if (addNewCardContract$IView6 != null) {
                        addNewCardContract$IView6.showLoadingView(false);
                    }
                    AddNewCardContract$IView addNewCardContract$IView7 = (AddNewCardContract$IView) lVar.f27351a;
                    if (addNewCardContract$IView7 != null) {
                        addNewCardContract$IView7.handleBindResult(it5);
                    }
                }
                break;
            case 5:
                ToastUtils.showLong((String) obj, new Object[0]);
                AddNewCardContract$IView addNewCardContract$IView8 = (AddNewCardContract$IView) this.f5584b.f27351a;
                if (addNewCardContract$IView8 != null) {
                    addNewCardContract$IView8.showLoadingView(false);
                }
                break;
            default:
                CommonBeanResult<String> it6 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                AddNewCardContract$IView addNewCardContract$IView9 = (AddNewCardContract$IView) this.f5584b.f27351a;
                if (addNewCardContract$IView9 != null) {
                    addNewCardContract$IView9.getBindBankCardTips(it6);
                }
                break;
        }
        return Unit.f38893a;
    }
}
