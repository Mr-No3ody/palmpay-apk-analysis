package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class X extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f12859b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f12859b = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.W, androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void setFirstBaselineToTopHeight(int i7) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i7);
    }

    @Override // androidx.appcompat.widget.W, androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void setLastBaselineToBottomHeight(int i7) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i7);
    }
}
