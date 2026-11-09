package androidx.core.view;

import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    WindowInsets mDispachedInsets;
    private final int mDispatchMode = 0;

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }

    public abstract void onEnd(d0 d0Var);

    public void onPrepare(d0 d0Var) {
    }

    public abstract q0 onProgress(q0 q0Var, List list);

    public V onStart(d0 d0Var, V v3) {
        return v3;
    }
}
