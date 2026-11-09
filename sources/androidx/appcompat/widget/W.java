package androidx.appcompat.widget;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: loaded from: classes.dex */
public class W implements AppCompatTextView.SuperCaller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f12851a;

    public W(AppCompatTextView appCompatTextView) {
        this.f12851a = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int getAutoSizeMaxTextSize() {
        return super/*android.widget.TextView*/.getAutoSizeMaxTextSize();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int getAutoSizeMinTextSize() {
        return super/*android.widget.TextView*/.getAutoSizeMinTextSize();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int getAutoSizeStepGranularity() {
        return super/*android.widget.TextView*/.getAutoSizeStepGranularity();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int[] getAutoSizeTextAvailableSizes() {
        return super/*android.widget.TextView*/.getAutoSizeTextAvailableSizes();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int getAutoSizeTextType() {
        return super/*android.widget.TextView*/.getAutoSizeTextType();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final TextClassifier getTextClassifier() {
        return super/*android.widget.TextView*/.getTextClassifier();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i10, int i11, int i12) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void setAutoSizeTextTypeWithDefaults(int i7) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeWithDefaults(i7);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public void setFirstBaselineToTopHeight(int i7) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public void setLastBaselineToBottomHeight(int i7) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public void setLineHeight(int i7, float f10) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void setTextClassifier(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }
}
