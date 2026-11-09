package G4;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    @Override // G4.g
    public final void c() {
        Matrix matrix = this.f2998b;
        matrix.reset();
        j jVar = this.f2999c;
        matrix.postTranslate(jVar.f3007b.left, jVar.f3009d - jVar.b());
    }
}
