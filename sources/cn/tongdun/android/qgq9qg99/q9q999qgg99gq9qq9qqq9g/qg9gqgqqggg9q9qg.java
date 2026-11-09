package cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
final class qg9gqgqqggg9q9qg implements FilenameFilter {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ String f19099q999ggg99999qqggqqg9qg;
    private /* synthetic */ gqgg9q99qg9 qgq9qg99;

    public qg9gqgqqggg9q9qg(gqgg9q99qg9 gqgg9q99qg9Var, String str) {
        this.qgq9qg99 = gqgg9q99qg9Var;
        this.f19099q999ggg99999qqggqqg9qg = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f19099q999ggg99999qqggqqg9qg);
    }
}
