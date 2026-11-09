package p051d9;

import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryUiResourceRsp1;
import com.transsnet.palmpay.core.bean.rsp.ShareAccountDetailBean;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1613j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1623u f35623b;

    public /* synthetic */ C1613j(C1623u c1623u, int i7) {
        this.f35622a = i7;
        this.f35623b = c1623u;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35622a) {
            case 0:
                CommonBeanResult<PreCheckPhoneRsp> it = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.isSuccess() && it.data == null) {
                    ToastUtils.showLong("data is null", new Object[0]);
                } else {
                    LoginContract.View view = (LoginContract.View) this.f35623b.f27351a;
                    if (view != null) {
                        view.onCheckMobileNumberResult(it);
                    }
                }
                break;
            case 1:
                SmsActionRsp it2 = (SmsActionRsp) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean zIsSuccess = it2.isSuccess();
                C1623u c1623u = this.f35623b;
                if (zIsSuccess) {
                    LoginContract.View view2 = (LoginContract.View) c1623u.f27351a;
                    if (view2 != null) {
                        view2.onSmsTokenReceived(it2.data);
                    }
                } else {
                    LoginContract.View view3 = (LoginContract.View) c1623u.f27351a;
                    if (view3 != null) {
                        view3.onGetSmsTokenFail(it2.getRespMsg());
                    }
                }
                break;
            case 2:
                String str = (String) obj;
                LoginContract.View view4 = (LoginContract.View) this.f35623b.f27351a;
                if (view4 != null) {
                    view4.onGetSmsTokenFail(str);
                }
                break;
            case 3:
                QueryUiResourceRsp1 it3 = (QueryUiResourceRsp1) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3.isSuccess()) {
                    LoginContract.View view5 = (LoginContract.View) this.f35623b.f27351a;
                    if (view5 != null) {
                        view5.handleConfig(it3);
                    }
                } else {
                    ToastUtils.showLong(it3.getRespMsg(), new Object[0]);
                }
                break;
            case 4:
                ToastUtils.showLong((String) obj, new Object[0]);
                LoginContract.View view6 = (LoginContract.View) this.f35623b.f27351a;
                if (view6 != null) {
                    view6.updateSendSmsButton(true);
                }
                break;
            default:
                CommonBeanResult<ShareAccountDetailBean> it4 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                LoginContract.View view7 = (LoginContract.View) this.f35623b.f27351a;
                if (view7 != null) {
                    view7.handleShareAccountDetailResult(it4);
                }
                break;
        }
        return Unit.f38893a;
    }
}
