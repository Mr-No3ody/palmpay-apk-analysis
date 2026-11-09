package p183m6;

import Kf.m;
import N8.q0;
import Wf.AbstractC0774s;
import Wf.I;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.palmpay.lib.config.api.bean.ConfigReq;
import com.palmpay.lib.config.api.bean.ConfigRsp;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;
import p042cg.e;
import p042cg.f;
import p199n6.c;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f39509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f39510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f39511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f39512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f39513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC0774s f39514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ConfigRsp f39515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f39516i;

    static {
        new g(null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    public i(Context context, c cVar, File file, e eVar, s sVar, int i7) throws XmlPullParserException, IOException {
        ConfigRsp configRsp;
        Object objC;
        cVar = (i7 & 2) != 0 ? null : cVar;
        file = (i7 & 4) != 0 ? null : file;
        eVar = (i7 & 8) != 0 ? null : eVar;
        f fVar = I.f10809a;
        e dispatcher = e.f19009c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f39508a = context;
        this.f39509b = cVar;
        this.f39510c = file;
        this.f39511d = eVar;
        this.f39512e = null;
        this.f39513f = sVar;
        this.f39514g = dispatcher;
        if (file == null) {
            if (!TextUtils.isEmpty(sVar != null ? sVar.f39542b : null)) {
                this.f39510c = new File(context.getFilesDir(), q0.j(sVar != null ? sVar.f39542b : null, "-config.cache.json"));
            }
        }
        File file2 = this.f39510c;
        if (file2 != null) {
            try {
                if (file2.exists()) {
                    String strB = m.b(file2);
                    if (TextUtils.isEmpty(strB)) {
                        configRsp = null;
                    } else {
                        Intrinsics.e(strB);
                        try {
                            configRsp = (ConfigRsp) j.c().b(strB, ConfigRsp.class);
                        } catch (Exception e10) {
                            Log.e("Config", "Error parsing config from cached file", e10);
                            configRsp = null;
                        }
                    }
                } else {
                    configRsp = null;
                }
            } catch (Throwable unused) {
            }
        } else {
            configRsp = null;
        }
        this.f39515h = configRsp;
        B b7 = new B();
        b7.f38947a = true;
        if (configRsp == null) {
            b7.f38947a = false;
            this.f39515h = new ConfigRsp();
        }
        Context context2 = this.f39508a;
        s sVar2 = this.f39513f;
        int i10 = sVar2 != null ? sVar2.f39546f : 0;
        if (i10 == 0) {
            objC = G.c();
        } else {
            try {
                XmlResourceParser xml = context2.getResources().getXml(i10);
                Intrinsics.e(xml);
                HashMap map = new HashMap();
                String strNextText = null;
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && Intrinsics.c(xml.getName(), "key")) {
                        strNextText = xml.nextText();
                    }
                    if (xml.getEventType() == 2 && Intrinsics.c(xml.getName(), "value")) {
                        String strNextText2 = xml.nextText();
                        if (!TextUtils.isEmpty(strNextText)) {
                            Intrinsics.e(strNextText);
                            map.put(strNextText, strNextText2);
                        }
                        strNextText = null;
                    }
                    xml.next();
                }
                objC = map;
            } catch (Exception e11) {
                Log.e("Config", "Default config xml not found: " + i10, e11);
                objC = G.c();
            }
        }
        this.f39516i = objC;
        e eVar2 = this.f39511d;
        if (eVar2 != null) {
            s sVar3 = this.f39513f;
            eVar2.a(sVar3 != null ? sVar3.f39548h : false, new f(b7, this, null));
        }
    }

    public static final void a(i iVar, File file, ConfigRsp configRsp) {
        synchronized (iVar) {
            try {
                if (file != null) {
                    try {
                        try {
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            String json = ((Gson) j.c().f39520b).toJson(configRsp);
                            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            m.c(file, json);
                        } catch (Exception unused) {
                            Unit unit = Unit.f38893a;
                        }
                    } catch (Exception unused2) {
                        file.delete();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ConfigRsp b(String str, List list) {
        String str2;
        s sVar = this.f39513f;
        if (sVar == null || (str2 = sVar.f39542b) == null) {
            str2 = "no_id";
        }
        ConfigReq configReq = new ConfigReq(this.f39508a, str2);
        configReq.nebulaClientParam.memberId = str;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                configReq.codes = arrayList;
                arrayList.addAll(list);
            }
        }
        try {
            c cVar = this.f39509b;
            ConfigRsp configRspA = cVar != null ? cVar.a(configReq) : null;
            if (configRspA == null || !configRspA.isSuccess()) {
                return null;
            }
            return configRspA;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized String c(String key) {
        String str;
        HashMap<String, String> data;
        String str2;
        Intrinsics.checkNotNullParameter(key, "key");
        ConfigRsp configRsp = this.f39515h;
        if (configRsp != null && (data = configRsp.getData()) != null && (str2 = data.get(key)) != null) {
            return str2;
        }
        ?? r3 = this.f39516i;
        if (r3 == 0 || (str = (String) r3.get(key)) == null) {
            return null;
        }
        return str;
    }
}
