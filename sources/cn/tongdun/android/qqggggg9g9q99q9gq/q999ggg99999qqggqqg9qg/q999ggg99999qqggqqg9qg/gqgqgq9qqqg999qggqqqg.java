package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.content.pm.PackageInfo;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class gqgqgq9qqqg999qggqqqg implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ Context f19243q999ggg99999qqggqqg9qg;

    public gqgqgq9qqqg999qggqqqg(Context context) {
        this.f19243q999ggg99999qqggqqg9qg = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: merged with bridge method [inline-methods] */
    public PackageInfo invoke() {
        try {
            return this.f19243q999ggg99999qqggqqg9qg.getPackageManager().getPackageInfo(qq9gg99gqqqgqgq999gqg.gqgg9q99qg9, 64);
        } catch (Exception unused) {
            return null;
        }
    }
}
