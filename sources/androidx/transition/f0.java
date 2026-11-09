package androidx.transition;

import android.view.View;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f18046b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18045a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18047c = new ArrayList();

    public f0(View view) {
        this.f18046b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f18046b == f0Var.f18046b && this.f18045a.equals(f0Var.f18045a);
    }

    public final int hashCode() {
        return this.f18045a.hashCode() + (this.f18046b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbT = C0.G.t("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbT.append(this.f18046b);
        sbT.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        String strJ = N8.q0.j(sbT.toString(), "    values:");
        HashMap map = this.f18045a;
        for (String str : map.keySet()) {
            strJ = strJ + "    " + str + ": " + map.get(str) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        return strJ;
    }
}
