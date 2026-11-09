package androidx.preference;

import android.content.DialogInterface;
import com.growingio.android.circler.ThreadSafeTipView$OnExitListener;

/* JADX INFO: loaded from: classes.dex */
public final class g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17632b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f17631a = i7;
        this.f17632b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f17631a) {
            case 0:
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = (ListPreferenceDialogFragmentCompat) this.f17632b;
                listPreferenceDialogFragmentCompat.f17529j = i7;
                listPreferenceDialogFragmentCompat.f17583i = -1;
                dialogInterface.dismiss();
                break;
            case 1:
                ((Ab.r) this.f17632b).onExitDebugger();
                break;
            case 2:
                ((ThreadSafeTipView$OnExitListener) this.f17632b).onExitDebugger();
                break;
            case 3:
                ((com.google.firebase.crashlytics.internal.concurrency.b) this.f17632b).onExitDebugger();
                break;
            default:
                ((com.growingio.android.debugger.ThreadSafeTipView$OnExitListener) this.f17632b).onExitDebugger();
                break;
        }
    }
}
