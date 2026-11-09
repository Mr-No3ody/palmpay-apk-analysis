package Q;

import androidx.constraintlayout.core.widgets.Helper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class j extends e implements Helper {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public e[] f7568u0 = new e[4];

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f7569v0 = 0;

    public final void S(int i7, R.m mVar, ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f7569v0; i10++) {
            e eVar = this.f7568u0[i10];
            ArrayList arrayList2 = mVar.f7892a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        for (int i11 = 0; i11 < this.f7569v0; i11++) {
            R.g.b(this.f7568u0[i11], i7, arrayList, mVar);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public final void add(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i7 = this.f7569v0 + 1;
        e[] eVarArr = this.f7568u0;
        if (i7 > eVarArr.length) {
            this.f7568u0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f7568u0;
        int i10 = this.f7569v0;
        eVarArr2[i10] = eVar;
        this.f7569v0 = i10 + 1;
    }

    @Override // Q.e
    public void g(e eVar, HashMap map) {
        super.g(eVar, map);
        j jVar = (j) eVar;
        this.f7569v0 = 0;
        int i7 = jVar.f7569v0;
        for (int i10 = 0; i10 < i7; i10++) {
            add((e) map.get(jVar.f7568u0[i10]));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public final void removeAllIds() {
        this.f7569v0 = 0;
        Arrays.fill(this.f7568u0, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(f fVar) {
    }
}
