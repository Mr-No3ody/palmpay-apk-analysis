package Mc;

import com.alibaba.android.alpha.Task;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.managemoney.init.ManagerMoneyInitTask;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ManagerMoneyInitTask f5932a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ManagerMoneyInitTask managerMoneyInitTask) {
        super(BaseInitTaskKt.TASK_10);
        this.f5932a = managerMoneyInitTask;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        ManagerMoneyInitTask managerMoneyInitTask = this.f5932a;
        BaseInitTask.beginSection$default(managerMoneyInitTask, null, 1, null);
        managerMoneyInitTask.getInterestRateConfig();
        BaseInitTask.endSection$default(managerMoneyInitTask, null, 1, null);
    }
}
