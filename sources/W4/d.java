package W4;

import C0.G;
import android.text.TextUtils;
import com.growingio.android.hybrid.OnDomChangedListener;
import com.growingio.android.sdk.track.listener.OnUserIdChangedListener;
import p279s5.l;
import p279s5.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends D4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7) {
        super(7);
        this.f10557c = i7;
    }

    @Override // D4.f
    public final void u(Object obj, Object obj2) {
        switch (this.f10557c) {
            case 0:
                ((OnDomChangedListener) obj).onDomChanged();
                break;
            default:
                ((OnUserIdChangedListener) obj).onUserIdChanged((String) obj2);
                break;
        }
    }

    public void w(String str) throws Throwable {
        ((com.growingio.android.sdk.a) p279s5.d.b().f42025b).getClass();
        if (str != null && str.length() > 1000) {
            p198n5.h.c("UserInfoPolicy", "GrowingIO.setUserId(KEY, VALUE):VALUE长度大于1000，不发送", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            p152k5.e.f38687a.a(null);
            p198n5.h.a("UserInfoPolicy", "clean the userId (and will also clean the userKey", new Object[0]);
            l(null);
            return;
        }
        p152k5.f fVar = p152k5.e.f38687a;
        String string = fVar.f38688a.getString("LOGIN_USER_ID", "");
        if (str == string || (str != null && str.equals(string))) {
            String string2 = fVar.f38688a.getString("LOGIN_USER_KEY", "");
            if (string2 != null && (string2 == null || !string2.equals(null))) {
                fVar.a(str);
            }
            p198n5.h.a("UserInfoPolicy", "setUserId, but the userId is same as the old userId, just return", new Object[0]);
            return;
        }
        l(str);
        TextUtils.isEmpty(null);
        fVar.a(str);
        p152k5.d dVar = fVar.f38688a;
        String string3 = dVar.getString("LATEST_NON_NULL_USER_ID", "");
        p198n5.h.a("UserInfoPolicy", G.p("onUserIdChanged: newUserId = ", str, ", mLatestNonNullUserId = ", string3), new Object[0]);
        if (str == null || str.length() == 0) {
            return;
        }
        if (TextUtils.isEmpty(string3)) {
            l.f42040a.getClass();
            m.a();
        } else if (!str.equals(string3)) {
            l.f42040a.getClass();
            m.b();
            m.a();
        }
        dVar.putString("LATEST_NON_NULL_USER_ID", str);
    }
}
