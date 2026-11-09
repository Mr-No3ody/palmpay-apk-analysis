package A;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f11a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f13c;

    public d(f fVar) {
        this.f13c = fVar;
    }

    @Override // A.e
    public final void a(c cVar) {
        c cVar2 = this.f11a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f10d;
            this.f11a = cVar3;
            this.f12b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12b) {
            return this.f13c.f14a != null;
        }
        c cVar = this.f11a;
        return (cVar == null || cVar.f9c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12b) {
            this.f12b = false;
            this.f11a = this.f13c.f14a;
        } else {
            c cVar = this.f11a;
            this.f11a = cVar != null ? cVar.f9c : null;
        }
        return this.f11a;
    }
}
