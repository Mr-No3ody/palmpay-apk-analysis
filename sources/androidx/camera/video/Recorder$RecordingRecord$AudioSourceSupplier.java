package androidx.camera.video;

import E.AbstractC0210o;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
interface Recorder$RecordingRecord$AudioSourceSupplier {
    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    androidx.camera.video.internal.audio.b get(@NonNull androidx.camera.video.internal.audio.a aVar, @NonNull Executor executor) throws AbstractC0210o;
}
