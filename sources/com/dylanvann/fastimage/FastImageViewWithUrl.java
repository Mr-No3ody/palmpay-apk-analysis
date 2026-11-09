package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.n;
import com.bumptech.glide.p;
import com.bumptech.glide.request.Request;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
class FastImageViewWithUrl extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReadableMap f21158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f21159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f21160d;

    public FastImageViewWithUrl(Context context) {
        super(context);
        this.f21157a = false;
        this.f21158b = null;
        this.f21159c = null;
    }

    public final void a(p pVar) {
        if (pVar == null || getTag() == null || !(getTag() instanceof Request)) {
            return;
        }
        pVar.e(new n(this));
    }
}
