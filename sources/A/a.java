package A;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f3e = new HashMap();

    @Override // A.f
    public final c a(Object obj) {
        return (c) this.f3e.get(obj);
    }

    @Override // A.f
    public final Object b(Object obj, Object obj2) {
        c cVarA = a(obj);
        if (cVarA != null) {
            return cVarA.f8b;
        }
        HashMap map = this.f3e;
        c cVar = new c(obj, obj2);
        this.f17d++;
        c cVar2 = this.f15b;
        if (cVar2 == null) {
            this.f14a = cVar;
            this.f15b = cVar;
        } else {
            cVar2.f9c = cVar;
            cVar.f10d = cVar2;
            this.f15b = cVar;
        }
        map.put(obj, cVar);
        return null;
    }

    @Override // A.f
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.f3e.remove(obj);
        return objC;
    }
}
