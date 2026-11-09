package p377z5;

import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f44457a;

    public e(Handler handler) {
        this.f44457a = handler;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            this.f44457a.handleMessage(message);
        } catch (WindowManager.BadTokenException | IllegalStateException e10) {
            e10.printStackTrace();
        }
    }
}
