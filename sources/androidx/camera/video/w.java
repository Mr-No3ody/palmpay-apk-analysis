package androidx.camera.video;

import androidx.camera.core.UseCase$StateChangeCallback;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Observable.Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f14866a;

    public w(C c6) {
        this.f14866a = c6;
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onError(Throwable th) {
        p140j8.f.G("VideoCapture");
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onNewData(Object obj) {
        h hVar = (h) obj;
        if (hVar == null) {
            throw new IllegalArgumentException("StreamInfo can't be null");
        }
        C c6 = this.f14866a;
        if (c6.f14549u == F.f14572c) {
            return;
        }
        Objects.toString(c6.f14546q);
        hVar.toString();
        p140j8.f.G("VideoCapture");
        h hVar2 = c6.f14546q;
        c6.f14546q = hVar;
        C0993n c0993n = c6.f2079g;
        c0993n.getClass();
        int i7 = hVar2.f14601a;
        Set set = h.f14599d;
        boolean zContains = set.contains(Integer.valueOf(i7));
        int i10 = hVar.f14601a;
        if (!zContains && !set.contains(Integer.valueOf(i10)) && i7 != i10) {
            c6.L();
            return;
        }
        int i11 = hVar2.f14601a;
        if ((i11 != -1 && i10 == -1) || (i11 == -1 && i10 != -1)) {
            c6.F(c6.f14547r, hVar, c0993n);
            Object[] objArr = {c6.f14547r.d()};
            ArrayList arrayList = new ArrayList(1);
            Object obj2 = objArr[0];
            Objects.requireNonNull(obj2);
            arrayList.add(obj2);
            c6.C(Collections.unmodifiableList(arrayList));
            c6.o();
            return;
        }
        if (hVar2.f14602b != hVar.f14602b) {
            c6.F(c6.f14547r, hVar, c0993n);
            Object[] objArr2 = {c6.f14547r.d()};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj3 = objArr2[0];
            Objects.requireNonNull(obj3);
            arrayList2.add(obj3);
            c6.C(Collections.unmodifiableList(arrayList2));
            Iterator it = c6.f2073a.iterator();
            while (it.hasNext()) {
                ((UseCase$StateChangeCallback) it.next()).onUseCaseUpdated(c6);
            }
        }
    }
}
