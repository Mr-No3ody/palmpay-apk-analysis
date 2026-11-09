package com.transsnet.mtn.sdk.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.transsnet.mtn.sdk.ui.view.TitleBar;
import mh.g;
import p274s.a;
import p349x8.b;
import p349x8.c;
import p349x8.f;

/* JADX INFO: loaded from: classes3.dex */
public class TitleBar extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f25734i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f25735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f25736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f25737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f25738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25741g;

    public TitleBar(@NonNull Context context) {
        this(context, null);
    }

    @Override // p274s.a
    public final void a() {
        View.inflate(getContext(), b.mtn_title_bar_layout, this);
        this.f25735a = findViewById(p349x8.a.mtn_root);
        this.f25736b = (ImageView) findViewById(p349x8.a.mtn_back);
        this.f25737c = (TextView) findViewById(p349x8.a.mtn_title);
        this.f25738d = (ImageView) findViewById(p349x8.a.mtn_quit);
        this.f25735a.setBackgroundColor(this.f25739e);
        this.f25737c.setText(this.f25740f);
        this.f25736b.setImageResource(this.f25741g);
        final int i7 = 0;
        this.f25736b.setOnClickListener(new View.OnClickListener(this) { // from class: B8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TitleBar f566b;

            {
                this.f566b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TitleBar titleBar = this.f566b;
                switch (i7) {
                    case 0:
                        int i10 = TitleBar.f25734i;
                        ((Activity) titleBar.getContext()).finish();
                        break;
                    default:
                        int i11 = TitleBar.f25734i;
                        titleBar.getClass();
                        g gVar = new g(titleBar.getContext(), 1);
                        gVar.f39788d = new d(0);
                        gVar.show();
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f25738d.setOnClickListener(new View.OnClickListener(this) { // from class: B8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TitleBar f566b;

            {
                this.f566b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TitleBar titleBar = this.f566b;
                switch (i10) {
                    case 0:
                        int i11 = TitleBar.f25734i;
                        ((Activity) titleBar.getContext()).finish();
                        break;
                    default:
                        int i12 = TitleBar.f25734i;
                        titleBar.getClass();
                        g gVar = new g(titleBar.getContext(), 1);
                        gVar.f39788d = new d(0);
                        gVar.show();
                        break;
                }
            }
        });
    }

    @Override // p274s.a
    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.TitleBar);
        this.f25739e = typedArrayObtainStyledAttributes.getColor(f.TitleBar_title_bar_bg_color, -1);
        this.f25740f = typedArrayObtainStyledAttributes.getString(f.TitleBar_title_bar_title);
        this.f25741g = typedArrayObtainStyledAttributes.getResourceId(f.TitleBar_title_bar_back_img, c.mtn_back_arrow);
        typedArrayObtainStyledAttributes.recycle();
    }

    public TitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
