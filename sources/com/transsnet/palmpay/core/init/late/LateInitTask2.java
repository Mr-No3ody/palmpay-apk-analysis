package com.transsnet.palmpay.core.init.late;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import cn.tongdun.mobrisk.TDRiskCallback;
import com.adjust.sdk.Constants;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p017b1.a;
import p017b1.b;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, group = BaseInitTaskKt.GROUP_LATE_INIT, name = BaseInitTaskKt.LATE_INIT_TONG_DUN_TASK)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/core/init/late/LateInitTask2;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "Lcn/tongdun/mobrisk/TDRiskCallback;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "initFMAgent", "", "onEvent", "blackbox", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LateInitTask2 extends BaseInitTask implements TDRiskCallback {
    /* JADX INFO: Access modifiers changed from: private */
    public final void initFMAgent(Application application) {
        String str;
        Class<?> cls;
        Object objNewProxyInstance;
        String strI;
        Class[] clsArr;
        Context context;
        String strI2;
        String strI3;
        C2085k0 c2085k0 = new C2085k0(16, false);
        b bVar = new b();
        bVar.f18756f = b.a("1b322032", 53);
        bVar.f18757g |= 245760;
        bVar.f18756f = b.a("1b382a38", 63);
        c2085k0.f42878b = bVar;
        try {
            char[] charArray = "584e5f4d".toCharArray();
            byte[] bArr = new byte[4];
            for (int i7 = 0; i7 < 4; i7++) {
                int i10 = i7 * 2;
                bArr[i7] = (byte) ("0123456789abcdef".indexOf(charArray[i10 + 1]) | ("0123456789abcdef".indexOf(charArray[i10]) << 4));
            }
            byte b7 = (byte) 95;
            byte b10 = (byte) (bArr[0] ^ 40);
            bArr[0] = b10;
            for (int i11 = 1; i11 < 4; i11++) {
                b10 = (byte) ((b10 ^ bArr[i11]) ^ b7);
                bArr[i11] = b10;
            }
            str = new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            str = "";
        }
        bVar.f18756f = str;
        b bVar2 = (b) c2085k0.f42878b;
        bVar2.f18751a = "cyjf";
        bVar2.f18755e = "https://riskopsfinger.transspay.net/android3_8/profile.json";
        bVar2.f18754d = true;
        bVar2.f18752b = true;
        Intrinsics.checkNotNullExpressionValue(c2085k0, "disableDebugger(...)");
        if (!BaseApplication.hasLogin()) {
            ((b) c2085k0.f42878b).f18753c = true;
        }
        int i12 = a.f18750a;
        if (application == null) {
            throw new IllegalArgumentException(a.b("0d5558434844550d10430a1758420d387b4e44464644540016440b386859455c535b4c445f58", 90));
        }
        b bVar3 = (b) c2085k0.f42878b;
        if (application == null) {
            throw new IllegalArgumentException(a.b("0f5d4c5049464e59514a4d0205561f0257554c", 79));
        }
        if (bVar3 == null) {
            throw new IllegalArgumentException(a.b("1c28292b170c372e35327d7a29607d282a33", 48));
        }
        synchronized (p059e1.a.class) {
            if (p059e1.a.f35989b == null) {
                p059e1.a.f35989b = application.getApplicationContext();
            }
        }
        try {
            Class<?> cls2 = Class.forName(com.facebook.imagepipeline.nativecode.b.I("575c110b4a505852404a111e5e5b474c575c1b0c4a5c585113395a5d77535a4b", 58));
            HashMap map = new HashMap();
            map.put(com.facebook.imagepipeline.nativecode.b.I("445c5e4b5c5a607141464c", 38), bVar3.f18751a);
            Object obj = null;
            map.put(com.facebook.imagepipeline.nativecode.b.I("57263031302c21", 65), null);
            map.put(com.facebook.imagepipeline.nativecode.b.I("550e1f302b1103", 116), null);
            map.put(com.facebook.imagepipeline.nativecode.b.I("5978776a6160624e53696d7b607c7b", 17), com.facebook.imagepipeline.nativecode.b.I("00070707000006", 118));
            if (com.facebook.imagepipeline.nativecode.b.I("47362436", 79).equals(bVar3.f18756f)) {
                strI2 = com.facebook.imagepipeline.nativecode.b.I("4402130b0c170301", 117);
                strI3 = com.facebook.imagepipeline.nativecode.b.I("477f6d7f", 6);
            } else {
                strI2 = com.facebook.imagepipeline.nativecode.b.I("4455445c5b405456", 34);
                strI3 = com.facebook.imagepipeline.nativecode.b.I("44160715", 108);
            }
            map.put(strI2, strI3);
            if (!TextUtils.isEmpty(bVar3.f18755e)) {
                map.put(com.facebook.imagepipeline.nativecode.b.I("570e1e1f031a2a321f06", 115), bVar3.f18755e);
            }
            if (!TextUtils.isEmpty(null)) {
                map.put(com.facebook.imagepipeline.nativecode.b.I("503f36383c33", 95), null);
            }
            if (!TextUtils.isEmpty(null)) {
                map.put(com.facebook.imagepipeline.nativecode.b.I("7555444b554b484c", 47), null);
            }
            if (!TextUtils.isEmpty(null)) {
                map.put(com.facebook.imagepipeline.nativecode.b.I("55342539202f2730382324141328", 78), null);
            }
            if (!TextUtils.isEmpty(null)) {
                map.put(com.facebook.imagepipeline.nativecode.b.I("571707062a2e031c0d071701", 106), null);
            }
            if (!TextUtils.isEmpty(null)) {
                map.put(com.facebook.imagepipeline.nativecode.b.I("573133353a3133", 81), null);
            }
            if (!TextUtils.isEmpty(null)) {
                map.put(com.facebook.imagepipeline.nativecode.b.I("57151a19101f0e322a100a0a10", 114), null);
            }
            if (bVar3.f18752b) {
                map.put(com.facebook.imagepipeline.nativecode.b.I("5f595e5b68605a4b495b594c", 48), Boolean.TRUE);
            }
            if (bVar3.f18753c) {
                map.put(com.facebook.imagepipeline.nativecode.b.I("5d4258425048457974474d4f434753736e4a464b4c", 46), Boolean.FALSE);
            }
            if (bVar3.f18754d) {
                map.put(com.facebook.imagepipeline.nativecode.b.I("473923380e193622", 74), Boolean.TRUE);
            }
            map.put(com.facebook.imagepipeline.nativecode.b.I("437d6c6c474f6145486c606d6a", 8), Boolean.FALSE);
            String strI4 = com.facebook.imagepipeline.nativecode.b.I("53121a1211132024121721201115191413", 113);
            Boolean bool = Boolean.TRUE;
            map.put(strI4, bool);
            map.put(com.facebook.imagepipeline.nativecode.b.I("5b5c5a5f6968595d515c5b", 57), bool);
            map.put(com.facebook.imagepipeline.nativecode.b.I("47627e787663675f53685e5f6e6a666b6c", 14), bool);
            map.put(com.facebook.imagepipeline.nativecode.b.I("5b504b52494e7e7d435d57", 36), Integer.valueOf(bVar3.f18757g));
            map.put(com.facebook.imagepipeline.nativecode.b.I("577e6e6f736a5a5a607e687a6e6a", 3), null);
            if (TextUtils.isEmpty(null)) {
                obj = "";
            }
            com.facebook.imagepipeline.nativecode.b.I("5b38233a21263a6e3d", 76);
            map.toString();
            int i13 = p059e1.b.f35993a;
            String strI5 = com.facebook.imagepipeline.nativecode.b.I("5d77776d534e6d6c574f746d76716d", 27);
            Class[] clsArr2 = {Context.class, String.class, Map.class};
            synchronized (p059e1.a.class) {
                D3.a.z(cls2, strI5, clsArr2, new Object[]{p059e1.a.f35989b, obj, map});
                a.b("1d253d797b35352f66743d353528293f3376652c2f2e7a262828282f2f29", 49);
                p059e1.b.a("087e757c4c635e557476", 124);
                try {
                    cls = Class.forName(com.facebook.imagepipeline.nativecode.b.I("57175a40011b13190b015a5515100c071c1750470117131a587211163c181100", 113));
                    Class<?> cls3 = Class.forName(com.facebook.imagepipeline.nativecode.b.I("577538226379717b6963383777726e657e753225637571783a3f7f62696f241073765a7578767b7a70", 19));
                    p030c1.a aVar = new p030c1.a();
                    aVar.f18852a = this;
                    objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls3}, aVar);
                    strI = com.facebook.imagepipeline.nativecode.b.I("5b09233b1b0312", 99);
                    clsArr = new Class[]{Context.class, cls3};
                    synchronized (p059e1.a.class) {
                        context = p059e1.a.f35989b;
                    }
                } catch (Throwable th) {
                    String strValueOf = String.valueOf(com.facebook.imagepipeline.nativecode.b.J(th));
                    com.facebook.imagepipeline.nativecode.b.I("53150621391a151f3e3a00550d", 124);
                    int i14 = p059e1.b.f35993a;
                    onEvent(strValueOf);
                    return;
                }
            }
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw new IllegalArgumentException(th2.getMessage());
            }
        }
        D3.a.z(cls, strI, clsArr, new Object[]{context, objNewProxyInstance});
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.late.LateInitTask2.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(LateInitTask2.this, null, 1, null);
                LateInitTask2.this.initFMAgent(application);
                com.facebook.imagepipeline.nativecode.b.d();
                BaseInitTask.endSection$default(LateInitTask2.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.LATE_INIT_TONG_DUN_TASK;
    }

    @Override // cn.tongdun.mobrisk.TDRiskCallback
    public void onEvent(@NotNull String blackbox) {
        Intrinsics.checkNotNullParameter(blackbox, "blackbox");
    }
}
