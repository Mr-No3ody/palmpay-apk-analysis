package E0;

import C0.K;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.FloatingWindow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends K implements FloatingWindow {
    public String t;

    @Override // C0.K
    public final void e(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.e(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, p.DialogFragmentNavigator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…ntNavigator\n            )");
        String className = typedArrayObtainAttributes.getString(p.DialogFragmentNavigator_android_name);
        if (className != null) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.t = className;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // C0.K
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof c) && super.equals(obj) && Intrinsics.c(this.t, ((c) obj).t);
    }

    @Override // C0.K
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.t;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
