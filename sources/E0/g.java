package E0;

import C0.K;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.maps.android.BuildConfig;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends K {
    public String t;

    @Override // C0.K
    public final void e(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.e(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, p.FragmentNavigator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String className = typedArrayObtainAttributes.getString(p.FragmentNavigator_android_name);
        if (className != null) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.t = className;
        }
        Unit unit = Unit.f38893a;
        typedArrayObtainAttributes.recycle();
    }

    @Override // C0.K
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof g) && super.equals(obj) && Intrinsics.c(this.t, ((g) obj).t);
    }

    @Override // C0.K
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.t;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // C0.K
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" class=");
        String str = this.t;
        if (str == null) {
            sb2.append(BuildConfig.TRAVIS);
        } else {
            sb2.append(str);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
