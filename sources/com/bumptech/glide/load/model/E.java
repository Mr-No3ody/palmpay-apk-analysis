package com.bumptech.glide.load.model;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class E implements ModelLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f20817b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.SCHEME)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoader f20818a;

    public E(ModelLoader modelLoader) {
        this.f20818a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final t buildLoadData(Object obj, int i7, int i10, com.bumptech.glide.load.h hVar) {
        return this.f20818a.buildLoadData(new l(((Uri) obj).toString()), i7, i10, hVar);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        return f20817b.contains(((Uri) obj).getScheme());
    }
}
