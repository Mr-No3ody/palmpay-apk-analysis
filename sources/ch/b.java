package ch;

import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import p227p.a$b;
import p227p.a$f;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a$b, a$f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputView f19033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputView f19034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputView f19035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f19036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MTNButton f19037e;

    @Override // p227p.a$b
    public final void a() {
        this.f19037e.e();
    }

    @Override // p227p.a$b
    public final void b() {
        this.f19037e.f25722f = 0;
        g();
    }

    @Override // p227p.a$b
    public final String c() {
        return this.f19033a.get();
    }

    @Override // p227p.a$b
    public final void d() {
        this.f19036d.setVisibility(8);
        this.f19036d.setText("");
    }

    @Override // p227p.a$f
    public final String e() {
        return this.f19035c.get();
    }

    @Override // p227p.a$b
    public final String f() {
        return this.f19034b.get();
    }

    public final void g() {
        if (this.f19037e.d()) {
            return;
        }
        if (TextUtils.isEmpty(this.f19033a.get()) || TextUtils.isEmpty(this.f19034b.get()) || TextUtils.isEmpty(this.f19035c.get())) {
            this.f19037e.c();
        } else {
            this.f19037e.f();
        }
    }

    @Override // p227p.a$b
    public final void a(String str) {
        this.f19036d.setVisibility(0);
        this.f19036d.setText(str);
    }
}
