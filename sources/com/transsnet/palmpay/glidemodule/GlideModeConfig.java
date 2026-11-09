package com.transsnet.palmpay.glidemodule;

import C0.G;
import G1.d;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.e;
import com.bumptech.glide.j;
import com.bumptech.glide.load.engine.bitmap_recycle.h;
import com.bumptech.glide.load.engine.cache.c;
import com.bumptech.glide.load.engine.cache.f;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.module.a;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.MerchantLogo;
import com.transsnet.palmpay.util.DeviceUtils;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p310ub.C2085k0;
import p359y1.b;

/* JADX INFO: loaded from: classes4.dex */
@GlideModule
public class GlideModeConfig extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f31835a = Runtime.getRuntime().maxMemory() / 16;

    @Override // com.bumptech.glide.module.a, com.bumptech.glide.module.AppliesOptions
    public final void applyOptions(Context context, e eVar) {
        int i7;
        DeviceUtils.LEVEL deviceLevel = DeviceUtils.getDeviceLevel(context);
        boolean z3 = deviceLevel == DeviceUtils.LEVEL.HIGH || deviceLevel == DeviceUtils.LEVEL.BEST;
        long jMin = Math.min(f31835a, z3 ? 50331648L : 25165824L);
        long j6 = (!z3 || BaseApplication.get().isOldAndroidDevice()) ? jMin / 3 : jMin / 2;
        eVar.f20447f = new f(jMin);
        eVar.f20445d = new h(j6);
        File file = new File(BaseApplication.getContext().getExternalCacheDir(), "image");
        if (!file.exists()) {
            file.mkdirs();
        }
        eVar.f20450i = new c(new com.bumptech.glide.load.engine.cache.h(file.getAbsolutePath(), 2), 104857600L);
        int i10 = b.f44029c;
        androidx.camera.core.impl.utils.executor.e eVar2 = new androidx.camera.core.impl.utils.executor.e(3);
        if (b.f44029c == 0) {
            b.f44029c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i11 = b.f44029c;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException(G.o("Name must be non-null and non-empty, but given: ", "source"));
        }
        ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(i11, i11, 30000L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new PriorityBlockingQueue(), (ThreadFactory) new p359y1.a(eVar2, "source", false), "\u200bcom.bumptech.glide.load.engine.executor.GlideExecutor$Builder", true);
        if (30000 != 0) {
            shadowThreadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        eVar.f20448g = new b(shadowThreadPoolExecutor);
        d dVar = new d();
        if (p059e1.a.C("key_enable_hw_bitmap", false) && (i7 = Build.VERSION.SDK_INT) >= 26 && i7 != 29) {
            dVar = (d) dVar.C(o.f20936i, Boolean.TRUE);
        }
        eVar.f20454m = new C2085k0((d) dVar.m(com.bumptech.glide.load.b.f20515b), 17);
    }

    @Override // com.bumptech.glide.module.b, com.bumptech.glide.module.RegistersComponents
    public final void registerComponents(Context context, com.bumptech.glide.b bVar, j jVar) {
        jVar.j(new p345x1.b(BaseApplication.get().getHttpClient()));
        jVar.c(MerchantLogo.class, InputStream.class, new p222oc.d(0));
        jVar.c(Rb.a.class, InputStream.class, new p222oc.d(1));
    }
}
