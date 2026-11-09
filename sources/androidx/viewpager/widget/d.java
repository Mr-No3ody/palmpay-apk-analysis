package androidx.viewpager.widget;

import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d extends SingleLineTransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Locale f18259a;

    @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        CharSequence transformation = super.getTransformation(charSequence, view);
        if (transformation != null) {
            return transformation.toString().toUpperCase(this.f18259a);
        }
        return null;
    }
}
