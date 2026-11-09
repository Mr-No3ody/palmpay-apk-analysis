package androidx.activity;

import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H extends kotlin.jvm.internal.m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11997a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, obj, cls, str, str2, i10);
        this.f11997a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11997a) {
            case 0:
                ((I) this.receiver).f();
                return Unit.f38893a;
            case 1:
                ((I) this.receiver).f();
                return Unit.f38893a;
            case 2:
                BuyBundleHomePageActivity buyBundleHomePageActivity = (BuyBundleHomePageActivity) this.receiver;
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                buyBundleHomePageActivity.finish();
                return Unit.f38893a;
            case 3:
                TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) this.receiver;
                int i7 = TopupAirtimeActivity.f26495x0;
                topupAirtimeActivity.goBackToHome();
                topupAirtimeActivity.finish();
                return Unit.f38893a;
            case 4:
                BettingHomeActivity bettingHomeActivity = (BettingHomeActivity) this.receiver;
                KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                return bettingHomeActivity.r();
            case 5:
                return ((BettingHomeActivity) this.receiver).f26671Z;
            case 6:
                BettingHomeActivity bettingHomeActivity2 = (BettingHomeActivity) this.receiver;
                return Long.valueOf(Math.max(bettingHomeActivity2.f26678q0, bettingHomeActivity2.f26680s0));
            default:
                BettingHomeActivity bettingHomeActivity3 = (BettingHomeActivity) this.receiver;
                return Long.valueOf(Math.min(bettingHomeActivity3.f26677p0, bettingHomeActivity3.f26679r0));
        }
    }
}
