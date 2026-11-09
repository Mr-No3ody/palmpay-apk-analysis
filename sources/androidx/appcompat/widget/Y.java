package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f12861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f12861c = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.W, androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void setLineHeight(int i7, float f10) {
        super/*android.widget.TextView*/.setLineHeight(i7, f10);
    }
}
