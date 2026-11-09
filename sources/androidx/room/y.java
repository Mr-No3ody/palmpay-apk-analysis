package androidx.room;

import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f17800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f17801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z tracker, C1227f delegate) {
        super(delegate.f17795a);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f17800b = tracker;
        this.f17801c = new WeakReference(delegate);
    }

    @Override // androidx.room.w
    public final void a(Set tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        w wVar = (w) this.f17801c.get();
        if (wVar == null) {
            this.f17800b.d(this);
        } else {
            wVar.a(tables);
        }
    }
}
