package androidx.work.impl.constraints.controllers;

import V0.D;
import android.os.Build;
import androidx.work.impl.constraints.i;
import androidx.work.impl.model.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.work.impl.constraints.trackers.a tracker) {
        super(tracker);
        this.f18478b = 0;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18479c = 6;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final int a() {
        switch (this.f18478b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f18479c;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean b(Object obj) {
        switch (this.f18478b) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                i value = (i) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                return Build.VERSION.SDK_INT < 26 ? !value.f18492a : !(value.f18492a && value.f18493b);
            case 3:
                i value2 = (i) obj;
                Intrinsics.checkNotNullParameter(value2, "value");
                return !value2.f18492a || value2.f18494c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean hasConstraint(k workSpec) {
        switch (this.f18478b) {
            case 0:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.f18621j.f9942c;
            case 1:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.f18621j.f9944e;
            case 2:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.f18621j.f9940a == D.f9864b;
            case 3:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                D d2 = workSpec.f18621j.f9940a;
                return d2 == D.f9865c || (Build.VERSION.SDK_INT >= 30 && d2 == D.f9868f);
            default:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.f18621j.f9945f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.work.impl.constraints.trackers.a tracker, byte b7) {
        super(tracker);
        this.f18478b = 1;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18479c = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.work.impl.constraints.trackers.a tracker, char c6) {
        super(tracker);
        this.f18478b = 4;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18479c = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.work.impl.constraints.trackers.h tracker, int i7) {
        super(tracker);
        this.f18478b = i7;
        switch (i7) {
            case 3:
                Intrinsics.checkNotNullParameter(tracker, "tracker");
                super(tracker);
                this.f18479c = 7;
                break;
            default:
                Intrinsics.checkNotNullParameter(tracker, "tracker");
                this.f18479c = 7;
                break;
        }
    }
}
