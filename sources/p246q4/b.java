package p246q4;

import android.text.LoginFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class b extends LoginFilter.UsernameFilterGeneric {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41454a;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b() {
        super(false);
        Intrinsics.checkNotNullParameter("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]\n", "mNotAllowed");
        this.f41454a = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]\n";
    }

    @Override // android.text.LoginFilter.UsernameFilterGeneric, android.text.LoginFilter
    public final boolean isAllowed(char c6) {
        return StringsKt.D(this.f41454a, c6, 0, 6) < 0;
    }
}
