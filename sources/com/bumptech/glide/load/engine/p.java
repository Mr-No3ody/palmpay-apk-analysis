package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20724a;

    public p(ArrayList arrayList) {
        this.f20724a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f20724a.iterator();
    }
}
