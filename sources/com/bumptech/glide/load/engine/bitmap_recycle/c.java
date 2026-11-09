package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20578a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20579b = new HashMap();

    public final Object a(Poolable poolable) {
        HashMap map = this.f20579b;
        b bVar = (b) map.get(poolable);
        if (bVar == null) {
            bVar = new b(poolable);
            map.put(poolable, bVar);
        } else {
            poolable.offer();
        }
        b bVar2 = bVar.f20577d;
        bVar2.f20576c = bVar.f20576c;
        bVar.f20576c.f20577d = bVar2;
        b bVar3 = this.f20578a;
        bVar.f20577d = bVar3;
        b bVar4 = bVar3.f20576c;
        bVar.f20576c = bVar4;
        bVar4.f20577d = bVar;
        bVar.f20577d.f20576c = bVar;
        ArrayList arrayList = bVar.f20575b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return bVar.f20575b.remove(size - 1);
        }
        return null;
    }

    public final void b(Poolable poolable, Object obj) {
        HashMap map = this.f20579b;
        b bVar = (b) map.get(poolable);
        if (bVar == null) {
            bVar = new b(poolable);
            bVar.f20577d = bVar;
            b bVar2 = this.f20578a;
            bVar.f20577d = bVar2.f20577d;
            bVar.f20576c = bVar2;
            bVar2.f20577d = bVar;
            bVar.f20577d.f20576c = bVar;
            map.put(poolable, bVar);
        } else {
            poolable.offer();
        }
        if (bVar.f20575b == null) {
            bVar.f20575b = new ArrayList();
        }
        bVar.f20575b.add(obj);
    }

    public final Object c() {
        b bVar = this.f20578a;
        b bVar2 = bVar.f20577d;
        while (true) {
            if (bVar2.equals(bVar)) {
                return null;
            }
            ArrayList arrayList = bVar2.f20575b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? bVar2.f20575b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            b bVar3 = bVar2.f20577d;
            bVar3.f20576c = bVar2.f20576c;
            bVar2.f20576c.f20577d = bVar3;
            HashMap map = this.f20579b;
            Object obj = bVar2.f20574a;
            map.remove(obj);
            ((Poolable) obj).offer();
            bVar2 = bVar2.f20577d;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        b bVar = this.f20578a;
        b bVar2 = bVar.f20576c;
        boolean z3 = false;
        while (!bVar2.equals(bVar)) {
            sb2.append('{');
            sb2.append(bVar2.f20574a);
            sb2.append(':');
            ArrayList arrayList = bVar2.f20575b;
            sb2.append(arrayList != null ? arrayList.size() : 0);
            sb2.append("}, ");
            bVar2 = bVar2.f20576c;
            z3 = true;
        }
        if (z3) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
