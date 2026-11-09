package R;

import androidx.constraintlayout.core.widgets.analyzer.Dependency;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n {
    @Override // R.n
    public final void c() {
        Q.e eVar = this.f7898b;
        if (eVar instanceof Q.a) {
            e eVar2 = this.f7904h;
            eVar2.f7873b = true;
            Q.a aVar = (Q.a) eVar;
            int i7 = aVar.f7398w0;
            boolean z3 = aVar.f7399x0;
            int i10 = 0;
            if (i7 == 0) {
                eVar2.f7876e = 4;
                while (i10 < aVar.f7569v0) {
                    Q.e eVar3 = aVar.f7568u0[i10];
                    if (z3 || eVar3.i0 != 8) {
                        e eVar4 = eVar3.f7463d.f7904h;
                        eVar4.f7882k.add(eVar2);
                        eVar2.f7883l.add(eVar4);
                    }
                    i10++;
                }
                l(this.f7898b.f7463d.f7904h);
                l(this.f7898b.f7463d.f7905i);
                return;
            }
            if (i7 == 1) {
                eVar2.f7876e = 5;
                while (i10 < aVar.f7569v0) {
                    Q.e eVar5 = aVar.f7568u0[i10];
                    if (z3 || eVar5.i0 != 8) {
                        e eVar6 = eVar5.f7463d.f7905i;
                        eVar6.f7882k.add(eVar2);
                        eVar2.f7883l.add(eVar6);
                    }
                    i10++;
                }
                l(this.f7898b.f7463d.f7904h);
                l(this.f7898b.f7463d.f7905i);
                return;
            }
            if (i7 == 2) {
                eVar2.f7876e = 6;
                while (i10 < aVar.f7569v0) {
                    Q.e eVar7 = aVar.f7568u0[i10];
                    if (z3 || eVar7.i0 != 8) {
                        e eVar8 = eVar7.f7465e.f7904h;
                        eVar8.f7882k.add(eVar2);
                        eVar2.f7883l.add(eVar8);
                    }
                    i10++;
                }
                l(this.f7898b.f7465e.f7904h);
                l(this.f7898b.f7465e.f7905i);
                return;
            }
            if (i7 != 3) {
                return;
            }
            eVar2.f7876e = 7;
            while (i10 < aVar.f7569v0) {
                Q.e eVar9 = aVar.f7568u0[i10];
                if (z3 || eVar9.i0 != 8) {
                    e eVar10 = eVar9.f7465e.f7905i;
                    eVar10.f7882k.add(eVar2);
                    eVar2.f7883l.add(eVar10);
                }
                i10++;
            }
            l(this.f7898b.f7465e.f7904h);
            l(this.f7898b.f7465e.f7905i);
        }
    }

    @Override // R.n
    public final void d() {
        Q.e eVar = this.f7898b;
        if (eVar instanceof Q.a) {
            int i7 = ((Q.a) eVar).f7398w0;
            e eVar2 = this.f7904h;
            if (i7 == 0 || i7 == 1) {
                eVar.f7460a0 = eVar2.f7878g;
            } else {
                eVar.b0 = eVar2.f7878g;
            }
        }
    }

    @Override // R.n
    public final void e() {
        this.f7899c = null;
        this.f7904h.b();
    }

    @Override // R.n
    public final boolean j() {
        return false;
    }

    public final void l(e eVar) {
        e eVar2 = this.f7904h;
        eVar2.f7882k.add(eVar);
        eVar.f7883l.add(eVar2);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void update(Dependency dependency) {
        Q.a aVar = (Q.a) this.f7898b;
        int i7 = aVar.f7398w0;
        e eVar = this.f7904h;
        Iterator it = eVar.f7883l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((e) it.next()).f7878g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i7 == 0 || i7 == 2) {
            eVar.c(i11 + aVar.f7400y0);
        } else {
            eVar.c(i10 + aVar.f7400y0);
        }
    }
}
