package p033c4;

import C9.ViewOnClickListenerC0146m;
import android.widget.TextView;
import com.flexibank.sdk.p;
import p215o4.b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f18860g;

    @Override // p215o4.b
    public final void a() {
        ((TextView) findViewById(p.fb_title_tv)).setText(this.f18858e);
        ((TextView) findViewById(p.fb_mobile_wallet_name)).setText(this.f18859f);
        ((TextView) findViewById(p.fb_guide_msg)).setText(this.f18860g);
        ((TextView) findViewById(p.fb_confirm_tv)).setOnClickListener(new ViewOnClickListenerC0146m(this, 20));
    }
}
