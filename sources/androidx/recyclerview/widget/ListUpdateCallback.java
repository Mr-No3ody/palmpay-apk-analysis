package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface ListUpdateCallback {
    void onChanged(int i7, int i10, @Nullable Object obj);

    void onInserted(int i7, int i10);

    void onMoved(int i7, int i10);

    void onRemoved(int i7, int i10);
}
