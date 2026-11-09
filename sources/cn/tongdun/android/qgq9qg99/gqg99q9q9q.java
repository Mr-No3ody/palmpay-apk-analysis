package cn.tongdun.android.qgq9qg99;

import android.content.Context;
import android.content.pm.PackageInfo;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class gqg99q9q9q implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ Context f19082q999ggg99999qqggqqg9qg;
    private /* synthetic */ q999ggg99999qqggqqg9qg qgq9qg99;

    public gqg99q9q9q(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, Context context) {
        this.qgq9qg99 = q999ggg99999qqggqqg9qgVar;
        this.f19082q999ggg99999qqggqqg9qg = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: merged with bridge method [inline-methods] */
    public PackageInfo invoke() {
        try {
            return this.f19082q999ggg99999qqggqqg9qg.getPackageManager().getPackageInfo(this.f19082q999ggg99999qqggqqg9qg.getPackageName(), 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
