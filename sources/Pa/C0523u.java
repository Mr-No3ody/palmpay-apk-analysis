package Pa;

import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Pa.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0523u implements RequestListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f7163a;

    public C0523u(WeakReference weakReference) {
        this.f7163a = weakReference;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final boolean onLoadFailed(com.bumptech.glide.load.engine.u uVar, Object obj, Target target, boolean z3) {
        CompleteCallback completeCallback = (CompleteCallback) this.f7163a.get();
        if (completeCallback == null) {
            return true;
        }
        completeCallback.onComplete(null);
        return true;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final boolean onResourceReady(Object obj, Object obj2, Target target, com.bumptech.glide.load.a aVar, boolean z3) {
        File file = (File) obj;
        CompleteCallback completeCallback = (CompleteCallback) this.f7163a.get();
        if (completeCallback == null) {
            return true;
        }
        completeCallback.onComplete(file);
        return true;
    }
}
