package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends k0 {
    public l0(@NonNull q0 q0Var, @NonNull WindowInsets windowInsets) {
        super(q0Var, windowInsets);
    }

    @Override // androidx.core.view.o0
    @NonNull
    public q0 a() {
        return q0.h(null, this.f16252c.consumeDisplayCutout());
    }

    @Override // androidx.core.view.j0, androidx.core.view.o0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Objects.equals(this.f16252c, l0Var.f16252c) && Objects.equals(this.f16256g, l0Var.f16256g);
    }

    @Override // androidx.core.view.o0
    @Nullable
    public C1058j f() {
        DisplayCutout displayCutout = this.f16252c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1058j(displayCutout);
    }

    @Override // androidx.core.view.o0
    public int hashCode() {
        return this.f16252c.hashCode();
    }

    public l0(@NonNull q0 q0Var, @NonNull l0 l0Var) {
        super(q0Var, l0Var);
    }
}
