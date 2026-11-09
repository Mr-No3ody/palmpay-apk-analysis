package p337w8;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends o implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f43305b = new d(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f43306c = new d(0, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f43307d = new d(0, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43308a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i10) {
        super(i7);
        this.f43308a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f43308a) {
            case 0:
                return new AtomicBoolean(false);
            case 1:
                return Fg.d.f2846i.e();
            default:
                return new c();
        }
    }
}
