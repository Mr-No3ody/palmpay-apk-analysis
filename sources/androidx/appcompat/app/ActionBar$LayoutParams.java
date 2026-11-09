package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.navigation.NavigationBarView;

/* JADX INFO: loaded from: classes.dex */
public class ActionBar$LayoutParams extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12075a;

    public ActionBar$LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12075a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p241q.j.ActionBarLayout);
        this.f12075a = typedArrayObtainStyledAttributes.getInt(p241q.j.ActionBarLayout_android_layout_gravity, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ActionBar$LayoutParams(int i7) {
        super(-2, i7);
        this.f12075a = NavigationBarView.ITEM_GRAVITY_START_CENTER;
    }

    public ActionBar$LayoutParams(ActionBar$LayoutParams actionBar$LayoutParams) {
        super((ViewGroup.MarginLayoutParams) actionBar$LayoutParams);
        this.f12075a = 0;
        this.f12075a = actionBar$LayoutParams.f12075a;
    }

    public ActionBar$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f12075a = 0;
    }
}
