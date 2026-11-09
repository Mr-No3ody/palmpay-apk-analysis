package p077f4;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.annotations.Expose;
import kotlin.jvm.internal.Intrinsics;
import p029c.a;
import p029c.c;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ExclusionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36386a;

    public /* synthetic */ e(int i7) {
        this.f36386a = i7;
    }

    @Override // com.google.gson.ExclusionStrategy
    public final boolean shouldSkipClass(Class cls) {
        switch (this.f36386a) {
        }
        return false;
    }

    @Override // com.google.gson.ExclusionStrategy
    public final boolean shouldSkipField(FieldAttributes f10) {
        switch (this.f36386a) {
            case 0:
                Intrinsics.checkNotNullParameter(f10, "f");
                Expose expose = (Expose) f10.getAnnotation(Expose.class);
                return (expose == null || expose.serialize()) ? false : true;
            case 1:
                Intrinsics.checkNotNullParameter(f10, "f");
                Expose expose2 = (Expose) f10.getAnnotation(Expose.class);
                return (expose2 == null || expose2.deserialize()) ? false : true;
            case 2:
                Expose expose3 = (Expose) f10.getAnnotation(Expose.class);
                return (expose3 == null || expose3.deserialize()) ? false : true;
            case 3:
                Expose expose4 = (Expose) f10.getAnnotation(Expose.class);
                return (expose4 == null || expose4.serialize()) ? false : true;
            default:
                return (f10.getAnnotation(c.class) == null && f10.getAnnotation(a.class) == null) ? false : true;
        }
    }
}
