package mh;

import android.R;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends V6.a {
    @Override // V6.a
    public final void b() {
        setContentView(p349x8.b.mtn_gate_page_layout);
        Window window = getWindow();
        window.setBackgroundDrawableResource(R.color.transparent);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = p118hf.a.a(86.0f);
        attributes.height = -2;
        window.setAttributes(attributes);
    }
}
