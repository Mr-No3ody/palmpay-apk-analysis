package com.palmpay.image.loader;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.palmpay.image.callback.IBitmap;
import com.palmpay.image.callback.IFile;
import com.palmpay.image.callback.IResult;
import java.io.File;
import p061e3.o;

/* JADX INFO: loaded from: classes3.dex */
public interface IImageLoaderStrategy {
    void cleanAllMemory();

    void cleanMemory();

    o getPipelineConfig(Context context, a aVar);

    void init(Context context, a aVar);

    void loadFile(@NonNull Context context, @NonNull String str, String str2, int i7, int i10, IFile iFile);

    void loadImage(@NonNull Context context, @NonNull String str, IBitmap iBitmap);

    void loadImage(@NonNull c cVar);

    Bitmap loadSyncImage(@NonNull Context context, @NonNull String str, int i7, int i10);

    Bitmap loadSyncImage(@NonNull c cVar);

    void pause();

    void preLoad(@NonNull Context context, @NonNull String str, IResult<File> iResult);

    void resume();

    void showImage(@NonNull c cVar);
}
