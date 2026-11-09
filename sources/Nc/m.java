package Nc;

import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.data.local.entity.AdEntity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdEntity f6337b;

    public /* synthetic */ m(AdEntity adEntity, int i7) {
        this.f6336a = i7;
        this.f6337b = adEntity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6336a) {
            case 0:
                org.chromium.support_lib_boundary.util.b.P(this.f6337b);
                break;
            case 1:
                AdManager.lambda$saveAdClickStatus$1(this.f6337b);
                break;
            default:
                AdManager.lambda$saveAdCloseStatus$2(this.f6337b);
                break;
        }
    }
}
