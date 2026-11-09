package Ca;

import com.alibaba.android.alpha.Task;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.core.rnbridge.ReactNativeInitTask;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReactNativeInitTask f1343a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReactNativeInitTask reactNativeInitTask) {
        super(BaseInitTaskKt.TASK_REACT_NATIVE_INIT, false);
        this.f1343a = reactNativeInitTask;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        ReactNativeInitTask reactNativeInitTask = this.f1343a;
        BaseInitTask.beginSection$default(reactNativeInitTask, null, 1, null);
        if (p267r9.a.f41645a.a()) {
            reactNativeInitTask.initOkHttpClientFactory();
        }
        BaseInitTask.endSection$default(reactNativeInitTask, null, 1, null);
    }
}
