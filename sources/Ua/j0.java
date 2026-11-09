package Ua;

import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f9419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnFocusChangeListener f9420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f9421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Oc.j f9422d;

    public j0(EditText editText, View.OnFocusChangeListener onFocusChangeListener, i0 i0Var, Oc.j jVar) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f9419a = editText;
        this.f9420b = onFocusChangeListener;
        this.f9421c = i0Var;
        this.f9422d = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f9419a.equals(j0Var.f9419a) && Intrinsics.c(this.f9420b, j0Var.f9420b) && Intrinsics.c(this.f9421c, j0Var.f9421c) && Intrinsics.c(this.f9422d, j0Var.f9422d);
    }

    public final int hashCode() {
        int iHashCode = this.f9419a.hashCode() * 31;
        View.OnFocusChangeListener onFocusChangeListener = this.f9420b;
        int iHashCode2 = (iHashCode + (onFocusChangeListener == null ? 0 : onFocusChangeListener.hashCode())) * 31;
        i0 i0Var = this.f9421c;
        int iHashCode3 = (iHashCode2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        Oc.j jVar = this.f9422d;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedTarget(editText=" + this.f9419a + ", originalFocusListener=" + this.f9420b + ", attachedFocusListener=" + this.f9421c + ", attachedClickListener=" + this.f9422d + ")";
    }
}
