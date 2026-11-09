package ch;

import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import p227p.a$b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements a$b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f19029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputView f19030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f19031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MTNButton f19032d;

    @Override // p227p.a$b
    public final void a() {
        this.f19032d.e();
    }

    @Override // p227p.a$b
    public final void b() {
        this.f19032d.f25722f = 0;
        e();
    }

    @Override // p227p.a$b
    public final String c() {
        return null;
    }

    @Override // p227p.a$b
    public final void d() {
        this.f19031c.setVisibility(8);
        this.f19031c.setText("");
    }

    public final void e() {
        if (this.f19032d.d()) {
            return;
        }
        if (TextUtils.isEmpty(this.f19030b.get())) {
            this.f19032d.c();
        } else {
            this.f19032d.f();
        }
    }

    @Override // p227p.a$b
    public final String f() {
        return this.f19030b.get();
    }

    @Override // p227p.a$b
    public final void a(String str) {
        this.f19031c.setVisibility(0);
        this.f19031c.setText(str);
    }
}
