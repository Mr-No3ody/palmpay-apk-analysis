package Qa;

import C0.G;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7656i;

    public a(String scene, String authType, String str, String result, String str2, String str3, String str4, String str5, int i7, int i10) {
        str3 = (i10 & 32) != 0 ? null : str3;
        str4 = (i10 & 64) != 0 ? null : str4;
        str5 = (i10 & 128) != 0 ? null : str5;
        i7 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0 : i7;
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(ViewProps.NONE, "fallbackType");
        this.f7648a = scene;
        this.f7649b = authType;
        this.f7650c = str;
        this.f7651d = result;
        this.f7652e = str2;
        this.f7653f = str3;
        this.f7654g = str4;
        this.f7655h = str5;
        this.f7656i = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7648a.equals(aVar.f7648a) && this.f7649b.equals(aVar.f7649b) && this.f7650c.equals(aVar.f7650c) && this.f7651d.equals(aVar.f7651d) && this.f7652e.equals(aVar.f7652e) && Intrinsics.c(this.f7653f, aVar.f7653f) && Intrinsics.c(this.f7654g, aVar.f7654g) && Intrinsics.c(this.f7655h, aVar.f7655h) && this.f7656i == aVar.f7656i;
    }

    public final int hashCode() {
        int iC = G.c(G.c(G.c(G.c(this.f7648a.hashCode() * 31, 31, this.f7649b), 31, this.f7650c), 31, this.f7651d), 31, this.f7652e);
        String str = this.f7653f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7654g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7655h;
        return ((Boolean.hashCode(false) + u.b(this.f7656i, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31)) * 31) + 3387192;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuthVerifyResultParams(scene=");
        sb2.append(this.f7648a);
        sb2.append(", authType=");
        sb2.append(this.f7649b);
        sb2.append(", entrySource=");
        sb2.append(this.f7650c);
        sb2.append(", result=");
        sb2.append(this.f7651d);
        sb2.append(", failStage=");
        sb2.append(this.f7652e);
        sb2.append(", failCategory=");
        sb2.append(this.f7653f);
        sb2.append(", failCode=");
        sb2.append(this.f7654g);
        sb2.append(", failMessage=");
        sb2.append(this.f7655h);
        sb2.append(", retryCount=");
        return G.n(this.f7656i, ", fallbackUsed=false, fallbackType=none)", sb2);
    }
}
