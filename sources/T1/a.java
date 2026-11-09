package T1;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8933b = new a(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8934c = new a(0, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8935a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i10) {
        super(i7);
        this.f8935a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8935a) {
            case 0:
                break;
        }
        return new ArrayList();
    }
}
