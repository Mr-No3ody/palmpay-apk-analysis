package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.custom_view.model.ModelBillRecordItemV2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001d\u0010!\u001a\u0004\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001d\u0010$\u001a\u0004\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001d\u0010)\u001a\u0004\u0018\u00010%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u0004\u0018\u00010*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/ModelBillRecordItemV2;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "", "setTitle", "(Ljava/lang/String;)V", "resId", "(I)V", "Landroid/widget/TextView;", "c", "Lkotlin/Lazy;", "getMTitleTv", "()Landroid/widget/TextView;", "mTitleTv", "d", "getMTimeTv", "mTimeTv", "e", "getMAmountTv", "mAmountTv", "f", "getMStateTv", "mStateTv", "g", "getMTagTv", "mTagTv", "Landroid/widget/ImageView;", "i", "getMItemIconIv", "()Landroid/widget/ImageView;", "mItemIconIv", "Landroidx/constraintlayout/widget/ConstraintLayout;", "j", "getMRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "mRoot", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelBillRecordItemV2 extends BaseModel {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f31482o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f31486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f31487g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f31488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f31489j;

    public ModelBillRecordItemV2(@Nullable Context context) {
        super(context);
        final int i7 = 0;
        this.f31483c = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i7) {
                    case 0:
                        int i10 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i11 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i12 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i13 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i14 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i15 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i10 = 1;
        this.f31484d = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i10) {
                    case 0:
                        int i11 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i12 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i13 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i14 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i15 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i11 = 2;
        this.f31485e = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i11) {
                    case 0:
                        int i12 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i13 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i14 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i15 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i12 = 3;
        this.f31486f = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i12) {
                    case 0:
                        int i13 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i14 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i15 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i13 = 4;
        this.f31487g = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i13) {
                    case 0:
                        int i14 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i15 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i14 = 5;
        this.f31488i = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i14) {
                    case 0:
                        int i15 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i15 = 6;
        this.f31489j = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i15) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_model_bill_record_item_v2, this);
        return this;
    }

    @Nullable
    public final TextView getMAmountTv() {
        return (TextView) this.f31485e.getValue();
    }

    @Nullable
    public final ImageView getMItemIconIv() {
        return (ImageView) this.f31488i.getValue();
    }

    @Nullable
    public final ConstraintLayout getMRoot() {
        return (ConstraintLayout) this.f31489j.getValue();
    }

    @Nullable
    public final TextView getMStateTv() {
        return (TextView) this.f31486f.getValue();
    }

    @Nullable
    public final TextView getMTagTv() {
        return (TextView) this.f31487g.getValue();
    }

    @Nullable
    public final TextView getMTimeTv() {
        return (TextView) this.f31484d.getValue();
    }

    @Nullable
    public final TextView getMTitleTv() {
        return (TextView) this.f31483c.getValue();
    }

    public final void setTitle(@Nullable String title) {
        TextView mTitleTv = getMTitleTv();
        if (mTitleTv != null) {
            mTitleTv.setText(title);
        }
    }

    public final void setTitle(int resId) {
        TextView mTitleTv = getMTitleTv();
        if (mTitleTv != null) {
            mTitleTv.setText(resId);
        }
    }

    public ModelBillRecordItemV2(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        final int i7 = 0;
        this.f31483c = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i7) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i10 = 1;
        this.f31484d = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i10) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i11 = 2;
        this.f31485e = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i11) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i12 = 3;
        this.f31486f = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i12) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i13 = 4;
        this.f31487g = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i13) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i14 = 5;
        this.f31488i = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i14) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i15 = 6;
        this.f31489j = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i15) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
    }

    public ModelBillRecordItemV2(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        final int i10 = 0;
        this.f31483c = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i10) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i11 = 1;
        this.f31484d = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i11) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i12 = 2;
        this.f31485e = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i12) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i13 = 3;
        this.f31486f = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i13) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i14 = 4;
        this.f31487g = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i14) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i15 = 5;
        this.f31488i = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i15) {
                    case 0:
                        int i16 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
        final int i16 = 6;
        this.f31489j = C2131j.b(new Function0(this) { // from class: Vb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillRecordItemV2 f10282b;

            {
                this.f10282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillRecordItemV2 modelBillRecordItemV2 = this.f10282b;
                switch (i16) {
                    case 0:
                        int i17 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_title);
                    case 1:
                        int i18 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_time);
                    case 2:
                        int i19 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_amount);
                    case 3:
                        int i110 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_state);
                    case 4:
                        int i111 = ModelBillRecordItemV2.f31482o;
                        return (TextView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.tv_tag);
                    case 5:
                        int i112 = ModelBillRecordItemV2.f31482o;
                        return (ImageView) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_icon);
                    default:
                        int i113 = ModelBillRecordItemV2.f31482o;
                        return (ConstraintLayout) modelBillRecordItemV2.findViewById(com.transsnet.palmpay.custom_view.s.layout_root);
                }
            }
        });
    }
}
