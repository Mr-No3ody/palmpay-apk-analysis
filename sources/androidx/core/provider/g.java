package androidx.core.provider;

import M.n;
import androidx.core.util.Consumer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16121b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f16120a = i7;
        this.f16121b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f16120a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((p279s5.d) this.f16121b).c(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f16126c) {
                    try {
                        n nVar = i.f16127d;
                        ArrayList arrayList = (ArrayList) nVar.get((String) this.f16121b);
                        if (arrayList == null) {
                            return;
                        }
                        nVar.remove((String) this.f16121b);
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            ((Consumer) arrayList.get(i7)).accept(hVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
