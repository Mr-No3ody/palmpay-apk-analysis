package O6;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f6656a;

    public g(DialogInterface.OnShowListener onShowListener) {
        this.f6656a = new WeakReference(onShowListener);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        WeakReference weakReference = this.f6656a;
        if (weakReference.get() != null) {
            ((DialogInterface.OnShowListener) weakReference.get()).onShow(dialogInterface);
        }
    }
}
