package p279s5;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.growingio.android.sdk.track.listener.IActivityLifecycle;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import e5.c;
import p182m5.a;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements IActivityLifecycle {
    @Override // com.growingio.android.sdk.track.listener.IActivityLifecycle
    public final void onActivityLifecycle(a aVar) {
        Uri data;
        int i7 = aVar.f39477a;
        if (i7 == 1 || i7 == 4) {
            Activity activityA = aVar.a();
            Intent intent = activityA != null ? activityA.getIntent() : null;
            if (intent == null || (data = intent.getData()) == null || !((com.growingio.android.sdk.a) d.b().f42025b).f23184b.equals(data.getScheme())) {
                return;
            }
            h.a("DeepLinkProvider", "enter growingio:" + data.toString(), new Object[0]);
            c.f36164a.x(new b(this, data));
        }
    }
}
