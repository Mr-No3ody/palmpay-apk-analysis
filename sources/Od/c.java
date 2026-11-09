package Od;

import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import com.alibaba.android.alpha.Task;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.task.HomeMenuConfigTask;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeMenuConfigTask f6809a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HomeMenuConfigTask homeMenuConfigTask, String str) {
        super(str);
        this.f6809a = homeMenuConfigTask;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        HomeMenuConfigTask homeMenuConfigTask = this.f6809a;
        BaseInitTask.beginSection$default(homeMenuConfigTask, null, 1, null);
        V v3 = V.f10828a;
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(v3, p042cg.e.f19009c, null, new b(homeMenuConfigTask, null), 2);
        BaseInitTask.endSection$default(homeMenuConfigTask, null, 1, null);
    }
}
