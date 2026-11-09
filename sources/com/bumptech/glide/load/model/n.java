package com.bumptech.glide.load.model;

import C0.G;

/* JADX INFO: loaded from: classes.dex */
public final class n implements LazyHeaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20856a;

    public n(String str) {
        this.f20856a = str;
    }

    @Override // com.bumptech.glide.load.model.LazyHeaderFactory
    public final String buildHeader() {
        return this.f20856a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f20856a.equals(((n) obj).f20856a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20856a.hashCode();
    }

    public final String toString() {
        return G.r(new StringBuilder("StringHeaderFactory{value='"), this.f20856a, "'}");
    }
}
