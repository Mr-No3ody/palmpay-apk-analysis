package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface ResourceDecoder<T, Z> {
    @Nullable
    Resource<Z> decode(@NonNull T t, int i7, int i10, @NonNull h hVar) throws IOException;

    boolean handles(@NonNull T t, @NonNull h hVar) throws IOException;
}
