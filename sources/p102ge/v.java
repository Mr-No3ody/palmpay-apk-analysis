package p102ge;

import Pa.n0;
import android.os.MessageQueue;
import com.transsnet.palmpay.ui.activity.HomeActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements MessageQueue.IdleHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f37235a;

    public v(HomeActivity homeActivity) {
        this.f37235a = homeActivity;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        n0.p(this.f37235a.getIntent());
        return false;
    }
}
