package cn.tongdun.android.shell.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class qqggggg9g9q99q9gq implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ Context f19278q999ggg99999qqggqqg9qg;
    private /* synthetic */ String qgq9qg99;

    public qqggggg9g9q99q9gq(Context context, String str) {
        this.f19278q999ggg99999qqggqqg9qg = context;
        this.qgq9qg99 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: merged with bridge method [inline-methods] */
    public PackageInfo invoke() {
        try {
            return this.f19278q999ggg99999qqggqqg9qg.getPackageManager().getPackageInfo(this.qgq9qg99, 64);
        } catch (Exception unused) {
            return null;
        }
    }
}
