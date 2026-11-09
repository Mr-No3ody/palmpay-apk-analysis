package com.scwang.smartrefresh.layout.header;

import D7.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.ArrowDrawable;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import com.scwang.smartrefresh.layout.internal.ProgressDrawable;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class ClassicsHeader extends InternalClassics<ClassicsHeader> implements RefreshHeader {
    public static final byte ID_TEXT_UPDATE = 4;
    public static String REFRESH_HEADER_FAILED;
    public static String REFRESH_HEADER_FINISH;
    public static String REFRESH_HEADER_LOADING;
    public static String REFRESH_HEADER_PULLING;
    public static String REFRESH_HEADER_REFRESHING;
    public static String REFRESH_HEADER_RELEASE;
    public static String REFRESH_HEADER_SECONDARY;
    public static String REFRESH_HEADER_UPDATE;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f25141B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Date f25142C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final TextView f25143H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final SharedPreferences f25144L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public DateFormat f25145M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f25146Q;

    public ClassicsHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean z3) {
        TextView textView = this.f25174c;
        if (z3) {
            textView.setText(REFRESH_HEADER_FINISH);
            if (this.f25142C != null) {
                setLastUpdateTime(new Date());
            }
        } else {
            textView.setText(REFRESH_HEADER_FAILED);
        }
        return super.onFinish(refreshLayout, z3);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f25175d;
        TextView textView = this.f25143H;
        int i7 = b.f1688a[refreshState2.ordinal()];
        TextView textView2 = this.f25174c;
        switch (i7) {
            case 1:
                textView.setVisibility(this.f25146Q ? 0 : 8);
                break;
            case 2:
                break;
            case 3:
            case 4:
                textView2.setText(REFRESH_HEADER_REFRESHING);
                imageView.setVisibility(8);
                return;
            case 5:
                textView2.setText(REFRESH_HEADER_RELEASE);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                textView2.setText(REFRESH_HEADER_SECONDARY);
                imageView.animate().rotation(0.0f);
                return;
            case 7:
                imageView.setVisibility(8);
                textView.setVisibility(this.f25146Q ? 4 : 8);
                textView2.setText(REFRESH_HEADER_LOADING);
                return;
            default:
                return;
        }
        textView2.setText(REFRESH_HEADER_PULLING);
        imageView.setVisibility(0);
        imageView.animate().rotation(0.0f);
    }

    public ClassicsHeader setEnableLastTime(boolean z3) {
        TextView textView = this.f25143H;
        this.f25146Q = z3;
        textView.setVisibility(z3 ? 0 : 8);
        RefreshKernel refreshKernel = this.f25178g;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightFor(this);
        }
        return this;
    }

    public ClassicsHeader setLastUpdateText(CharSequence charSequence) {
        this.f25142C = null;
        this.f25143H.setText(charSequence);
        return this;
    }

    public ClassicsHeader setLastUpdateTime(Date date) {
        this.f25142C = date;
        this.f25143H.setText(this.f25145M.format(date));
        SharedPreferences sharedPreferences = this.f25144L;
        if (sharedPreferences != null && !isInEditMode()) {
            sharedPreferences.edit().putLong(this.f25141B, date.getTime()).apply();
        }
        return this;
    }

    public ClassicsHeader setTextSizeTime(float f10) {
        this.f25143H.setTextSize(f10);
        RefreshKernel refreshKernel = this.f25178g;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightFor(this);
        }
        return this;
    }

    public ClassicsHeader setTextTimeMarginTop(float f10) {
        TextView textView = this.f25143H;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = DensityUtil.dp2px(f10);
        textView.setLayoutParams(marginLayoutParams);
        return this;
    }

    public ClassicsHeader setTimeFormat(DateFormat dateFormat) {
        this.f25145M = dateFormat;
        Date date = this.f25142C;
        if (date != null) {
            this.f25143H.setText(dateFormat.format(date));
        }
        return this;
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics
    public ClassicsHeader setAccentColor(@ColorInt int i7) {
        this.f25143H.setTextColor((16777215 & i7) | (-872415232));
        return (ClassicsHeader) super.setAccentColor(i7);
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet, int i7) {
        Z supportFragmentManager;
        List listF;
        super(context, attributeSet, i7);
        this.f25141B = "LAST_UPDATE_TIME";
        this.f25146Q = true;
        if (REFRESH_HEADER_PULLING == null) {
            REFRESH_HEADER_PULLING = context.getString(R.string.srl_header_pulling);
        }
        if (REFRESH_HEADER_REFRESHING == null) {
            REFRESH_HEADER_REFRESHING = context.getString(R.string.srl_header_refreshing);
        }
        if (REFRESH_HEADER_LOADING == null) {
            REFRESH_HEADER_LOADING = context.getString(R.string.srl_header_loading);
        }
        if (REFRESH_HEADER_RELEASE == null) {
            REFRESH_HEADER_RELEASE = context.getString(R.string.srl_header_release);
        }
        if (REFRESH_HEADER_FINISH == null) {
            REFRESH_HEADER_FINISH = context.getString(R.string.srl_header_finish);
        }
        if (REFRESH_HEADER_FAILED == null) {
            REFRESH_HEADER_FAILED = context.getString(R.string.srl_header_failed);
        }
        if (REFRESH_HEADER_UPDATE == null) {
            REFRESH_HEADER_UPDATE = context.getString(R.string.srl_header_update);
        }
        if (REFRESH_HEADER_SECONDARY == null) {
            REFRESH_HEADER_SECONDARY = context.getString(R.string.srl_header_secondary);
        }
        TextView textView = new TextView(context);
        this.f25143H = textView;
        textView.setTextColor(-8618884);
        this.f25145M = new SimpleDateFormat(REFRESH_HEADER_UPDATE, Locale.getDefault());
        ImageView imageView = this.f25175d;
        ImageView imageView2 = this.f25176e;
        LinearLayout linearLayout = this.f25177f;
        DensityUtil densityUtil = new DensityUtil();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClassicsHeader);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClassicsHeader_srlTextTimeMarginTop, densityUtil.dip2px(0.0f));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClassicsFooter_srlDrawableMarginRight, densityUtil.dip2px(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsHeader_srlDrawableArrowSize, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsHeader_srlDrawableArrowSize, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsHeader_srlDrawableProgressSize, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsHeader_srlDrawableProgressSize, layoutParams2.height);
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsHeader_srlDrawableSize, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsHeader_srlDrawableSize, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsHeader_srlDrawableSize, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsHeader_srlDrawableSize, layoutParams2.height);
        this.f25183v = typedArrayObtainStyledAttributes.getInt(R.styleable.ClassicsHeader_srlFinishDuration, this.f25183v);
        this.f25146Q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ClassicsHeader_srlEnableLastTime, this.f25146Q);
        this.f25172b = SpinnerStyle.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.ClassicsHeader_srlClassicsSpinnerStyle, this.f25172b.ordinal())];
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsHeader_srlDrawableArrow)) {
            this.f25175d.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(R.styleable.ClassicsHeader_srlDrawableArrow));
        } else {
            ArrowDrawable arrowDrawable = new ArrowDrawable();
            this.f25179i = arrowDrawable;
            arrowDrawable.setColor(-10066330);
            this.f25175d.setImageDrawable(this.f25179i);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsHeader_srlDrawableProgress)) {
            this.f25176e.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(R.styleable.ClassicsHeader_srlDrawableProgress));
        } else {
            ProgressDrawable progressDrawable = new ProgressDrawable();
            this.f25180j = progressDrawable;
            progressDrawable.setColor(-10066330);
            this.f25176e.setImageDrawable(this.f25180j);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsHeader_srlTextSizeTitle)) {
            this.f25174c.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClassicsHeader_srlTextSizeTitle, DensityUtil.dp2px(16.0f)));
        } else {
            this.f25174c.setTextSize(16.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsHeader_srlTextSizeTime)) {
            textView.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClassicsHeader_srlTextSizeTime, DensityUtil.dp2px(12.0f)));
        } else {
            textView.setTextSize(12.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsHeader_srlPrimaryColor)) {
            setPrimaryColor(typedArrayObtainStyledAttributes.getColor(R.styleable.ClassicsHeader_srlPrimaryColor, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsHeader_srlAccentColor)) {
            setAccentColor(typedArrayObtainStyledAttributes.getColor(R.styleable.ClassicsHeader_srlAccentColor, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        textView.setId(4);
        textView.setVisibility(this.f25146Q ? 0 : 8);
        linearLayout.addView(textView, layoutParams3);
        this.f25174c.setText(isInEditMode() ? REFRESH_HEADER_REFRESHING : REFRESH_HEADER_PULLING);
        try {
            if ((context instanceof E) && (supportFragmentManager = ((E) context).getSupportFragmentManager()) != null && (listF = supportFragmentManager.f17069c.f()) != null && listF.size() > 0) {
                setLastUpdateTime(new Date());
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String str = this.f25141B + context.getClass().getName();
        this.f25141B = str;
        SharedPreferences sharedPreferences = context.getSharedPreferences("ClassicsHeader", 0);
        this.f25144L = sharedPreferences;
        setLastUpdateTime(new Date(sharedPreferences.getLong(str, System.currentTimeMillis())));
    }
}
