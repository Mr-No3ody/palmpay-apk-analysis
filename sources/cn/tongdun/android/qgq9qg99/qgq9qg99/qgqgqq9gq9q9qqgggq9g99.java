package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.content.pm.PackageInfo;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class qgqgqq9gq9q9qqgggq9g99 implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ Context f19200q999ggg99999qqggqqg9qg;
    private /* synthetic */ String qgq9qg99;

    public qgqgqq9gq9q9qqgggq9g99(Context context, String str) {
        this.f19200q999ggg99999qqggqqg9qg = context;
        this.qgq9qg99 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: merged with bridge method [inline-methods] */
    public PackageInfo invoke() {
        try {
            return this.f19200q999ggg99999qqggqqg9qg.getPackageManager().getPackageInfo(this.qgq9qg99, 64);
        } catch (Exception unused) {
            return null;
        }
    }
}
