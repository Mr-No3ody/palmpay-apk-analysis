package T6;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9030a;

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        switch (this.f9030a) {
            case 1:
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(item, "item");
                break;
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode mode, Menu menu) {
        switch (this.f9030a) {
            case 0:
                return false;
            case 1:
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(menu, "menu");
                return false;
            default:
                if (menu == null) {
                    return true;
                }
                try {
                    menu.removeItem(R.id.autofill);
                    return true;
                } catch (Exception unused) {
                    return true;
                }
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode mode) {
        switch (this.f9030a) {
            case 1:
                Intrinsics.checkNotNullParameter(mode, "mode");
                break;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        switch (this.f9030a) {
            case 0:
                break;
            case 1:
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(menu, "menu");
                break;
            default:
                if (menu != null) {
                    try {
                        menu.removeItem(R.id.autofill);
                    } catch (Exception unused) {
                        return false;
                    }
                }
                break;
        }
        return false;
    }

    private final void a(ActionMode actionMode) {
    }

    private final void b(ActionMode actionMode) {
    }
}
