package A0;

import M.o;
import androidx.lifecycle.a0;

/* JADX INFO: loaded from: classes.dex */
public class c extends a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f19e = new b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f20d = new o();

    @Override // androidx.lifecycle.a0
    public final void b() {
        o oVar = this.f20d;
        if (oVar.e() > 0) {
            oVar.f(0).getClass();
            throw new ClassCastException();
        }
        int i7 = oVar.f5699d;
        Object[] objArr = oVar.f5698c;
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = null;
        }
        oVar.f5699d = 0;
        oVar.f5696a = false;
    }
}
