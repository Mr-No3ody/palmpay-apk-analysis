package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import com.bumptech.glide.load.engine.bitmap_recycle.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThumbnailQuery f20558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f20559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f20560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20561d;

    public c(ArrayList arrayList, ThumbnailQuery thumbnailQuery, f fVar, ContentResolver contentResolver) {
        this.f20558a = thumbnailQuery;
        this.f20559b = fVar;
        this.f20560c = contentResolver;
        this.f20561d = arrayList;
    }
}
