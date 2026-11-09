package Od;

import android.app.Application;
import com.alibaba.android.alpha.Task;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.service.PushMainService;
import com.transsnet.palmpay.task.StartPushServiceTask;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartPushServiceTask f6815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f6816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StartPushServiceTask startPushServiceTask, Application application, String str) {
        super(str);
        this.f6815a = startPushServiceTask;
        this.f6816b = application;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        StartPushServiceTask startPushServiceTask = this.f6815a;
        BaseInitTask.beginSection$default(startPushServiceTask, null, 1, null);
        PushMainService.f34093f.start(this.f6816b, false);
        BaseInitTask.endSection$default(startPushServiceTask, null, 1, null);
    }
}
