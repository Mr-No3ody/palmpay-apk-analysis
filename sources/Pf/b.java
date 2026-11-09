package Pf;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Pf.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f7328c = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // Pf.a
    public final Random e() {
        Object obj = this.f7328c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Random) obj;
    }
}
