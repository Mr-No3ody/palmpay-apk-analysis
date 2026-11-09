package p369yd;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import p141j9.t;
import p382zb.r;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Observer, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44287a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f44288b;

    public e(t function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f44288b = function;
    }

    public final boolean equals(Object obj) {
        switch (this.f44287a) {
            case 0:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 3:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 4:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 5:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.f44287a) {
            case 0:
                return (t) this.f44288b;
            case 1:
                return (p) this.f44288b;
            case 2:
                return (p) this.f44288b;
            case 3:
                return (r) this.f44288b;
            case 4:
                return (r) this.f44288b;
            case 5:
                return (r) this.f44288b;
            default:
                return (p) this.f44288b;
        }
    }

    public final int hashCode() {
        switch (this.f44287a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.f44287a) {
            case 0:
                ((t) this.f44288b).invoke(obj);
                break;
            case 1:
                ((p) this.f44288b).invoke(obj);
                break;
            case 2:
                ((p) this.f44288b).invoke(obj);
                break;
            case 3:
                ((r) this.f44288b).invoke(obj);
                break;
            case 4:
                ((r) this.f44288b).invoke(obj);
                break;
            case 5:
                ((r) this.f44288b).invoke(obj);
                break;
            default:
                ((p) this.f44288b).invoke(obj);
                break;
        }
    }

    public e(p function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f44288b = function;
    }

    public e(p function, byte b7) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f44288b = function;
    }

    public e(p function, char c6) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f44288b = function;
    }

    public e(r function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f44288b = function;
    }

    public e(r function, byte b7) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f44288b = function;
    }

    public e(r function, char c6) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f44288b = function;
    }
}
