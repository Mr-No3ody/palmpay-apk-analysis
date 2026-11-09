package A;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f4a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f5b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6c;

    public b(c cVar, c cVar2, int i7) {
        this.f6c = i7;
        this.f4a = cVar2;
        this.f5b = cVar;
    }

    @Override // A.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f4a == cVar && cVar == this.f5b) {
            this.f5b = null;
            this.f4a = null;
        }
        c cVar3 = this.f4a;
        if (cVar3 == cVar) {
            switch (this.f6c) {
                case 0:
                    cVar2 = cVar3.f10d;
                    break;
                default:
                    cVar2 = cVar3.f9c;
                    break;
            }
            this.f4a = cVar2;
        }
        c cVar4 = this.f5b;
        if (cVar4 == cVar) {
            c cVar5 = this.f4a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f5b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f6c) {
            case 0:
                return cVar.f9c;
            default:
                return cVar.f10d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f5b;
        c cVar2 = this.f4a;
        this.f5b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
