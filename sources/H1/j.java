package H1;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.p;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f3597b = new Handler(Looper.getMainLooper(), new i(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f3598a;

    public j(p pVar) {
        super(0);
        this.f3598a = pVar;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj, Transition transition) {
        Request request = getRequest();
        if (request == null || !request.isComplete()) {
            return;
        }
        f3597b.obtainMessage(1, this).sendToTarget();
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable) {
    }
}
