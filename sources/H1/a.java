package H1;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.Target;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Target {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Request f3579a;

    @Override // com.bumptech.glide.request.target.Target
    public Request getRequest() {
        return this.f3579a;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void setRequest(Request request) {
        this.f3579a = request;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(Drawable drawable) {
    }
}
