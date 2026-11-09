package p228p0;

import Z4.e;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f41160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f41161g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41162i = true;

    public f(TextView textView) {
        this.f41160f = textView;
        this.f41161g = new d(textView);
    }

    @Override // Z4.e
    public final void C(boolean z3) {
        if (z3) {
            TextView textView = this.f41160f;
            textView.setTransformationMethod(Q(textView.getTransformationMethod()));
        }
    }

    @Override // Z4.e
    public final void D(boolean z3) {
        this.f41162i = z3;
        TextView textView = this.f41160f;
        textView.setTransformationMethod(Q(textView.getTransformationMethod()));
        textView.setFilters(l(textView.getFilters()));
    }

    @Override // Z4.e
    public final TransformationMethod Q(TransformationMethod transformationMethod) {
        if (this.f41162i) {
            return ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod);
        }
        return transformationMethod instanceof j ? ((j) transformationMethod).f41168a : transformationMethod;
    }

    @Override // Z4.e
    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        if (!this.f41162i) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.f41161g;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == dVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }

    @Override // Z4.e
    public final boolean s() {
        return this.f41162i;
    }
}
