package N8;

import android.content.DialogInterface;
import com.transsnet.palmpay.account.ui.activity.SetTouchIdActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class W implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6182a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6183b;

    public W(DialogInterface.OnCancelListener onCancelListener) {
        this.f6183b = new WeakReference(onCancelListener);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f6182a) {
            case 0:
                SetTouchIdActivity setTouchIdActivity = (SetTouchIdActivity) this.f6183b;
                setTouchIdActivity.setResult(0);
                setTouchIdActivity.finish();
                break;
            default:
                DialogInterface.OnCancelListener onCancelListener = (DialogInterface.OnCancelListener) ((WeakReference) this.f6183b).get();
                if (onCancelListener != null) {
                    onCancelListener.onCancel(dialogInterface);
                }
                break;
        }
    }

    public W(SetTouchIdActivity setTouchIdActivity) {
        this.f6183b = setTouchIdActivity;
    }
}
