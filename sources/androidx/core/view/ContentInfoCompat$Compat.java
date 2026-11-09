package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
interface ContentInfoCompat$Compat {
    @NonNull
    ClipData getClip();

    @Nullable
    Bundle getExtras();

    int getFlags();

    @Nullable
    Uri getLinkUri();

    int getSource();

    @Nullable
    ContentInfo getWrapped();
}
