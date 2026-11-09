package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.content.pm.PackageInfo;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class qq9gg9q implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ Context f19245q999ggg99999qqggqqg9qg;

    public qq9gg9q(Context context) {
        this.f19245q999ggg99999qqggqqg9qg = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: merged with bridge method [inline-methods] */
    public PackageInfo invoke() {
        try {
            return this.f19245q999ggg99999qqggqqg9qg.getPackageManager().getPackageInfo(gq9gggq9gq9gg9q99g9q.gqgg9q99qg9, 64);
        } catch (Exception unused) {
            return null;
        }
    }
}
