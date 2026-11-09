package p102ge;

import F6.d;
import Pa.n0;
import android.os.MessageQueue;
import com.transsnet.palmpay.ui.activity.SplashActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class L implements MessageQueue.IdleHandler {
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        int i7 = SplashActivity.f34568g;
        try {
            n0.g().C();
            return false;
        } catch (Throwable th) {
            d.c("SplashActivity", "scheduleGrowingIoInitOnIdle", th);
            return false;
        }
    }
}
