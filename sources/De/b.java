package De;

import android.content.Intent;
import android.text.TextUtils;
import androidx.camera.camera2.internal.D0;
import androidx.camera.camera2.internal.K0;
import androidx.camera.camera2.internal.e1;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.k;
import com.transsnet.adsdk.AdManager;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.ui.fragment.settings.PaymentSettingsFragment;
import com.transsnet.palmpay.ui.view.SettingItem;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Argument2Callback, CallbackToFutureAdapter$Resolver, ObservableOnSubscribe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1868c;

    public /* synthetic */ b(Object obj, boolean z3, int i7) {
        this.f1866a = i7;
        this.f1868c = obj;
        this.f1867b = z3;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(k kVar) {
        switch (this.f1866a) {
            case 1:
                K0 k2 = (K0) this.f1868c;
                k2.getClass();
                k2.f13204b.execute(new D0(k2, this.f1867b, kVar));
                return "enableExternalFlashAeMode";
            default:
                e1 e1Var = (e1) this.f1868c;
                e1Var.getClass();
                boolean z3 = this.f1867b;
                e1Var.f13508d.execute(new D0(e1Var, kVar, z3));
                return "enableTorch: " + z3;
        }
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        SettingItem settingItem;
        int iIntValue = ((Integer) obj).intValue();
        Intent intent = (Intent) obj2;
        int i7 = PaymentSettingsFragment.f35271C;
        String stringExtra = intent != null ? intent.getStringExtra("extra_data") : "";
        PaymentSettingsFragment paymentSettingsFragment = (PaymentSettingsFragment) this.f1868c;
        boolean z3 = this.f1867b;
        if (iIntValue == -1 && !TextUtils.isEmpty(stringExtra)) {
            SettingItem settingItem2 = paymentSettingsFragment.f35276p;
            if (settingItem2 != null) {
                settingItem2.setVisibility(z3 ? 0 : 8);
            }
            paymentSettingsFragment.x(paymentSettingsFragment.f35277v, stringExtra, z3);
            return;
        }
        if (TextUtils.isEmpty(stringExtra) && iIntValue == -1) {
            paymentSettingsFragment.z("Empty token");
        }
        boolean z8 = !z3;
        SettingItem settingItem3 = paymentSettingsFragment.f35275o;
        if (settingItem3 != null) {
            settingItem3.setChecked(z8);
        }
        if (!z3 || (settingItem = paymentSettingsFragment.f35276p) == null) {
            return;
        }
        settingItem.setVisibility(8);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) throws Exception {
        AdManager.lambda$preloadSingleAd$3((String) this.f1868c, this.f1867b, observableEmitter);
    }
}
