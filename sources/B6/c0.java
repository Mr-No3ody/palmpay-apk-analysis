package B6;

import androidx.lifecycle.ViewModelProvider$Factory;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f468d;

    public c0(ArrayList tasks, int i7, int i10) {
        this.f466b = i10;
        switch (i10) {
            case 1:
                Intrinsics.checkNotNullParameter(tasks, "tasks");
                this.f467c = tasks;
                this.f468d = i7;
                break;
            default:
                Intrinsics.checkNotNullParameter(tasks, "tasks");
                this.f467c = tasks;
                this.f468d = i7;
                break;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final androidx.lifecycle.a0 create(Class modelClass) {
        switch (this.f466b) {
            case 0:
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                if (!modelClass.isAssignableFrom(b0.class)) {
                    throw new IllegalArgumentException("Unknown ViewModel class");
                }
                return new b0(this.f468d, this.f467c);
            default:
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                if (!modelClass.isAssignableFrom(D6.e.class)) {
                    throw new IllegalArgumentException("Unknown ViewModel class");
                }
                return new D6.e(this.f468d, this.f467c);
        }
    }
}
