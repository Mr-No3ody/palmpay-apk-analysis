package com.abedelazizshe.lightcompressorlibrary.config;

import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class c implements VideoResizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f19296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f19297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19298c;

    public c(double d2, double d10, boolean z3) {
        this.f19296a = d2;
        this.f19297b = d10;
        this.f19298c = z3;
    }

    @Override // com.abedelazizshe.lightcompressorlibrary.config.VideoResizer
    public final Pair resize(double d2, double d10) {
        if (this.f19298c) {
            return new Pair(Double.valueOf(this.f19296a), Double.valueOf(this.f19297b));
        }
        return VideoResizer.f19290h0.keepAspect(d2, d10, this.f19296a, this.f19297b);
    }
}
