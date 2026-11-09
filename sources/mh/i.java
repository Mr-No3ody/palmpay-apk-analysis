package mh;

import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import com.transsnet.mtn.sdk.ui.view.avloading.AVLoadingIndicatorView;
import p173ld.o;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends V6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f39789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebView f39790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AVLoadingIndicatorView f39791e;

    @Override // V6.a
    public final void a() {
        findViewById(p349x8.a.mtn_close).setOnClickListener(new o(this, 9));
    }

    @Override // V6.a
    public final void b() {
        setContentView(p349x8.b.mtn_terms_privacy_agreement_layout);
        this.f39789c = findViewById(p349x8.a.mtn_root);
        this.f39790d = (WebView) findViewById(p349x8.a.web_view);
        AVLoadingIndicatorView aVLoadingIndicatorView = (AVLoadingIndicatorView) findViewById(p349x8.a.mtn_avi);
        this.f39791e = aVLoadingIndicatorView;
        aVLoadingIndicatorView.getIndicator().setColor(Color.parseColor("#202046"));
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(p349x8.e.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = l.c();
        attributes.height = -2;
        window.setAttributes(attributes);
        this.f39789c.getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(this, 19));
        this.f39790d.setWebViewClient(new R3.a(this, 1));
        if (p073f.c.a().f36335c != null) {
            this.f39790d.loadUrl(p073f.c.a().f36335c);
        }
    }
}
