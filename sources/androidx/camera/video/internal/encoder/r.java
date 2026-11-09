package androidx.camera.video.internal.encoder;

import E.AbstractC0198c;
import androidx.camera.core.impl.Observable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Encoder.ByteBufferInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14706a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.camera.video.internal.b f14707b = androidx.camera.video.internal.b.f14618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14708c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f14709d;

    public r(v vVar) {
        this.f14709d = vVar;
    }

    public final void a(boolean z3) {
        androidx.camera.video.internal.b bVar = androidx.camera.video.internal.b.f14618b;
        androidx.camera.video.internal.b bVar2 = z3 ? androidx.camera.video.internal.b.f14617a : bVar;
        if (this.f14707b == bVar2) {
            return;
        }
        this.f14707b = bVar2;
        if (bVar2 == bVar) {
            ArrayList arrayList = this.f14708c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.f14706a.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new o(0, entry, bVar2));
            } catch (RejectedExecutionException e10) {
                p140j8.f.h(this.f14709d.f14734a, "Unable to post to the supplied executor.", e10);
            }
        }
    }

    @Override // androidx.camera.video.internal.BufferProvider
    public final ListenableFuture<InputBuffer> acquireBuffer() {
        return AbstractC0198c.y(new n(this, 1));
    }

    @Override // androidx.camera.core.impl.Observable
    public final void addObserver(Executor executor, Observable.Observer<? super androidx.camera.video.internal.b> observer) {
        this.f14709d.f14741h.execute(new Da.h(this, 28, observer, executor));
    }

    @Override // androidx.camera.core.impl.Observable
    public final ListenableFuture<androidx.camera.video.internal.b> fetchData() {
        return AbstractC0198c.y(new n(this, 0));
    }

    @Override // androidx.camera.core.impl.Observable
    public final void removeObserver(Observable.Observer<? super androidx.camera.video.internal.b> observer) {
        this.f14709d.f14741h.execute(new o(1, this, observer));
    }
}
