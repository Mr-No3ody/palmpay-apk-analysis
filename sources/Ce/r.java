package Ce;

import android.os.Handler;
import com.transsnet.palmpay.ui.fragment.HomeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f1521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f1522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f1523d;

    public /* synthetic */ r(Handler handler, HomeFragment homeFragment, HomeFragment homeFragment2, int i7) {
        this.f1520a = i7;
        this.f1521b = handler;
        this.f1522c = homeFragment;
        this.f1523d = homeFragment2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1520a) {
            case 0:
                this.f1521b.post(new RunnableC0175q(this.f1522c, this.f1523d, 0));
                break;
            default:
                this.f1521b.post(new RunnableC0175q(this.f1522c, this.f1523d, 1));
                break;
        }
    }
}
