package M0;

import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements SupportSQLiteQuery {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5705c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f5707b;

    public b(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f5706a = query;
        this.f5707b = objArr;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void bindTo(SupportSQLiteProgram statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f5705c.bind(statement, this.f5707b);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final int getArgCount() {
        Object[] objArr = this.f5707b;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final String getSql() {
        return this.f5706a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
