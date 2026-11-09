package com.google.mlkit.vision.face;

import androidx.annotation.NonNull;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface FaceDetector extends Detector<List<Face>>, OptionalModuleApi {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @OnLifecycleEvent(EnumC1203m.ON_DESTROY)
    void close();

    @NonNull
    Task<List<Face>> process(@NonNull MlImage mlImage);

    @NonNull
    Task<List<Face>> process(@NonNull InputImage inputImage);
}
