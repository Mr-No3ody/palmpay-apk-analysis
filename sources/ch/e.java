package ch;

import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends eh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f19044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f19045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CardView f19046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f19047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f19048f;

    @Override // eh.a
    public final void f() {
        this.f19044b = findViewById(p349x8.a.mtn_bg);
        this.f19045c = (ImageView) findViewById(p349x8.a.mtn_logo);
        this.f19046d = (CardView) findViewById(p349x8.a.mtn_content);
        this.f19047e = (TextView) findViewById(p349x8.a.mtn_define);
        this.f19048f = (WebView) findViewById(p349x8.a.pcd_web);
    }

    @Override // eh.a
    public final int g() {
        return p349x8.b.mtn_base_login_activity_layout;
    }

    @Override // eh.a
    public final void i() {
        j();
        int color = Color.parseColor("#1AFFC90A".toUpperCase());
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(color);
        View view = this.f19044b;
        j();
        view.setBackgroundColor(Color.parseColor("#1AFFC90A".toUpperCase()));
        this.f19045c.setImageResource(j().f36328b);
        this.f19048f.getSettings().setJavaScriptEnabled(true);
        TextView textView = this.f19047e;
        j();
        textView.setTextColor(Color.parseColor("#FFC90A"));
        this.f19047e.setText(getString(p349x8.d.mtn_str_define, p073f.c.a().f36337e));
        View viewK = k();
        if (viewK != null) {
            this.f19046d.addView(viewK);
        }
        l();
    }

    public abstract p073f.a j();

    public abstract View k();

    public abstract void l();

    @Override // eh.a
    public final void h() {
    }
}
