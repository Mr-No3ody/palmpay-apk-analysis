package p215o4;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.TextView;
import com.flexibank.sdk.p;
import p173ld.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f40026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40027f;

    @Override // p215o4.b
    public final void a() {
        TextView textView = (TextView) findViewById(p.fb_tips_msg);
        TextView textView2 = (TextView) findViewById(p.fb_confirm_tv);
        textView.setText(this.f40026e);
        textView.setGravity(this.f40027f);
        if (!TextUtils.isEmpty(null)) {
            textView2.setText((CharSequence) null);
        }
        textView2.setOnClickListener(new o(this, 11));
    }

    @Override // android.app.Dialog
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
    }
}
