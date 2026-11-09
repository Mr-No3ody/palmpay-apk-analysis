package androidx.appcompat.app;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class O implements Toolbar.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f12160a;

    public O(S s3) {
        this.f12160a = s3;
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f12160a.f12165b.f12082a.onMenuItemSelected(0, menuItem);
    }
}
