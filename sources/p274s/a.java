package p274s;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends FrameLayout {
    public a(@NonNull Context context) {
        this(context, null);
    }

    public abstract void a();

    public void b(Context context, AttributeSet attributeSet) {
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        b(context, attributeSet);
        a();
    }
}
