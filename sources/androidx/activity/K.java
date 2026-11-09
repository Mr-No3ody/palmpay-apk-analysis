package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K f12006b = new K(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K f12007c = new K(1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final K f12008d = new K(1, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12009a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i7, int i10) {
        super(i7);
        this.f12009a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f12009a) {
            case 0:
                Resources resources = (Resources) obj;
                Intrinsics.checkNotNullParameter(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                Intrinsics.checkNotNullParameter((Resources) obj, "<anonymous parameter 0>");
                return Boolean.TRUE;
            default:
                Intrinsics.checkNotNullParameter((Resources) obj, "<anonymous parameter 0>");
                return Boolean.FALSE;
        }
    }
}
