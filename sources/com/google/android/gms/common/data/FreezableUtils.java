package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import p317v0.f;

/* JADX INFO: loaded from: classes2.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        f fVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            fVar.add(arrayList.get(i7).freeze());
        }
        return fVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        f fVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            fVar.add(it.next().freeze());
        }
        return fVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        f fVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            fVar.add(e10.freeze());
        }
        return fVar;
    }
}
