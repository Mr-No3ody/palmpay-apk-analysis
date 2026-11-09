package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f12510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2085k0 f12511b;

    public A(TextView textView) {
        this.f12510a = textView;
        this.f12511b = new C2085k0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((Z4.e) this.f12511b.f42878b).l(inputFilterArr);
    }

    public final boolean b() {
        return ((Z4.e) this.f12511b.f42878b).s();
    }

    public final void c(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f12510a.getContext().obtainStyledAttributes(attributeSet, p241q.j.AppCompatTextView, i7, 0);
        try {
            boolean z3 = typedArrayObtainStyledAttributes.hasValue(p241q.j.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(p241q.j.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z3);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void d(boolean z3) {
        ((Z4.e) this.f12511b.f42878b).C(z3);
    }

    public final void e(boolean z3) {
        ((Z4.e) this.f12511b.f42878b).D(z3);
    }
}
