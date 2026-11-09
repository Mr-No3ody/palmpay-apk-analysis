package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f16305c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16307b;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f16306a);
        removeCallbacks(this.f16307b);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f16306a);
        removeCallbacks(this.f16307b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.core.widget.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.core.widget.b] */
    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i7 = 0;
        this.f16306a = new Runnable(this) { // from class: androidx.core.widget.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f16349b;

            {
                this.f16349b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar contentLoadingProgressBar = this.f16349b;
                switch (i7) {
                    case 0:
                        int i10 = ContentLoadingProgressBar.f16305c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i11 = ContentLoadingProgressBar.f16305c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f16307b = new Runnable(this) { // from class: androidx.core.widget.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f16349b;

            {
                this.f16349b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar contentLoadingProgressBar = this.f16349b;
                switch (i10) {
                    case 0:
                        int i11 = ContentLoadingProgressBar.f16305c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i12 = ContentLoadingProgressBar.f16305c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }
}
