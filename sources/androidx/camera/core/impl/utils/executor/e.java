package androidx.camera.core.impl.utils.executor;

import Pa.P;
import androidx.core.provider.k;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14166a;

    public /* synthetic */ e(int i7) {
        this.f14166a = i7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f14166a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 1:
                return new k(runnable);
            case 2:
                return new ShadowThread(new h(runnable, 1), "glide-active-resources", "\u200bcom.bumptech.glide.load.engine.ActiveResources$1");
            default:
                return new P(runnable, "\u200bcom.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory$1", 3);
        }
    }
}
