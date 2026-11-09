package ch;

import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import p227p.a$b;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements a$b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputView f19038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputView f19039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f19040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MTNButton f19041d;

    @Override // p227p.a$b
    public final void a() {
        this.f19041d.e();
    }

    @Override // p227p.a$b
    public final void b() {
        this.f19041d.f25722f = 0;
        e();
    }

    @Override // p227p.a$b
    public final String c() {
        return this.f19039b.get();
    }

    @Override // p227p.a$b
    public final void d() {
        this.f19040c.setVisibility(8);
        this.f19040c.setText("");
    }

    public final void e() {
        if (this.f19041d.d()) {
            return;
        }
        if (TextUtils.isEmpty(this.f19038a.get()) || TextUtils.isEmpty(this.f19039b.get())) {
            this.f19041d.c();
        } else {
            this.f19041d.f();
        }
    }

    @Override // p227p.a$b
    public final String f() {
        return this.f19038a.get();
    }

    @Override // p227p.a$b
    public final void a(String str) {
        this.f19040c.setVisibility(0);
        this.f19040c.setText(str);
    }
}
