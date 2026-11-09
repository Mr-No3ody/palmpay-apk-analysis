package O1;

import M1.j;
import com.chad.library.adapter.base.diff.DifferImp;
import com.chad.library.adapter.base.diff.ListChangeListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DifferImp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f6542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2085k0 f6544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f6545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f6546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6547f;

    public c(j adapter, f config) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f6542a = adapter;
        this.f6543b = config;
        this.f6544c = new C2085k0(adapter);
        a aVar = new a(0);
        config.getClass();
        this.f6545d = aVar;
        this.f6546e = new CopyOnWriteArrayList();
    }

    public final void a(List list, Runnable runnable) {
        Iterator it = this.f6546e.iterator();
        while (it.hasNext()) {
            ((ListChangeListener) it.next()).onCurrentListChanged(list, this.f6542a.getData());
        }
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.chad.library.adapter.base.diff.DifferImp
    public final void addListListener(ListChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f6546e.add(listener);
    }
}
