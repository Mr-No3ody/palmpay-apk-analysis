package com.bumptech.glide.request;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.request.target.Target;

/* JADX INFO: loaded from: classes.dex */
public interface RequestListener<R> {
    boolean onLoadFailed(@Nullable u uVar, @Nullable Object obj, @NonNull Target<R> target, boolean z3);

    boolean onResourceReady(@NonNull R r3, @NonNull Object obj, Target<R> target, @NonNull a aVar, boolean z3);
}
