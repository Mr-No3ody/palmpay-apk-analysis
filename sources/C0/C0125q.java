package C0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0125q extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0130w f1080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0125q(AbstractC0130w abstractC0130w, int i7) {
        super(1);
        this.f1079a = i7;
        this.f1080b = abstractC0130w;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1079a) {
            case 0:
                K destination = (K) obj;
                Intrinsics.checkNotNullParameter(destination, "destination");
                return Boolean.valueOf(!this.f1080b.f1112l.containsKey(Integer.valueOf(destination.f961i)));
            default:
                K destination2 = (K) obj;
                Intrinsics.checkNotNullParameter(destination2, "destination");
                return Boolean.valueOf(!this.f1080b.f1112l.containsKey(Integer.valueOf(destination2.f961i)));
        }
    }
}
