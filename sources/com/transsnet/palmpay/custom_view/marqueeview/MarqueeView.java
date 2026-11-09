package com.transsnet.palmpay.custom_view.marqueeview;

import G1.d;
import Y.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.ColorRes;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.resource.bitmap.i;
import com.bumptech.glide.m;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CvUtils;
import com.transsnet.palmpay.custom_view.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MarqueeView<T> extends ViewFlipper {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f31390Q = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f31391A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f31392B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public OnItemClickListener f31393C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public IMarqueeItemChanged f31394H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f31395L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f31396M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31403g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f31404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f31405j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f31406o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Typeface f31407p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f31408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f31409w;

    public interface OnItemClickListener {
        void onItemClick(int i7, TextView textView);
    }

    public MarqueeView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    public final LinearLayout a(Object obj) {
        String str;
        String imgUrl;
        View viewFindViewById;
        TextView textView;
        ImageView imageView;
        LinearLayout linearLayout = (LinearLayout) getChildAt((getDisplayedChild() + 1) % 3);
        if (linearLayout == null) {
            linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(t.cv_marquee_layout, (ViewGroup) this, false);
            TextView textView2 = (TextView) linearLayout.findViewById(s.marquee_content_tv);
            textView2.setGravity(this.f31405j | 16);
            textView2.setTextSize(this.f31400d);
            textView2.setIncludeFontPadding(true);
            textView2.setSingleLine(this.f31402f);
            if (this.f31402f) {
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
            }
            Typeface typeface = this.f31407p;
            if (typeface != null) {
                textView2.setTypeface(typeface);
            }
            textView2.setOnClickListener(new a(this));
        }
        int textColor = this.f31401e;
        CharSequence charSequenceMarqueeMessage = "";
        if (!(obj instanceof CharSequence)) {
            if (obj instanceof IMarqueeItem) {
                IMarqueeItem iMarqueeItem = (IMarqueeItem) obj;
                charSequenceMarqueeMessage = iMarqueeItem.marqueeMessage();
                imgUrl = iMarqueeItem.getImgUrl();
                textColor = iMarqueeItem.getTextColor();
            } else {
                str = "";
            }
            viewFindViewById = linearLayout.findViewById(s.iv_notice);
            if (this.f31403g) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
            textView = (TextView) linearLayout.findViewById(s.marquee_content_tv);
            if (this.f31395L) {
                textView.setTextColor(CommonExtKt.invertColor(textColor));
            } else {
                textView.setTextColor(textColor);
            }
            textView.setText(charSequenceMarqueeMessage);
            imageView = (ImageView) linearLayout.findViewById(s.marquee_icon_img);
            imageView.setVisibility(this.f31404i ? 0 : 8);
            if (CvUtils.isValidGlideContext(imageView.getContext())) {
                ((m) b.f(imageView).load(str).a((d) ((d) ((d) new d().x(this.t)).j(this.t)).H(new i())).g(k.f20703b)).S(imageView);
            }
            linearLayout.setTag(Integer.valueOf(this.f31391A));
            return linearLayout;
        }
        imgUrl = "";
        charSequenceMarqueeMessage = (CharSequence) obj;
        str = imgUrl;
        viewFindViewById = linearLayout.findViewById(s.iv_notice);
        if (this.f31403g) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        textView = (TextView) linearLayout.findViewById(s.marquee_content_tv);
        if (this.f31395L) {
            textView.setTextColor(CommonExtKt.invertColor(textColor));
        } else {
            textView.setTextColor(textColor);
        }
        textView.setText(charSequenceMarqueeMessage);
        imageView = (ImageView) linearLayout.findViewById(s.marquee_icon_img);
        imageView.setVisibility(this.f31404i ? 0 : 8);
        if (CvUtils.isValidGlideContext(imageView.getContext())) {
            ((m) b.f(imageView).load(str).a((d) ((d) ((d) new d().x(this.t)).j(this.t)).H(new i())).g(k.f20703b)).S(imageView);
        }
        linearLayout.setTag(Integer.valueOf(this.f31391A));
        return linearLayout;
    }

    public final void b(List list) {
        int i7 = this.f31408v;
        int i10 = this.f31409w;
        if (list == null || list.size() == 0) {
            return;
        }
        setMessages(list);
        post(new Ub.a(this, i7, i10));
    }

    public List<T> getMessages() {
        return this.f31392B;
    }

    public int getPosition() {
        return ((Integer) getCurrentView().getTag()).intValue();
    }

    public void setDefaultIcon(int i7) {
        this.t = i7;
    }

    public void setMessages(List<T> list) {
        this.f31392B = list;
    }

    public void setNightMode(boolean z3) {
        this.f31395L = z3;
    }

    public void setOnItemChangedListener(IMarqueeItemChanged iMarqueeItemChanged) {
        this.f31394H = iMarqueeItemChanged;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.f31393C = onItemClickListener;
    }

    public void setTextColor(@ColorRes int i7) {
        this.f31401e = i7;
    }

    public void setTypeface(Typeface typeface) {
        this.f31407p = typeface;
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31397a = 3000;
        this.f31398b = false;
        this.f31399c = 1000;
        this.f31400d = 14;
        this.f31401e = -16777216;
        this.f31402f = false;
        this.f31403g = false;
        this.f31404i = false;
        this.f31405j = 19;
        this.f31406o = 0;
        this.t = r.cv_avatar_default;
        this.f31408v = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_bottom_in;
        this.f31409w = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_top_out;
        this.f31392B = new ArrayList();
        this.f31395L = false;
        this.f31396M = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.MarqueeViewStyle, 0, 0);
        this.f31397a = typedArrayObtainStyledAttributes.getInteger(x.MarqueeViewStyle_mvInterval, this.f31397a);
        this.f31398b = typedArrayObtainStyledAttributes.hasValue(x.MarqueeViewStyle_mvAnimDuration);
        this.f31399c = typedArrayObtainStyledAttributes.getInteger(x.MarqueeViewStyle_mvAnimDuration, this.f31399c);
        this.f31402f = typedArrayObtainStyledAttributes.getBoolean(x.MarqueeViewStyle_mvSingleLine, false);
        this.f31403g = typedArrayObtainStyledAttributes.getBoolean(x.MarqueeViewStyle_mvShowNotice, false);
        this.f31404i = typedArrayObtainStyledAttributes.getBoolean(x.MarqueeViewStyle_mvShowIconImg, true);
        if (typedArrayObtainStyledAttributes.hasValue(x.MarqueeViewStyle_mvTextSize)) {
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(x.MarqueeViewStyle_mvTextSize, this.f31400d);
            this.f31400d = dimension;
            this.f31400d = (int) ((dimension / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        }
        this.f31401e = typedArrayObtainStyledAttributes.getColor(x.MarqueeViewStyle_mvTextColor, this.f31401e);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x.MarqueeViewStyle_mvFont, 0);
        if (resourceId != 0) {
            this.f31407p = j.a(resourceId, context);
        }
        int i7 = typedArrayObtainStyledAttributes.getInt(x.MarqueeViewStyle_mvGravity, 0);
        if (i7 == 0) {
            this.f31405j = 19;
        } else if (i7 == 1) {
            this.f31405j = 17;
        } else if (i7 == 2) {
            this.f31405j = 21;
        }
        if (typedArrayObtainStyledAttributes.hasValue(x.MarqueeViewStyle_mvDirection)) {
            int i10 = typedArrayObtainStyledAttributes.getInt(x.MarqueeViewStyle_mvDirection, this.f31406o);
            this.f31406o = i10;
            if (i10 == 0) {
                this.f31408v = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_bottom_in;
                this.f31409w = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_top_out;
            } else if (i10 == 1) {
                this.f31408v = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_top_in;
                this.f31409w = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_bottom_out;
            } else if (i10 == 2) {
                this.f31408v = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_right_in;
                this.f31409w = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_left_out;
            } else if (i10 == 3) {
                this.f31408v = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_left_in;
                this.f31409w = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_right_out;
            }
        } else {
            this.f31408v = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_bottom_in;
            this.f31409w = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_top_out;
        }
        typedArrayObtainStyledAttributes.recycle();
        setFlipInterval(this.f31397a);
    }
}
