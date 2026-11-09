package p363y5;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewTreeObserver;
import com.growingio.android.sdk.track.webservices.widget.TipView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f44058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f44059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TipView f44060c;

    public a(TipView tipView, Activity activity, View view) {
        this.f44060c = tipView;
        this.f44058a = activity;
        this.f44059b = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        IBinder windowToken = this.f44058a.getWindow().getDecorView().getWindowToken();
        if (windowToken != null) {
            int i7 = TipView.f23198j;
            this.f44060c.a(windowToken);
            this.f44059b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
