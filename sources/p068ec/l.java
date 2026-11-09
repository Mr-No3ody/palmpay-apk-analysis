package p068ec;

import android.os.Handler;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f36267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36268c;

    public /* synthetic */ l(Handler handler, BuyBundleHomePageActivity buyBundleHomePageActivity, int i7) {
        this.f36266a = i7;
        this.f36267b = handler;
        this.f36268c = buyBundleHomePageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36266a) {
            case 0:
                this.f36267b.post(new k(this.f36268c, 0));
                break;
            default:
                this.f36267b.post(new k(this.f36268c, 1));
                break;
        }
    }
}
