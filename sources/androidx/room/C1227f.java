package androidx.room;

import android.os.Looper;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.room.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1227f extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1227f(String[] strArr, Object obj, int i7) {
        super(strArr);
        this.f17752b = i7;
        this.f17753c = obj;
    }

    @Override // androidx.room.w
    public final void a(Set tables) {
        switch (this.f17752b) {
            case 0:
                ((Yf.n) this.f17753c).mo64trySendJP2dKIU(Unit.f38893a);
                break;
            default:
                Intrinsics.checkNotNullParameter(tables, "tables");
                p357y.a aVarZ = p357y.a.Z();
                M m7 = ((N) this.f17753c).f17738u;
                aVarZ.f44019f.getClass();
                if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
                    aVarZ.a0(m7);
                } else {
                    m7.run();
                }
                break;
        }
    }
}
