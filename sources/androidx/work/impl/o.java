package androidx.work.impl;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.transsnet.adsdk.AdManager;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements SupportSQLiteOpenHelper.Factory, Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f18667a;

    public /* synthetic */ o(Context context) {
        this.f18667a = context;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        return AdManager.lambda$preloadSingleAd$4(this.f18667a, (Boolean) obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(M0.g gVar) {
        return WorkDatabase.a.create$lambda$0(this.f18667a, gVar);
    }
}
