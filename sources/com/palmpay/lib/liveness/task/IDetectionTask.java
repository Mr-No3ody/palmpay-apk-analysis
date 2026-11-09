package com.palmpay.lib.liveness.task;

import com.facebook.react.uimanager.ViewProps;
import com.google.mlkit.vision.face.Face;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/palmpay/lib/liveness/task/IDetectionTask;", "", ViewProps.START, "", "process", "", "face", "Lcom/google/mlkit/vision/face/Face;", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IDetectionTask {
    boolean process(@NotNull Face face2);

    void start();
}
