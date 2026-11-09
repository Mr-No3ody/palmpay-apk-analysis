package androidx.fragment.app;

import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC1178m implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f17182a;

    public DialogInterfaceOnCancelListenerC1178m(DialogFragment dialogFragment) {
        this.f17182a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.f17182a;
        if (dialogFragment.mDialog != null) {
            dialogFragment.onCancel(dialogFragment.mDialog);
        }
    }
}
