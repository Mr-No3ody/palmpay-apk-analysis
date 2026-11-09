package R;

import androidx.constraintlayout.core.widgets.analyzer.Dependency;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n {
    @Override // R.n
    public final void c() {
        Q.e eVar = this.f7898b;
        Q.i iVar = (Q.i) eVar;
        int i7 = iVar.f7563v0;
        int i10 = iVar.f7564w0;
        int i11 = iVar.f7566y0;
        e eVar2 = this.f7904h;
        if (i11 == 1) {
            if (i7 != -1) {
                eVar2.f7883l.add(eVar.f7454V.f7463d.f7904h);
                this.f7898b.f7454V.f7463d.f7904h.f7882k.add(eVar2);
                eVar2.f7877f = i7;
            } else if (i10 != -1) {
                eVar2.f7883l.add(eVar.f7454V.f7463d.f7905i);
                this.f7898b.f7454V.f7463d.f7905i.f7882k.add(eVar2);
                eVar2.f7877f = -i10;
            } else {
                eVar2.f7873b = true;
                eVar2.f7883l.add(eVar.f7454V.f7463d.f7905i);
                this.f7898b.f7454V.f7463d.f7905i.f7882k.add(eVar2);
            }
            l(this.f7898b.f7463d.f7904h);
            l(this.f7898b.f7463d.f7905i);
            return;
        }
        if (i7 != -1) {
            eVar2.f7883l.add(eVar.f7454V.f7465e.f7904h);
            this.f7898b.f7454V.f7465e.f7904h.f7882k.add(eVar2);
            eVar2.f7877f = i7;
        } else if (i10 != -1) {
            eVar2.f7883l.add(eVar.f7454V.f7465e.f7905i);
            this.f7898b.f7454V.f7465e.f7905i.f7882k.add(eVar2);
            eVar2.f7877f = -i10;
        } else {
            eVar2.f7873b = true;
            eVar2.f7883l.add(eVar.f7454V.f7465e.f7905i);
            this.f7898b.f7454V.f7465e.f7905i.f7882k.add(eVar2);
        }
        l(this.f7898b.f7465e.f7904h);
        l(this.f7898b.f7465e.f7905i);
    }

    @Override // R.n
    public final void d() {
        Q.e eVar = this.f7898b;
        int i7 = ((Q.i) eVar).f7566y0;
        e eVar2 = this.f7904h;
        if (i7 == 1) {
            eVar.f7460a0 = eVar2.f7878g;
        } else {
            eVar.b0 = eVar2.f7878g;
        }
    }

    @Override // R.n
    public final void e() {
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
        e eVar = this.f7904h;
        if (eVar.f7874c && !eVar.f7881j) {
            eVar.c((int) ((((e) eVar.f7883l.get(0)).f7878g * ((Q.i) this.f7898b).f7562u0) + 0.5f));
        }
    }
}
