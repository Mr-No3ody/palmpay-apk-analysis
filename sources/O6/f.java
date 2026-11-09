package O6;

import Ce.T;
import N8.W;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class f extends Dialog {
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private DialogInterface.OnShowListener mOnShowListener;

    @Override // android.app.Dialog
    public void setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        this.mOnCancelListener = onCancelListener;
        super.setOnCancelListener(new W(onCancelListener));
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
        super.setOnDismissListener(new T(onDismissListener));
    }

    @Override // android.app.Dialog
    public void setOnShowListener(@Nullable DialogInterface.OnShowListener onShowListener) {
        this.mOnShowListener = onShowListener;
        super.setOnShowListener(new g(onShowListener));
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }
}
