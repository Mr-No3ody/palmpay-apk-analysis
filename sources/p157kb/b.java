package p157kb;

import com.alibaba.android.alpha.Task;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.credit.init.LoanBusinessConfigTask;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoanBusinessConfigTask f38724a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LoanBusinessConfigTask loanBusinessConfigTask, String str) {
        super(str);
        this.f38724a = loanBusinessConfigTask;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        LoanBusinessConfigTask loanBusinessConfigTask = this.f38724a;
        BaseInitTask.beginSection$default(loanBusinessConfigTask, null, 1, null);
        loanBusinessConfigTask.queryBusinessConfig("loan", 1296000, false);
        BaseInitTask.endSection$default(loanBusinessConfigTask, null, 1, null);
    }
}
