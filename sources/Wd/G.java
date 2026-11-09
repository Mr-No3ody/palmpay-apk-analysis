package Wd;

import Wf.AbstractC0774s;
import com.facebook.react.ReactHost;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.defaults.DefaultReactHost;
import com.facebook.react.defaults.DefaultReactHostDelegate;
import com.google.api.Service;
import com.transsnet.palmpay.teller.ui.activity.EditBeneficiaryActivity;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;
import com.transsnet.palmpay.teller.ui.activity.TvPreCheckActivity;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.InputPaymentItemAmountDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class G implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10715a;

    public /* synthetic */ G(int i7) {
        this.f10715a = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10715a) {
            case 0:
                String errorMsg = (String) obj;
                int i7 = EditBeneficiaryActivity.f34202M;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                return Unit.f38893a;
            case 1:
                String errorMsg2 = (String) obj;
                int i10 = EditBeneficiaryActivity.f34202M;
                Intrinsics.checkNotNullParameter(errorMsg2, "errorMsg");
                return Unit.f38893a;
            case 2:
                String errorMsg3 = (String) obj;
                int i11 = EditBeneficiaryActivity.f34202M;
                Intrinsics.checkNotNullParameter(errorMsg3, "errorMsg");
                return Unit.f38893a;
            case 3:
                String it = (String) obj;
                int i12 = JambHomeActivity.f34222B;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f38893a;
            case 4:
                String errorMsg4 = (String) obj;
                int i13 = JambHomeActivity.f34222B;
                Intrinsics.checkNotNullParameter(errorMsg4, "errorMsg");
                ToastUtils.showLong(errorMsg4, new Object[0]);
                return Unit.f38893a;
            case 5:
                String errorMsg5 = (String) obj;
                KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                Intrinsics.checkNotNullParameter(errorMsg5, "errorMsg");
                ToastUtils.showLong(errorMsg5, new Object[0]);
                return Unit.f38893a;
            case 6:
                String errorMsg6 = (String) obj;
                int i14 = WaecHomeActivity.f34237Q;
                Intrinsics.checkNotNullParameter(errorMsg6, "errorMsg");
                ToastUtils.showLong(errorMsg6, new Object[0]);
                return Unit.f38893a;
            case 7:
                String it2 = (String) obj;
                int i15 = WaecHomeActivity.f34237Q;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Unit.f38893a;
            case 8:
                String it3 = (String) obj;
                int i16 = WaecHomeActivity.f34237Q;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Unit.f38893a;
            case 9:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof AbstractC0774s) {
                    return (AbstractC0774s) element;
                }
                return null;
            case 10:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof Wf.T) {
                    return (Wf.T) element2;
                }
                return null;
            case 11:
                Byte b7 = (Byte) obj;
                b7.byteValue();
                return com.airbnb.lottie.model.layer.d.n(new Object[]{b7}, 1, "%02x", "format(...)");
            case 12:
                return InputPaymentItemAmountDialog.callback$lambda$0(((Long) obj).longValue());
            case 13:
                String errorMsg7 = (String) obj;
                int i17 = BillPaymentElectricityHomeFragment.f34255z0;
                Intrinsics.checkNotNullParameter(errorMsg7, "errorMsg");
                ToastUtils.showLong(errorMsg7, new Object[0]);
                return Unit.f38893a;
            case 14:
                String errorMsg8 = (String) obj;
                int i18 = BillPaymentElectricityHomeFragment.f34255z0;
                Intrinsics.checkNotNullParameter(errorMsg8, "errorMsg");
                ToastUtils.showLong(errorMsg8, new Object[0]);
                return Unit.f38893a;
            case 15:
                ((Integer) obj).intValue();
                int i19 = BillPaymentElectricityHomeFragment.f34255z0;
                return Unit.f38893a;
            case 16:
                String it4 = (String) obj;
                int i20 = BillPaymentElectricityHomeFragment.f34255z0;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Unit.f38893a;
            case 17:
                String it5 = (String) obj;
                int i21 = BillPaymentElectricityHomeFragment.f34255z0;
                Intrinsics.checkNotNullParameter(it5, "it");
                return Unit.f38893a;
            case 18:
                String it6 = (String) obj;
                int i22 = BillPaymentHomeNGFragment.f34279r0;
                Intrinsics.checkNotNullParameter(it6, "it");
                return Unit.f38893a;
            case 19:
                String errorMsg9 = (String) obj;
                int i23 = BillPaymentHomeNGFragment.f34279r0;
                Intrinsics.checkNotNullParameter(errorMsg9, "errorMsg");
                ToastUtils.showLong(errorMsg9, new Object[0]);
                return Unit.f38893a;
            case 20:
                String it7 = (String) obj;
                int i24 = BillPaymentHomeNGFragment.f34279r0;
                Intrinsics.checkNotNullParameter(it7, "it");
                return Unit.f38893a;
            case 21:
                String it8 = (String) obj;
                int i25 = BillPaymentTvHomeFragment.f34295v0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Unit.f38893a;
            case 22:
                String it9 = (String) obj;
                int i26 = BillPaymentTvHomeFragment.f34295v0;
                Intrinsics.checkNotNullParameter(it9, "it");
                ToastUtils.showLong(it9, new Object[0]);
                return Unit.f38893a;
            case 23:
                ((Integer) obj).intValue();
                int i27 = BillPaymentTvHomeFragment.f34295v0;
                return Unit.f38893a;
            case 24:
                return ReactHost.destroy$lambda$0(((Boolean) obj).booleanValue());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ReadableMapBuffer.toString$lambda$5((MapBuffer.Entry) obj);
            case 26:
                return DefaultReactHost.getDefaultReactHost$lambda$1((Exception) obj);
            case 27:
                return DefaultReactHost.getDefaultReactHost$lambda$3((Exception) obj);
            case 28:
                return DefaultReactHost.getDefaultReactHost$lambda$0((Exception) obj);
            default:
                return DefaultReactHostDelegate._init_$lambda$0((Exception) obj);
        }
    }
}
