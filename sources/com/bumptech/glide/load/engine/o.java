package com.bumptech.glide.load.engine;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1.e f20722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f20723b;

    public o(G1.e eVar, Executor executor) {
        this.f20722a = eVar;
        this.f20723b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f20722a.equals(((o) obj).f20722a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20722a.hashCode();
    }
}
