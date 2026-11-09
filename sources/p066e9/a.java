package p066e9;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f36185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36186b;

    public a(int i7, View.OnClickListener onClickListener) {
        this.f36185a = new WeakReference(onClickListener);
        this.f36186b = i7;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        View.OnClickListener onClickListener = (View.OnClickListener) this.f36185a.get();
        if (onClickListener != null) {
            view.setId(this.f36186b);
            onClickListener.onClick(view);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
