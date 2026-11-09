package p130ic;

import androidx.lifecycle.F;
import androidx.lifecycle.a0;

/* JADX INFO: renamed from: ic.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1747b extends a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f37496d = new F(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37497e;

    public final void d(int i7) {
        F f10 = this.f37496d;
        Integer num = (Integer) f10.d();
        if (num != null && num.intValue() == i7) {
            return;
        }
        f10.k(Integer.valueOf(i7));
    }
}
