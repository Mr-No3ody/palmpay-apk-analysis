package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public interface VideoDecoder$MediaInitializer<T> {
    @RequiresApi(16)
    void initializeExtractor(MediaExtractor mediaExtractor, T t) throws IOException;

    void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever, T t);
}
