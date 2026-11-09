package G7;

import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Balloon f3057a;

    public d(Balloon balloon) {
        Intrinsics.checkNotNullParameter(balloon, "balloon");
        this.f3057a = balloon;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3057a.f();
    }
}
