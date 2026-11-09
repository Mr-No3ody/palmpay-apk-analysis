package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
interface DecodePath$DecodeCallback<ResourceType> {
    @NonNull
    Resource<ResourceType> onResourceDecoded(@NonNull Resource<ResourceType> resource);
}
