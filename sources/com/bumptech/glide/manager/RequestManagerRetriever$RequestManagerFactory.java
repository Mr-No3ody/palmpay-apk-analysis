package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.p;

/* JADX INFO: loaded from: classes.dex */
public interface RequestManagerRetriever$RequestManagerFactory {
    @NonNull
    p build(@NonNull com.bumptech.glide.b bVar, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context);
}
