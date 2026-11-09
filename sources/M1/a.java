package M1;

import android.util.SparseArray;
import android.util.SparseIntArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5720b = new a(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5721c = new a(0, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5722a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i10) {
        super(i7);
        this.f5722a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5722a) {
            case 0:
                return new SparseIntArray();
            default:
                return new SparseArray();
        }
    }
}
