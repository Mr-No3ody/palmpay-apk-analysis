package com.transsnet.palmpay.core.init;

import C0.G;
import F6.d;
import Ff.h;
import Pa.RunnableC0527y;
import Pa.T;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.D;
import Wf.I;
import Wf.v0;
import android.app.Application;
import androidx.camera.core.impl.utils.executor.g;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.pp.faceguard.traffic.FaceGuardTraffic;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.PhoneUtils;
import face.security.device.api.FaceSecDevice;
import face.security.device.api.FaceSecToken;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_HTTP_CLIENT_WARM, BaseInitTaskKt.TASK_GET_FCM_TOKEN}, name = BaseInitTaskKt.TASK_INIT_FACE_GUARD)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/core/init/FaceGuardInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "taskScope", "Lkotlinx/coroutines/CoroutineScope;", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "getDeviceToken", "", "Companion", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FaceGuardInitTask extends BaseInitTask {
    private static final long MIN_INTERVAL_MS = 3000;

    @NotNull
    private static final String USER_PRODUCT_KEY = "sgaec7116agsc83944aa357a2066175b";

    @NotNull
    private final CoroutineScope taskScope;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.init.FaceGuardInitTask$getDeviceToken$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.transsnet.palmpay.core.init.FaceGuardInitTask$getDeviceToken$1", f = "FaceGuardInitTask.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    g.M(obj);
                    this.label = 1;
                    if (D.b(FaceGuardInitTask.MIN_INTERVAL_MS, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.M(obj);
                }
                FaceSecToken deviceToken = FaceSecDevice.getInstance().getDeviceToken();
                if (deviceToken != null) {
                    int i10 = deviceToken.code;
                    if (10000 != i10) {
                        d.h(BaseInitTask.TAG, 3, "AliyunFaceGuard get token fail code=" + i10);
                    } else {
                        if (Intrinsics.c(p059e1.a.I("face_guard_device_token", ""), deviceToken.token)) {
                            return Unit.f38893a;
                        }
                        if (BaseApplication.hasLogin()) {
                            FaceGuardTraffic.bindDeviceTokens(BaseApplication.get().getUser().getMemberId(), deviceToken.token, "", null);
                        }
                        String token = deviceToken.token;
                        Intrinsics.checkNotNullExpressionValue(token, "token");
                        p059e1.a.W("face_guard_device_token", token);
                        d.h(BaseInitTask.TAG, 3, "AliyunFaceGuard get token success token=" + deviceToken.token);
                        T.b(-4).execute(new RunnableC0527y(1));
                    }
                } else {
                    d.h(BaseInitTask.TAG, 3, "AliyunFaceGuard get token fail, token is null");
                }
            } catch (Exception e10) {
                d.c(BaseInitTask.TAG, G.o("AliyunFaceGuard get token fail, exception=", e10.getMessage()));
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.init.FaceGuardInitTask$getTask$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/transsnet/palmpay/core/init/FaceGuardInitTask$getTask$1", "Lcom/alibaba/android/alpha/Task;", "run", "", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C14591 extends Task {
        final /* synthetic */ Application $application;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14591(Application application, String str) {
            super(str);
            this.$application = application;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void run$lambda$0(FaceGuardInitTask faceGuardInitTask, int i7) {
            if (10000 != i7) {
                d.h(BaseInitTask.TAG, 3, "AliyunFaceGuard init fail");
            } else {
                d.h(BaseInitTask.TAG, 3, "AliyunFaceGuard init success");
                faceGuardInitTask.getDeviceToken();
            }
        }

        @Override // com.alibaba.android.alpha.Task
        public void run() {
            BaseInitTask.beginSection$default(FaceGuardInitTask.this, null, 1, null);
            FaceGuardTraffic.initialize(PhoneUtils.getUniqueId(), false, (U) p324va.d.f43142a.f18580b);
            HashMap map = new HashMap();
            map.put("IPv6", "0");
            map.put("DataSwitch", "0");
            map.put("CustomUrl", "https://cloudauth-device.eu-central-1.aliyuncs.com");
            map.put("CustomHost", "cloudauth-device.eu-central-1.aliyuncs.com");
            FaceSecDevice.getInstance().initWithOptions(this.$application, FaceGuardInitTask.USER_PRODUCT_KEY, map, new com.google.firebase.crashlytics.internal.concurrency.b(FaceGuardInitTask.this, 22));
            BaseInitTask.endSection$default(FaceGuardInitTask.this, null, 1, null);
        }
    }

    public FaceGuardInitTask() {
        f fVar = I.f10809a;
        e eVar = e.f19009c;
        v0 v0VarC = AbstractC0780y.c();
        eVar.getClass();
        this.taskScope = AbstractC0777v.a(kotlin.coroutines.e.c(eVar, v0VarC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getDeviceToken() {
        AbstractC0780y.m(this.taskScope, null, null, new AnonymousClass1(null), 3);
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new C14591(application, getTaskName());
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_INIT_FACE_GUARD;
    }
}
