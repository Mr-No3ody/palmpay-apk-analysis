package p071ef;

import android.os.Handler;
import android.os.Message;
import df.f;
import df.h;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import p001if.b;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f36292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f36293b;

    public c(Handler handler) {
        this.f36292a = handler;
    }

    @Override // df.h
    public final Disposable b(Runnable runnable, long j6, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        boolean z3 = this.f36293b;
        b bVar = b.f37587a;
        if (z3) {
            return bVar;
        }
        Handler handler = this.f36292a;
        f fVar = new f(1, handler, runnable);
        Message messageObtain = Message.obtain(handler, fVar);
        messageObtain.obj = this;
        this.f36292a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j6));
        if (!this.f36293b) {
            return fVar;
        }
        this.f36292a.removeCallbacks(fVar);
        return bVar;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f36293b = true;
        this.f36292a.removeCallbacksAndMessages(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f36293b;
    }
}
