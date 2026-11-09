package androidx.appcompat.app;

import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: androidx.appcompat.app.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0831i extends ArrayAdapter {
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
