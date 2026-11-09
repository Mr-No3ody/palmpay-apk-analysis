package top.zibin.luban.io;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ArrayPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p039cb.c f42661a = new p039cb.c(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.c f42662b = new p1.c(28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f42663c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f42664d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42665e = 4194304;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42666f;

    public final void a(int i7, Class cls) {
        NavigableMap navigableMapE = e(cls);
        Integer num = (Integer) navigableMapE.get(Integer.valueOf(i7));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapE.remove(Integer.valueOf(i7));
                return;
            } else {
                navigableMapE.put(Integer.valueOf(i7), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i7 + ", this: " + this);
    }

    public final void b(int i7) {
        Object objRemove;
        while (this.f42666f > i7) {
            p039cb.c cVar = this.f42661a;
            d dVar = (d) cVar.f18901b;
            d dVar2 = dVar.f42657d;
            while (true) {
                objRemove = null;
                if (dVar2.equals(dVar)) {
                    break;
                }
                ArrayList arrayList = dVar2.f42655b;
                int size = arrayList != null ? arrayList.size() : 0;
                objRemove = size > 0 ? dVar2.f42655b.remove(size - 1) : null;
                if (objRemove != null) {
                    break;
                }
                d dVar3 = dVar2.f42657d;
                dVar3.f42656c = dVar2.f42656c;
                dVar2.f42656c.f42657d = dVar3;
                HashMap map = (HashMap) cVar.f18902c;
                PoolAble poolAble = dVar2.f42654a;
                map.remove(poolAble);
                poolAble.offer();
                dVar2 = dVar2.f42657d;
            }
            ArrayAdapterInterface arrayAdapterInterfaceC = c(objRemove.getClass());
            this.f42666f -= arrayAdapterInterfaceC.getArrayLength(objRemove) * arrayAdapterInterfaceC.getElementSizeInBytes();
            a(arrayAdapterInterfaceC.getArrayLength(objRemove), objRemove.getClass());
            if (Log.isLoggable(arrayAdapterInterfaceC.getTag(), 2)) {
                arrayAdapterInterfaceC.getTag();
                arrayAdapterInterfaceC.getArrayLength(objRemove);
            }
        }
    }

    public final ArrayAdapterInterface c(Class cls) {
        c cVar;
        HashMap map = this.f42664d;
        ArrayAdapterInterface arrayAdapterInterface = (ArrayAdapterInterface) map.get(cls);
        if (arrayAdapterInterface != null) {
            return arrayAdapterInterface;
        }
        if (cls.equals(int[].class)) {
            cVar = new c(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            cVar = new c(0);
        }
        map.put(cls, cVar);
        return cVar;
    }

    @Override // top.zibin.luban.io.ArrayPool
    public final synchronized void clearMemory() {
        b(0);
    }

    public final Object d(e eVar, Class cls) {
        ArrayAdapterInterface arrayAdapterInterfaceC = c(cls);
        p039cb.c cVar = this.f42661a;
        HashMap map = (HashMap) cVar.f18902c;
        d dVar = (d) map.get(eVar);
        if (dVar == null) {
            dVar = new d(eVar);
            map.put(eVar, dVar);
        } else {
            eVar.offer();
        }
        d dVar2 = dVar.f42657d;
        dVar2.f42656c = dVar.f42656c;
        dVar.f42656c.f42657d = dVar2;
        d dVar3 = (d) cVar.f18901b;
        dVar.f42657d = dVar3;
        d dVar4 = dVar3.f42656c;
        dVar.f42656c = dVar4;
        dVar4.f42657d = dVar;
        dVar.f42657d.f42656c = dVar;
        ArrayList arrayList = dVar.f42655b;
        int size = arrayList != null ? arrayList.size() : 0;
        Object objRemove = size > 0 ? dVar.f42655b.remove(size - 1) : null;
        if (objRemove != null) {
            this.f42666f -= arrayAdapterInterfaceC.getArrayLength(objRemove) * arrayAdapterInterfaceC.getElementSizeInBytes();
            a(arrayAdapterInterfaceC.getArrayLength(objRemove), cls);
        }
        if (objRemove != null) {
            return objRemove;
        }
        if (Log.isLoggable(arrayAdapterInterfaceC.getTag(), 2)) {
            arrayAdapterInterfaceC.getTag();
        }
        return arrayAdapterInterfaceC.newArray(eVar.f42659b);
    }

    public final NavigableMap e(Class cls) {
        HashMap map = this.f42663c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    @Override // top.zibin.luban.io.ArrayPool
    public final synchronized Object get(int i7, Class cls) {
        Integer num;
        int i10;
        try {
            num = (Integer) e(cls).ceilingKey(Integer.valueOf(i7));
        } catch (Throwable th) {
            throw th;
        }
        return d((num == null || ((i10 = this.f42666f) != 0 && this.f42665e / i10 < 2 && num.intValue() > i7 * 8)) ? this.f42662b.e(i7, cls) : this.f42662b.e(num.intValue(), cls), cls);
    }

    @Override // top.zibin.luban.io.ArrayPool
    public final void put(Object obj, Class cls) {
        put(obj);
    }

    @Override // top.zibin.luban.io.ArrayPool
    public final synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        ArrayAdapterInterface arrayAdapterInterfaceC = c(cls);
        int arrayLength = arrayAdapterInterfaceC.getArrayLength(obj);
        int elementSizeInBytes = arrayAdapterInterfaceC.getElementSizeInBytes() * arrayLength;
        if (elementSizeInBytes <= this.f42665e / 2) {
            e eVarE = this.f42662b.e(arrayLength, cls);
            this.f42661a.f(eVarE, obj);
            NavigableMap navigableMapE = e(cls);
            Integer num = (Integer) navigableMapE.get(Integer.valueOf(eVarE.f42659b));
            Integer numValueOf = Integer.valueOf(eVarE.f42659b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapE.put(numValueOf, Integer.valueOf(iIntValue));
            this.f42666f += elementSizeInBytes;
            b(this.f42665e);
        }
    }
}
