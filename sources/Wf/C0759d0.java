package Wf;

import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Wf.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0759d0 extends kotlin.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10845a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0759d0(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, obj, cls, str, str2, i10);
        this.f10845a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10845a) {
            case 0:
                ((AbstractC0761e0) this.receiver).h((Throwable) obj);
                break;
            case 1:
                ((BuyBundleHomePageActivity) this.receiver).showLoadingDialog(((Boolean) obj).booleanValue());
                break;
            case 2:
                ((TopupAirtimeActivity) this.receiver).showLoadingDialog(((Boolean) obj).booleanValue());
                break;
            case 3:
                ((BettingHomeActivity) this.receiver).showLoadingDialog(((Boolean) obj).booleanValue());
                break;
            default:
                ((BettingHomeActivity) this.receiver).showLoadingDialog(((Boolean) obj).booleanValue());
                break;
        }
        return Unit.f38893a;
    }
}
