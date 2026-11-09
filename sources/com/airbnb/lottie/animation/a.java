package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.airbnb.lottie.utils.g;
import com.google.android.flexbox.FlexItem;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Paint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19636a;

    @Override // android.graphics.Paint
    public void setAlpha(int i7) {
        switch (this.f19636a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(g.c(i7));
                } else {
                    setColor((g.c(i7) << 24) | (getColor() & FlexItem.MAX_SIZE));
                }
                break;
            default:
                super.setAlpha(i7);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f19636a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i10) {
        super(i7);
        this.f19636a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PorterDuff.Mode mode) {
        super(1);
        this.f19636a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}
