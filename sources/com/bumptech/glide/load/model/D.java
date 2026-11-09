package com.bumptech.glide.load.model;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class D implements ModelLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f20815b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", FirebaseAnalytics.Param.CONTENT, "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20816a;

    public D(UriLoader$LocalUriFetcherFactory uriLoader$LocalUriFetcherFactory) {
        this.f20816a = uriLoader$LocalUriFetcherFactory;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.bumptech.glide.load.model.UriLoader$LocalUriFetcherFactory, java.lang.Object] */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public final t buildLoadData(Object obj, int i7, int i10, com.bumptech.glide.load.h hVar) {
        Uri uri = (Uri) obj;
        return new t(new I1.d(uri), this.f20816a.build(uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        return f20815b.contains(((Uri) obj).getScheme());
    }
}
