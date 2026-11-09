package androidx.room;

import Pa.C0525w;
import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.room.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1234m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SupportSQLiteOpenHelper.Factory f17773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0525w f17774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f17775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final E f17777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f17778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f17779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f17780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f17781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f17782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f17783m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f17784n;

    public C1234m(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, C0525w migrationContainer, ArrayList arrayList, boolean z3, E journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z8, boolean z10, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f17771a = context;
        this.f17772b = str;
        this.f17773c = sqliteOpenHelperFactory;
        this.f17774d = migrationContainer;
        this.f17775e = arrayList;
        this.f17776f = z3;
        this.f17777g = journalMode;
        this.f17778h = queryExecutor;
        this.f17779i = transactionExecutor;
        this.f17780j = z8;
        this.f17781k = z10;
        this.f17782l = linkedHashSet;
        this.f17783m = typeConverters;
        this.f17784n = autoMigrationSpecs;
    }
}
