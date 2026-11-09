package ch;

import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import p227p.c$a;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements c$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f19060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputView f19061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MTNButton f19062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f19063d;

    public j(k kVar) {
        this.f19063d = kVar;
    }

    @Override // p227p.c$a
    public final void a() {
        this.f19062c.e();
    }

    @Override // p227p.c$a
    public final void b() {
        this.f19062c.f25722f = 0;
        d();
    }

    public final void d() {
        if (this.f19062c.d()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f19061b.get()) && (this.f19061b.getDigit() == 0 || this.f19061b.get().length() == this.f19061b.getDigit())) {
            this.f19062c.f();
        } else {
            this.f19062c.c();
        }
    }

    @Override // p227p.c$a
    public final void a(String str) {
        this.f19060a.setVisibility(0);
        this.f19060a.setText(str);
    }

    @Override // p227p.c$a
    public final void c() {
    }
}
