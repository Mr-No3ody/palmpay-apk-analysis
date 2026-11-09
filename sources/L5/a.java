package L5;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.mikepenz.iconics.IconicsDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IconicsDrawable f5553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconicsDrawable f5554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IconicsDrawable f5555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IconicsDrawable f5556d;

    public final void a(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "getCompoundDrawablesRelative(textView)");
        Drawable drawable = this.f5553a;
        if (drawable == null) {
            drawable = compoundDrawablesRelative[0];
        }
        Drawable drawable2 = this.f5554b;
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative[1];
        }
        Drawable drawable3 = this.f5555c;
        if (drawable3 == null) {
            drawable3 = compoundDrawablesRelative[2];
        }
        Drawable drawable4 = this.f5556d;
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative[3];
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
}
