package mh;

import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import com.transsnet.mtn.sdk.ui.view.wheelview.widget.WheelView;
import p141j9.C1794b;
import p173ld.o;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends V6.a {
    public static String[] t = (String[]) org.chromium.support_lib_boundary.util.b.b(1).toArray(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f39776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f39777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WheelView f39778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WheelView f39779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WheelView f39780g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MTNButton f39781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f39782j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A8.a f39783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f39784p;

    @Override // V6.a
    public final void b() {
        setContentView(p349x8.b.mtn_date_picker_layout);
        this.f39776c = (TextView) findViewById(p349x8.a.mtn_title);
        this.f39777d = (ImageView) findViewById(p349x8.a.mtn_close);
        this.f39778e = (WheelView) findViewById(p349x8.a.mtn_day);
        this.f39779f = (WheelView) findViewById(p349x8.a.mtn_month);
        this.f39780g = (WheelView) findViewById(p349x8.a.mtn_year);
        this.f39781i = (MTNButton) findViewById(p349x8.a.mtn_confirm);
        this.f39777d.setOnClickListener(new o(this, 8));
        this.f39781i.setOnFDSClickListener(new C1794b(this, 15));
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(p349x8.e.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = l.c();
        attributes.height = -2;
        window.setAttributes(attributes);
        this.f39782j = new d(this);
    }
}
