package androidx.fragment.app;

import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC1179n implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f17185a;

    public DialogInterfaceOnDismissListenerC1179n(DialogFragment dialogFragment) {
        this.f17185a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.f17185a;
        if (dialogFragment.mDialog != null) {
            dialogFragment.onDismiss(dialogFragment.mDialog);
        }
    }
}
