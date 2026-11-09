package com.bumptech.glide.load.model;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class q extends J1.k {
    @Override // J1.k
    public final void c(Object obj, Object obj2) {
        r rVar = (r) obj;
        rVar.getClass();
        ArrayDeque arrayDeque = r.f20862d;
        synchronized (arrayDeque) {
            arrayDeque.offer(rVar);
        }
    }
}
