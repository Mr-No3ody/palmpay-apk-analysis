package com.bumptech.glide.load.model;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface Headers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f20819a;

    static {
        m mVar = new m();
        mVar.f20853a = true;
        f20819a = new o(mVar.f20854b);
    }

    Map<String, String> getHeaders();
}
