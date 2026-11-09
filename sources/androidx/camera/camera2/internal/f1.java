package androidx.camera.camera2.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0926f f13523b;

    public /* synthetic */ f1(C0926f c0926f, int i7) {
        this.f13522a = i7;
        this.f13523b = c0926f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13522a) {
            case 0:
                C0926f this$0 = this.f13523b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((AtomicInteger) this$0.f13513b).decrementAndGet() >= 0) {
                    p140j8.f.G("VideoUsageControl");
                } else {
                    p140j8.f.G("VideoUsageControl");
                }
                break;
            default:
                C0926f this$1 = this.f13523b;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ((AtomicInteger) this$1.f13513b).incrementAndGet();
                p140j8.f.G("VideoUsageControl");
                break;
        }
    }
}
