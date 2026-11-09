package com.nimbusds.jose.shaded.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends o implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23686a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n) && ((n) obj).f23686a.equals(this.f23686a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f23686a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f23686a.iterator();
    }
}
