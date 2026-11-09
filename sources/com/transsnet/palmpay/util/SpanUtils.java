package com.transsnet.palmpay.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SpanUtils {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_TOP = 3;
    private static final int COLOR_DEFAULT = -16777217;
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private int alignImage;
    private int alignLine;
    private Layout.Alignment alignment;
    private int backgroundColor;
    private float blurRadius;
    private int bulletColor;
    private int bulletGapWidth;
    private int bulletRadius;
    private ClickableSpan clickSpan;
    private int first;
    private int flag;
    private String fontFamily;
    private int fontSize;
    private boolean fontSizeIsDp;
    private int foregroundColor;
    private Bitmap imageBitmap;
    private Drawable imageDrawable;
    private int imageResourceId;
    private Uri imageUri;
    private boolean isBold;
    private boolean isBoldItalic;
    private boolean isItalic;
    private boolean isStrikethrough;
    private boolean isSubscript;
    private boolean isSuperscript;
    private boolean isUnderline;
    private int lineHeight;
    private int mType;
    private float proportion;
    private int quoteColor;
    private int quoteGapWidth;
    private int rest;
    private Shader shader;
    private int shadowColor;
    private float shadowDx;
    private float shadowDy;
    private float shadowRadius;
    private int spaceColor;
    private int spaceSize;
    private Object[] spans;
    private int stripeWidth;
    private BlurMaskFilter.Blur style;
    private Typeface typeface;
    private String url;
    private float xProportion;
    private final int mTypeCharSequence = 0;
    private final int mTypeImage = 1;
    private final int mTypeSpace = 2;
    private SpannableStringBuilder mBuilder = new SpannableStringBuilder();
    private CharSequence mText = "";

    @Retention(RetentionPolicy.SOURCE)
    public @interface Align {
    }

    public class CustomBulletSpan implements LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int radius;
        private Path sBulletPath;

        public /* synthetic */ CustomBulletSpan(SpanUtils spanUtils, int i7, int i10, int i11, int i12) {
            this(i7, i10, i11);
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z3, Layout layout) {
            if (((Spanned) charSequence).getSpanStart(this) == i14) {
                Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                paint.setColor(this.color);
                paint.setStyle(Paint.Style.FILL);
                if (canvas.isHardwareAccelerated()) {
                    if (this.sBulletPath == null) {
                        Path path = new Path();
                        this.sBulletPath = path;
                        path.addCircle(0.0f, 0.0f, this.radius, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.translate((i10 * this.radius) + i7, (i11 + i13) / 2.0f);
                    canvas.drawPath(this.sBulletPath, paint);
                    canvas.restore();
                } else {
                    int i16 = this.radius;
                    canvas.drawCircle((i10 * i16) + i7, (i11 + i13) / 2.0f, i16, paint);
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z3) {
            return (this.radius * 2) + this.gapWidth;
        }

        private CustomBulletSpan(int i7, int i10, int i11) {
            this.sBulletPath = null;
            this.color = i7;
            this.radius = i10;
            this.gapWidth = i11;
        }
    }

    public abstract class CustomDynamicDrawableSpan extends ReplacementSpan {
        static final int ALIGN_BASELINE = 1;
        static final int ALIGN_BOTTOM = 0;
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        private WeakReference<Drawable> mDrawableRef;
        final int mVerticalAlignment;

        public /* synthetic */ CustomDynamicDrawableSpan(SpanUtils spanUtils, int i7, int i10) {
            this(i7);
        }

        private Drawable getCachedDrawable() {
            WeakReference<Drawable> weakReference = this.mDrawableRef;
            Drawable drawable = weakReference != null ? weakReference.get() : null;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = getDrawable();
            this.mDrawableRef = new WeakReference<>(drawable2);
            return drawable2;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, @NonNull Paint paint) {
            int iHeight;
            float fHeight;
            Drawable cachedDrawable = getCachedDrawable();
            Rect bounds = cachedDrawable.getBounds();
            canvas.save();
            if (bounds.height() < i13 - i11) {
                int i14 = this.mVerticalAlignment;
                if (i14 == 3) {
                    fHeight = i11;
                } else {
                    if (i14 == 2) {
                        iHeight = ((i13 + i11) - bounds.height()) / 2;
                    } else if (i14 == 1) {
                        fHeight = i12 - bounds.height();
                    } else {
                        iHeight = i13 - bounds.height();
                    }
                    fHeight = iHeight;
                }
                canvas.translate(f10, fHeight);
            } else {
                canvas.translate(f10, i11);
            }
            cachedDrawable.draw(canvas);
            canvas.restore();
        }

        public abstract Drawable getDrawable();

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
            int i11;
            Rect bounds = getCachedDrawable().getBounds();
            if (fontMetricsInt != null && (i11 = fontMetricsInt.bottom - fontMetricsInt.top) < bounds.height()) {
                int i12 = this.mVerticalAlignment;
                if (i12 == 3) {
                    fontMetricsInt.top = fontMetricsInt.top;
                    fontMetricsInt.bottom = bounds.height() + fontMetricsInt.top;
                } else if (i12 == 2) {
                    int i13 = i11 / 4;
                    fontMetricsInt.top = ((-bounds.height()) / 2) - i13;
                    fontMetricsInt.bottom = (bounds.height() / 2) - i13;
                } else {
                    int i14 = -bounds.height();
                    int i15 = fontMetricsInt.bottom;
                    fontMetricsInt.top = i14 + i15;
                    fontMetricsInt.bottom = i15;
                }
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = fontMetricsInt.bottom;
            }
            return bounds.right;
        }

        private CustomDynamicDrawableSpan() {
            this.mVerticalAlignment = 0;
        }

        private CustomDynamicDrawableSpan(int i7) {
            this.mVerticalAlignment = i7;
        }
    }

    public class CustomImageSpan extends CustomDynamicDrawableSpan {
        private Uri mContentUri;
        private Drawable mDrawable;
        private int mResourceId;

        public /* synthetic */ CustomImageSpan(SpanUtils spanUtils, int i7, int i10, int i11) {
            this(i7, i10);
        }

        @Override // com.transsnet.palmpay.util.SpanUtils.CustomDynamicDrawableSpan
        public Drawable getDrawable() {
            Drawable drawable = this.mDrawable;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = null;
            if (this.mContentUri != null) {
                try {
                    InputStream inputStreamOpenInputStream = Utils.getApp().getContentResolver().openInputStream(this.mContentUri);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(Utils.getApp().getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    try {
                        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
                        if (inputStreamOpenInputStream == null) {
                            return bitmapDrawable;
                        }
                        inputStreamOpenInputStream.close();
                        return bitmapDrawable;
                    } catch (Exception e10) {
                        e = e10;
                        drawable2 = bitmapDrawable;
                        Log.e("sms", "Failed to loaded content " + this.mContentUri, e);
                        return drawable2;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                try {
                    drawable2 = Utils.getApp().getDrawable(this.mResourceId);
                    drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                    return drawable2;
                } catch (Exception unused) {
                    Log.e("sms", "Unable to find resource: " + this.mResourceId);
                }
            }
            return drawable2;
        }

        public /* synthetic */ CustomImageSpan(SpanUtils spanUtils, Bitmap bitmap, int i7, int i10) {
            this(bitmap, i7);
        }

        public /* synthetic */ CustomImageSpan(SpanUtils spanUtils, Drawable drawable, int i7, int i10) {
            this(drawable, i7);
        }

        public /* synthetic */ CustomImageSpan(SpanUtils spanUtils, Uri uri, int i7, int i10) {
            this(uri, i7);
        }

        private CustomImageSpan(Bitmap bitmap, int i7) {
            super(SpanUtils.this, i7, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(Utils.getApp().getResources(), bitmap);
            this.mDrawable = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private CustomImageSpan(Drawable drawable, int i7) {
            super(SpanUtils.this, i7, 0);
            this.mDrawable = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private CustomImageSpan(Uri uri, int i7) {
            super(SpanUtils.this, i7, 0);
            this.mContentUri = uri;
        }

        private CustomImageSpan(int i7, int i10) {
            super(SpanUtils.this, i10, 0);
            this.mResourceId = i7;
        }
    }

    public class CustomLineHeightSpan extends CharacterStyle implements LineHeightSpan {
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        private final int height;
        final int mVerticalAlignment;

        public CustomLineHeightSpan(int i7, int i10) {
            this.height = i7;
            this.mVerticalAlignment = i10;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
            int i13 = this.height;
            int i14 = fontMetricsInt.descent;
            int i15 = fontMetricsInt.ascent;
            int i16 = i13 - (((i12 + i14) - i15) - i11);
            int i17 = this.mVerticalAlignment;
            if (i17 == 3) {
                fontMetricsInt.descent = i14 + i16;
            } else if (i17 == 2) {
                int i18 = i16 / 2;
                fontMetricsInt.descent = i14 + i18;
                fontMetricsInt.ascent = i15 - i18;
            } else {
                fontMetricsInt.ascent = i15 - i16;
            }
            int i19 = fontMetricsInt.bottom;
            int i20 = fontMetricsInt.top;
            int i21 = i13 - (((i12 + i19) - i20) - i11);
            if (i17 == 3) {
                fontMetricsInt.top = i20 + i21;
            } else {
                if (i17 != 2) {
                    fontMetricsInt.top = i20 - i21;
                    return;
                }
                int i22 = i21 / 2;
                fontMetricsInt.bottom = i19 + i22;
                fontMetricsInt.top = i20 - i22;
            }
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    public class CustomQuoteSpan implements LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int stripeWidth;

        public /* synthetic */ CustomQuoteSpan(SpanUtils spanUtils, int i7, int i10, int i11, int i12) {
            this(i7, i10, i11);
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z3, Layout layout) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.color);
            canvas.drawRect(i7, i11, (i10 * this.stripeWidth) + i7, i13, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z3) {
            return this.stripeWidth + this.gapWidth;
        }

        private CustomQuoteSpan(int i7, int i10, int i11) {
            this.color = i7;
            this.stripeWidth = i10;
            this.gapWidth = i11;
        }
    }

    @SuppressLint({"ParcelCreator"})
    public class CustomTypefaceSpan extends TypefaceSpan {
        private final Typeface newType;

        public /* synthetic */ CustomTypefaceSpan(SpanUtils spanUtils, Typeface typeface, int i7) {
            this(typeface);
        }

        private void apply(Paint paint, Typeface typeface) {
            Typeface typeface2 = paint.getTypeface();
            int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (~typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.getShader();
            paint.setTypeface(typeface);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        private CustomTypefaceSpan(Typeface typeface) {
            super("");
            this.newType = typeface;
        }
    }

    public class ShaderSpan extends CharacterStyle implements UpdateAppearance {
        private Shader mShader;

        public /* synthetic */ ShaderSpan(SpanUtils spanUtils, Shader shader, int i7) {
            this(shader);
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShader(this.mShader);
        }

        private ShaderSpan(Shader shader) {
            this.mShader = shader;
        }
    }

    public class ShadowSpan extends CharacterStyle implements UpdateAppearance {
        private float dx;
        private float dy;
        private float radius;
        private int shadowColor;

        public /* synthetic */ ShadowSpan(SpanUtils spanUtils, float f10, float f11, float f12, int i7, int i10) {
            this(f10, f11, f12, i7);
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShadowLayer(this.radius, this.dx, this.dy, this.shadowColor);
        }

        private ShadowSpan(float f10, float f11, float f12, int i7) {
            this.radius = f10;
            this.dx = f11;
            this.dy = f12;
            this.shadowColor = i7;
        }
    }

    public class SpaceSpan extends ReplacementSpan {
        private final int color;
        private final int width;

        public /* synthetic */ SpaceSpan(SpanUtils spanUtils, int i7, int i10, int i11) {
            this(i7, i10);
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i7, @IntRange(from = 0) int i10, float f10, int i11, int i12, int i13, @NonNull Paint paint) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.color);
            canvas.drawRect(f10, i11, f10 + this.width, i13, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i7, @IntRange(from = 0) int i10, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            return this.width;
        }

        private SpaceSpan(SpanUtils spanUtils, int i7) {
            this(i7, 0);
        }

        private SpaceSpan(int i7, int i10) {
            this.width = i7;
            this.color = i10;
        }
    }

    public SpanUtils() {
        setDefault();
    }

    private void apply(int i7) {
        applyLast();
        this.mType = i7;
    }

    private void applyLast() {
        int i7 = this.mType;
        if (i7 == 0) {
            updateCharCharSequence();
        } else if (i7 == 1) {
            updateImage();
        } else if (i7 == 2) {
            updateSpace();
        }
        setDefault();
    }

    private void setDefault() {
        this.flag = 33;
        this.foregroundColor = COLOR_DEFAULT;
        this.backgroundColor = COLOR_DEFAULT;
        this.lineHeight = -1;
        this.quoteColor = COLOR_DEFAULT;
        this.first = -1;
        this.bulletColor = COLOR_DEFAULT;
        this.fontSize = -1;
        this.proportion = -1.0f;
        this.xProportion = -1.0f;
        this.isStrikethrough = false;
        this.isUnderline = false;
        this.isSuperscript = false;
        this.isSubscript = false;
        this.isBold = false;
        this.isItalic = false;
        this.isBoldItalic = false;
        this.fontFamily = null;
        this.typeface = null;
        this.alignment = null;
        this.clickSpan = null;
        this.url = null;
        this.blurRadius = -1.0f;
        this.shader = null;
        this.shadowRadius = -1.0f;
        this.spans = null;
        this.imageBitmap = null;
        this.imageDrawable = null;
        this.imageUri = null;
        this.imageResourceId = -1;
        this.spaceSize = -1;
    }

    private void updateCharCharSequence() {
        CharSequence charSequence = this.mText;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int length = this.mBuilder.length();
        this.mBuilder.append(this.mText);
        int length2 = this.mBuilder.length();
        if (this.foregroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), length, length2, this.flag);
        }
        if (this.backgroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), length, length2, this.flag);
        }
        if (this.first != -1) {
            this.mBuilder.setSpan(new LeadingMarginSpan.Standard(this.first, this.rest), length, length2, this.flag);
        }
        int i7 = this.quoteColor;
        if (i7 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new CustomQuoteSpan(this, i7, this.stripeWidth, this.quoteGapWidth, 0), length, length2, this.flag);
        }
        int i10 = this.bulletColor;
        if (i10 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new CustomBulletSpan(this, i10, this.bulletRadius, this.bulletGapWidth, 0), length, length2, this.flag);
        }
        if (this.fontSize != -1) {
            this.mBuilder.setSpan(new AbsoluteSizeSpan(this.fontSize, this.fontSizeIsDp), length, length2, this.flag);
        }
        if (this.proportion != -1.0f) {
            this.mBuilder.setSpan(new RelativeSizeSpan(this.proportion), length, length2, this.flag);
        }
        if (this.xProportion != -1.0f) {
            this.mBuilder.setSpan(new ScaleXSpan(this.xProportion), length, length2, this.flag);
        }
        if (this.lineHeight != -1) {
            this.mBuilder.setSpan(new CustomLineHeightSpan(this.lineHeight, this.alignLine), length, length2, this.flag);
        }
        if (this.isStrikethrough) {
            this.mBuilder.setSpan(new StrikethroughSpan(), length, length2, this.flag);
        }
        if (this.isUnderline) {
            this.mBuilder.setSpan(new UnderlineSpan(), length, length2, this.flag);
        }
        if (this.isSuperscript) {
            this.mBuilder.setSpan(new SuperscriptSpan(), length, length2, this.flag);
        }
        if (this.isSubscript) {
            this.mBuilder.setSpan(new SubscriptSpan(), length, length2, this.flag);
        }
        if (this.isBold) {
            this.mBuilder.setSpan(new StyleSpan(1), length, length2, this.flag);
        }
        if (this.isItalic) {
            this.mBuilder.setSpan(new StyleSpan(2), length, length2, this.flag);
        }
        if (this.isBoldItalic) {
            this.mBuilder.setSpan(new StyleSpan(3), length, length2, this.flag);
        }
        if (this.fontFamily != null) {
            this.mBuilder.setSpan(new TypefaceSpan(this.fontFamily), length, length2, this.flag);
        }
        int i11 = 0;
        if (this.typeface != null) {
            this.mBuilder.setSpan(new CustomTypefaceSpan(this, this.typeface, i11), length, length2, this.flag);
        }
        if (this.alignment != null) {
            this.mBuilder.setSpan(new AlignmentSpan.Standard(this.alignment), length, length2, this.flag);
        }
        ClickableSpan clickableSpan = this.clickSpan;
        if (clickableSpan != null) {
            this.mBuilder.setSpan(clickableSpan, length, length2, this.flag);
        }
        if (this.url != null) {
            this.mBuilder.setSpan(new URLSpan(this.url), length, length2, this.flag);
        }
        if (this.blurRadius != -1.0f) {
            this.mBuilder.setSpan(new MaskFilterSpan(new BlurMaskFilter(this.blurRadius, this.style)), length, length2, this.flag);
        }
        if (this.shader != null) {
            this.mBuilder.setSpan(new ShaderSpan(this, this.shader, i11), length, length2, this.flag);
        }
        if (this.shadowRadius != -1.0f) {
            this.mBuilder.setSpan(new ShadowSpan(this, this.shadowRadius, this.shadowDx, this.shadowDy, this.shadowColor, 0), length, length2, this.flag);
        }
        Object[] objArr = this.spans;
        if (objArr != null) {
            int length3 = objArr.length;
            while (i11 < length3) {
                this.mBuilder.setSpan(objArr[i11], length, length2, this.flag);
                i11++;
            }
        }
    }

    private void updateImage() {
        int length = this.mBuilder.length();
        this.mBuilder.append((CharSequence) "<img>");
        int i7 = length + 5;
        int i10 = 0;
        if (this.imageBitmap != null) {
            this.mBuilder.setSpan(new CustomImageSpan(this, this.imageBitmap, this.alignImage, i10), length, i7, this.flag);
            return;
        }
        if (this.imageDrawable != null) {
            this.mBuilder.setSpan(new CustomImageSpan(this, this.imageDrawable, this.alignImage, i10), length, i7, this.flag);
        } else if (this.imageUri != null) {
            this.mBuilder.setSpan(new CustomImageSpan(this, this.imageUri, this.alignImage, i10), length, i7, this.flag);
        } else if (this.imageResourceId != -1) {
            this.mBuilder.setSpan(new CustomImageSpan(this, this.imageResourceId, this.alignImage, i10), length, i7, this.flag);
        }
    }

    private void updateSpace() {
        int length = this.mBuilder.length();
        this.mBuilder.append((CharSequence) "< >");
        this.mBuilder.setSpan(new SpaceSpan(this, this.spaceSize, this.spaceColor, 0), length, length + 3, this.flag);
    }

    public SpanUtils append(@NonNull CharSequence charSequence) {
        apply(0);
        this.mText = charSequence;
        return this;
    }

    public SpanUtils appendImage(@NonNull Bitmap bitmap) {
        return appendImage(bitmap, 0);
    }

    public SpanUtils appendLine() {
        apply(0);
        this.mText = LINE_SEPARATOR;
        return this;
    }

    public SpanUtils appendSpace(@IntRange(from = 0) int i7) {
        return appendSpace(i7, 0);
    }

    public SpannableStringBuilder create() {
        applyLast();
        return this.mBuilder;
    }

    public SpanUtils setAlign(@NonNull Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public SpanUtils setBackgroundColor(@ColorInt int i7) {
        this.backgroundColor = i7;
        return this;
    }

    public SpanUtils setBlur(@FloatRange(from = 0.0d, fromInclusive = false) float f10, BlurMaskFilter.Blur blur) {
        this.blurRadius = f10;
        this.style = blur;
        return this;
    }

    public SpanUtils setBold() {
        this.isBold = true;
        return this;
    }

    public SpanUtils setBoldItalic() {
        this.isBoldItalic = true;
        return this;
    }

    public SpanUtils setBullet(@IntRange(from = 0) int i7) {
        return setBullet(0, 3, i7);
    }

    public SpanUtils setClickSpan(@NonNull ClickableSpan clickableSpan) {
        this.clickSpan = clickableSpan;
        return this;
    }

    public SpanUtils setFlag(int i7) {
        this.flag = i7;
        return this;
    }

    public SpanUtils setFontFamily(@NonNull String str) {
        this.fontFamily = str;
        return this;
    }

    public SpanUtils setFontProportion(float f10) {
        this.proportion = f10;
        return this;
    }

    public SpanUtils setFontSize(@IntRange(from = 0) int i7) {
        return setFontSize(i7, false);
    }

    public SpanUtils setFontXProportion(float f10) {
        this.xProportion = f10;
        return this;
    }

    public SpanUtils setForegroundColor(@ColorInt int i7) {
        this.foregroundColor = i7;
        return this;
    }

    public SpanUtils setItalic() {
        this.isItalic = true;
        return this;
    }

    public SpanUtils setLeadingMargin(@IntRange(from = 0) int i7, @IntRange(from = 0) int i10) {
        this.first = i7;
        this.rest = i10;
        return this;
    }

    public SpanUtils setLineHeight(@IntRange(from = 0) int i7) {
        return setLineHeight(i7, 2);
    }

    public SpanUtils setQuoteColor(@ColorInt int i7) {
        return setQuoteColor(i7, 2, 2);
    }

    public SpanUtils setShader(@NonNull Shader shader) {
        this.shader = shader;
        return this;
    }

    public SpanUtils setShadow(@FloatRange(from = 0.0d, fromInclusive = false) float f10, float f11, float f12, int i7) {
        this.shadowRadius = f10;
        this.shadowDx = f11;
        this.shadowDy = f12;
        this.shadowColor = i7;
        return this;
    }

    public SpanUtils setSpans(@NonNull Object... objArr) {
        if (objArr.length > 0) {
            this.spans = objArr;
        }
        return this;
    }

    public SpanUtils setStrikethrough() {
        this.isStrikethrough = true;
        return this;
    }

    public SpanUtils setSubscript() {
        this.isSubscript = true;
        return this;
    }

    public SpanUtils setSuperscript() {
        this.isSuperscript = true;
        return this;
    }

    public SpanUtils setTypeface(@NonNull Typeface typeface) {
        this.typeface = typeface;
        return this;
    }

    public SpanUtils setUnderline() {
        this.isUnderline = true;
        return this;
    }

    public SpanUtils setUrl(@NonNull String str) {
        this.url = str;
        return this;
    }

    public SpanUtils appendImage(@NonNull Bitmap bitmap, int i7) {
        apply(1);
        this.imageBitmap = bitmap;
        this.alignImage = i7;
        return this;
    }

    public SpanUtils appendSpace(@IntRange(from = 0) int i7, @ColorInt int i10) {
        apply(2);
        this.spaceSize = i7;
        this.spaceColor = i10;
        return this;
    }

    public SpanUtils setBullet(@ColorInt int i7, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11) {
        this.bulletColor = i7;
        this.bulletRadius = i10;
        this.bulletGapWidth = i11;
        return this;
    }

    public SpanUtils setFontSize(@IntRange(from = 0) int i7, boolean z3) {
        this.fontSize = i7;
        this.fontSizeIsDp = z3;
        return this;
    }

    public SpanUtils setLineHeight(@IntRange(from = 0) int i7, int i10) {
        this.lineHeight = i7;
        this.alignLine = i10;
        return this;
    }

    public SpanUtils setQuoteColor(@ColorInt int i7, @IntRange(from = 1) int i10, @IntRange(from = 0) int i11) {
        this.quoteColor = i7;
        this.stripeWidth = i10;
        this.quoteGapWidth = i11;
        return this;
    }

    public SpanUtils appendLine(@NonNull CharSequence charSequence) {
        apply(0);
        this.mText = ((Object) charSequence) + LINE_SEPARATOR;
        return this;
    }

    public SpanUtils appendImage(@NonNull Drawable drawable) {
        return appendImage(drawable, 0);
    }

    public SpanUtils appendImage(@NonNull Drawable drawable, int i7) {
        apply(1);
        this.imageDrawable = drawable;
        this.alignImage = i7;
        return this;
    }

    public SpanUtils appendImage(@NonNull Uri uri) {
        return appendImage(uri, 0);
    }

    public SpanUtils appendImage(@NonNull Uri uri, int i7) {
        apply(1);
        this.imageUri = uri;
        this.alignImage = i7;
        return this;
    }

    public SpanUtils appendImage(@DrawableRes int i7) {
        return appendImage(i7, 0);
    }

    public SpanUtils appendImage(@DrawableRes int i7, int i10) {
        append(Character.toString((char) 0));
        apply(1);
        this.imageResourceId = i7;
        this.alignImage = i10;
        return this;
    }
}
