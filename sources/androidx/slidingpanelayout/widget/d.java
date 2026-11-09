package androidx.slidingpanelayout.widget;

import Wf.t0;
import androidx.window.layout.WindowInfoTracker;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInfoTracker f17858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f17859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0 f17860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Sd.b f17861d;

    public d(WindowInfoTracker windowInfoTracker, Executor executor) {
        Intrinsics.checkNotNullParameter(windowInfoTracker, "windowInfoTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f17858a = windowInfoTracker;
        this.f17859b = executor;
    }
}
