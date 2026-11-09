package com.facebook.react.views.text.frescosupport;

import F2.f;
import I2.a;
import J2.b;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.TextView;
import com.facebook.drawee.drawable.ScalingUtils$ScaleType;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.request.e;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J9\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(JW\u00100\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R&\u0010\u000e\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00106R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u0014\u00108\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00102R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010B\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010G¨\u0006I"}, d2 = {"Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageSpan;", "Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;", "Landroid/content/res/Resources;", "resources", "", "height", "width", "tintColor", "Landroid/net/Uri;", "uri", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "LF2/f;", "Lcom/facebook/imagepipeline/request/d;", "draweeControllerBuilder", "", "callerContext", "", ViewProps.RESIZE_MODE, "<init>", "(Landroid/content/res/Resources;IIILandroid/net/Uri;Lcom/facebook/react/bridge/ReadableMap;LF2/f;Ljava/lang/Object;Ljava/lang/String;)V", "", "onDetachedFromWindow", "()V", "onStartTemporaryDetach", "onAttachedToWindow", "onFinishTemporaryDetach", "Landroid/graphics/Paint;", "paint", "", ReactTextInputShadowNode.PROP_TEXT, ViewProps.START, ViewProps.END, "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/widget/TextView;", "textView", "setTextView", "(Landroid/widget/TextView;)V", "Landroid/graphics/Canvas;", "canvas", "", "x", ViewProps.TOP, "y", ViewProps.BOTTOM, "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "I", "Lcom/facebook/react/bridge/ReadableMap;", "LF2/f;", "Ljava/lang/Object;", "Ljava/lang/String;", "Landroid/widget/TextView;", "_uri", "Landroid/net/Uri;", "_width", "_height", "LJ2/b;", "LI2/a;", "draweeHolder", "LJ2/b;", "Landroid/graphics/drawable/Drawable;", "value", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getWidth", "()I", "getHeight", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFrescoBasedReactTextInlineImageSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrescoBasedReactTextInlineImageSpan.kt\ncom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
public final class FrescoBasedReactTextInlineImageSpan extends TextInlineImageSpan {
    private final int _height;

    @NotNull
    private final Uri _uri;
    private final int _width;

    @Nullable
    private final Object callerContext;

    @Nullable
    private Drawable drawable;

    @NotNull
    private final f draweeControllerBuilder;

    @NotNull
    private final b draweeHolder;

    @Nullable
    private final ReadableMap headers;

    @Nullable
    private final String resizeMode;

    @Nullable
    private TextView textView;
    private final int tintColor;

    public FrescoBasedReactTextInlineImageSpan(@NotNull Resources resources, int i7, int i10, int i11, @Nullable Uri EMPTY, @Nullable ReadableMap readableMap, @NotNull f draweeControllerBuilder, @Nullable Object obj, @Nullable String str) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(draweeControllerBuilder, "draweeControllerBuilder");
        this.tintColor = i11;
        this.headers = readableMap;
        this.draweeControllerBuilder = draweeControllerBuilder;
        this.callerContext = obj;
        this.resizeMode = str;
        if (EMPTY == null) {
            EMPTY = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        this._uri = EMPTY;
        this._width = (int) PixelUtil.toPixelFromDIP(i10);
        this._height = (int) PixelUtil.toPixelFromDIP(i7);
        this.draweeHolder = new b(new I2.b(resources).a());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x3, int top2, int y8, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (getDrawable() == null) {
            ReactNetworkImageRequest reactNetworkImageRequestFromBuilderWithHeaders$default = ReactNetworkImageRequest.Companion.fromBuilderWithHeaders$default(ReactNetworkImageRequest.INSTANCE, e.d(this._uri), this.headers, null, 4, null);
            DraweeHierarchy draweeHierarchy = this.draweeHolder.f4486d;
            draweeHierarchy.getClass();
            ScalingUtils$ScaleType scaleType = ImageResizeMode.toScaleType(this.resizeMode);
            scaleType.getClass();
            m mVarF = ((a) draweeHierarchy).f(2);
            mVarF.getClass();
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            if (!p213o2.e.h(mVarF.f21323a, scaleType)) {
                mVarF.f21323a = scaleType;
                mVarF.f21324b = null;
                mVarF.a();
                mVarF.invalidateSelf();
            }
            this.draweeControllerBuilder.b();
            f fVar = this.draweeControllerBuilder;
            fVar.f2565f = this.draweeHolder.f4487e;
            Object obj = this.callerContext;
            if (obj != null) {
                fVar.f2560a = obj;
                Intrinsics.checkNotNullExpressionValue(fVar, "setCallerContext(...)");
            }
            f fVar2 = this.draweeControllerBuilder;
            fVar2.f2561b = reactNetworkImageRequestFromBuilderWithHeaders$default;
            C2.a aVarBuild = fVar2.build();
            Intrinsics.checkNotNullExpressionValue(aVarBuild, "build(...)");
            this.draweeHolder.g(aVarBuild);
            this.draweeControllerBuilder.b();
            Drawable drawableC = this.draweeHolder.c();
            if (drawableC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            drawableC.setBounds(0, 0, this._width, this._height);
            if (this.tintColor != 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    drawableC.setColorFilter(new BlendModeColorFilter(this.tintColor, BlendMode.SRC_IN));
                } else {
                    drawableC.setColorFilter(new PorterDuffColorFilter(this.tintColor, PorterDuff.Mode.SRC_IN));
                }
            }
            drawableC.setCallback(this.textView);
            this.drawable = drawableC;
        }
        canvas.save();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas.translate(x3, ((y8 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - (drawable.getBounds().height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    @Nullable
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    /* JADX INFO: renamed from: getHeight, reason: from getter */
    public int get_height() {
        return this._height;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (fm != null) {
            int i7 = -this._height;
            fm.ascent = i7;
            fm.descent = 0;
            fm.top = i7;
            fm.bottom = 0;
        }
        return this._width;
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    /* JADX INFO: renamed from: getWidth, reason: from getter */
    public int get_width() {
        return this._width;
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onAttachedToWindow() {
        this.draweeHolder.e();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onDetachedFromWindow() {
        this.draweeHolder.f();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onFinishTemporaryDetach() {
        this.draweeHolder.e();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onStartTemporaryDetach() {
        this.draweeHolder.f();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void setTextView(@Nullable TextView textView) {
        this.textView = textView;
    }
}
