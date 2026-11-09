package p024b9;

import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepBillUploadFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p051d9.C1628z;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UpgradeTier3StepBillUploadFragment f18813b;

    public /* synthetic */ j(UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment, int i7) {
        this.f18812a = i7;
        this.f18813b = upgradeTier3StepBillUploadFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18812a) {
            case 0:
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(url, "url");
                C1628z c1628z = (C1628z) this.f18813b.f27328i;
                if (c1628z != null) {
                    c1628z.queryAddressFromBill(url);
                }
                break;
            case 1:
                this.f18813b.showLoadingDialog(((Boolean) obj).booleanValue());
                break;
            default:
                String url2 = (String) obj;
                Intrinsics.checkNotNullParameter(url2, "url");
                C1628z c1628z2 = (C1628z) this.f18813b.f27328i;
                if (c1628z2 != null) {
                    c1628z2.queryAddressFromBill(url2);
                }
                break;
        }
        return Unit.f38893a;
    }
}
