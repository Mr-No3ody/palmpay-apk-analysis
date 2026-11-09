package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.core.impl.AbstractC0970b0;
import java.util.Iterator;
import java.util.List;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13486c;

    public boolean a() {
        return (this.f13486c || this.f13485b) && this.f13484a;
    }

    public void b(List list) {
        if ((this.f13484a || this.f13485b || this.f13486c) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractC0970b0) it.next()).a();
            }
            f.G("ForceCloseDeferrableSurface");
        }
    }
}
