package com.imuxuan.floatingview;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import p205nc.c;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultFloatingView extends FloatingMagnetView {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f23545w;

    public DefaultFloatingView(@NonNull Context context) {
        this(context, c.cv_en_floating_view);
    }

    public void setIconImage(@DrawableRes int i7) {
        ImageView imageView = this.f23545w;
        if (imageView != null) {
            imageView.setImageResource(i7);
        }
    }

    public DefaultFloatingView(Context context, int i7) {
        super(context, null);
        View.inflate(context, i7, this);
        this.f23545w = (ImageView) findViewById(R.id.icon);
    }
}
