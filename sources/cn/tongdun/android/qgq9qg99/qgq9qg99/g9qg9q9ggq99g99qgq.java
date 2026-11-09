package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.content.pm.PackageInfo;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class g9qg9q9ggq99g99qgq implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ Context f19132q999ggg99999qqggqqg9qg;
    private /* synthetic */ String qgq9qg99;

    public g9qg9q9ggq99g99qgq(Context context, String str) {
        this.f19132q999ggg99999qqggqqg9qg = context;
        this.qgq9qg99 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: merged with bridge method [inline-methods] */
    public PackageInfo invoke() {
        try {
            return this.f19132q999ggg99999qqggqqg9qg.getPackageManager().getPackageInfo(this.qgq9qg99, 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
