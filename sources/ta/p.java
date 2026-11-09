package ta;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.C0833k;
import androidx.appcompat.app.DialogInterfaceC0834l;
import com.transsnet.palmpay.core.location.listeners.DialogListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f42390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42391b;

    public p(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42391b = message;
    }

    public final DialogInterfaceC0834l a(Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0833k c0833k = new C0833k(context);
        c0833k.setMessage(this.f42391b);
        c0833k.setCancelable(false);
        c0833k.setPositiveButton(R.string.ok, this);
        c0833k.setNegativeButton(R.string.cancel, this);
        return c0833k.create();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i7) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (i7 == -2) {
            WeakReference weakReference = this.f42390a;
            Intrinsics.e(weakReference);
            if (((DialogListener) weakReference.get()) != null) {
                WeakReference weakReference2 = this.f42390a;
                Intrinsics.e(weakReference2);
                DialogListener dialogListener = (DialogListener) weakReference2.get();
                Intrinsics.e(dialogListener);
                dialogListener.onNegativeButtonClick();
                return;
            }
            return;
        }
        if (i7 != -1) {
            return;
        }
        WeakReference weakReference3 = this.f42390a;
        Intrinsics.e(weakReference3);
        if (((DialogListener) weakReference3.get()) != null) {
            WeakReference weakReference4 = this.f42390a;
            Intrinsics.e(weakReference4);
            DialogListener dialogListener2 = (DialogListener) weakReference4.get();
            Intrinsics.e(dialogListener2);
            dialogListener2.onPositiveButtonClick();
        }
    }
}
