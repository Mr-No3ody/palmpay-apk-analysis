package H1;

import android.os.Handler;
import android.os.Message;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3596a;

    public /* synthetic */ i(int i7) {
        this.f3596a = i7;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f3596a) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                j jVar = (j) message.obj;
                jVar.f3598a.e(jVar);
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((Resource) message.obj).recycle();
                return true;
        }
    }
}
