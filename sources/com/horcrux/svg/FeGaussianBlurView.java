package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class FeGaussianBlurView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f23287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23288e;

    @Override // com.horcrux.svg.FilterPrimitiveView
    public final Bitmap b(HashMap map, Bitmap bitmap) {
        Bitmap bitmapC = FilterPrimitiveView.c(map, bitmap, this.f23286c);
        Context context = getContext();
        float fMax = Math.max(this.f23287d, this.f23288e) * 2.0f;
        if (fMax <= 0.0f) {
            return bitmapC;
        }
        float fMin = Math.min(fMax, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapC);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(fMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        renderScriptCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmapC.getWidth(), bitmapC.getHeight(), false);
    }
}
