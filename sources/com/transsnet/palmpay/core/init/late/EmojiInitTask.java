package com.transsnet.palmpay.core.init.late;

import E.AbstractC0198c;
import F6.d;
import android.app.Application;
import android.content.Context;
import androidx.emoji2.text.i;
import androidx.emoji2.text.s;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_CRONET}, group = BaseInitTaskKt.GROUP_LATE_INIT, name = BaseInitTaskKt.LATE_INIT_EMOJI_TASK)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/init/late/EmojiInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "initEmojiCompat", "", "context", "Landroid/content/Context;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmojiInitTask extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    public final void initEmojiCompat(Context context) {
        s sVarI;
        try {
            if (!i.d() && (sVarI = AbstractC0198c.i(context)) != null) {
                i.c(sVarI);
                d.h(BaseInitTask.TAG, 3, "EmojiCompat init ok");
            }
        } catch (Exception e10) {
            d.c(BaseInitTask.TAG, "EmojiCompat init failed", e10);
        }
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.late.EmojiInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(EmojiInitTask.this, null, 1, null);
                EmojiInitTask.this.initEmojiCompat(application);
                BaseInitTask.endSection$default(EmojiInitTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.LATE_INIT_EMOJI_TASK;
    }
}
