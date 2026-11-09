package E;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f2087d = Arrays.asList(1, 2, 4, 3, 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0 f2088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2089b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2090c = new ArrayList();

    public final void a(n0 n0Var) {
        this.f2089b.add(n0Var);
    }

    public final p0 b() {
        ArrayList arrayList = this.f2089b;
        p118hf.a.g(!arrayList.isEmpty(), "UseCase must not be empty.");
        ArrayList arrayList2 = this.f2090c;
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            return new p0(this.f2088a, arrayList, arrayList2);
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
