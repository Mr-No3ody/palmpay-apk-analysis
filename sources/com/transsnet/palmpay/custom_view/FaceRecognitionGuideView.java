package com.transsnet.palmpay.custom_view;

import Bc.C0105b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Px;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u001b\u001a\u00020\u000b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cR!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/custom_view/FaceRecognitionGuideView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "resId", "", "setTopIcon", "(I)V", "sizePx", "setTopIconSize", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "guideTitle", "setGuideTitle", "", "Lcom/transsnet/palmpay/custom_view/h;", "items", "setItems", "(Ljava/util/List;)V", "", "c", "Lkotlin/Lazy;", "getDefaultItemTexts", "()[Ljava/lang/CharSequence;", "defaultItemTexts", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceRecognitionGuideView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceRecognitionGuideView.kt\ncom/transsnet/palmpay/custom_view/FaceRecognitionGuideView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1#2:181\n1563#3:182\n1634#3,3:183\n1573#3:186\n1604#3,4:187\n1869#3,2:191\n*S KotlinDebug\n*F\n+ 1 FaceRecognitionGuideView.kt\ncom/transsnet/palmpay/custom_view/FaceRecognitionGuideView\n*L\n148#1:182\n148#1:183,3\n155#1:186\n155#1:187,4\n168#1:191,2\n*E\n"})
public final class FaceRecognitionGuideView extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31019d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0105b f31020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f31021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f31022c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceRecognitionGuideView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final CharSequence[] getDefaultItemTexts() {
        return (CharSequence[]) this.f31022c.getValue();
    }

    public final void setGuideTitle(@Nullable CharSequence guideTitle) {
        if (guideTitle == null) {
            return;
        }
        ((TextView) this.f31020a.f663c).setText(guideTitle);
    }

    public final void setItems(@Nullable List<C1550h> items) {
        ArrayList<C1550h> arrayList;
        List<C1550h> list = items;
        if (list == null || list.isEmpty()) {
            int[] iArr = this.f31021b;
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            IntRange intRange = new IntRange(0, iArr.length - 1, 1);
            ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(intRange, 10));
            Iterator it = intRange.iterator();
            while (((Rf.b) it).f8613c) {
                int iA = ((kotlin.collections.C) it).a();
                arrayList2.add(new C1550h(Integer.valueOf(iArr[iA]), getDefaultItemTexts()[iA]));
            }
            arrayList = arrayList2;
        } else {
            List<C1550h> list2 = items;
            arrayList = new ArrayList(kotlin.collections.r.l(list2, 10));
            int i7 = 0;
            for (Object obj : list2) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    C1850q.k();
                    throw null;
                }
                C1550h c1550h = (C1550h) obj;
                Integer numValueOf = Integer.valueOf(c1550h.f31346a.intValue());
                CharSequence charSequence = c1550h.f31347b;
                if (charSequence == null && (charSequence = (CharSequence) C1847n.s(i7, getDefaultItemTexts())) == null) {
                    CharSequence[] defaultItemTexts = getDefaultItemTexts();
                    Intrinsics.checkNotNullParameter(defaultItemTexts, "<this>");
                    if (defaultItemTexts.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    Intrinsics.checkNotNullParameter(defaultItemTexts, "<this>");
                    charSequence = defaultItemTexts[defaultItemTexts.length - 1];
                }
                arrayList.add(new C1550h(numValueOf, charSequence));
                i7 = i10;
            }
        }
        C0105b c0105b = this.f31020a;
        ((LinearLayout) c0105b.f662b).removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        for (C1550h c1550h2 : arrayList) {
            ViewGroup viewGroup = (LinearLayout) c0105b.f662b;
            View viewInflate = layoutInflaterFrom.inflate(t.cv_layout_face_recognition_guide_item, viewGroup, false);
            int i11 = s.ivIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i11, viewInflate);
            if (appCompatImageView != null) {
                i11 = s.tvText;
                TextView textView = (TextView) p059e1.a.m(i11, viewInflate);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    Intrinsics.checkNotNullExpressionValue(new N6.e(constraintLayout, appCompatImageView, textView), "inflate(...)");
                    appCompatImageView.setImageResource(c1550h2.f31346a.intValue());
                    textView.setText(c1550h2.f31347b);
                    viewGroup.addView(constraintLayout);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        }
    }

    public final void setSubtitle(@Nullable CharSequence subtitle) {
        if (subtitle == null) {
            return;
        }
        ((TextView) this.f31020a.f664d).setText(subtitle);
    }

    public final void setTitle(@Nullable CharSequence title) {
        if (title == null) {
            return;
        }
        ((TextView) this.f31020a.f665e).setText(title);
    }

    public final void setTopIcon(@DrawableRes int resId) {
        ((ImageView) this.f31020a.f667g).setImageResource(resId);
    }

    public final void setTopIconSize(@Px int sizePx) {
        C0105b c0105b = this.f31020a;
        ViewGroup.LayoutParams layoutParams = ((ImageView) c0105b.f667g).getLayoutParams();
        layoutParams.width = sizePx;
        layoutParams.height = sizePx;
        ((ImageView) c0105b.f667g).setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceRecognitionGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FaceRecognitionGuideView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceRecognitionGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        int dimensionPixelSize;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31021b = new int[]{r.cv_face_capture_guide_1, r.cv_face_capture_guide_2, r.cv_face_capture_guide_3};
        this.f31022c = C2131j.b(new Gd.n(context, 9));
        setOrientation(1);
        LayoutInflater.from(context).inflate(t.cv_layout_face_recognition_guide, (ViewGroup) this, true);
        int i10 = s.ivTopIcon;
        ImageView imageView = (ImageView) p059e1.a.m(i10, this);
        if (imageView != null) {
            i10 = s.layoutGuideCard;
            if (((LinearLayout) p059e1.a.m(i10, this)) != null) {
                i10 = s.layoutItems;
                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i10, this);
                if (linearLayout != null) {
                    i10 = s.tvGuideTitle;
                    TextView textView = (TextView) p059e1.a.m(i10, this);
                    if (textView != null) {
                        i10 = s.tvSubtitle;
                        TextView textView2 = (TextView) p059e1.a.m(i10, this);
                        if (textView2 != null) {
                            i10 = s.tvTitle;
                            TextView textView3 = (TextView) p059e1.a.m(i10, this);
                            if (textView3 != null) {
                                C0105b c0105b = new C0105b(this, imageView, linearLayout, textView, textView2, textView3);
                                Intrinsics.checkNotNullExpressionValue(c0105b, "bind(...)");
                                this.f31020a = c0105b;
                                if (attributeSet != null) {
                                    TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvFaceRecognitionGuideView);
                                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                                    try {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x.CvFaceRecognitionGuideView_cv_frg_top_icon, 0);
                                        if (resourceId != 0) {
                                            setTopIcon(resourceId);
                                        }
                                        if (typedArrayObtainStyledAttributes.hasValue(x.CvFaceRecognitionGuideView_cv_frg_top_icon_size) && (dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CvFaceRecognitionGuideView_cv_frg_top_icon_size, 0)) > 0) {
                                            setTopIconSize(dimensionPixelSize);
                                        }
                                        CharSequence text = typedArrayObtainStyledAttributes.getText(x.CvFaceRecognitionGuideView_cv_frg_title);
                                        if (text != null) {
                                            setTitle(text);
                                        }
                                        CharSequence text2 = typedArrayObtainStyledAttributes.getText(x.CvFaceRecognitionGuideView_cv_frg_subtitle);
                                        if (text2 != null) {
                                            setSubtitle(text2);
                                        }
                                        CharSequence text3 = typedArrayObtainStyledAttributes.getText(x.CvFaceRecognitionGuideView_cv_frg_guide_title);
                                        if (text3 != null) {
                                            setGuideTitle(text3);
                                        }
                                        typedArrayObtainStyledAttributes.recycle();
                                    } catch (Throwable th) {
                                        typedArrayObtainStyledAttributes.recycle();
                                        throw th;
                                    }
                                }
                                setItems(null);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i10)));
    }
}
