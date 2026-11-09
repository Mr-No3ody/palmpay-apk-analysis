package com.transsnet.mtn.sdk.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p274s.a;
import p349x8.b;
import p349x8.f;

/* JADX INFO: loaded from: classes3.dex */
public class PrivacyItemView extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f25726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f25727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f25728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25732g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25733i;

    public PrivacyItemView(@NonNull Context context) {
        this(context, null);
    }

    @Override // p274s.a
    public final void a() {
        View.inflate(getContext(), b.mtn_privacy_item_layout, this);
        this.f25726a = (ImageView) findViewById(p349x8.a.mtn_img);
        this.f25727b = (TextView) findViewById(p349x8.a.mtn_title);
        this.f25728c = (TextView) findViewById(p349x8.a.mtn_content);
        this.f25729d = findViewById(p349x8.a.mtn_divider);
        this.f25726a.setImageResource(this.f25730e);
        this.f25727b.setText(this.f25731f);
        this.f25728c.setText(this.f25732g);
        this.f25729d.setVisibility(this.f25733i ? 0 : 4);
    }

    @Override // p274s.a
    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.PrivacyItemView);
        this.f25730e = typedArrayObtainStyledAttributes.getResourceId(f.PrivacyItemView_privacy_item_view_img, 0);
        this.f25731f = typedArrayObtainStyledAttributes.getString(f.PrivacyItemView_privacy_item_view_bar_title);
        this.f25732g = typedArrayObtainStyledAttributes.getString(f.PrivacyItemView_privacy_item_view_content);
        this.f25733i = typedArrayObtainStyledAttributes.getBoolean(f.PrivacyItemView_privacy_item_view_is_show_divider, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public PrivacyItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivacyItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
