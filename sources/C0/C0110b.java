package C0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0110b extends K {
    public Intent t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f1003v;

    public static String f(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return kotlin.text.y.k(str, "${applicationId}", packageName);
    }

    @Override // C0.K
    public final void e(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.e(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, j0.ActivityNavigator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…tyNavigator\n            )");
        String strF = f(context, typedArrayObtainAttributes.getString(j0.ActivityNavigator_targetPackage));
        if (this.t == null) {
            this.t = new Intent();
        }
        Intent intent = this.t;
        Intrinsics.e(intent);
        intent.setPackage(strF);
        String string = typedArrayObtainAttributes.getString(j0.ActivityNavigator_android_name);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.t == null) {
                this.t = new Intent();
            }
            Intent intent2 = this.t;
            Intrinsics.e(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(j0.ActivityNavigator_action);
        if (this.t == null) {
            this.t = new Intent();
        }
        Intent intent3 = this.t;
        Intrinsics.e(intent3);
        intent3.setAction(string2);
        String strF2 = f(context, typedArrayObtainAttributes.getString(j0.ActivityNavigator_data));
        if (strF2 != null) {
            Uri uri = Uri.parse(strF2);
            if (this.t == null) {
                this.t = new Intent();
            }
            Intent intent4 = this.t;
            Intrinsics.e(intent4);
            intent4.setData(uri);
        }
        this.f1003v = f(context, typedArrayObtainAttributes.getString(j0.ActivityNavigator_dataPattern));
        typedArrayObtainAttributes.recycle();
    }

    @Override // C0.K
    public final boolean equals(Object obj) {
        boolean zFilterEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0110b) && super.equals(obj)) {
            Intent intent = this.t;
            if (intent != null) {
                zFilterEquals = intent.filterEquals(((C0110b) obj).t);
            } else {
                zFilterEquals = ((C0110b) obj).t == null;
            }
            if (zFilterEquals && Intrinsics.c(this.f1003v, ((C0110b) obj).f1003v)) {
                return true;
            }
        }
        return false;
    }

    @Override // C0.K
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.t;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f1003v;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // C0.K
    public final String toString() {
        Intent intent = this.t;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (component != null) {
            sb2.append(" class=");
            sb2.append(component.getClassName());
        } else {
            Intent intent2 = this.t;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb2.append(" action=");
                sb2.append(action);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
