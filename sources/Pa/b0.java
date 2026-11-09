package Pa;

import Xd.C0784c;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentEarnLayout;
import com.google.api.Service;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationUserProfileFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelBillQuickAccessItem;
import com.transsnet.palmpay.custom_view.model.ModelPaymentEarnLayout;
import com.transsnet.palmpay.teller.ui.dialog.DataBundleWalletDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7075a;

    public /* synthetic */ b0(int i7) {
        this.f7075a = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7075a) {
            case 0:
                return f0.f7079a;
            case 1:
                return new M3.a();
            case 2:
                return new M3.e();
            case 3:
                return new ArrayList();
            case 4:
                int i7 = NetworkNotConnectView.f27120i;
                Object systemService = BaseApplication.get().getSystemService("connectivity");
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                return (ConnectivityManager) systemService;
            case 5:
                int i10 = FlexiBankModelPaymentEarnLayout.f22045e;
                return new S3.a(com.flexibank.sdk.q.fb_layout_payment_earn_item, null);
            case 6:
                S6.a[] aVarArrValues = S6.a.values();
                int iA = kotlin.collections.F.a(aVarArrValues.length);
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (S6.a aVar : aVarArrValues) {
                    linkedHashMap.put(aVar.name(), Character.valueOf(aVar.f8812a));
                }
                return linkedHashMap;
            case 7:
                return S6.b.f8814a;
            case 8:
                return new ArrayList();
            case 9:
                return new ArrayList();
            case 10:
                int i11 = ModelAvailableCouponItem.f28246o;
                return Unit.f38893a;
            case 11:
                int i12 = ModelBillQuickAccessItem.f28279f;
                return new Ua.C(p025ba.g.core_layout_biller_quick_access_item, null);
            case 12:
                return Unit.f38893a;
            case 13:
                return new ViewGroup.LayoutParams(-1, -2);
            case 14:
                int i13 = IdentityVerificationAddressFragment.f26156Q;
                return new ArrayList();
            case 15:
                int i14 = IdentityVerificationUserProfileFragment.f26181L;
                return new ArrayList();
            case 16:
                int i15 = IdentityVerificationUserProfileFragment.f26181L;
                return new ArrayList();
            case 17:
                int i16 = IdentityVerificationUserProfileFragment.f26181L;
                return new ArrayList();
            case 18:
                int i17 = IdentityVerificationUserProfileFragment.f26181L;
                return new Handler(Looper.getMainLooper());
            case 19:
                int i18 = IdentityVerificationUserProfileFragment.f26181L;
                return new ArrayList();
            case 20:
                int i19 = IdentityVerificationUserProfileFragment.f26181L;
                return new ArrayList();
            case 21:
                int i20 = ModelPaymentEarnLayout.f31528f;
                return Unit.f38893a;
            case 22:
                int i21 = ModelPaymentEarnLayout.f31528f;
                return new Vb.c(com.transsnet.palmpay.custom_view.t.cv_layout_payment_earn_item, null);
            case 23:
                return new W2.g();
            case 24:
                int i22 = LogInInputMobileFragment.f26194C;
                return new Handler(Looper.getMainLooper());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return Unit.f38893a;
            case 26:
                return Unit.f38893a;
            case 27:
                return DataBundleWalletDialog.adapter_delegate$lambda$0();
            case 28:
                int i23 = BillPaymentElectricityHomeFragment.f34255z0;
                C0784c c0784c = new C0784c(Pd.d.qt_item_payment_amount, null);
                c0784c.f11143a = -1;
                return c0784c;
            default:
                Xd.D d2 = new Xd.D(Pd.d.qt_item_tv_payment_item_child, null);
                d2.setDiffCallback(new Xd.C());
                return d2;
        }
    }
}
