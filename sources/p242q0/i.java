package p242q0;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    @DoNotInline
    public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
        mediaMetadataRetriever.setDataSource(mediaDataSource);
    }
}
