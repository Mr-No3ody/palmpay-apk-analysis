package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
interface ContentInfoCompat$BuilderCompat {
    @NonNull
    C1054f build();

    void setClip(@NonNull ClipData clipData);

    void setExtras(@Nullable Bundle bundle);

    void setFlags(int i7);

    void setLinkUri(@Nullable Uri uri);

    void setSource(int i7);
}
