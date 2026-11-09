package Od;

import android.content.IntentFilter;
import android.os.Build;
import com.alibaba.android.alpha.Task;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.task.VagueConfigTask;
import p183m6.n;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VagueConfigTask f6820a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(VagueConfigTask vagueConfigTask, String str) {
        super(str);
        this.f6820a = vagueConfigTask;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        VagueConfigTask vagueConfigTask = this.f6820a;
        BaseInitTask.beginSection$default(vagueConfigTask, null, 1, null);
        try {
            if (n.f39523a.instance().b("featureTaskVague", false)) {
                if (Build.VERSION.SDK_INT < 33) {
                    BaseApplication.get().registerReceiver(Aa.d.f98b.getInstance(), new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                } else {
                    BaseApplication.get().registerReceiver(Aa.d.f98b.getInstance(), new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), 2);
                }
            }
        } catch (Exception e10) {
            F6.d.c("VagueConfigTask", "run: ", e10);
        }
        BaseInitTask.endSection$default(vagueConfigTask, null, 1, null);
    }
}
