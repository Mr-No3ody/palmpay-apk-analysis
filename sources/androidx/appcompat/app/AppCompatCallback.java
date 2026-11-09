package androidx.appcompat.app;

import androidx.annotation.Nullable;
import androidx.appcompat.view.ActionMode$Callback;

/* JADX INFO: loaded from: classes.dex */
public interface AppCompatCallback {
    void onSupportActionModeFinished(p343x.a aVar);

    void onSupportActionModeStarted(p343x.a aVar);

    @Nullable
    p343x.a onWindowStartingSupportActionMode(ActionMode$Callback actionMode$Callback);
}
