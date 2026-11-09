package Fe;

import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Fe.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0259g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2771b;

    public /* synthetic */ C0259g(String str, int i7) {
        this.f2770a = i7;
        this.f2771b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2770a) {
            case 0:
                return ((PayApiService) p324va.c.f43141a.f14621b).homeSmDialogShown(this.f2771b);
            case 1:
                return ((PayApiService) p324va.c.f43141a.f14621b).getBankInfoByCardNo(this.f2771b);
            case 2:
                return PickBillerNewDialog.mAdapter_delegate$lambda$0(this.f2771b);
            case 3:
                return G8.a.t().getSecurityFlow(false, this.f2771b, 14);
            case 4:
                return G8.a.t().getLatestBillerOrderDetail(this.f2771b);
            case 5:
                return G8.a.t().getResetPinVerifyList(this.f2771b);
            default:
                return G8.a.t().getSecurityFlow(false, this.f2771b, 12);
        }
    }
}
