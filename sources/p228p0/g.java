package p228p0;

import Z4.e;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f41163f;

    public g(TextView textView) {
        this.f41163f = new f(textView);
    }

    @Override // Z4.e
    public final void C(boolean z3) {
        if (i.d()) {
            this.f41163f.C(z3);
        }
    }

    @Override // Z4.e
    public final void D(boolean z3) {
        boolean zD = i.d();
        f fVar = this.f41163f;
        if (zD) {
            fVar.D(z3);
        } else {
            fVar.f41162i = z3;
        }
    }

    @Override // Z4.e
    public final TransformationMethod Q(TransformationMethod transformationMethod) {
        return !i.d() ? transformationMethod : this.f41163f.Q(transformationMethod);
    }

    @Override // Z4.e
    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        return !i.d() ? inputFilterArr : this.f41163f.l(inputFilterArr);
    }

    @Override // Z4.e
    public final boolean s() {
        return this.f41163f.f41162i;
    }
}
