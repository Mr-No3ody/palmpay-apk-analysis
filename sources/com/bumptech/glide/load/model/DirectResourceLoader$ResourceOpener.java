package com.bumptech.glide.load.model;

import android.content.res.Resources;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
interface DirectResourceLoader$ResourceOpener<DataT> {
    void close(DataT datat) throws IOException;

    Class<DataT> getDataClass();

    DataT open(@Nullable Resources.Theme theme, Resources resources, int i7);
}
