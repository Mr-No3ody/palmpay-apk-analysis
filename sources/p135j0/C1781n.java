package p135j0;

import androidx.datastore.core.StorageConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: j0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1781n extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f38106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1781n(O o10, int i7) {
        super(0);
        this.f38105a = i7;
        this.f38106b = o10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38105a) {
            case 0:
                return ((StorageConnection) this.f38106b.f37970j.getValue()).getCoordinator();
            default:
                return this.f38106b.f37961a.createConnection();
        }
    }
}
