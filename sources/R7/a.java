package R7;

import N2.b;
import com.swmansion.rnscreens.gamma.helpers.ViewIdProviding;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewIdProviding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7933a;

    static {
        b bVar = new b();
        bVar.f6069a = 3;
        f7933a = bVar;
    }

    @Override // com.swmansion.rnscreens.gamma.helpers.ViewIdProviding
    public final int generateViewId() {
        return f7933a.generateViewId();
    }
}
