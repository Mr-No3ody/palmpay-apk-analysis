package androidx.camera.video;

import android.media.MediaMuxer;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
interface Recorder$RecordingRecord$MediaMuxerSupplier {
    @NonNull
    MediaMuxer get(int i7, @NonNull Consumer<Uri> consumer) throws IOException;
}
