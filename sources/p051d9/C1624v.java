package p051d9;

import C0.G;
import F6.d;
import com.google.api.Service;
import com.transsnet.palmpay.airtime.ui.AutoTopupOverlayActivity;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoTopupOverlayActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p133ig.a;

/* JADX INFO: renamed from: d9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1624v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35664a;

    public /* synthetic */ C1624v(int i7) {
        this.f35664a = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35664a) {
            case 0:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 1:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 2:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 3:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 4:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 5:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 6:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 7:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 8:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 9:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 10:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 11:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 12:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 13:
                d.h("SignUpPresenter", 3, G.o("verifyMtnNumber: error: ", (String) obj));
                break;
            case 14:
                ToastUtils.showLong((String) obj, new Object[0]);
                break;
            case 15:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ToastUtils.showLong(it, new Object[0]);
                break;
            case 16:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                d.c(it2, new Object[0]);
                break;
            case 17:
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                break;
            case 18:
                String it3 = (String) obj;
                int i7 = DataBundleAutoTopupOverlayActivity.f31768f;
                Intrinsics.checkNotNullParameter(it3, "it");
                ToastUtils.showShort(it3, new Object[0]);
                break;
            case 19:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                break;
            case 20:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                break;
            case 21:
                Intrinsics.checkNotNullParameter((a) obj, "<this>");
                break;
            case 22:
                String it4 = (String) obj;
                int i10 = AutoTopupOverlayActivity.f26463f;
                Intrinsics.checkNotNullParameter(it4, "it");
                ToastUtils.showShort(it4, new Object[0]);
                break;
            case 23:
                int i11 = ScheduleTopUpHomeActivity.f26471i;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                break;
            case 24:
                String it5 = (String) obj;
                int i12 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(it5, "it");
                ToastUtils.showLong(it5, new Object[0]);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i13 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                break;
            case 26:
                String it6 = (String) obj;
                int i14 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(it6, "it");
                ToastUtils.showLong(it6, new Object[0]);
                break;
            case 27:
                int i15 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                break;
            case 28:
                int i16 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                break;
            default:
                int i17 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                break;
        }
        return Unit.f38893a;
    }

    public /* synthetic */ C1624v(BaseMvvmVBActivity baseMvvmVBActivity, int i7) {
        this.f35664a = i7;
    }
}
