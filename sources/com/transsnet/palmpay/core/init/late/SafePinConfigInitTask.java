package com.transsnet.palmpay.core.init.late;

import Ef.a;
import Ff.c;
import Pa.I;
import Pa.r0;
import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import Wf.V;
import android.app.Application;
import androidx.camera.core.impl.utils.executor.g;
import androidx.core.app.M;
import com.alibaba.android.alpha.Task;
import com.luck.picture.lib.config.PictureConfig;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.MemberLabelReq;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.TimeUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.LATE_INIT_VAGUE_TASK}, group = BaseInitTaskKt.GROUP_LATE_INIT, name = BaseInitTaskKt.LATE_INIT_SAFE_PIN_CONFIG_TASK)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/init/late/SafePinConfigInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "initSafeConfig", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadNotificationState", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafePinConfigInitTask extends BaseInitTask {

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.init.late.SafePinConfigInitTask$initSafeConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.transsnet.palmpay.core.init.late.SafePinConfigInitTask", f = "SafePinConfigInitTask.kt", i = {}, l = {PictureConfig.MAX_PAGE_SIZE}, m = "initSafeConfig", n = {}, s = {})
    public static final class C14631 extends c {
        int label;
        /* synthetic */ Object result;

        public C14631(Continuation<? super C14631> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SafePinConfigInitTask.this.initSafeConfig(this);
        }
    }

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.init.late.SafePinConfigInitTask$uploadNotificationState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.transsnet.palmpay.core.init.late.SafePinConfigInitTask", f = "SafePinConfigInitTask.kt", i = {0}, l = {86}, m = "uploadNotificationState", n = {"spKey"}, s = {"L$0"})
    public static final class C14641 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14641(Continuation<? super C14641> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SafePinConfigInitTask.this.uploadNotificationState(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object initSafeConfig(Continuation<? super Unit> continuation) {
        C14631 c14631;
        String str;
        if (continuation instanceof C14631) {
            c14631 = (C14631) continuation;
            int i7 = c14631.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c14631.label = i7 - Integer.MIN_VALUE;
            } else {
                c14631 = new C14631(continuation);
            }
        } else {
            c14631 = new C14631(continuation);
        }
        Object objQueryMemberLabelInfo = c14631.result;
        a aVar = a.f2423a;
        int i10 = c14631.label;
        try {
            if (i10 == 0) {
                g.M(objQueryMemberLabelInfo);
                MemberApiService memberApiService = (MemberApiService) p324va.c.f43141a.f14622c;
                MemberLabelReq memberLabelReq = new MemberLabelReq(3, "");
                c14631.label = 1;
                objQueryMemberLabelInfo = memberApiService.queryMemberLabelInfo(memberLabelReq, c14631);
                if (objQueryMemberLabelInfo == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(objQueryMemberLabelInfo);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) objQueryMemberLabelInfo;
            if (commonBeanResult.isSuccess()) {
                MemberLabelReq memberLabelReq2 = (MemberLabelReq) commonBeanResult.data;
                int i11 = (memberLabelReq2 == null || (str = memberLabelReq2.status) == null) ? 0 : Integer.parseInt(str);
                if (i11 != r0.o0()) {
                    SPUtils.getInstance().put(BaseApplication.getInstance().getUser().getPhoneNumber() + "PATTERN_PIN_SETTING", i11);
                }
            }
        } catch (Exception unused) {
        }
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object uploadNotificationState(Continuation<? super Unit> continuation) {
        C14641 c14641;
        String str;
        if (continuation instanceof C14641) {
            c14641 = (C14641) continuation;
            int i7 = c14641.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c14641.label = i7 - Integer.MIN_VALUE;
            } else {
                c14641 = new C14641(continuation);
            }
        } else {
            c14641 = new C14641(continuation);
        }
        Object obj = c14641.result;
        a aVar = a.f2423a;
        int i10 = c14641.label;
        try {
            if (i10 == 0) {
                g.M(obj);
                if (TimeUtils.isToday(p059e1.a.E(0L, "fcm_sp_last_upload_notify_state_time"))) {
                    return Unit.f38893a;
                }
                String str2 = new M(BaseApplication.getContext()).f15943b.areNotificationsEnabled() ? "1" : "0";
                MemberApiService memberApiService = (MemberApiService) p324va.c.f43141a.f14622c;
                MemberLabelReq memberLabelReq = new MemberLabelReq(17, str2);
                c14641.L$0 = "fcm_sp_last_upload_notify_state_time";
                c14641.label = 1;
                Object objMarkMemberLabel = memberApiService.markMemberLabel(memberLabelReq, c14641);
                if (objMarkMemberLabel == aVar) {
                    return aVar;
                }
                str = "fcm_sp_last_upload_notify_state_time";
                obj = objMarkMemberLabel;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c14641.L$0;
                g.M(obj);
            }
            if (((CommonResult) obj).isSuccess()) {
                p059e1.a.V(System.currentTimeMillis(), str);
            }
        } catch (Exception unused) {
        }
        return Unit.f38893a;
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.late.SafePinConfigInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(SafePinConfigInitTask.this, null, 1, null);
                if (BaseApplication.hasLogin()) {
                    V v3 = V.f10828a;
                    AbstractC0774s abstractC0774s = I.f7021a;
                    AbstractC0780y.m(v3, abstractC0774s, null, new SafePinConfigInitTask$getTask$1$run$1(SafePinConfigInitTask.this, null), 2);
                    AbstractC0780y.m(v3, abstractC0774s, null, new SafePinConfigInitTask$getTask$1$run$2(SafePinConfigInitTask.this, null), 2);
                }
                BaseInitTask.endSection$default(SafePinConfigInitTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.LATE_INIT_SAFE_PIN_CONFIG_TASK;
    }
}
