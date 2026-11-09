package Z4;

import C0.G;
import android.text.TextUtils;
import com.growingio.android.sdk.track.events.EventBuildInterceptor;
import com.growingio.android.sdk.track.listener.OnUserIdChangedListener;
import p198n5.h;
import p279s5.n;

/* JADX INFO: loaded from: classes3.dex */
public class d implements EventBuildInterceptor, OnUserIdChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11511a;

    public d(String str) {
        this.f11511a = str;
        n.f42043a.r(this);
    }

    @Override // com.growingio.android.sdk.track.events.EventBuildInterceptor
    public final void eventWillBuild(p111h5.c cVar) {
        cVar.f37312n.put("dataSourceId", this.f11511a);
        String string = p152k5.e.f38687a.f38688a.getString("GIO_ID", null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        cVar.f37312n.put("gioId", string);
    }

    @Override // com.growingio.android.sdk.track.listener.OnUserIdChangedListener
    public final void onUserIdChanged(String str) {
        p152k5.f fVar = p152k5.e.f38687a;
        String string = fVar.f38688a.getString("GIO_ID", null);
        h.a("CdpEventBuildInterceptor", G.p("onUserIdChanged: newUserId = ", str, ", mLatestGioId = ", string), new Object[0]);
        if (str == null || str.length() == 0 || str.equals(string)) {
            return;
        }
        fVar.f38688a.putString("GIO_ID", str);
    }

    @Override // com.growingio.android.sdk.track.events.EventBuildInterceptor
    public void eventDidBuild(p216o5.d dVar) {
    }
}
