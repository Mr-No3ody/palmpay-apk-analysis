package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1180o implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f17188a;

    public C1180o(DialogFragment dialogFragment) {
        this.f17188a = dialogFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (((LifecycleOwner) obj) != null) {
            DialogFragment dialogFragment = this.f17188a;
            if (dialogFragment.mShowsDialog) {
                View viewRequireView = dialogFragment.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogFragment.mDialog != null) {
                    if (Z.L(3)) {
                        Objects.toString(dialogFragment.mDialog);
                    }
                    dialogFragment.mDialog.setContentView(viewRequireView);
                }
            }
        }
    }
}
