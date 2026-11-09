package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.content.pm.PackageInfo;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class qgq9q9999qg implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ Context f19194q999ggg99999qqggqqg9qg;

    public qgq9q9999qg(Context context) {
        this.f19194q999ggg99999qqggqqg9qg = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: merged with bridge method [inline-methods] */
    public PackageInfo invoke() {
        try {
            return this.f19194q999ggg99999qqggqqg9qg.getApplicationContext().getPackageManager().getPackageInfo(this.f19194q999ggg99999qqggqqg9qg.getPackageName(), 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
