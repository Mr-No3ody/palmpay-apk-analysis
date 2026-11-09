package com.transsnet.palmpay.core.service;

import F6.d;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.O;
import com.transsnet.palmpay.core.base.BaseApplication;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/service/UpdateBadgeService;", "Landroidx/core/app/O;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpdateBadgeService extends O {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f27407i = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void enqueueWork(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String str = Build.BRAND;
            if ("TECNO".equalsIgnoreCase(str) || "Infinix".equalsIgnoreCase(str) || "Itel".equalsIgnoreCase(str)) {
                try {
                    O.a(context, UpdateBadgeService.class, 1004, new Intent());
                } catch (SecurityException e10) {
                    d.c("UpdateBadgeService", "enqueueWork: ", e10);
                }
            }
        }

        private a() {
        }
    }

    @Override // androidx.core.app.O
    public final void e(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (BaseApplication.hasLogin()) {
            V v3 = V.f10828a;
            f fVar = I.f10809a;
            AbstractC0780y.m(v3, e.f19009c, null, new Fa.a(this, null), 2);
        }
    }
}
