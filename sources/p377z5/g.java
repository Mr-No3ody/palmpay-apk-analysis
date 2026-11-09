package p377z5;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.hjq.toast.config.IToast;

/* JADX INFO: loaded from: classes3.dex */
public class g extends Toast implements IToast {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f44459a;

    @Override // android.widget.Toast, com.hjq.toast.config.IToast
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        TextView textView = this.f44459a;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // android.widget.Toast, com.hjq.toast.config.IToast
    public final void setView(View view) {
        super.setView(view);
        if (view == null) {
            this.f44459a = null;
        } else {
            this.f44459a = findMessageView(view);
        }
    }
}
