package C0;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(int i7, Bundle bundle) {
        super(1);
        this.f924a = i7;
        this.f925b = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f924a) {
            case 0:
                String argName = (String) obj;
                Intrinsics.checkNotNullParameter(argName, "argName");
                return Boolean.valueOf(!this.f925b.containsKey(argName));
            default:
                String key = (String) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                return Boolean.valueOf(!this.f925b.containsKey(key));
        }
    }
}
