package G1;

import com.bumptech.glide.load.engine.k;

/* JADX INFO: loaded from: classes.dex */
public class d extends a {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static d f2930Z;

    public static d N(k kVar) {
        return (d) new d().g(kVar);
    }

    public static d O(int i7) {
        return (d) new d().x(i7);
    }

    public static d P() {
        if (f2930Z == null) {
            f2930Z = (d) ((d) new d().F(true)).b();
        }
        return f2930Z;
    }

    @Override // G1.a
    public final boolean equals(Object obj) {
        return (obj instanceof d) && super.equals(obj);
    }
}
