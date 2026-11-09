package p071ef;

import android.os.Handler;
import android.os.Message;
import df.f;
import df.h;
import df.i;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f36294c;

    public d(Handler handler) {
        this.f36294c = handler;
    }

    @Override // df.i
    public final h a() {
        return new c(this.f36294c);
    }

    @Override // df.i
    public final Disposable c(Runnable runnable, long j6, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f36294c;
        f fVar = new f(1, handler, runnable);
        handler.sendMessageDelayed(Message.obtain(handler, fVar), timeUnit.toMillis(j6));
        return fVar;
    }
}
