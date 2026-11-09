package p054dd;

import com.transsnet.palmpay.airtime.bean.rsp.Recharge2CashProviderV2Rsp;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.input.InputMobileImpl;
import com.transsnet.palmpay.custom_view.input.OnNumberInputListener;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import com.transsnet.palmpay.r2c.viewmodel.Recharge2CashViewModel;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import java.util.ArrayList;
import p085fd.g;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements OnNumberInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashHomeActivity f35884a;

    public i(Recharge2CashHomeActivity recharge2CashHomeActivity) {
        this.f35884a = recharge2CashHomeActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public final void onNumberEditComplete(String str) {
        String str2;
        ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
        Recharge2CashHomeActivity recharge2CashHomeActivity = this.f35884a;
        Recharge2CashViewModel recharge2CashViewModel = (Recharge2CashViewModel) recharge2CashHomeActivity.l();
        Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp = recharge2CashHomeActivity.f33120o;
        if (recharge2CashProviderV2Rsp == null || (str2 = recharge2CashProviderV2Rsp.billerName) == null) {
            str2 = "";
        }
        PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
        if (str == null) {
            str = "";
        }
        String fullMobileNumber = phoneBaseNumberUtils.getFullMobileNumber(str, BaseApplication.getCountryLocale());
        recharge2CashViewModel.getClass();
        f.s(recharge2CashViewModel, new g(str2, fullMobileNumber, null), recharge2CashViewModel.f33143g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public final void onSelectNumber(InputMobileImpl inputMobileImpl) {
        OnNumberInputListener.DefaultImpls.onSelectNumber(this, inputMobileImpl);
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnNumberInputListener
    public final void onNumberEditing(String str) {
    }
}
