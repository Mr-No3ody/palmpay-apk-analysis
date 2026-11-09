package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14298a;

    public y0(List list) {
        this.f14298a = new ArrayList(list);
    }

    public static void d(y0 y0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = y0Var.f14298a.iterator();
        while (it.hasNext()) {
            arrayList.add(((Quirk) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            return;
        }
        while (true) {
            sb2.append((CharSequence) it2.next());
            if (!it2.hasNext()) {
                return;
            } else {
                sb2.append((CharSequence) " | ");
            }
        }
    }

    public final boolean a(Class cls) {
        Iterator it = this.f14298a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((Quirk) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final Quirk b(Class cls) {
        for (Quirk quirk : this.f14298a) {
            if (quirk.getClass() == cls) {
                return quirk;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Quirk quirk : this.f14298a) {
            if (cls.isAssignableFrom(quirk.getClass())) {
                arrayList.add(quirk);
            }
        }
        return arrayList;
    }
}
