package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        l();
    }

    public final void l() {
        k(1);
        f(new Fade(2));
        f(new ChangeBounds());
        f(new Fade(1));
    }

    public AutoTransition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        l();
    }
}
