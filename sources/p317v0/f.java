package p317v0;

import android.util.Pair;
import androidx.camera.video.internal.c;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ArrayList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f43025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f43026b;

    public f(Class cls, Class cls2) {
        this.f43025a = cls;
        this.f43026b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c a() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f43025a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.f43026b, size);
        for (int i7 = 0; i7 < size; i7++) {
            objArr[i7] = ((Pair) get(i7)).first;
            objArr2[i7] = ((Pair) get(i7)).second;
        }
        return new c(objArr, objArr2);
    }
}
