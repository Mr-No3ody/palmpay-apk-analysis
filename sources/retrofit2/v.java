package retrofit2;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U f41965e;

    public /* synthetic */ v(U u6, int i7) {
        this.f41964d = i7;
        this.f41965e = u6;
    }

    @Override // retrofit2.U
    public final void a(H h7, Object obj) {
        switch (this.f41964d) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f41965e.a(h7, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i7 = 0; i7 < length; i7++) {
                        this.f41965e.a(h7, Array.get(obj, i7));
                    }
                    break;
                }
                break;
        }
    }
}
