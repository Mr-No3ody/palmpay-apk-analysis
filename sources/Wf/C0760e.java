package Wf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.Deferred;

/* JADX INFO: renamed from: Wf.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0760e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10846b = AtomicIntegerFieldUpdater.newUpdater(C0760e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred[] f10847a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0760e(Deferred[] deferredArr) {
        this.f10847a = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }
}
