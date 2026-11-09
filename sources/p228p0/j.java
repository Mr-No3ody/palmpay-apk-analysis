package p228p0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.i;

/* JADX INFO: loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransformationMethod f41168a;

    public j(TransformationMethod transformationMethod) {
        this.f41168a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f41168a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || i.a().b() != 1) {
            return charSequence;
        }
        i iVarA = i.a();
        iVarA.getClass();
        return iVarA.g(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f41168a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i7, rect);
        }
    }
}
