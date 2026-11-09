package p078f5;

import android.os.Handler;
import android.os.Looper;
import com.growingio.android.sdk.track.async.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f36407a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f36408b;

    @Override // com.growingio.android.sdk.track.async.Disposable
    public final void dispose() {
        this.f36408b = true;
        this.f36407a.removeCallbacksAndMessages(this);
    }

    @Override // com.growingio.android.sdk.track.async.Disposable
    public final boolean isDisposed() {
        return this.f36408b;
    }
}
