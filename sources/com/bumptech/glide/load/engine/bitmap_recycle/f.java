package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ArrayPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f20584a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20585b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20586c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f20587d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20589f;

    public f(int i7) {
        this.f20588e = i7;
    }

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
        while (this.f20589f > i7) {
            Object objC = this.f20584a.c();
            J1.g.b(objC);
            ArrayAdapterInterface arrayAdapterInterfaceC = c(objC.getClass());
            this.f20589f -= arrayAdapterInterfaceC.getArrayLength(objC) * arrayAdapterInterfaceC.getElementSizeInBytes();
            a(arrayAdapterInterfaceC.getArrayLength(objC), objC.getClass());
            if (Log.isLoggable(arrayAdapterInterfaceC.getTag(), 2)) {
                arrayAdapterInterfaceC.getTag();
                arrayAdapterInterfaceC.getArrayLength(objC);
            }
        }
    }

    public final ArrayAdapterInterface c(Class cls) {
        a aVar;
        HashMap map = this.f20587d;
        ArrayAdapterInterface arrayAdapterInterface = (ArrayAdapterInterface) map.get(cls);
        if (arrayAdapterInterface != null) {
            return arrayAdapterInterface;
        }
        if (cls.equals(int[].class)) {
            aVar = new a(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            aVar = new a(0);
        }
        map.put(cls, aVar);
        return aVar;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final synchronized void clearMemory() {
        b(0);
    }

    public final Object d(d dVar, Class cls) {
        ArrayAdapterInterface arrayAdapterInterfaceC = c(cls);
        Object objA = this.f20584a.a(dVar);
        if (objA != null) {
            this.f20589f -= arrayAdapterInterfaceC.getArrayLength(objA) * arrayAdapterInterfaceC.getElementSizeInBytes();
            a(arrayAdapterInterfaceC.getArrayLength(objA), cls);
        }
        if (objA != null) {
            return objA;
        }
        if (Log.isLoggable(arrayAdapterInterfaceC.getTag(), 2)) {
            arrayAdapterInterfaceC.getTag();
        }
        return arrayAdapterInterfaceC.newArray(dVar.f20581b);
    }

    public final NavigableMap e(Class cls) {
        HashMap map = this.f20586c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final synchronized Object get(int i7, Class cls) {
        d dVar;
        int i10;
        try {
            Integer num = (Integer) e(cls).ceilingKey(Integer.valueOf(i7));
            if (num == null || ((i10 = this.f20589f) != 0 && this.f20588e / i10 < 2 && num.intValue() > i7 * 8)) {
                e eVar = this.f20585b;
                Poolable poolableW = (Poolable) ((ArrayDeque) eVar.f1592b).poll();
                if (poolableW == null) {
                    poolableW = eVar.w();
                }
                dVar = (d) poolableW;
                dVar.f20581b = i7;
                dVar.f20582c = cls;
            } else {
                e eVar2 = this.f20585b;
                int iIntValue = num.intValue();
                Poolable poolableW2 = (Poolable) ((ArrayDeque) eVar2.f1592b).poll();
                if (poolableW2 == null) {
                    poolableW2 = eVar2.w();
                }
                dVar = (d) poolableW2;
                dVar.f20581b = iIntValue;
                dVar.f20582c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d(dVar, cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final synchronized Object getExact(int i7, Class cls) {
        d dVar;
        e eVar = this.f20585b;
        Poolable poolableW = (Poolable) ((ArrayDeque) eVar.f1592b).poll();
        if (poolableW == null) {
            poolableW = eVar.w();
        }
        dVar = (d) poolableW;
        dVar.f20581b = i7;
        dVar.f20582c = cls;
        return d(dVar, cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final void put(Object obj, Class cls) {
        put(obj);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final synchronized void trimMemory(int i7) {
        try {
            if (i7 >= 40) {
                clearMemory();
            } else if (i7 >= 20 || i7 == 15) {
                b(this.f20588e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public final synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        ArrayAdapterInterface arrayAdapterInterfaceC = c(cls);
        int arrayLength = arrayAdapterInterfaceC.getArrayLength(obj);
        int elementSizeInBytes = arrayAdapterInterfaceC.getElementSizeInBytes() * arrayLength;
        if (elementSizeInBytes <= this.f20588e / 2) {
            e eVar = this.f20585b;
            Poolable poolableW = (Poolable) ((ArrayDeque) eVar.f1592b).poll();
            if (poolableW == null) {
                poolableW = eVar.w();
            }
            d dVar = (d) poolableW;
            dVar.f20581b = arrayLength;
            dVar.f20582c = cls;
            this.f20584a.b(dVar, obj);
            NavigableMap navigableMapE = e(cls);
            Integer num = (Integer) navigableMapE.get(Integer.valueOf(dVar.f20581b));
            Integer numValueOf = Integer.valueOf(dVar.f20581b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapE.put(numValueOf, Integer.valueOf(iIntValue));
            this.f20589f += elementSizeInBytes;
            b(this.f20588e);
        }
    }
}
