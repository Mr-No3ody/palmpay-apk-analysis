package Q2;

import F2.f;
import com.facebook.common.internal.Supplier;
import com.palmpay.lib.apm.launchcounter.util.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7582a;

    public /* synthetic */ a(int i7) {
        this.f7582a = i7;
    }

    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        switch (this.f7582a) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Boolean.TRUE;
            case 4:
                return Boolean.FALSE;
            default:
                return d.z(f.f2558h);
        }
    }
}
