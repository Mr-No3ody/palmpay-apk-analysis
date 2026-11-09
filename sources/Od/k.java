package Od;

import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import com.alibaba.android.alpha.Task;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.task.WelcomeNewUserConfigTask;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WelcomeNewUserConfigTask f6823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(WelcomeNewUserConfigTask welcomeNewUserConfigTask, String str) {
        super(str);
        this.f6823a = welcomeNewUserConfigTask;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        WelcomeNewUserConfigTask welcomeNewUserConfigTask = this.f6823a;
        BaseInitTask.beginSection$default(welcomeNewUserConfigTask, null, 1, null);
        V v3 = V.f10828a;
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(v3, p042cg.e.f19009c, null, new j(welcomeNewUserConfigTask, null), 2);
        BaseInitTask.endSection$default(welcomeNewUserConfigTask, null, 1, null);
    }
}
