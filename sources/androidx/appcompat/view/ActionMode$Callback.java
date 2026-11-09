package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuItem;
import p343x.a;

/* JADX INFO: loaded from: classes.dex */
public interface ActionMode$Callback {
    boolean onActionItemClicked(a aVar, MenuItem menuItem);

    boolean onCreateActionMode(a aVar, Menu menu);

    void onDestroyActionMode(a aVar);

    boolean onPrepareActionMode(a aVar, Menu menu);
}
