package p261r1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f41532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f41533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Postcard f41534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NavigationCallback f41535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f41536f;

    public a(c cVar, int i7, Context context, Intent intent, Postcard postcard, NavigationCallback navigationCallback) {
        this.f41536f = cVar;
        this.f41531a = i7;
        this.f41532b = context;
        this.f41533c = intent;
        this.f41534d = postcard;
        this.f41535e = navigationCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41536f.getClass();
        int i7 = this.f41531a;
        Context context = this.f41532b;
        Intent intent = this.f41533c;
        Postcard postcard = this.f41534d;
        if (i7 < 0) {
            context.startActivity(intent, postcard.getOptionsBundle());
        } else if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, i7, postcard.getOptionsBundle());
        } else {
            c.f41538a.warning("ARouter::", "Must use [navigation(activity, ...)] to support [startActivityForResult]");
        }
        if (-1 != postcard.getEnterAnim() && -1 != postcard.getExitAnim() && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(postcard.getEnterAnim(), postcard.getExitAnim());
        }
        NavigationCallback navigationCallback = this.f41535e;
        if (navigationCallback != null) {
            navigationCallback.onArrival(postcard);
        }
    }
}
