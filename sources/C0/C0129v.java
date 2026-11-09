package C0;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0129v extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0129v(String str, int i7) {
        super(1);
        this.f1095a = i7;
        this.f1096b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1095a) {
            case 0:
                return Boolean.valueOf(Intrinsics.c((String) obj, this.f1096b));
            case 1:
                Pair it = (Pair) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.c(it.f38891a, this.f1096b));
            default:
                WorkDatabase db2 = (WorkDatabase) obj;
                Intrinsics.checkNotNullParameter(db2, "db");
                Object objApply = androidx.work.impl.model.k.f18611z.apply(db2.h().getWorkStatusPojoForTag(this.f1096b));
                Intrinsics.checkNotNullExpressionValue(objApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForTag(tag))");
                return (List) objApply;
        }
    }
}
