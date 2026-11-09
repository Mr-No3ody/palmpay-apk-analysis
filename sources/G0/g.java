package G0;

import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2890a;

    public /* synthetic */ g(int i7) {
        this.f2890a = i7;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2890a) {
            case 0:
                runnable.run();
                break;
            case 1:
                ReactInstanceManagerInspectorTarget.mHybridData$lambda$0(runnable);
                break;
            default:
                p357y.a.Z().f44019f.f44021g.execute(runnable);
                break;
        }
    }
}
