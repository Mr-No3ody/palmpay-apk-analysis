package De;

import android.content.Intent;
import android.text.TextUtils;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.ui.fragment.settings.PaymentSettingsFragment;
import com.transsnet.palmpay.ui.view.SettingItem;
import io.fastkv.n;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Argument2Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentSettingsFragment f1874b;

    public /* synthetic */ e(PaymentSettingsFragment paymentSettingsFragment, int i7) {
        this.f1873a = i7;
        this.f1874b = paymentSettingsFragment;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public final void invoke(Object obj, Object obj2) {
        PaymentSettingsFragment paymentSettingsFragment = this.f1874b;
        int i7 = this.f1873a;
        int iIntValue = ((Integer) obj).intValue();
        Intent intent = (Intent) obj2;
        switch (i7) {
            case 0:
                int i10 = PaymentSettingsFragment.f35271C;
                String stringExtra = intent != null ? intent.getStringExtra("extra_data") : "";
                if (iIntValue == -1 && !TextUtils.isEmpty(stringExtra)) {
                    int i11 = paymentSettingsFragment.f35278w;
                    SettingItem settingItem = paymentSettingsFragment.f35276p;
                    if (settingItem != null) {
                        settingItem.setSummary(paymentSettingsFragment.u(i11));
                    }
                    paymentSettingsFragment.x(i11, stringExtra, true);
                } else {
                    if (TextUtils.isEmpty(stringExtra) && iIntValue == -1) {
                        paymentSettingsFragment.z("Empty token");
                    }
                    SettingItem settingItem2 = paymentSettingsFragment.f35276p;
                    if (settingItem2 != null) {
                        settingItem2.setSummary(paymentSettingsFragment.u(paymentSettingsFragment.f35277v));
                    }
                }
                break;
            case 1:
                int i12 = PaymentSettingsFragment.f35271C;
                if (iIntValue != -1) {
                    D3.a.N("enable", "fail", "user_cancelled");
                    SettingItem settingItem3 = paymentSettingsFragment.t;
                    if (settingItem3 != null) {
                        settingItem3.setChecked(false);
                    }
                } else {
                    n.J(intent);
                    n.N(true);
                    D3.a.N("enable", "success", null);
                    paymentSettingsFragment.z("Enabled Successfully");
                }
                break;
            default:
                int i13 = PaymentSettingsFragment.f35271C;
                paymentSettingsFragment.v(iIntValue);
                break;
        }
    }
}
