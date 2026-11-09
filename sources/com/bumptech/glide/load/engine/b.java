package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
public final class b extends RuntimeException {
    public b(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
