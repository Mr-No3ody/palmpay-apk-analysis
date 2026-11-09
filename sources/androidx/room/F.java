package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class F extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f17705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(G g7, int i7) {
        super(1);
        this.f17704a = i7;
        this.f17705b = g7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17704a) {
            case 0:
                SupportSQLiteDatabase it = (SupportSQLiteDatabase) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                G.access$internalBeginTransaction(this.f17705b);
                break;
            default:
                SupportSQLiteDatabase it2 = (SupportSQLiteDatabase) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                this.f17705b.a();
                break;
        }
        return null;
    }
}
